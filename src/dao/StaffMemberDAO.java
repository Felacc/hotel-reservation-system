/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import model.StaffMember;
import util.DBConnection;

/**
 *
 * @author kale
 */
public class StaffMemberDAO {
     private StaffMember staffMember;

    public StaffMemberDAO() {
    }

    public StaffMemberDAO(StaffMember staffMember) {
        this.staffMember = staffMember;
    }

    public StaffMember getStaffMember() {
        return staffMember;
    }

    public void setStaffMember(StaffMember staffMember) {
        this.staffMember = staffMember;
    }
    
    public static boolean addStaffMemberRecord(StaffMember staffMember){
        //The ?, ? values are not known yet
        String query = "INSERT INTO hotelReservationdb.staff_members (first_name, last_name, email, phone_number, SIN, citizenship_status, unit_number, street_address, city, postal_code, country, created_by) VALUES (?, ?, ?, ?, ?,? ,? ,? ,? ,? ,? ,?)";
        
        //Connect to database
        try(Connection connection = DBConnection.getConnection();
        //Preparse statement for query
            PreparedStatement preparedStatement = connection.prepareStatement(query)){
            preparedStatement.setString(1, staffMember.getFirstName()); // second question mark - last name
            preparedStatement.setString(2, staffMember.getLastName());
            preparedStatement.setString(3,staffMember.getEmail()); // first question mark - first name
            preparedStatement.setString(4,staffMember.getPhoneNumber());
            preparedStatement.setInt(5,staffMember.getSIN());
            preparedStatement.setString(6,staffMember.getCitizenshipStatus());
            preparedStatement.setString(7,staffMember.getUnitNumber());
            preparedStatement.setString(8,staffMember.getStreetAddress());
            preparedStatement.setString(9,staffMember.getCity());
            preparedStatement.setString(10,staffMember.getPostalCode());
            preparedStatement.setString(11,staffMember.getCountry());
            preparedStatement.setInt(12,staffMember.getCreatedBy());
            return preparedStatement.executeUpdate() > 0; //successful insertion
        }
        catch(Exception ex){
            ex.printStackTrace();
        }
        return false;
    }
    
    
}
