package edu.dsc.hotelreservation.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import edu.dsc.hotelreservation.model.Booking;
import edu.dsc.hotelreservation.util.DBConnection;

/**
 *
 * @author felix
 */
public class BookingDAO {
    
    public BookingDAO() {
        
    }

    public boolean addBookingRecord(Booking booking) {
        //The ?, ? values are not known yet
        String query = "INSERT INTO hotelreservationdb.bookings (reservation_id, booking_date, total_price) VALUES (?, ?, ?)";

        //Connect to database
        try (Connection connection = DBConnection.getConnection(); // Prepared statement for query
                 PreparedStatement preparedStatement = connection.prepareStatement(query)) {
            preparedStatement.setInt(1, booking.getReservationID());
            preparedStatement.setString(2, booking.getBookingDate());
            preparedStatement.setDouble(3, booking.getTotalPrice());
            return preparedStatement.executeUpdate() > 0; //successful insertion
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return false;
    }

    public boolean deleteBookingRecord(int bookingID) {
        String query = "DELETE FROM hotelreservationdb.bookings WHERE booking_id = (?)";
        try (Connection connection = DBConnection.getConnection(); //Prepared statement for query
                 PreparedStatement preparedStatement = connection.prepareStatement(query)) {
            preparedStatement.setInt(1, bookingID);
            return preparedStatement.executeUpdate() > 0; //successful insertion
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return false;
    }

    public boolean updateBookingRecord(int bookingID, int reservationID, String bookingDate, double totalPrice) {
        String query = "UPDATE bookings SET reservation_id = ?, booking_date = ?, total_price = ? WHERE booking_id = ?";
        try (Connection connection = DBConnection.getConnection(); 
                PreparedStatement preparedStatement = connection.prepareStatement(query)) { //Prepared statement for query
            preparedStatement.setInt(1, reservationID);
            preparedStatement.setString(2, bookingDate);
            preparedStatement.setDouble(3, totalPrice);
            preparedStatement.setInt(4, bookingID);
            return preparedStatement.executeUpdate() > 0; //successful insertion
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return false;
    }

    public Booking fetchBookingByBookingID(int bookingID) {
        Booking booking = null;
        String query
                = """
            SELECT booking_id, reservation_id, booking_date, total_price
            FROM   hotelreservationdb.bookings
            WHERE  booking_id = ?
        """;

        try (Connection connection = DBConnection.getConnection(); PreparedStatement preparedStatement = connection.prepareStatement(query)) {

            preparedStatement.setInt(1, bookingID);

            ResultSet resultSet = preparedStatement.executeQuery();

            if (resultSet.next()) {
                booking = new Booking(
                        resultSet.getInt("reservation_id"),
                        resultSet.getString("booking_date"),
                        resultSet.getDouble("total_price")
                );
                booking.setBookingID(resultSet.getInt("booking_id"));
            }

        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return booking;
    }

    public List<Booking> fetchAllBookings() {
        List<Booking> bookingList = new ArrayList<>();
        String query
                = """
           SELECT *
           FROM  bookings
        """;

        try (Connection connection = DBConnection.getConnection(); PreparedStatement preparedStatement = connection.prepareStatement(query)) {

            ResultSet resultSet = preparedStatement.executeQuery();

            while (resultSet.next()) {
                Booking booking = new Booking(
                        resultSet.getInt("reservation_id"),
                        resultSet.getString("booking_date"),
                        resultSet.getDouble("total_price")
                );
                booking.setBookingID(resultSet.getInt("booking_id"));
                bookingList.add(booking);
            }

        } catch (SQLException ex) {
            ex.printStackTrace();
        }

        return bookingList;
    }
}
