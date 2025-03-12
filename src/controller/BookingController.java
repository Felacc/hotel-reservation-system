/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import dao.BookingDAO;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;
import model.Booking;
import view.HotelBookingAddView;

/**
 *
 *
 * @author kale
 */
public class BookingController {
    private HotelBookingAddView hotelBookingRegistrationView;
    private BookingDAO BookingDAO;

    public BookingController(HotelBookingAddView hotelBookingRegistrationView, BookingDAO BookingDAO) {
        this.hotelBookingRegistrationView = hotelBookingRegistrationView;
        this.BookingDAO = BookingDAO;

        
        //We need to make event listeners
//        hotelBookingRegistrationView.addBookingBtnListener(new AddBookingRecord());
//        hotelBookingRegistrationView.addClearAllBtnListener(new ClearAllTextFields());
    }

    private class ClearAllTextFields implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            hotelBookingRegistrationView.getTxtFirstName().setText("");
            hotelBookingRegistrationView.getTxtFirstName().setText("");
            hotelBookingRegistrationView.getTxtLastName().setText("");
            hotelBookingRegistrationView.getTxtAddress().setText("");
            hotelBookingRegistrationView.getTxtBillingAddress().setText("");
            hotelBookingRegistrationView.getTxtPhone().setText("");
            hotelBookingRegistrationView.getTxtEmail().setText("");
            hotelBookingRegistrationView.getTxtPassword().setText("");
        }
    }

    private class AddBookingRecord implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {


           
            boolean result = BookingDAO.addBookingRecord(newBooking);
       //make this result once implemented)
            if (result) {
                JOptionPane.showMessageDialog(null, "Successfully added a new course");
            } else {
                JOptionPane.showMessageDialog(null, "Was not able to add a new course record");
            }

        }

    }

}
