/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller.guest;

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
    private HotelGuestAddView hotelGuestAddView;
    private GuestDAO guestDAO;

    public AddGuestController(HotelGuestAddView hotelGuestRegistrationView, GuestDAO guestDAO) {
        this.hotelGuestAddView = hotelGuestRegistrationView;
        this.guestDAO = guestDAO;

        hotelGuestRegistrationView.addGuestBtnListener(new AddGuestRecord());
        hotelGuestRegistrationView.clearAllBtnListener(new ClearAllTextFields());
    }

    private class ClearAllTextFields implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            hotelGuestAddView.getTxtFirstName().setText("");
            hotelGuestAddView.getTxtLastName().setText("");
            hotelGuestAddView.getTxtUnit().setText("");
            hotelGuestAddView.getTxtStreetAddress().setText("");
            hotelGuestAddView.getTxtCity().setText("");
            hotelGuestAddView.getTxtPostalCode().setText("");
            hotelGuestAddView.getTxtEmail().setText("");
            hotelGuestAddView.getTxtPhone().setText("");
            hotelGuestAddView.getTxtCountry().setText("");
        }
    }
    private class AddGuestRecord implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            String firstName = hotelGuestAddView.getTxtFirstName().getText();
            String lastName = hotelGuestAddView.getTxtLastName().getText();
            String unit = hotelGuestAddView.getTxtUnit().getText();
            String address = hotelGuestAddView.getTxtStreetAddress().getText();
            String city = hotelGuestAddView.getTxtCity().getText();
            String postal = hotelGuestAddView.getTxtPostalCode().getText();
            String country = hotelGuestAddView.getTxtCountry().getText();
            String email = hotelGuestAddView.getTxtEmail().getText();
            String phone = hotelGuestAddView.getTxtPhone().getText();
          

            Guest newGuest = new Guest(firstName,lastName, email, phone, unit, address, city, postal, country);
            boolean result = guestDAO.addGuestRecord(newGuest);
            if (result) {
                JOptionPane.showMessageDialog(null, "Successfully added a new guest");
            } else {
                JOptionPane.showMessageDialog(null, "Was not able to add a new guest record");
            }
        }
    } 
}
