package app.hotelreservationsystem.controllers.user;

import app.hotelreservationsystem.daos.user.UserDAO;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;
import app.hotelreservationsystem.models.user.User;
import app.hotelreservationsystem.views.user.HotelUserAddView;

/**
 *
 *
 * @author kale
 */
public class AddUserController {
    private HotelUserAddView hotelUserAddView;
    private UserDAO UserDAO;

    public AddUserController(HotelUserAddView hotelUserAddView, UserDAO UserDAO) {
        this.hotelUserAddView = hotelUserAddView;
        this.UserDAO = UserDAO;

        
        hotelUserAddView.addUserBtnListener(new AddUserRecord());
        hotelUserAddView.clearAllBtnListener(new ClearAllTextFields());
    }

    private class ClearAllTextFields implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
  
        }
    }

    private class AddUserRecord implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            String username = hotelUserAddView.getTxtUserName().getText();
            String password = hotelUserAddView.getTxtUserPassword().getText();
            String userType = hotelUserAddView.getBoxUserType().getSelectedItem().toString().toLowerCase();
            System.out.println(userType);
            
            
           User newUser = new User(username,password,userType);
                   
           boolean result = UserDAO.addUserRecord(newUser);
            if (result) {
                JOptionPane.showMessageDialog(null, "Successfully added a new user");
            } else {
                JOptionPane.showMessageDialog(null, "Was not able to add a new user record");
            }

        }

    }

}
