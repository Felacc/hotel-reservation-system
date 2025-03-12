/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import dao.UserDAO;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;
import model.User;
import view.HotelUserAddView;

/**
 *
 *
 * @author kale
 */
public class UserController {
    private HotelUserAddView hotelUserRegistrationView;
    private UserDAO UserDAO;

    public UserController(HotelUserAddView hotelUserRegistrationView, UserDAO UserDAO) {
        this.hotelUserRegistrationView = hotelUserRegistrationView;
        this.UserDAO = UserDAO;

        
        //We need to make event listeners
//        hotelUserRegistrationView.addUserBtnListener(new AddUserRecord());
//        hotelUserRegistrationView.addClearAllBtnListener(new ClearAllTextFields());
    }

    private class ClearAllTextFields implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            hotelUserRegistrationView.getTxtFirstName().setText("");
            hotelUserRegistrationView.getTxtFirstName().setText("");
            hotelUserRegistrationView.getTxtLastName().setText("");
            hotelUserRegistrationView.getTxtAddress().setText("");
            hotelUserRegistrationView.getTxtBillingAddress().setText("");
            hotelUserRegistrationView.getTxtPhone().setText("");
            hotelUserRegistrationView.getTxtEmail().setText("");
            hotelUserRegistrationView.getTxtPassword().setText("");
        }
    }

    private class AddUserRecord implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {


           
            boolean result = UserDAO.addUserRecord(newUser);
       //make this result once implemented)
            if (result) {
                JOptionPane.showMessageDialog(null, "Successfully added a new course");
            } else {
                JOptionPane.showMessageDialog(null, "Was not able to add a new course record");
            }

        }

    }

}
