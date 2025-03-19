package util;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


/**
 *
 * @author C0522047
 */

public class DBConnection {
    private static final String URL = "jdbc:mysql://5b94af937a-dbserver.mysql.database.azure.com:3306/hotelreservationdb?useSSL=true";
    private static final String USER = "pncrcccpdq";
    private static final String PASSWORD = "Camosun123";
    
    public static Connection getConnection() throws SQLException{
        return DriverManager.getConnection(URL, USER, PASSWORD);
    }
}

