package app.hotelreservationsystem.controllers.room;

import app.hotelreservationsystem.daos.room.RoomDAO;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;
import javax.swing.table.DefaultTableModel;
import app.hotelreservationsystem.models.room.Room;
import app.hotelreservationsystem.views.room.HotelRoomSearchView;

/**
 *
 * @author felix
 */
public class SearchRoomController {

    private HotelRoomSearchView hotelRoomSearchView;
    private RoomDAO roomDAO;

    public SearchRoomController(HotelRoomSearchView hotelRoomSearchView, RoomDAO roomDAO) {
        this.hotelRoomSearchView = hotelRoomSearchView;
        this.roomDAO = roomDAO;

        this.hotelRoomSearchView.searchRoomByIDBtnListener(new SearchRoomByIDActionListener());
        this.hotelRoomSearchView.searchAllRoomsBtnListener(new SearchAllRoomsActionListener());
    }

    private class SearchAllRoomsActionListener implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            DefaultTableModel model = (DefaultTableModel) hotelRoomSearchView.getTblRooms().getModel();
            model.setRowCount(0);

            List<Room> roomList = roomDAO.fetchAllRooms();
            for (Room room : roomList) {
                Object[] row = {
                    room.getRoomID(),
                    room.getRoomNumber(),
                    room.getRoomType(),
                    room.getPricePerNight(),
                    room.getStatus(),
                    room.getUpdatedBy()
                };
                model.addRow(row);

            }
        }

    }

    private class SearchRoomByIDActionListener implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            int roomID = Integer.valueOf(hotelRoomSearchView.getTxtRoomID().getText());

            Room room = null;

            DefaultTableModel model = (DefaultTableModel) hotelRoomSearchView.getTblRooms().getModel();
            model.setRowCount(0);

            if (roomID != 0) {
                room = roomDAO.fetchRoomByRoomID(roomID);
                Object[] row = {
                    room.getRoomID(),
                    room.getRoomNumber(),
                    room.getRoomType(),
                    room.getPricePerNight(),
                    room.getStatus(),
                    room.getUpdatedBy()
                };
                model.addRow(row);
            }
        }
    }
}
