import java.sql.*;
import java.util.Properties;
import java.util.Scanner;

public class P5RemoveVillain {
    public static void main(String[] args) throws SQLException {
        Connection connection = DriverManager
                .getConnection("jdbc:mysql://localhost:3306/minions_db", "root", "1234");

        Scanner scanner = new Scanner(System.in);
        int villainId = Integer.parseInt(scanner.nextLine());

        PreparedStatement selectVillain = connection
                .prepareStatement("select name from villains where id = ?");
        selectVillain.setInt(1, villainId);
        ResultSet resultVillain = selectVillain.executeQuery();

        if (!resultVillain.next()) {
            System.out.println("No such villain was found");
            return;
        }
        String villainName = resultVillain.getString("name");


        PreparedStatement countMinionsVillain = connection
                .prepareStatement("select count(distinct minion_id) as count_m from minions_villains where villain_id = ?;");
        countMinionsVillain.setInt(1, villainId);
        ResultSet resultCount = countMinionsVillain.executeQuery();
        resultCount.next();
        int countedMinions = resultCount.getInt("count_m");

        connection.setAutoCommit(false);

        try {
            PreparedStatement deleteVillainsMinions = connection
                    .prepareStatement("delete from minions_villains where villain_id = ?;");
            deleteVillainsMinions.setInt(1, villainId);
            deleteVillainsMinions.executeUpdate();

            PreparedStatement deleteVillain = connection
                    .prepareStatement("delete from villains where id = ?;");
            deleteVillain.setInt(1, villainId);
            deleteVillain.executeUpdate();

            connection.commit();

            System.out.println(villainName + " was deleted");
            System.out.println(countedMinions + " minions released");

        } catch (SQLException e) {
            connection.rollback();
        }
        connection.close();

    }
}
