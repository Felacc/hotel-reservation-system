package edu.dsc.hotelreservation.util;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author Caleb
 * mysql -h 5b94af937a-dbserver.mysql.database.azure.com -P 3306 -u pncrcccpdq -p
 */

public class DBConnection {
    public static final String URL = "jdbc:mysql://5b94af937a-dbserver.mysql.database.azure.com:3306/hotelreservationdb";
    private static final String USER = "pncrcccpdq";
    private static final String PASSWORD = "Camosun123";
    
    public static Connection getConnection() throws SQLException{
        return DriverManager.getConnection(URL, USER, PASSWORD);
    }
}

