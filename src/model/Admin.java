/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package model;

import java.util.HashSet;
import java.util.Set;

/**
 *
 * @author kale
 */

// Admins will be determined by using an SQL query to check if the role of the user is admin.
// If the role is admin then we will create an admin object instead of an employee object, so that it will have the extra permissions
public class Admin extends Employee {
    
    public Admin(String firstName, String lastName, String email, String phoneNumber, String address, String password, int SIN, String citizenshipStatus, String hireDate) {
        super(firstName, lastName, email, phoneNumber, address, password, SIN, citizenshipStatus, hireDate);
    }
    
    
    // Methods for setting employee info
    public void setEmployeeSIN(Employee emp, int SIN) {
        emp.setSIN(SIN);
    }
    
    public void setEmployeeCitizenshipStatus(Employee emp, String citizenshipStatus) {
        emp.setCitizenshipStatus(citizenshipStatus);
    }
    
    public void changeRoomPrice(Room room) {
        System.out.println("to be implemented....");
    }
    
        // Not sure what these methods will do yet:
    
//    public void manageStaff(Employee emp) {
//        
//    }
//    
//    public void manageRoom(Room room) {
//        
//    }
}