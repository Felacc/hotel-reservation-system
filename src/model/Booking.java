/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.time.LocalDate;

/**
 *
 * @author felix
 */
public class Booking {
    // Booking info
    private int reservationID;
    private LocalDate bookingDate;
    private double totalPrice;

    // Constructor
    public Booking(int reservationID, LocalDate bookingDate, double totalPrice) {
        this.reservationID = reservationID;
        this.bookingDate = bookingDate;
        this.totalPrice = totalPrice;
    }
    
    // Getters and Setters

    public int getReservationID() {
        return reservationID;
    }

    public void setReservationID(int reservationID) {
        this.reservationID = reservationID;
    }

    public LocalDate getBookingDate() {
        return bookingDate;
    }

    public void setBookingDate(LocalDate bookingDate) {
        this.bookingDate = bookingDate;
    }

    public double getTotalPrice() {
        return totalPrice;
    }

    public void setTotalPrice(double totalPrice) {
        this.totalPrice = totalPrice;
    }
    
    
   
}
