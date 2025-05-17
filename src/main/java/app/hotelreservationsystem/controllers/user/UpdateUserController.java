package app.hotelreservationsystem.controllers.user;

import app.hotelreservationsystem.daos.user.UserDAO;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;
import app.hotelreservationsystem.views.user.HotelUserUpdateView;

/**
 *
 *
 * @author kale
 */
public class UpdateUserController {
    private HotelUserUpdateView hotelUserUpdateView;
    private UserDAO userDAO;

    public UpdateUserController(HotelUserUpdateView hotelUserUpdateView, UserDAO userDAO) {
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
            String username = hotelUserUpdateView.getTxtUsername().getText();
            String column = "username";
            
            boolean result = userDAO.updateUserRecord(userId, column, username);
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
            String column = "password";
            
            boolean result = userDAO.updateUserRecord(userId, column, password);
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
            String column = "user_type";
            
            boolean result = userDAO.updateUserRecord(userId, column, userType);
            if (result) {
                JOptionPane.showMessageDialog(null, "Successfully updated user");
            } else {
                JOptionPane.showMessageDialog(null, "User does not exist");
            }
        }
    }

}
