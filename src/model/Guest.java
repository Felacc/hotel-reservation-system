package model;

import model.User;

/**
 *
 * @author Edwynne Kalugdan
 * @author Caleb Irvine
 */
public class Guest extends User {
    private String billingAdress;
    
    

    // Constructor

    public Guest(String firstName, String lastName, String email, String phoneNumber, String billingAdress, String address, String password) {
        super(firstName, lastName, email, phoneNumber, address, password);
        this.billingAdress = billingAdress;
    }
    
    @Override
    public void login() {
        System.out.println("Guest logged in with email: " + getEmail());
    }

    @Override
    public void updateInfo(String newInfo, String attributeToChange) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
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

