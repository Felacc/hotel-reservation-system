package model;

/**
 *
 * @author felix
 */
public class Booking {
    // Booking info
    private int bookingID;
    private int reservationID;
    private String bookingDate;
    private double totalPrice;

    // Constructor
    public Booking(int reservationID, String bookingDate, double totalPrice) {
        this.bookingID = -1;
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

    public String getBookingDate() {
        return bookingDate;
    }

    public void setBookingDate(String bookingDate) {
        this.bookingDate = bookingDate;
    }

    public double getTotalPrice() {
        return totalPrice;
    }

    public void setTotalPrice(double totalPrice) {
        this.totalPrice = totalPrice;
    }
    
    public int getBookingID() {
        return bookingID;
    }

    public void setBookingID(int bookingID) {
        this.bookingID = bookingID;
    }

}
