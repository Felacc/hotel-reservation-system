package controller.room;

import dao.RoomDAO;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;
import model.Room;
import view.HotelRoomAddView;

/**
 *
 * @author felix
 */
public class AddRoomController {
    private RoomDAO roomDAO;
    private HotelRoomAddView hotelRoomAddView;
    
    public AddRoomController(RoomDAO roomDAO, HotelRoomAddView hotelRoomAddView) {
        this.roomDAO = roomDAO;
        this.hotelRoomAddView = hotelRoomAddView;
        
        this.hotelRoomAddView.addRoomBtnListener(new AddRoomRecord());
        this.hotelRoomAddView.clearAllBtnListener(new ClearAllTextFields());
    }
    
    private class AddRoomRecord implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            String roomNumber = hotelRoomAddView.getTxtRoomNumber().getText();
            String roomType = hotelRoomAddView.getTxtRoomType().getText();
            double pricePerNight = Double.valueOf(hotelRoomAddView.getTxtPricePerNight().getText());
            String status = hotelRoomAddView.getTxtRoomStatus().getText();
            int updatedBy = Integer.valueOf(hotelRoomAddView.getTxtUpdatedBy().getText());
            
            
            Room newRoom = new Room (roomNumber, roomType, pricePerNight, status, updatedBy);
            
            boolean result = roomDAO.addRoomRecord(newRoom);
            if (result) {
                JOptionPane.showMessageDialog(null, "Room successfully added!");
            } else {
                JOptionPane.showMessageDialog(null, "Was not able to add room :(");
            }
        }
    }
    
    private class ClearAllTextFields implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            hotelRoomAddView.getTxtRoomNumber().setText("");
            hotelRoomAddView.getTxtRoomType().setText("");
            hotelRoomAddView.getTxtPricePerNight().setText("");
            hotelRoomAddView.getTxtRoomStatus().setText("");
            hotelRoomAddView.getTxtUpdatedBy().setText("");
        }
    }
}
