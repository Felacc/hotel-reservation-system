/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import model.Guest;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.util.List;
import model.User;
import util.DBConnection;

/**
 *
 * @author C0522047
 */

public class UserDAO {

    //This user DAO will be interacting the model
    private User user;

    public UserDAO() {
    }

    public UserDAO(Guest guest) {
        this.user = user;
    }

    public User getGuest() {
        return user;
    }

    public void setGuest(User user) {
        this.user = user;
    }
    
    
    public boolean addUserRecord(User user){
        //The ?, ? values are not known yet
        String query = "INSERT INTO hotelReservationdb.users (username, password, user_type) VALUES (?, ?, ?)";
        
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
}