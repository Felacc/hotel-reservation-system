/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author felix
 */
public class Employee extends User implements Staff {
    private int SIN;
    private String citizenshipStatus;
    final private String hireDate; // will possibly want to refactor to use date type and instantiate objects with the current date

    public Employee(String firstName, String lastName, String email, String phoneNumber, String address, String password, int SIN, String citizenshipStatus, String hireDate) {
        super(firstName, lastName, email, phoneNumber, address, password);
        this.SIN = SIN;
        this.citizenshipStatus = citizenshipStatus;
        this.hireDate = hireDate;
    }

    
    // Getters

    public int getSIN() {
        return SIN;
    }

    public String getCitizenshipStatus() {
        return citizenshipStatus;
    }

    public String getHireDate() {
        return hireDate;
    }
    
    
    // Protected setters
    // Only employees and admins can set employee specific attributes
    // Hence the protected visibility modifier
    // there isn't one for hire date because I am going to refactor hire date to set itself to the current date at time of object instantiation
    protected void setSIN(int SIN) {
        this.SIN = SIN;
    }
    
    protected void setCitizenshipStatus(String citizenshipStatus) {
        this.citizenshipStatus = citizenshipStatus;
    }
    
    @Override
    public void login() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void updateInfo(String newInfo, String attributeToChange) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void checkInGuest(int bookingNumber) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void checkoutGuest(int bookingNumber) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void updateRoom(int roomNumber, int newRoomNumber) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void viewRoomAvailablity() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void viewRoomAvailability(int roomNumber) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
}

