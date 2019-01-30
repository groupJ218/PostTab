package utils;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import com.mysql.fabric.jdbc.FabricMySQLDriver;

public class Connector {

    private Connection connection;

    static String URL = "jdbc:mysql://127.0.0.1:3306/mydb";
    static String user = "root";
    static String password = "root";

    public Connector() {
    }

    public Connection getConnection() {
        if (connection == null) {
            try {
                DriverManager.registerDriver(new com.mysql.jdbc.Driver());
//                Class.forName("com.mysql.jdbc.Driver"); // Driver register String
                connection = DriverManager.getConnection(URL, user, password);
            } catch (SQLException e) {
                e.printStackTrace();
//            } catch (ClassNotFoundException e) {
//                e.printStackTrace();
            }
        }
        return connection;
    }

    public static void closeConnection() {
        try {
           new Connector().getConnection().close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
