/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import model.Guest;
import java.sql.Connection;
import java.sql.PreparedStatement;
import util.dbConnection;

/**
 *
 * @author C0522047
 */

public class GuestDAO {
    //This course DAO will be interacting the model
    private Guest guest;

    public GuestDAO() {
    }

    public GuestDAO(String courseName, int credit) {
        this.guest = guest;
    }

    public Guest getCourse() {
        return guest;
    }

    public void setGuest(Guest guest) {
        this.guest = guest;
    }
    
    
    public boolean addGuestRecord(Guest guest){
        //The ?, ? values are nhote known yet
        String query = "INSERT INTO coursemanagement.course (name,credit) VALUES (?, ?)";
        
        //Connect to database
        try(Connection connection = dbConnection.getConnection();
        //Preparse statement for query
            PreparedStatement preparedStatement = connection.prepareStatement(query)){
            preparedStatement.setString(1,guest.getFirstName()); //Our First Question mark is for the name type sting by calling the getter
            preparedStatement.setString(2, guest.getLastName()); //Our second question makr is for the type int calling the get credit
            //... and so on
            
            return preparedStatement.executeUpdate() > 0; //successful insertion
        }
        catch(Exception ex){
            ex.printStackTrace();
        }
        return false;
    }
}