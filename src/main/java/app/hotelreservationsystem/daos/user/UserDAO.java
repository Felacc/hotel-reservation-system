package app.hotelreservationsystem.daos.user;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import app.hotelreservationsystem.models.user.User;
import app.hotelreservationsystem.utils.DBConnection;

/**
 *
 * @author Caleb
 * @author Felix
 */

public class UserDAO {

    //This user DAO will be interacting the model
    private User user;

    public UserDAO() {
    }

    public UserDAO(User user) {
        this.user = user;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }
    
    
    public boolean addUserRecord(User user){
        //The ?, ? values are not known yet
        String query = "INSERT INTO hotel_reservation_db.user (username, password, user_type) VALUES (?, ?, ?)";
        
        //Connect to database
        try(Connection connection = DBConnection.getConnection();
        //Preparse statement for query
            PreparedStatement preparedStatement = connection.prepareStatement(query)){
            preparedStatement.setString(1, user.getUsername()); // second question mark - last name
            preparedStatement.setString(2, user.getPassword());
            preparedStatement.setString(3,user.getUserType()); // first question mark - first name
            return preparedStatement.executeUpdate() > 0; //successful insertion
        }
        catch(Exception ex){
            ex.printStackTrace();
        }
        return false;
    }
    
    public static boolean deleteUserRecord(int userId){
        String query = "DELETE from hotelreservationdb.users where user_id = (?)";
        try(Connection connection = DBConnection.getConnection();
        //Preparse statement for query
            PreparedStatement preparedStatement = connection.prepareStatement(query)){
            preparedStatement.setInt(1, userId);
            return preparedStatement.executeUpdate() > 0; //successful insertion
        }
        catch(Exception ex){
            ex.printStackTrace();
        }
        return false;
    }

    public boolean updateUserRecord(int userId, String column, String value) {
        String query = "UPDATE users SET " + column + " = ? WHERE user_id = ?";
         try(Connection connection = DBConnection.getConnection();
        //Preparse statement for query
            PreparedStatement preparedStatement = connection.prepareStatement(query)){
            preparedStatement.setString(1, value);
            preparedStatement.setInt(2, userId); 
            return preparedStatement.executeUpdate() > 0; //successful insertion
        }
        catch(Exception ex){
            ex.printStackTrace();
        }
        return false;
    }
    
    public static User fetchUserByIdForTable(int userId) {
        User userObject = null;
        String query
                = """
            SELECT user_id, username, password, user_type
            FROM   users
            WHERE  user_id = ?
        """;

        try (Connection connection = DBConnection.getConnection(); PreparedStatement preparedStatement = connection.prepareStatement(query)) {

            preparedStatement.setInt(1, userId);

            ResultSet resultSet = preparedStatement.executeQuery();

            if (resultSet.next()) {
                userObject = new User(
                        resultSet.getString("username"),
                        resultSet.getString("password"),
                        resultSet.getString("user_type")
                );
                userObject.setUserId(resultSet.getInt("user_id"));
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return userObject;
    }

    public static List<User> fetchAllUserRecords() {
        List<User> userList = new ArrayList<User>();
        String query
                = """
           SELECT user_id, username, password, user_type
           FROM   users
        """;

        try (Connection connection = DBConnection.getConnection(); PreparedStatement preparedStatement = connection.prepareStatement(query)) {

            ResultSet resultSet = preparedStatement.executeQuery();

            while (resultSet.next()) {
                 User userObject = new User(
                        resultSet.getString("username"),
                        resultSet.getString("password"),
                        resultSet.getString("user_type")
                );
                userObject.setUserId(resultSet.getInt("user_id"));
                userList.add(userObject);
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return userList;
    }
}