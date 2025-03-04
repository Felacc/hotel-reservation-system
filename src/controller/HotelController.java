/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import dao.HotelDAO;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;
import model.Guest;
import view.HotelGuestRegistrationView;

/**
 *
 *
 * @author kale
 */
public class HotelController {

    private HotelGuestRegistrationView hotelGuestRegistrationView;
    private HotelDAO hotelDAO;

    public HotelController(HotelGuestRegistrationView hotelGuestRegistrationView, HotelDAO hotelDAO) {
        this.hotelGuestRegistrationView = hotelGuestRegistrationView;
        this.hotelDAO = hotelDAO;

        hotelGuestRegistrationView.addGuestBtnListener(new AddGuestRecord());
        hotelGuestRegistrationView.addClearAllBtnListener(new ClearAllTextFields());
    }

    private class ClearAllTextFields implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            hotelGuestRegistrationView.getTxtFirstName().setText("");
            hotelGuestRegistrationView.getTxtLastName().setText("");
            hotelGuestRegistrationView.getTxtAddress().setText("");
            hotelGuestRegistrationView.getTxtBillingAddress().setText("");
            hotelGuestRegistrationView.getTxtPhone().setText("");
//            hotelGuestRegistrationView.setTxtEmail().setText("");
//            hotelGuestRegistrationView.setTxtPassword().setText("");

          
        }
    }

    private class AddGuestRecord implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            String firstName = hotelGuestRegistrationView.getTxtFirstName().getText();
            String lastName = hotelGuestRegistrationView.getTxtLastName().getText();
            String address = hotelGuestRegistrationView.getTxtAddress().getText();
            String billingAddress = hotelGuestRegistrationView.getTxtBillingAddress().getText();
            String phoneNumber = hotelGuestRegistrationView.getTxtPhone().getText();
            String email = hotelGuestRegistrationView.getTxtEmail().getText();
            String password = hotelGuestRegistrationView.getTxtPassword().getText();

            Guest newGuest = new Guest(firstName, lastName, address, billingAddress, phoneNumber, email, password, null);
            boolean result = new hotelDAO.addGuestRecord(newGuest);

             if (firstName.isEmpty() || lastName.isEmpty() || address.isEmpty() || phoneNumber.isEmpty() || email.isEmpty() || password.equals(0)) {
                JOptionPane.showMessageDialog(null,
                        "Please enter all fields",
                        "Try Again Please...",
                        JOptionPane.ERROR_MESSAGE
                );
            } else {
                //
                JOptionPane.showMessageDialog(null, "Form Success");
                //method for DAO - Insert data into SQL table..
            }
             
            if (result) {
                JOptionPane.showMessageDialog(null, "Successfully added a new course");
            } else {
                JOptionPane.showMessageDialog(null, "Was not able to add a new course record");
            }

        }

    }

}
