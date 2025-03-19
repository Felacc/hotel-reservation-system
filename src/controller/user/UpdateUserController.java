/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller.user;

import dao.UserDAO;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;
import model.User;
import view.HotelUserUpdateView;

/**
 *
 *
 * @author kale
 */
public class UpdateUserController {
    private HotelUserUpdateView hotelUserUpdateView;
    private UserDAO userDAO;

    public UpdateUserController(HotelUserUpdateView hotelUserUpdateView, UserDAO UserDAO) {
        this.hotelUserUpdateView = hotelUserUpdateView;
        this.userDAO = userDAO;
        
        this.hotelUserUpdateView.updateUsernameBtnListener(new UpdateUsernameRecord());
        this.hotelUserUpdateView.updatePasswordBtnListener(new UpdatePasswordRecord());
        this.hotelUserUpdateView.updateUserTypeBtnListener(new UpdateUserTypeRecord());
    }

    private class UpdateUsernameRecord implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            int userId = Integer.parseInt(hotelUserUpdateView.getTxtUserId().getText());
            String username = hotelUserUpdateView.getTxtUserName().getText();
            
            boolean result = userDAO.updateUserRecord(userId, username, "username");
            if (result) {
                JOptionPane.showMessageDialog(null, "Successfully updated user");
            } else {
                JOptionPane.showMessageDialog(null, "User does not exist");
            }
        }
    }

    private class UpdatePasswordRecord implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            int userId = Integer.parseInt(hotelUserUpdateView.getTxtUserId().getText());
            String password = hotelUserUpdateView.getTxtUserPassword().getText();
            
            boolean result = userDAO.updateUserRecord(userId, password, "password");
            if (result) {
                JOptionPane.showMessageDialog(null, "Successfully updated user");
            } else {
                JOptionPane.showMessageDialog(null, "User does not exist");
            }
        }
    }
    
    private class UpdateUserTypeRecord implements ActionListener {

         @Override
        public void actionPerformed(ActionEvent e) {
            int userId = Integer.parseInt(hotelUserUpdateView.getTxtUserId().getText());
            String userType = hotelUserUpdateView.getComboUserType().getSelectedItem().toString().toLowerCase();
            
            boolean result = userDAO.updateUserRecord(userId, userType, "user_type");
            if (result) {
                JOptionPane.showMessageDialog(null, "Successfully updated user");
            } else {
                JOptionPane.showMessageDialog(null, "User does not exist");
            }
        }
    }

}
