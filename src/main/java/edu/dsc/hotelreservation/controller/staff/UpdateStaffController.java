package edu.dsc.hotelreservation.controller.staff;

import edu.dsc.hotelreservation.dao.StaffMemberDAO;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;
import edu.dsc.hotelreservation.view.HotelStaffUpdateView;

/**
 *
 *
 * @author kale
 */
public class UpdateStaffController {
    private HotelStaffUpdateView hotelStaffUpdateView;
    private StaffMemberDAO staffDAO;

    public UpdateStaffController(HotelStaffUpdateView hotelstaffUpdateView, StaffMemberDAO staffDAO) {
        this.hotelStaffUpdateView = hotelstaffUpdateView;
        this.staffDAO = staffDAO;
        
        this.hotelStaffUpdateView.updateFirstNameBtnListener(new UpdateFirstNameRecord());
        this.hotelStaffUpdateView.updateLastNameBtnListener(new UpdateLastNameRecord());
        this.hotelStaffUpdateView.updateEmailBtnListener(new UpdateEmailRecord());
        this.hotelStaffUpdateView.updatePhoneBtnListener(new UpdatesPhoneRecord());
        this.hotelStaffUpdateView.updateSINBtnListener(new UpdateSINRecord());
        this.hotelStaffUpdateView.updateCitizenBtnListener(new UpdateCitizenRecord());
        this.hotelStaffUpdateView.updateUnitBtnListener(new updateUnitRecord());
        this.hotelStaffUpdateView.updateAddressBtnListener(new UpdateAddressRecord());
        this.hotelStaffUpdateView.updateCityBtnListener(new UpdateCityRecord());
        this.hotelStaffUpdateView.updatePostalBtnListener(new UpdatePostalRecord());
        this.hotelStaffUpdateView.updateCountryBtnListener(new UpdateCountryRecord());
    }

    private class UpdateCitizenRecord implements ActionListener {

       @Override
        public void actionPerformed(ActionEvent e) {
            int staffId = Integer.parseInt(hotelStaffUpdateView.getTxtStaffId().getText());
            String status = hotelStaffUpdateView.getBoxCitizenType().getSelectedItem().toString().toLowerCase();
            String column = "citizenship_status";
            
            boolean result = staffDAO.updateStaffMemberRecord(staffId, column, status);
            if (result) {
                JOptionPane.showMessageDialog(null, "Successfully updated Staff");
            } else {
                JOptionPane.showMessageDialog(null, "Staff does not exist");
            }
        }
    }

    private class UpdateFirstNameRecord implements ActionListener {

       @Override
        public void actionPerformed(ActionEvent e) {
            int staffId = Integer.parseInt(hotelStaffUpdateView.getTxtStaffId().getText());
            String firstName = hotelStaffUpdateView.getTxtStaffFirstName().getText();
            String column = "first_name";
            
            boolean result = staffDAO.updateStaffMemberRecord(staffId, column, firstName);
            if (result) {
                JOptionPane.showMessageDialog(null, "Successfully updated Staff");
            } else {
                JOptionPane.showMessageDialog(null, "Staff does not exist");
            }
        }
    }

    private class UpdateLastNameRecord implements ActionListener {

       @Override
        public void actionPerformed(ActionEvent e) {
            int staffId = Integer.parseInt(hotelStaffUpdateView.getTxtStaffId().getText());
            String lastName = hotelStaffUpdateView.getTxtStaffLastName().getText();
            String column = "last_name";
            
            boolean result = staffDAO.updateStaffMemberRecord(staffId, column, lastName);
            if (result) {
                JOptionPane.showMessageDialog(null, "Successfully updated Staff");
            } else {
                JOptionPane.showMessageDialog(null, "Staff does not exist");
            }
        }
    }

    private class UpdateEmailRecord implements ActionListener {

       @Override
        public void actionPerformed(ActionEvent e) {
            int staffId = Integer.parseInt(hotelStaffUpdateView.getTxtStaffId().getText());
            String email = hotelStaffUpdateView.getTxtStaffEmail().getText();
            String column = "email";
            
            boolean result = staffDAO.updateStaffMemberRecord(staffId, column, email);
            if (result) {
                JOptionPane.showMessageDialog(null, "Successfully updated Staff");
            } else {
                JOptionPane.showMessageDialog(null, "Staff does not exist");
            }
        }
    }

