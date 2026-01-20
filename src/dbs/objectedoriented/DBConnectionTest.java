package dbs.objectedoriented;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;


public class DBConnectionTest {

    // The direction of the database that we are going to connect
    private final static String mysqlURL = "jdbc:mysql://localhost:3306/test";
    private final static String postgresqlURL =
            "jdbc:postgresql://localhost:5432/sample?ssl=true";

    // The user name used to connect to the database
    private final static String username = "root";

    // The password required to connect
    private final static String password = "2025Cve";

    public static void main(String[] args) {
        try {
            Connection conn = DriverManager.getConnection(mysqlURL, username, password);

            System.out.println("the address of the connection object is " + conn);

            String dbCreationSQL = "CREATE DATABASE IF NOT EXISTS happylearning";
            Statement stmt = conn.createStatement();
            stmt.executeUpdate(dbCreationSQL);

            conn.close();

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }


}
