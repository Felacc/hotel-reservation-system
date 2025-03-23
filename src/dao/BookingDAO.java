package dao;

import java.time.LocalDate;
import model.Booking;

/**
 *
 * @author felix
 */
public class BookingDAO {
    private Booking booking;
    
    public BookingDAO(Booking booking) {
        this.booking = booking;
    }
    
    public boolean addBookingRecord(Booking booking) {
        return false;
    }
    
    public boolean deleteBookingRecord(int reservationID) {
        return false;
    }
    
    public boolean updateBookingRecord (int reservationID, LocalDate bookingDate, double totalPrice) {
        return false;
    }
    
    public Booking searchBookingByReservationID(int reservationID) {
        return null;
    }
}
