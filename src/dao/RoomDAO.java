package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
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
        String query = "INSERT INTO hotelReservationDB.rooms (room_number, room_type, price_per_night, room_status, updated_by) VALUES (?, ?, ?, ?, ?)";

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
}
