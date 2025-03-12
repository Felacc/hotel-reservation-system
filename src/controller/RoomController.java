/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import dao.RoomDAO;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;
import model.Room;
import view.HotelRoomAddView;

/**
 *
 *
 * @author kale
 */
public class RoomController {
    private HotelRoomAddView hotelRoomRegistrationView;
    private RoomDAO RoomDAO;

    public RoomController(HotelRoomAddView hotelRoomRegistrationView, RoomDAO RoomDAO) {
        this.hotelRoomRegistrationView = hotelRoomRegistrationView;
        this.RoomDAO = RoomDAO;

        
        //We need to make event listeners
//        hotelRoomRegistrationView.addRoomBtnListener(new AddRoomRecord());
//        hotelRoomRegistrationView.addClearAllBtnListener(new ClearAllTextFields());
    }

    private class ClearAllTextFields implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            hotelRoomRegistrationView.getTxtFirstName().setText("");
            hotelRoomRegistrationView.getTxtFirstName().setText("");
            hotelRoomRegistrationView.getTxtLastName().setText("");
            hotelRoomRegistrationView.getTxtAddress().setText("");
            hotelRoomRegistrationView.getTxtBillingAddress().setText("");
            hotelRoomRegistrationView.getTxtPhone().setText("");
            hotelRoomRegistrationView.getTxtEmail().setText("");
            hotelRoomRegistrationView.getTxtPassword().setText("");
        }
    }

    private class AddRoomRecord implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {


           
            boolean result = RoomDAO.addRoomRecord(newRoom);
       //make this result once implemented)
            if (result) {
                JOptionPane.showMessageDialog(null, "Successfully added a new course");
            } else {
                JOptionPane.showMessageDialog(null, "Was not able to add a new course record");
            }

        }

    }

}
