package model;

import java.time.LocalDate;

/**
 *
 * @author felix
 */
public class Reservation {
    // Customer that booked, room that they booked, and employee that helped
    private int customerID;
    private int roomID;
    private int employeeID;
    // Check in and check out date
    private LocalDate checkInDate;
    private LocalDate checkOutDate;
    // no clue what this is
    private String status;

    // Constructor
    public Reservation(int customerID, int roomID, int employeeID, LocalDate checkInDate, LocalDate checkOutDate, String status) {
        this.customerID = customerID;
        this.roomID = roomID;
        this.employeeID = employeeID;
        this.checkInDate = checkInDate;
        this.checkOutDate = checkOutDate;
        this.status = status;
    }
    
    // Getters and Setters
    public int getCustomerID() {
        return customerID;
    }

    public void setCustomerID(int customerID) {
        this.customerID = customerID;
    }

    public int getRoomID() {
        return roomID;
    }

    public void setRoomID(int roomID) {
        this.roomID = roomID;
    }

    public int getEmployeeID() {
        return employeeID;
    }

    public void setEmployeeID(int employeeID) {
        this.employeeID = employeeID;
    }

    public LocalDate getCheckInDate() {
        return checkInDate;
    }

    public void setCheckInDate(LocalDate checkInDate) {
        this.checkInDate = checkInDate;
    }

    public LocalDate getCheckOutDate() {
        return checkOutDate;
    }

    public void setCheckOutDate(LocalDate checkOutDate) {
        this.checkOutDate = checkOutDate;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
    
    
    
    
    
}
