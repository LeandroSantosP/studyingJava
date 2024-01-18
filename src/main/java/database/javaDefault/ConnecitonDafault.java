package database.javaDefault;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnecitonDafault {

    static private final String url = "jdbc:postgresql://localhost:5432/postgres";
    static private final String user = "postgres";
    static private final String pass = "12345";

    private static Connection connection;

    private ConnecitonDafault() {
    }

    public static Connection getConnection() throws SQLException {
        if (connection == null) {
            connection = initConnection();
        }
        return connection;
    }

    private static Connection initConnection() throws SQLException {
        return DriverManager.getConnection(url, user, pass);
    }
}