    private class UpdatesPhoneRecord implements ActionListener {

       @Override
        public void actionPerformed(ActionEvent e) {
            int staffId = Integer.parseInt(hotelStaffUpdateView.getTxtStaffId().getText());
            String phone = hotelStaffUpdateView.getTxtStaffPhone().getText();
            String column = "phone";
            
            boolean result = staffDAO.updateStaffMemberRecord(staffId, column, phone);
            if (result) {
                JOptionPane.showMessageDialog(null, "Successfully updated Staff");
            } else {
                JOptionPane.showMessageDialog(null, "Staff does not exist");
            }
        }
    }

    private class UpdateSINRecord implements ActionListener {

       @Override
        public void actionPerformed(ActionEvent e) {
            int staffId = Integer.parseInt(hotelStaffUpdateView.getTxtStaffId().getText());
            String SIN = hotelStaffUpdateView.getTxtStaffSIN().getText();
            String column = "SIN";
            
            boolean result = staffDAO.updateStaffMemberRecord(staffId, column, SIN);
            if (result) {
                JOptionPane.showMessageDialog(null, "Successfully updated Staff");
            } else {
                JOptionPane.showMessageDialog(null, "Staff does not exist");
            }
        }
    }

    private class updateUnitRecord implements ActionListener {

       @Override
        public void actionPerformed(ActionEvent e) {
            int staffId = Integer.parseInt(hotelStaffUpdateView.getTxtStaffId().getText());
            String unit = hotelStaffUpdateView.getTxtUnitNumber().getText();
            String column = "unit";
            
            boolean result = staffDAO.updateStaffMemberRecord(staffId, column, unit);
            if (result) {
                JOptionPane.showMessageDialog(null, "Successfully updated Staff");
            } else {
                JOptionPane.showMessageDialog(null, "Staff does not exist");
            }
        }
    }

    private class UpdateAddressRecord implements ActionListener {

       @Override
        public void actionPerformed(ActionEvent e) {
            int staffId = Integer.parseInt(hotelStaffUpdateView.getTxtStaffId().getText());
            String address = hotelStaffUpdateView.getTxtStaffAddress().getText();
            String column = "address";
            
            boolean result = staffDAO.updateStaffMemberRecord(staffId, column, address);
            if (result) {
                JOptionPane.showMessageDialog(null, "Successfully updated Staff");
            } else {
                JOptionPane.showMessageDialog(null, "Staff does not exist");
            }
        }
    }

    private class UpdateCityRecord implements ActionListener {

       @Override
        public void actionPerformed(ActionEvent e) {
            int staffId = Integer.parseInt(hotelStaffUpdateView.getTxtStaffId().getText());
            String city = hotelStaffUpdateView.getTxtStaffCity().getText();
            String column = "city";
            
            boolean result = staffDAO.updateStaffMemberRecord(staffId, column, city);
            if (result) {
                JOptionPane.showMessageDialog(null, "Successfully updated Staff");
            } else {
                JOptionPane.showMessageDialog(null, "Staff does not exist");
            }
        }
    }

    private class UpdatePostalRecord implements ActionListener {

       @Override
        public void actionPerformed(ActionEvent e) {
            int staffId = Integer.parseInt(hotelStaffUpdateView.getTxtStaffId().getText());
            String postal = hotelStaffUpdateView.getTxtStaffPostalCode().getText();
            String column = "postal";
            
            boolean result = staffDAO.updateStaffMemberRecord(staffId, column, postal);
            if (result) {
                JOptionPane.showMessageDialog(null, "Successfully updated Staff");
            } else {
                JOptionPane.showMessageDialog(null, "Staff does not exist");
            }
        }
    }

    private class UpdateCountryRecord implements ActionListener {

       @Override
        public void actionPerformed(ActionEvent e) {
            int staffId = Integer.parseInt(hotelStaffUpdateView.getTxtStaffId().getText());
            String country = hotelStaffUpdateView.getTxtStaffCountry().getText();
            String column = "country";
            
            boolean result = staffDAO.updateStaffMemberRecord(staffId, column, country);
            if (result) {
                JOptionPane.showMessageDialog(null, "Successfully updated Staff");
            } else {
                JOptionPane.showMessageDialog(null, "Staff does not exist");
            }
        }
    }

}
