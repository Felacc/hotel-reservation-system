/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import util.DBConnection;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import model.Guest;


/**
 *
 * @author C0522047
 */

public class GuestDAO {  
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
        String query = "INSERT INTO hotelReservationDB.guests (first_name, last_name, email, phone_number, unit_number, street_address, city, postal_code, country) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?)";
        
        //Connect to database
        try(Connection connection = DBConnection.getConnection();
        //Preparse statement for query
            PreparedStatement preparedStatement = connection.prepareStatement(query)){
            preparedStatement.setString(1,guest.getFirstName()); // first question mark - first name
            preparedStatement.setString(2, guest.getLastName()); // second question mark - last name
            preparedStatement.setString(3, guest.getEmail());
            preparedStatement.setString(4, guest.getPhoneNumber());
            preparedStatement.setString(5, guest.getUnit());
            preparedStatement.setString(6, guest.getStreetAddress());
            preparedStatement.setString(7, guest.getCity());
            preparedStatement.setString(8, guest.getPostalCode());
            preparedStatement.setString(9, guest.getCountry());
            return preparedStatement.executeUpdate() > 0; //successful insertion
        }
        catch(Exception ex){
            ex.printStackTrace();
        }
        return false;
    }
    
    public static boolean deleteGuestRecord(int guestId){
        String query = "DELETE from hotelreservationdb.guests where guest_id = (?)";
        try(Connection connection = DBConnection.getConnection();
        //Preparse statement for query
            PreparedStatement preparedStatement = connection.prepareStatement(query)){
            preparedStatement.setInt(1, guestId);
            return preparedStatement.executeUpdate() > 0; //successful insertion
        }
        catch(Exception ex){
            ex.printStackTrace();
        }
        return false;
    }
    
     public List<Guest> fetchGuestByIdForTable(int id){
        Guest guestObject = null;
        String query = """
            SELECT class.class_id, class.building, class.number,               
                   course.course_id, course.name, course.credit, course.campus
            FROM   class
            JOIN   course ON class.course_id = course.course_id
            WHERE  class.class_id = ?
        """;
        
        try(Connection connection = DBConnection.getConnection();
            PreparedStatement preparedStatement = connection.prepareStatement(query)){
            
            preparedStatement.setInt(1, id);
            
            ResultSet resultSet = preparedStatement.executeQuery();
            
            if(resultSet.next()){
                Class classObject = new Class(
                    resultSet.getString("building"),
                    resultSet.getString("number"),
                    resultSet.getInt("course_id")
                );
                
                classObject.setClassID(resultSet.getInt("class_id"));
                
                Course courseObject = new Course(
                    resultSet.getString("name"),
                    resultSet.getInt("credit")
                );
                
                courseObject.setCampus(resultSet.getString("campus"));
                courseObject.setCourseID(resultSet.getInt("course_id"));
                
                courseAndClassObject = new CourseAndClass(classObject, courseObject);
            }
            
        } catch(SQLException ex){
            ex.printStackTrace();
        }
     
        return courseAndClassObject;
    }

    public List<CourseAndClass> fetchAllClassRecords(){
        CourseAndClass courseAndClassObject = null;
        List<CourseAndClass> courseAndClassList = new ArrayList<CourseAndClass>();
        String query = """
            SELECT class.class_id, class.building, class.number,               
                   course.course_id, course.name, course.credit, course.campus
            FROM   class
            JOIN   course ON class.course_id = course.course_id
        """;
        
        try(Connection connection = DBConnection.getConnection();
            PreparedStatement preparedStatement = connection.prepareStatement(query)){
            
            ResultSet resultSet = preparedStatement.executeQuery();
            
            while(resultSet.next()){
                Class classObject = new Class(
                    resultSet.getString("building"),
                    resultSet.getString("number"),
                    resultSet.getInt("course_id")
                );
                
                classObject.setClassID(resultSet.getInt("class_id"));
                
                Course courseObject = new Course(
                    resultSet.getString("name"),
                    resultSet.getInt("credit")
                );
                
                courseObject.setCampus(resultSet.getString("campus"));
                courseObject.setCourseID(resultSet.getInt("course_id"));
                
                courseAndClassObject = new CourseAndClass(classObject, courseObject);
                
                courseAndClassList.add(courseAndClassObject);
            }
            
        } catch(SQLException ex){
            ex.printStackTrace();
        }
     
        return courseAndClassList;
    }

}