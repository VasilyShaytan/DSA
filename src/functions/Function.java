package functions;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Function {
    static String urldb = "jdbc:mysql://localhost:3307/mydb_robots?useSSL=false";
    static String usernamedb = "vasia";
    static String passworddb = "123456";
    Connection connection = DriverManager.getConnection(urldb, usernamedb, passworddb);

    public Function() throws SQLException {
    }

    public static void PrintConsole(String text){
        System.out.println(text);
    }

    public static int connectionDB() throws SQLException {


        //System.out.println("Connecting database...");

        try (Connection connection = DriverManager.getConnection(urldb, usernamedb, passworddb)) {
            //System.out.println("Database connected!");
            return 0;
        } catch (SQLException e) {
            return 1;
            //throw new IllegalStateException("Cannot connect the database!", e);
        }

        //Statement statement = null;

        //statement = connection.createStatement();

        /*String insertTableSQL = "INSERT INTO clients"
                + "(id, login, password) " + "VALUES"
                + "(10,'11','12')";
        statement.executeUpdate(insertTableSQL);*/
    }

    public static int addNewAccount(int idAcc, String loginAcc, String passwordAcc) throws SQLException {
        try (Connection connection = DriverManager.getConnection(urldb, usernamedb, passworddb)) {

            Statement statement = null;
            statement = connection.createStatement();
            String insertTableSQL = "INSERT INTO clients"
                    + "(id, login, password) " + "VALUES"
                    + "(111, '112', '1234')";

            statement.executeUpdate(insertTableSQL);

        } catch (SQLException ex) {
            ex.printStackTrace();
        }

        return 0;
    }

}
