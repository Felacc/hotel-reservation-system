/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import model.Guest;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.util.List;
import util.dbConnection;

/**
 *
 * @author C0522047
 */

public class GuestDAO {

    public static List<Guest> fetchAllGuestRecords() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    public static Guest fetchGuestByIdForTable(int guestID) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    //This course DAO will be interacting the model
    private Guest guest;

    public GuestDAO() {
    }

    public GuestDAO(Guest guest) {
        this.guest = guest;
    }

    public Guest getGuest() {
        return guest;
    }

    public void setGuest(Guest guest) {
        this.guest = guest;
    }
    
    
    public boolean addGuestRecord(Guest guest){
        //The ?, ? values are not known yet
        String query = "INSERT INTO hotelReservationDB.guests (first_name, last_name, email, phone_number, unit_number, street_address, city, postal_code, country, user_id) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
        
        //Connect to database
        try(Connection connection = dbConnection.getConnection();
        //Preparse statement for query
            PreparedStatement preparedStatement = connection.prepareStatement(query)){
            
            preparedStatement.setString(1,guest.getFirstName()); // first question mark - first name
            preparedStatement.setString(2, guest.getLastName()); // second question mark - last name
            preparedStatement.setString(3, guest.getEmail());
            preparedStatement.setString(4, guest.getPhoneNumber());
            preparedStatement.setString(5, guest.getUnitNumber());
            preparedStatement.setString(6, guest.getStreetAddress());
            preparedStatement.setString(7, guest.getCity());
            preparedStatement.setString(8, guest.getPostalCode());
            preparedStatement.setString(9, guest.getCountry());
            preparedStatement.setInt(10, guest.getUserID());
            
            return preparedStatement.executeUpdate() > 0; //successful insertion
        }
        catch(Exception ex){
            ex.printStackTrace();
        }
        return false;
    }
    

    public Guest fetchGuestByIdForDelete(int guestId) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
    
}