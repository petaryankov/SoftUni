import java.sql.*;
import java.util.Properties;

public class P1GetVillainsNames {
    public static void main(String[] args) throws SQLException {

        Properties properties = new Properties();
        properties.setProperty("user", "root");
        properties.setProperty("password", "1234");

        Connection connection = DriverManager
                .getConnection("jdbc:mysql://localhost:3306/minions_db", properties);
        String selection = "select name, count(distinct minion_id) as count from villains v" +
                " join minions_villains mv on v.id = mv.villain_id" +
                " group by name" +
                " having count > ?" +
                " order by count desc;";
        PreparedStatement preparedStatement = connection.prepareStatement(selection);
        preparedStatement.setInt(1, 15);
        ResultSet resultSet = preparedStatement.executeQuery();

        if (resultSet.next()) {
            String name = resultSet.getString("name");
            int count = resultSet.getInt("count");
            System.out.printf("%s %d",name,count);
        }
        connection.close();
    }
}
