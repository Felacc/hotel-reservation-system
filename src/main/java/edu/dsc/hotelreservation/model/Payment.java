package edu.dsc.hotelreservation.model;

import java.time.LocalDate;

/**
 *
 * @author felix
 */
public class Payment {
    // Payment info
    private int bookingID;
    private int employeeID;
    private LocalDate paymentDate;
    private double amountPaid;
    private String paymentMethod;
    private String paymentStatus; // "paid" or "not paid" I guess
    
    // Constructor
    public Payment(int bookingID, int employeeID, LocalDate paymentDate, double amountPaid, String paymentMethod, String paymentStatus) {
        this.bookingID = bookingID;
        this.employeeID = employeeID;
        this.paymentDate = paymentDate;
        this.amountPaid = amountPaid;
        this.paymentMethod = paymentMethod;
        this.paymentStatus = paymentStatus;
    }
    
    // Getters and Setters
    public int getBookingID() {
        return bookingID;
    }

    public void setBookingID(int bookingID) {
        this.bookingID = bookingID;
    }

    public int getEmployeeID() {
        return employeeID;
    }

    public void setEmployeeID(int employeeID) {
        this.employeeID = employeeID;
    }

    public LocalDate getPaymentDate() {
        return paymentDate;
    }

    public void setPaymentDate(LocalDate paymentDate) {
        this.paymentDate = paymentDate;
    }

    public double getAmountPaid() {
        return amountPaid;
    }

    public void setAmountPaid(double amountPaid) {
        this.amountPaid = amountPaid;
    }

    public String getPaymentMethod() {
        return paymentMethod;
    }

    public void setPaymentMethod(String paymentMethod) {
        this.paymentMethod = paymentMethod;
    }

    public String getPaymentStatus() {
        return paymentStatus;
    }

    public void setPaymentStatus(String paymentStatus) {
        this.paymentStatus = paymentStatus;
    }
    
}
