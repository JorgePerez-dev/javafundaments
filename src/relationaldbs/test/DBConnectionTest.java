package relationaldbs.test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class DBConnectionTest {

    private static final String POSTGRES_URL =
            "jdbc:postgresql://localhost:5432/postgres";

    private static final String USERNAME = "postgres";
    private static final String PASSWORD = "Admin";

    public static void main(String[] args) {

        String dbCreationSQL = "CREATE DATABASE happylearning";

        try (Connection conn = DriverManager.getConnection(
                POSTGRES_URL, USERNAME, PASSWORD);
             Statement stmt = conn.createStatement()) {

            stmt.executeUpdate(dbCreationSQL);
            System.out.println(" Base de datos creada");

        } catch (SQLException e) {
            e.printStackTrace();
        }
    } //

} //
