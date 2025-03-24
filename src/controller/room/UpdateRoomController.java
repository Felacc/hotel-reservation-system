package controller.room;

import dao.RoomDAO;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;
import model.Room;
import view.HotelRoomUpdateView;

/**
 *
 * @author felix
 */
public class UpdateRoomController {

    private HotelRoomUpdateView hotelRoomUpdateView;
    private RoomDAO roomDAO;

    public UpdateRoomController(HotelRoomUpdateView hotelRoomUpdateView, RoomDAO roomDAO) {
        this.hotelRoomUpdateView = hotelRoomUpdateView;
        this.roomDAO = roomDAO;

        this.hotelRoomUpdateView.getRoomInfoBtnListener(new GetRoomInfo());
        this.hotelRoomUpdateView.updateRoomBtnListener(new UpdateRoomRecord());
        this.hotelRoomUpdateView.clearAllBtnListener(new ClearAllFields());
    }

    private class GetRoomInfo implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            int roomID = Integer.valueOf(hotelRoomUpdateView.getTxtRoomID().getText());

            Room room = roomDAO.fetchRoomByRoomID(roomID);
            String roomNumber = room.getRoomNumber();
            String roomType = room.getRoomType();
            String pricePerNight = String.valueOf(room.getPricePerNight());
            String roomStatus = room.getStatus();
            String updatedBy = String.valueOf(room.getUpdatedBy());

            hotelRoomUpdateView.getTxtRoomNumber().setText(roomNumber);
            hotelRoomUpdateView.getTxtRoomType().setText(roomType);
            hotelRoomUpdateView.getTxtPricePerNight().setText(pricePerNight);
            hotelRoomUpdateView.getTxtRoomStatus().setText(roomStatus);
            hotelRoomUpdateView.getTxtUpdatedBy().setText(updatedBy);
        }
    }

    private class UpdateRoomRecord implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            int roomID = Integer.valueOf(hotelRoomUpdateView.getTxtRoomID().getText());

            String roomNumber = hotelRoomUpdateView.getTxtRoomNumber().getText();
            String roomType = hotelRoomUpdateView.getTxtRoomType().getText();
            double pricePerNight = Double.valueOf(hotelRoomUpdateView.getTxtPricePerNight().getText());
            String roomStatus = hotelRoomUpdateView.getTxtRoomStatus().getText();
            int updatedBy = Integer.valueOf(hotelRoomUpdateView.getTxtUpdatedBy().getText());

            boolean result = roomDAO.updateRoomRecord(roomNumber, roomType, pricePerNight, roomStatus, updatedBy);
            if (result) {
                JOptionPane.showMessageDialog(null, "Successfully updated room record");
            } else {
                JOptionPane.showMessageDialog(null, "Room record does not exist");
            }
        }
    }

    private class ClearAllFields implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            hotelRoomUpdateView.getTxtRoomNumber().setText("");
            hotelRoomUpdateView.getTxtRoomType().setText("");
            hotelRoomUpdateView.getTxtPricePerNight().setText("");
            hotelRoomUpdateView.getTxtRoomStatus().setText("");
            hotelRoomUpdateView.getTxtUpdatedBy().setText("");
        }
    }
}
