package edu.dsc.hotelreservation.controller.guest;


import edu.dsc.hotelreservation.dao.GuestDAO;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;
import edu.dsc.hotelreservation.view.HotelGuestUpdateView;

/**
 *
 *
 * @author Caleb Irvine
 */
public class UpdateGuestController {
    private HotelGuestUpdateView hotelGuestUpdateView;
    private GuestDAO guestDAO;

    public UpdateGuestController(HotelGuestUpdateView hotelGuestUpdateView, GuestDAO guestDAO) {
        this.hotelGuestUpdateView = hotelGuestUpdateView;
        this.guestDAO = guestDAO;
        
        this.hotelGuestUpdateView.updateFirstNameBtnListener(new UpdateFirstNameRecord());
        this.hotelGuestUpdateView.updateLastNameBtnListener(new UpdateLastNameRecord());
        this.hotelGuestUpdateView.updateEmailBtnListener(new UpdateEmailRecord());
        this.hotelGuestUpdateView.updatePhoneBtnListener(new UpdatePhoneRecord());
        this.hotelGuestUpdateView.updateUnitBtnListener(new UpdateUnitRecord());
        this.hotelGuestUpdateView.updateAddressBtnListener(new UpdateAddressRecord());
        this.hotelGuestUpdateView.updateCityBtnListener(new UpdateCityRecord());
        this.hotelGuestUpdateView.updatePostalBtnListener(new UpdatePostalRecord());
        this.hotelGuestUpdateView.updateCountryBtnListener(new UpdateCountryRecord());
    }

    private class UpdateFirstNameRecord implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            int guestId = Integer.parseInt(hotelGuestUpdateView.getTxtGuestId().getText());
            String firstName = hotelGuestUpdateView.getTxtFirstName().getText();
            String column = "first_name";
            
            boolean result = guestDAO.updateGuestRecord(guestId, column, firstName);
            if (result) {
                JOptionPane.showMessageDialog(null, "Successfully updated Guest");
            } else {
                JOptionPane.showMessageDialog(null, "Guest does not exist");
            }
        }
    }

    private class UpdateLastNameRecord implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            int guestId = Integer.parseInt(hotelGuestUpdateView.getTxtGuestId().getText());
            String lastName = hotelGuestUpdateView.getTxtLastName().getText();
            String column = "last_name";
            
            boolean result = guestDAO.updateGuestRecord(guestId, column, lastName);
            if (result) {
                JOptionPane.showMessageDialog(null, "Successfully updated Guest");
            } else {
                JOptionPane.showMessageDialog(null, "Guest does not exist");
            }
        }
        
    }

    private class UpdateEmailRecord implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            int guestId = Integer.parseInt(hotelGuestUpdateView.getTxtGuestId().getText());
            String email = hotelGuestUpdateView.getTxtEmail().getText();
            String column = "email";
            
            boolean result = guestDAO.updateGuestRecord(guestId, column, email);
            if (result) {
                JOptionPane.showMessageDialog(null, "Successfully updated Guest");
            } else {
                JOptionPane.showMessageDialog(null, "Guest does not exist");
            }
        }  
    }

    private class UpdatePhoneRecord implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
             int guestId = Integer.parseInt(hotelGuestUpdateView.getTxtGuestId().getText());
            String phone = hotelGuestUpdateView.getTxtPhone().getText();
            String column = "phone_number";
            
            boolean result = guestDAO.updateGuestRecord(guestId, column, phone);
            if (result) {
                JOptionPane.showMessageDialog(null, "Successfully updated Guest");
            } else {
                JOptionPane.showMessageDialog(null, "Guest does not exist");
            }
        }
        
    }

    private class UpdateUnitRecord implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
           int guestId = Integer.parseInt(hotelGuestUpdateView.getTxtGuestId().getText());
            String unit = hotelGuestUpdateView.getTxtUnit().getText();
            String column = "unit_number";
            
            boolean result = guestDAO.updateGuestRecord(guestId, column, unit);
            if (result) {
                JOptionPane.showMessageDialog(null, "Successfully updated Guest");
            } else {
                JOptionPane.showMessageDialog(null, "Guest does not exist");
            }
        }
        
    }

    private class UpdateAddressRecord implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            int guestId = Integer.parseInt(hotelGuestUpdateView.getTxtGuestId().getText());
            String address = hotelGuestUpdateView.getTxtStreetAddress().getText();
            String column = "street_address";
            
            boolean result = guestDAO.updateGuestRecord(guestId, column, address);
            if (result) {
                JOptionPane.showMessageDialog(null, "Successfully updated Guest");
            } else {
                JOptionPane.showMessageDialog(null, "Guest does not exist");
            }
        }
        
    }

    private class UpdateCityRecord implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            int guestId = Integer.parseInt(hotelGuestUpdateView.getTxtGuestId().getText());
            String city = hotelGuestUpdateView.getTxtCity().getText();
            String column = "city";
            
            boolean result = guestDAO.updateGuestRecord(guestId, column, city);
            if (result) {
                JOptionPane.showMessageDialog(null, "Successfully updated Guest");
            } else {
                JOptionPane.showMessageDialog(null, "Guest does not exist");
            }
        }
        
    }

    private class UpdatePostalRecord implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            int guestId = Integer.parseInt(hotelGuestUpdateView.getTxtGuestId().getText());
            String postal = hotelGuestUpdateView.getTxtPostal().getText();
            String column = "postal_code";
            
            boolean result = guestDAO.updateGuestRecord(guestId, column, postal);
            if (result) {
                JOptionPane.showMessageDialog(null, "Successfully updated Guest");
            } else {
                JOptionPane.showMessageDialog(null, "Guest does not exist");
            }
        }
        
    }

    private class UpdateCountryRecord implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            int guestId = Integer.parseInt(hotelGuestUpdateView.getTxtGuestId().getText());
            String country = hotelGuestUpdateView.getTxtCountry().getText();
            String column = "country";
            
            boolean result = guestDAO.updateGuestRecord(guestId, column, country);
            if (result) {
                JOptionPane.showMessageDialog(null, "Successfully updated Guest");
            } else {
                JOptionPane.showMessageDialog(null, "Guest does not exist");
            }
        }
        
    }

 

   
}
