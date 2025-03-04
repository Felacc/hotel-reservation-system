package model;

import model.User;

/**
 *
 * @author Edwynne Kalugdan
 */
public class Guest extends User {
    private String billingAdress;
    
    

    // Constructor
   

    public Guest(String billingAdress, String email, String phoneNumber, String address, String password, int userID) {
        super(email, phoneNumber, address, password, userID);
        this.billingAdress = billingAdress;
    }

    
    
    @Override
    public void login() {
        System.out.println("Guest logged in with email: " + getEmail());
    }

    @Override
    public void updateInfo(String newEmail, String newPhoneNumber, String newAddress) {
        setEmail(newEmail);
        setPhoneNumber(newPhoneNumber);
        setAddress(newAddress);
        System.out.println("Guest information updated.");
    }

    // Guest-specific methods
    public void checkInGuest(int bookingNumber) {
        System.out.println("Guest checked in with booking number: " + bookingNumber);
    }

    public void checkOutGuest(int bookingNumber) {
        System.out.println("Guest checked out with booking number: " + bookingNumber);
    }

    public void updateRoom(int bookingNumber) {
        System.out.println("Room updated for booking number: " + bookingNumber);
    }

    public void viewRoomAvailability() {
        System.out.println("Displaying room availability...");
    }

    // Getters and setters

    public String getBillingAdress() {
        return billingAdress;
    }

    public void setBillingAdress(String billingAdress) {
        this.billingAdress = billingAdress;
    }
    
}

