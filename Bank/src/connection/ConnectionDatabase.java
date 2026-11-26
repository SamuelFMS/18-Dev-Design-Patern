package connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionDatabase {
    private static Connection connection;
    private static ConnectionDatabase instance;
    private String username;
    private String password;

    /*private ConnectionDatabase() {
        if(instance == null) {
            this.username = "root";
            instance = this;
        } else {
            throw new RuntimeException("Connection database already initialized");
        }
    }*/
    public static Connection getConnection() {
        if(connection == null) {
            try {
                connection = DriverManager.getConnection(
                        "jdbc:mysql://localhost:3306/bank_design_patern", "root", ""
                );
            } catch (SQLException sqlException) {
                throw new RuntimeException(sqlException);
            }
        }
        return connection;
    }
}
