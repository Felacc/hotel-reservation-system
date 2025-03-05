/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author kale
 */

interface Staff {
    //checkin and checkout
    public void checkInGuest(int bookingNumber);
    public void checkoutGuest(int bookingNumber);
     
    //Moving customer to a new room
    public void updateRoom(int roomNumber, int newRoomNumber);
    
    //See what rooms are availible
    public void viewRoomAvailablity();
    //Check specific room
    public void viewRoomAvailability(int roomNumber);
     
     
    //toString staff info
    public String toString();
}


