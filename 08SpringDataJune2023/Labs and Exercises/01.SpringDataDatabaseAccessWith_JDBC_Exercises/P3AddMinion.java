import java.sql.*;
import java.util.Scanner;

public class P3AddMinion {
    public static void main(String[] args) throws SQLException {

        Connection connection = DriverManager
                .getConnection("jdbc:mysql://localhost:3306/minions_db", "root", "1234");

        Scanner scanner = new Scanner(System.in);
        String[] minionInfo = scanner.nextLine().split(" ");
        String minionName = minionInfo[1];
        int minionAge = Integer.parseInt(minionInfo[2]);
        String minionTown = minionInfo[3];

        String[] villainInfo = scanner.nextLine().split(" ");
        String villainName = villainInfo[1];

        insertMinionTown(connection, minionTown);

        insertVillain(connection, villainName);

        insertMinion(connection, minionName, minionAge, minionTown);

        int minionId = getMinionId(connection);

        insertMinionVillain(connection, minionName, villainName, minionId);


    }

    private static void insertMinionVillain(Connection connection, String minionName, String villainName, int minionId) throws SQLException {
        PreparedStatement minion_villain = connection
                .prepareStatement("insert into minions_villains values (?, ?)");
        int villainIdInt = getVillainId(connection, villainName);

        minion_villain.setInt(1, minionId);
        minion_villain.setInt(2, villainIdInt);
        minion_villain.executeUpdate();
        System.out.printf("Successfully added %s to be minion of %s\n", minionName, villainName);
    }

    private static void insertMinion(Connection connection, String minionName, int minionAge, String minionTown) throws SQLException {
        PreparedStatement insertMinion = connection
                .prepareStatement("insert into minions(name, age, town_id) values (?, ?, ?)");
        insertMinion.setString(1, minionName);
        insertMinion.setInt(2, minionAge);
        int id = getTownId(connection, minionTown);
        insertMinion.setInt(3, id);
        insertMinion.executeUpdate();
    }

    private static int getMinionId(Connection connection) throws SQLException {
        PreparedStatement lastMinionId = connection
                .prepareStatement("select id from minions order by id desc;");
        ResultSet resultSet = lastMinionId.executeQuery();
        resultSet.next();
        int minionId = resultSet.getInt("id");
        return minionId;
    }

    private static int getVillainId(Connection connection, String villainName) throws SQLException {
        PreparedStatement villainId = connection
                .prepareStatement("select id from villains where name = ?");
        villainId.setString(1, villainName);
        villainId.executeQuery().next();
        ResultSet resultVillainId = villainId.executeQuery();
        resultVillainId.next();
        int villainIdInt = resultVillainId.getInt("id");
        return villainIdInt;
    }

    private static int getTownId(Connection connection, String minionTown) throws SQLException {
        PreparedStatement getTownId = connection.prepareStatement("select id from towns where name = ?");
        getTownId.setString(1, minionTown);
        ResultSet townIdResult = getTownId.executeQuery();
        townIdResult.next();
        int id = townIdResult.getInt("id");
        return id;
    }

    private static void insertVillain(Connection connection, String villainName) throws SQLException {
        PreparedStatement villainStatement = connection
                .prepareStatement("select name from villains where name = ?");
        villainStatement.setString(1, villainName);
        ResultSet villainNameSet = villainStatement.executeQuery();

        if (!villainNameSet.next()) {
            PreparedStatement insertVillain = connection
                    .prepareStatement("insert into villains(name, evilness_factor) values (?, ?)");
            insertVillain.setString(1, villainName);
            insertVillain.setString(2, "evil");
            insertVillain.executeUpdate();
            System.out.printf("Villain %s was added to the database.\n", villainName);
        }
    }

    private static void insertMinionTown(Connection connection, String minionTown) throws SQLException {
        PreparedStatement townStatement = connection
                .prepareStatement("select id from towns where name = ?");
        townStatement.setString(1, minionTown);

        ResultSet resultTown = townStatement.executeQuery();
        if (!resultTown.next()) {
            PreparedStatement insertTown = connection
                    .prepareStatement("insert into towns(name) values (?)");
            insertTown.setString(1, minionTown);
            insertTown.executeUpdate();
            System.out.printf("Town %s was added to the database.\n", minionTown);

        }
    }
}
