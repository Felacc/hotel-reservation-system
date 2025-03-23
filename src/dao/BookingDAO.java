package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.time.LocalDate;
import model.Booking;
import util.DBConnection;

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
        //The ?, ? values are not known yet
        String query = "INSERT INTO hotelReservationDB.bookings (reservation_id, booking_date, total_price) VALUES (?, ?, ?)";

        //Connect to database
        try (Connection connection = DBConnection.getConnection(); // Prepared statement for query
                 PreparedStatement preparedStatement = connection.prepareStatement(query)) {
            preparedStatement.setInt(1, booking.getReservationID()); // first question mark - first name
            preparedStatement.setString(2, booking.getBookingDate()); // second question mark - last name
            preparedStatement.setDouble(3, booking.getTotalPrice());
            return preparedStatement.executeUpdate() > 0; //successful insertion
        } catch (Exception ex) {
            ex.printStackTrace();
        }
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
