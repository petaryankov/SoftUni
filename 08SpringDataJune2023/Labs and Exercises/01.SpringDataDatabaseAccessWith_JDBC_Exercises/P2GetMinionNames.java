import java.sql.*;
import java.util.Properties;
import java.util.Scanner;

public class P2GetMinionNames {
    public static void main(String[] args) throws SQLException {

        Connection connection = DriverManager
                .getConnection("jdbc:mysql://localhost:3306/minions_db", "root", "1234");

        PreparedStatement villainStatement = connection
                .prepareStatement("select name from villains where id = ?;");
        Scanner scanner = new Scanner(System.in);
        int villainId = Integer.parseInt(scanner.nextLine());

        villainStatement.setInt(1, villainId);
        ResultSet resultVillain = villainStatement.executeQuery();

        if (!resultVillain.next()) {
            System.out.printf("No villain with ID %d exists in the database.", villainId);
            return;
        }
        String villainName = resultVillain.getString("name");
        System.out.printf("Villain: %s\n", villainName);

        PreparedStatement minionsStatement = connection
                .prepareStatement("select * from minions " +
                        " join minions_villains mv on minions.id = mv.minion_id" +
                        " where mv.villain_id = ?;");
        minionsStatement.setInt(1, villainId);
        ResultSet resultMinions = minionsStatement.executeQuery();
        int counter = 1;
        while (resultMinions.next()) {
            String name = resultMinions.getString("name");
            int age = resultMinions.getInt("age");
            System.out.printf("%d. %s %d\n", counter, name, age);
            counter++;
        }
        connection.close();
    }
}