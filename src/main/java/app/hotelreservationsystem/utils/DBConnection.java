package app.hotelreservationsystem.utils;

import java.io.IOException;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

/**
 *
 * @author Felix
 */
public class DBConnection {
    private static final String PROPERTIES_FILE = "/app/hotelreservationsystem/utils/db.properties";
    private static String dbUrl;
    private static String dbUsername;
    private static String dbPassword;
    
    static {
        try (InputStream input = DBConnection.class.getResourceAsStream(PROPERTIES_FILE)) {
            if (input == null) {
                throw new IOException("Unable to find " + PROPERTIES_FILE);
            }

            Properties prop = new Properties();
            prop.load(input);

            dbUrl = prop.getProperty("db.url");
            dbUsername = prop.getProperty("db.username");
            dbPassword = prop.getProperty("db.password");


        } catch (IOException ex) {
            ex.printStackTrace(); // Consider logging instead
        }
    }

    public static Connection getConnection() throws SQLException {
        return DriverManager.getConnection(dbUrl, dbUsername, dbPassword);
    }
}
