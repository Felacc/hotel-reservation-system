/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import dao.GuestDAO;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;
import model.Guest;
import view.HotelGuestAddView;



/**
 *
 *
 * @author kale
 */
public class AddGuestController {
    private HotelGuestAddView addHotelGuestView;
    private GuestDAO guestDAO;

    public AddGuestController(HotelGuestAddView hotelGuestRegistrationView, GuestDAO guestDAO) {
        this.addHotelGuestView = hotelGuestRegistrationView;
        this.guestDAO = guestDAO;

        hotelGuestRegistrationView.addGuestBtnListener(new AddGuestRecord());
        hotelGuestRegistrationView.clearAllBtnListener(new ClearAllTextFields());
    }

    private class ClearAllTextFields implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            addHotelGuestView.getTxtFirstName().setText("");
            addHotelGuestView.getTxtFirstName().setText("");
            addHotelGuestView.getTxtLastName().setText("");
            addHotelGuestView.getTxtAddress().setText("");
            addHotelGuestView.getTxtBillingAddress().setText("");
            addHotelGuestView.getTxtPhone().setText("");
            addHotelGuestView.getTxtEmail().setText("");
            addHotelGuestView.getTxtPassword().setText("");
        }
    }
    private class AddGuestRecord implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            String firstName = addHotelGuestView.getTxtFirstName().getText();
            String lastName = addHotelGuestView.getTxtLastName().getText();
            String address = addHotelGuestView.getTxtAddress().getText();
            String phoneNumber = addHotelGuestView.getTxtPhone().getText();
            String email = addHotelGuestView.getTxtEmail().getText();
            String password = addHotelGuestView.getTxtPassword().getText();

            Guest newGuest = new Guest(firstName,lastName, email, phoneNumber, address, city, postalCode, country, userID, username, password, userType);
            boolean result = guestDAO.addGuestRecord(newGuest);
       //make this result once implemented)
            if (result) {
                JOptionPane.showMessageDialog(null, "Successfully added a new course");
            } else {
                JOptionPane.showMessageDialog(null, "Was not able to add a new course record");
            }
        }
    } 
}
