package edu.dsc.hotelreservation.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import edu.dsc.hotelreservation.model.Reservation;
import edu.dsc.hotelreservation.util.DBConnection;

/**
 *
 * @author felix
 */
public class ReservationDAO {

    public ReservationDAO() {

    }

    public boolean addReservationRecord(Reservation reservation) {
        //The ?, ? values are not known yet
        String query = "INSERT INTO hotelreservationdb.reservations (customer_id, room_id, employee_id, check_in_date, check_out_date, reservation_status) VALUES (?, ?, ?, ?, ?, ?)";

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
        String query = "DELETE FROM hotelReservationdb.reservations WHERE reservation_id = ?";
        try (Connection connection = DBConnection.getConnection(); // Prepared statement for query
                 PreparedStatement preparedStatement = connection.prepareStatement(query)) {
            preparedStatement.setInt(1, reservationID);
            return preparedStatement.executeUpdate() > 0; //successful insertion
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return false;
    }
    
    public boolean updateReservationRecord(int customerID, int roomID, int employeeID, String checkInDate, String checkOutDate, String status) {
        String query = "UPDATE reservations SET customer_id = ?, room_id = ?, employee_id = ?, check_in_date = ?, check_out_date = ?, reservation_status = ?"
                + " WHERE reservation_id = ?";
        try (Connection connection = DBConnection.getConnection(); 
                PreparedStatement preparedStatement = connection.prepareStatement(query)) { //Prepared statement for query
            preparedStatement.setInt(1, customerID);
            preparedStatement.setInt(2, roomID);
            preparedStatement.setInt(3, employeeID);
            preparedStatement.setString(4, checkInDate);
            preparedStatement.setString(5, checkOutDate);
            preparedStatement.setString(6, status);
            return preparedStatement.executeUpdate() > 0; //successful insertion
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return false;
    }

    public Reservation fetchReservationByReservationID(int reservationID) {
        Reservation reservation = null;
        String query
                = """
            SELECT *
            FROM   hotelreservationdb.reservations
            WHERE  reservation_id = ?
        """;

        try (Connection connection = DBConnection.getConnection(); PreparedStatement preparedStatement = connection.prepareStatement(query)) {

            preparedStatement.setInt(1, reservationID);

            ResultSet resultSet = preparedStatement.executeQuery();

            if (resultSet.next()) {
                reservation = new Reservation(
                        resultSet.getInt("customer_id"),
                        resultSet.getInt("room_id"),
                        resultSet.getInt("employee_id"),
                        resultSet.getString("check_in_date"),
                        resultSet.getString("check_out_date"),
                        resultSet.getString("reservation_status")
                );
                reservation.setReservationID(resultSet.getInt("reservation_id"));
            }

        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return reservation;
    }

    public List<Reservation> fetchAllReservations() {
        List<Reservation> reservationList = new ArrayList<>();
        String query
                = """
           SELECT *
           FROM  reservations
        """;

        try (Connection connection = DBConnection.getConnection(); PreparedStatement preparedStatement = connection.prepareStatement(query)) {

            ResultSet resultSet = preparedStatement.executeQuery();

            while (resultSet.next()) {
                Reservation reservation = new Reservation (
                        resultSet.getInt("customer_id"),
                        resultSet.getInt("room_id"),
                        resultSet.getInt("employee_id"),
                        resultSet.getString("check_in_date"),
                        resultSet.getString("check_out_date"),
                        resultSet.getString("reservation_status")
                );
                reservation.setReservationID(resultSet.getInt("reservation_id"));
                reservationList.add(reservation);
            }

        } catch (SQLException ex) {
            ex.printStackTrace();
        }

        return reservationList;
    }

}
