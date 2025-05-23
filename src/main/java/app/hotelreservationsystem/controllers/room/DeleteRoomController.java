package app.hotelreservationsystem.controllers.room;

import app.hotelreservationsystem.daos.room.RoomDAO;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;
import app.hotelreservationsystem.views.room.HotelRoomDeleteView;

/**
 *
 * @author felix
 */
public class DeleteRoomController {
    private HotelRoomDeleteView hotelRoomDeleteView;
    private RoomDAO roomDAO;

    public DeleteRoomController (HotelRoomDeleteView hotelRoomDeleteView, RoomDAO roomDAO) {
        this.hotelRoomDeleteView = hotelRoomDeleteView;
        this.roomDAO = roomDAO;

        hotelRoomDeleteView.deleteRoomBtnListener(new DeleteRoomRecord());
    }

    private class DeleteRoomRecord implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            int roomID = Integer.valueOf(hotelRoomDeleteView.getTxtDeleteRoom().getText());
            boolean result = roomDAO.deleteRoomRecord(roomID);
            if (result) {
                JOptionPane.showMessageDialog(null, "Successfully removed reservation");
            } else {
                JOptionPane.showMessageDialog(null, "Reservation ID does not exist");
            }
        }
    }
}
