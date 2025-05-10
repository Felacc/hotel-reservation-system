package edu.dsc.hotelreservation.controller.user;

import edu.dsc.hotelreservation.dao.UserDAO;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;
import edu.dsc.hotelreservation.view.HotelUserDeleteView;



/**
 *
 *
 * @author kale
 */
public class DeleteUserController {
    private HotelUserDeleteView hotelUserDeleteView;
    private UserDAO userDAO;

    public DeleteUserController(HotelUserDeleteView hotelUserDeleteView, UserDAO userDAO) {
        this.hotelUserDeleteView = hotelUserDeleteView;
        this.userDAO = userDAO;

        hotelUserDeleteView.deleteUserBtnListener(new DeleteUserRecord());
    }

    private class DeleteUserRecord implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            int guestId = Integer.parseInt(hotelUserDeleteView.getTxtDeleteUser().getText());
                boolean result = UserDAO.deleteUserRecord(guestId);
                if (result) {
                    JOptionPane.showMessageDialog(null, "Successfully removed user");
                } else {
                    JOptionPane.showMessageDialog(null, "User ID does not exist");
                }
            
        }
    } 
}
