package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import model.Room;
import util.DBConnection;

/**
 *
 * @author felix
 */
public class RoomDAO {
    
    public RoomDAO () {
        
    }
    
    public boolean addRoomRecord(Room room) {
        //The ?, ? values are not known yet
        String query = "INSERT INTO hotelreservationdb.rooms (room_number, room_type, price_per_night, room_status, updated_by) VALUES (?, ?, ?, ?, ?)";

        //Connect to database
        try (Connection connection = DBConnection.getConnection(); // Prepared statement for query
                 PreparedStatement preparedStatement = connection.prepareStatement(query)) {
            preparedStatement.setString(1, room.getRoomNumber());
            preparedStatement.setString(2, room.getRoomType());
            preparedStatement.setDouble(3, room.getPricePerNight());
            preparedStatement.setString(4, room.getStatus());
            preparedStatement.setInt(5, room.getUpdatedBy());
            return preparedStatement.executeUpdate() > 0; //successful insertion
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return false;
    }
    
    public boolean deleteRoomRecord(int roomID) {
        String query = "DELETE FROM hotelreservationdb.rooms WHERE room_id = ?";
        try (Connection connection = DBConnection.getConnection(); // Prepared statement for query
                 PreparedStatement preparedStatement = connection.prepareStatement(query)) {
            preparedStatement.setInt(1, roomID);
            return preparedStatement.executeUpdate() > 0; //successful insertion
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return false;
    }
    
    
    public boolean updateRoomRecord(String roomNumber, String roomType, double pricePerNight, String roomStatus, int updatedBy) {
        String query = "UPDATE rooms SET room_number = ?, room_type = ?, price_per_night = ?, room_status = ?, updated_by = ?"
                + " WHERE room_id = ?";
        try (Connection connection = DBConnection.getConnection(); 
                PreparedStatement preparedStatement = connection.prepareStatement(query)) { //Prepared statement for query
            preparedStatement.setString(1, roomNumber);
            preparedStatement.setString(2, roomType);
            preparedStatement.setDouble(3, pricePerNight);
            preparedStatement.setString(4, roomStatus);
            preparedStatement.setInt(5, updatedBy);
            return preparedStatement.executeUpdate() > 0; //successful insertion
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return false;
    }
    
    
    public Room fetchRoomByRoomID(int roomID) {
        Room room = null;
        String query
                = """
            SELECT *
            FROM   hotelreservationdb.rooms
            WHERE  room_id = ?
        """;

        try (Connection connection = DBConnection.getConnection(); PreparedStatement preparedStatement = connection.prepareStatement(query)) {

            preparedStatement.setInt(1, roomID);

            ResultSet resultSet = preparedStatement.executeQuery();

            if (resultSet.next()) {
                room = new Room (
                        resultSet.getString("room_number"),
                        resultSet.getString("room_type"),
                        resultSet.getDouble("price_per_night"),
                        resultSet.getString("room_status"),
                        resultSet.getInt("updated_by")
                );
                room.setRoomID(resultSet.getInt("room_id"));
            }

        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return room;
    }

    public List<Room> fetchAllRooms() {
        List<Room> roomList = new ArrayList<>();
        String query
                = """
           SELECT *
           FROM  rooms
        """;

        try (Connection connection = DBConnection.getConnection(); PreparedStatement preparedStatement = connection.prepareStatement(query)) {

            ResultSet resultSet = preparedStatement.executeQuery();

            while (resultSet.next()) {
                Room room = new Room (
                        resultSet.getString("room_number"),
                        resultSet.getString("room_type"),
                        resultSet.getDouble("price_per_night"),
                        resultSet.getString("room_status"),
                        resultSet.getInt("updated_by")
                );
                room.setRoomID(resultSet.getInt("room_id"));
                roomList.add(room);
            }

        } catch (SQLException ex) {
            ex.printStackTrace();
        }

        return roomList;
    }
}
