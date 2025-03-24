package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import model.Reservation;
import util.DBConnection;

/**
 *
 * @author felix
 */
public class ReservationDAO {

    public ReservationDAO() {

    }

    public boolean addReservationRecord(Reservation reservation) {
        //The ?, ? values are not known yet
        String query = "INSERT INTO hotelReservationDB.reservations (customer_id, room_id, employee_id, check_in_date, check_out_date, reservation_status) VALUES (?, ?, ?, ?, ?, ?)";

        //Connect to database
        try (Connection connection = DBConnection.getConnection(); // Prepared statement for query
                 PreparedStatement preparedStatement = connection.prepareStatement(query)) {
            preparedStatement.setInt(1, reservation.getCustomerID());
            preparedStatement.setInt(2, reservation.getRoomID());
            preparedStatement.setInt(3, reservation.getEmployeeID());
            preparedStatement.setString(4, reservation.getCheckInDate());
            preparedStatement.setString(5, reservation.getCheckOutDate());
            preparedStatement.setString(6, reservation.getStatus());
            return preparedStatement.executeUpdate() > 0; //successful insertion
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return false;
    }

    public boolean deleteReservationRecord(int reservationID) {
        String query = "DELETE FROM hotelReservationDB.reservations WHERE reservation_id = (?)";
        try (Connection connection = DBConnection.getConnection(); // Prepared statement for query
                 PreparedStatement preparedStatement = connection.prepareStatement(query)) {
            preparedStatement.setInt(1, reservationID);
            return preparedStatement.executeUpdate() > 0; //successful insertion
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return false;
    }

}
