    /*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import model.StaffMember;
import util.DBConnection;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
/**
 *
 * @author Caleb Irvine | C0522047
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
    
    public boolean deleteStaffRecord(int staffId){
        String query = "DELETE from hotelreservationdb.staff_members  where staff_id = (?)";
        try(Connection connection = DBConnection.getConnection();
        //Preparse statement for query
            PreparedStatement preparedStatement = connection.prepareStatement(query)){
            preparedStatement.setInt(1, staffId);
            return preparedStatement.executeUpdate() > 0; //successful insertion
        }
        catch(Exception ex){
            ex.printStackTrace();
        }
        return false;
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
    
    
    
    public boolean updateStaffMemberRecord(int staffId, String column, String value) {
        String query = "UPDATE staff_members SET " + column + " = ? WHERE staff_id = ?";
        try(Connection connection = DBConnection.getConnection();
            PreparedStatement preparedStatement = connection.prepareStatement(query)){
            preparedStatement.setString(1, value);
            preparedStatement.setInt(2, staffId);
            return preparedStatement.executeUpdate() > 0; //successful update
        }
        catch(Exception ex){
            ex.printStackTrace();
        }
        return false;
    }
    
    public boolean updateStaffMemberIntRecord(int staffId, String column, int value) {
        String query = "UPDATE staff_members SET " + column + " = ? WHERE staff_id = ?";
        try(Connection connection = DBConnection.getConnection();
            PreparedStatement preparedStatement = connection.prepareStatement(query)){
            preparedStatement.setInt(1, value);
            preparedStatement.setInt(2, staffId);
            return preparedStatement.executeUpdate() > 0; //successful update
        }
        catch(Exception ex){
            ex.printStackTrace();
        }
        return false;
    }

    public static StaffMember fetchStaffByIdForTable(int staffId) {
        StaffMember staffMemberObject = null;
        String query = """
            SELECT staff_id, first_name, last_name, email, phone_number, SIN, citizenship_status, 
                   unit_number, street_address, city, postal_code, country, created_by
            FROM   hotelreservationdb.staff_members
            WHERE  staff_id = ?
            """;

        try (Connection connection = DBConnection.getConnection(); 
             PreparedStatement preparedStatement = connection.prepareStatement(query)) {

            preparedStatement.setInt(1, staffId);
            ResultSet resultSet = preparedStatement.executeQuery();

            if (resultSet.next()) {
                staffMemberObject = new StaffMember(
                    resultSet.getString("first_name"),
                    resultSet.getString("last_name"),
                    resultSet.getString("email"),
                    resultSet.getString("phone_number"),
                    resultSet.getInt("SIN"),
                    resultSet.getString("citizenship_status"),
                    resultSet.getString("unit_number"),
                    resultSet.getString("street_address"),
                    resultSet.getString("city"),
                    resultSet.getString("postal_code"),
                    resultSet.getString("country"),
                    resultSet.getInt("created_by")
                );
                staffMemberObject.setStaffId(resultSet.getInt("staff_id"));
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return staffMemberObject;
    }

    public static List<StaffMember> fetchAllStaffRecords() {
        List<StaffMember> staffList = new ArrayList<StaffMember>();
        String query = """
            SELECT staff_id, first_name, last_name, email, phone_number, SIN, citizenship_status, 
                   unit_number, street_address, city, postal_code, country, created_by
            FROM  hotelreservationdb.staff_members
            """;

        try (Connection connection = DBConnection.getConnection(); 
             PreparedStatement preparedStatement = connection.prepareStatement(query)) {

            ResultSet resultSet = preparedStatement.executeQuery();

            while (resultSet.next()) {
                StaffMember staffMemberObject = new StaffMember(
                    resultSet.getString("first_name"),
                    resultSet.getString("last_name"),
                    resultSet.getString("email"),
                    resultSet.getString("phone_number"),
                    resultSet.getInt("SIN"),
                    resultSet.getString("citizenship_status"),
                    resultSet.getString("unit_number"),
                    resultSet.getString("street_address"),
                    resultSet.getString("city"),
                    resultSet.getString("postal_code"),
                    resultSet.getString("country"),
                    resultSet.getInt("created_by")
                );
                staffMemberObject.setStaffId(resultSet.getInt("staff_id"));
                staffList.add(staffMemberObject);
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return staffList;
    }
    
    public static StaffMember fetchStaffMemberByEmail(String email) {
        StaffMember staffMemberObject = null;
        String query = """
            SELECT staff_id, first_name, last_name, email, phone_number, SIN, citizenship_status, 
                   unit_number, street_address, city, postal_code, country, created_by
            FROM   hotelreservationdb.staff_members
            WHERE  email = ?
            """;

        try (Connection connection = DBConnection.getConnection(); 
             PreparedStatement preparedStatement = connection.prepareStatement(query)) {

            preparedStatement.setString(1, email);
            ResultSet resultSet = preparedStatement.executeQuery();

            if (resultSet.next()) {
                staffMemberObject = new StaffMember(
                    resultSet.getString("first_name"),
                    resultSet.getString("last_name"),
                    resultSet.getString("email"),
                    resultSet.getString("phone_number"),
                    resultSet.getInt("SIN"),
                    resultSet.getString("citizenship_status"),
                    resultSet.getString("unit_number"),
                    resultSet.getString("street_address"),
                    resultSet.getString("city"),
                    resultSet.getString("postal_code"),
                    resultSet.getString("country"),
                    resultSet.getInt("created_by")
                );
                staffMemberObject.setStaffId(resultSet.getInt("staff_id"));
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return staffMemberObject;
    }  

}
