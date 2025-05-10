package edu.dsc.hotelreservation.model;

/**
 *
 * @author felix
 */
public class Room {
    // Primary key - auto incremented
    private int roomID;
    // Room info
    private String roomNumber; // used string in case of rooms like "101A"
    private String roomType;
    private double pricePerNight;
    private String status; // "booked" or "not booked"
    private int updatedBy; // Reference to the employee who updates room info
    
    // Constructor
    public Room(String roomNumber, String roomType, double pricePerNight, String status, int updatedBy) {
        this.roomNumber = roomNumber;
        this.roomType = roomType;
        this.pricePerNight = pricePerNight;
        this.status = status;
        this.updatedBy = updatedBy;
    }
    
    // Getters and Setters

    public int getRoomID() {
        return roomID;
    }

    public void setRoomID(int roomID) {
        this.roomID = roomID;
    }
    
    public String getRoomNumber() {
        return roomNumber;
    }

    public void setRoomNumber(String roomNumber) {
        this.roomNumber = roomNumber;
    }

    public String getRoomType() {
        return roomType;
    }

    public void setRoomType(String roomType) {
        this.roomType = roomType;
    }

    public double getPricePerNight() {
        return pricePerNight;
    }

    public void setPricePerNight(double pricePerNight) {
        this.pricePerNight = pricePerNight;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public int getUpdatedBy() {
        return updatedBy;
    }

    public void setUpdatedBy(int updatedBy) {
        this.updatedBy = updatedBy;
    }
    
    
    
    
    
     
}
