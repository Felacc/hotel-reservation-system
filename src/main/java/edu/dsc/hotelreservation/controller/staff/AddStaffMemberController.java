package edu.dsc.hotelreservation.controller.staff;

import edu.dsc.hotelreservation.dao.StaffMemberDAO;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;
import edu.dsc.hotelreservation.model.StaffMember;
import edu.dsc.hotelreservation.view.HotelStaffAddView;

/**
 *
 *
 * @author kale
 */
public class AddStaffMemberController {
    private HotelStaffAddView hotelStaffAddView;
    private StaffMemberDAO staffMemberDAO;

    public AddStaffMemberController(HotelStaffAddView hotelStaffAddView, StaffMemberDAO staffMemberDAO) {
        this.hotelStaffAddView = hotelStaffAddView;
        this.staffMemberDAO = staffMemberDAO;

        
        hotelStaffAddView.addStaffBtnListener(new AddStaffMemberRecord());
        hotelStaffAddView.clearAllBtnListener(new ClearAllTextFields());
    }

    private class ClearAllTextFields implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
  
        }
    }

    private class AddStaffMemberRecord implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            String firstName = hotelStaffAddView.getTxtStaffFirstName().getText();
            String lastName = hotelStaffAddView.getTxtStaffLastName().getText();
            String email = hotelStaffAddView.getTxtStaffEmail().getText();
            String phone = hotelStaffAddView.getTxtStaffPhone().getText();
            int SIN = Integer.parseInt(hotelStaffAddView.getTxtStaffSIN().getText());
            String status = hotelStaffAddView.getBoxCitizenType().getSelectedItem().toString().toLowerCase();
            String unit = hotelStaffAddView.getTxtStaffUnitNumber().getText();
            String address = hotelStaffAddView.getTxtStaffAddress().getText();
            String city = hotelStaffAddView.getTxtStaffCity().getText();
            String postal = hotelStaffAddView.getTxtStaffPostalCode().getText();
            String country = hotelStaffAddView.getTxtStaffCountry().getText();
            int createdBy = Integer.parseInt(hotelStaffAddView.getTxtStaffCreatedBy().getText());
            
             StaffMember newStaffMember = new StaffMember(firstName, lastName, email, phone, SIN, status, unit, address, city, postal, country, createdBy);
                   
           boolean result = StaffMemberDAO.addStaffMemberRecord(newStaffMember);
           if (result) {
                JOptionPane.showMessageDialog(null, "Successfully added a new StaffMember");
            } else {
                JOptionPane.showMessageDialog(null, "Was not able to add a new StaffMember record");
            }

        }

    }

}
