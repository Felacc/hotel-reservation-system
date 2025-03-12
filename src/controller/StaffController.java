/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import dao.staffDAO;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;
import model.StaffMember;
import view.HotelstaffAddView;

/**
 *
 *
 * @author kale
 */
public class StaffController {
    private HotelstaffAddView hotelstaffRegistrationView;
    private staffDAO staffDAO;

    public StaffController(HotelstaffAddView hotelstaffRegistrationView, staffDAO staffDAO) {
        this.hotelstaffRegistrationView = hotelstaffRegistrationView;
        this.staffDAO = staffDAO;

        
        //We need to make event listeners
//        hotelstaffRegistrationView.addstaffBtnListener(new AddstaffRecord());
//        hotelstaffRegistrationView.addClearAllBtnListener(new ClearAllTextFields());
    }

    private class ClearAllTextFields implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            hotelstaffRegistrationView.getTxtFirstName().setText("");
            hotelstaffRegistrationView.getTxtFirstName().setText("");
            hotelstaffRegistrationView.getTxtLastName().setText("");
            hotelstaffRegistrationView.getTxtAddress().setText("");
            hotelstaffRegistrationView.getTxtBillingAddress().setText("");
            hotelstaffRegistrationView.getTxtPhone().setText("");
            hotelstaffRegistrationView.getTxtEmail().setText("");
            hotelstaffRegistrationView.getTxtPassword().setText("");
        }
    }

    private class AddstaffRecord implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {


           
            boolean result = staffDAO.addstaffRecord(newstaff);
       //make this result once implemented)
            if (result) {
                JOptionPane.showMessageDialog(null, "Successfully added a new staff");
            } else {
                JOptionPane.showMessageDialog(null, "Was not able to add a new staff record");
            }

        }

    }

}
