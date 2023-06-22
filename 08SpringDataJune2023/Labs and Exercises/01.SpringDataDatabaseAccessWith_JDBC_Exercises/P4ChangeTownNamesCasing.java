import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class P4ChangeTownNamesCasing {
    public static void main(String[] args) throws SQLException {
        Scanner scanner = new Scanner(System.in);
        String country = scanner.nextLine();

        Connection connection = DriverManager
                .getConnection("jdbc:mysql://localhost:3306/minions_db", "root", "1234");
        PreparedStatement updateTownsName = connection
                .prepareStatement("update towns set name = upper(name) where country = ?");
        updateTownsName.setString(1, country);
        int count = updateTownsName.executeUpdate();

        if (count == 0) {
            System.out.println("No town names were affected.");
            return;
        }

            System.out.printf("%d town names were affected.\n", count);
            PreparedStatement selectAllTowns = connection
                    .prepareStatement("select name from towns where country = ?;");
            selectAllTowns.setString(1, country);
        ResultSet resultTowns = selectAllTowns.executeQuery();
        List<String> towns = new ArrayList<>();

        while (resultTowns.next()) {
            String town = resultTowns.getString("name");
            towns.add(town);
        }
        System.out.println(towns);


    }
}
