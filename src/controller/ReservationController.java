/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import dao.ReservationDAO;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;
import model.Reservation;
import view.HotelReservationAddView;

/**
 *
 *
 * @author kale
 */
public class ReservationController {
    private HotelReservationAddView hotelReservationRegistrationView;
    private ReservationDAO ReservationDAO;

    public ReservationController(HotelReservationAddView hotelReservationRegistrationView, ReservationDAO ReservationDAO) {
        this.hotelReservationRegistrationView = hotelReservationRegistrationView;
        this.ReservationDAO = ReservationDAO;

        
        //We need to make event listeners
//        hotelReservationRegistrationView.addReservationBtnListener(new AddReservationRecord());
//        hotelReservationRegistrationView.addClearAllBtnListener(new ClearAllTextFields());
    }

    private class ClearAllTextFields implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            hotelReservationRegistrationView.getTxtFirstName().setText("");
            hotelReservationRegistrationView.getTxtFirstName().setText("");
            hotelReservationRegistrationView.getTxtLastName().setText("");
            hotelReservationRegistrationView.getTxtAddress().setText("");
            hotelReservationRegistrationView.getTxtBillingAddress().setText("");
            hotelReservationRegistrationView.getTxtPhone().setText("");
            hotelReservationRegistrationView.getTxtEmail().setText("");
            hotelReservationRegistrationView.getTxtPassword().setText("");
        }
    }

    private class AddReservationRecord implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {


           
            boolean result = ReservationDAO.addReservationRecord(newReservation);
       //make this result once implemented)
            if (result) {
                JOptionPane.showMessageDialog(null, "Successfully added a new course");
            } else {
                JOptionPane.showMessageDialog(null, "Was not able to add a new course record");
            }

        }

    }

}
