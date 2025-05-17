package app.hotelreservationsystem.controllers.user;


import app.hotelreservationsystem.daos.user.UserDAO;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;
import javax.swing.table.DefaultTableModel;
import app.hotelreservationsystem.models.user.User;

import app.hotelreservationsystem.views.user.HotelUserSearchView;



/**
 *
 *
 * @author Caleb Irvine
 */
public class SearchUserController {
    private HotelUserSearchView hotelUserSearchView;
    private UserDAO userDAO;

    public SearchUserController(HotelUserSearchView hotelUserSearchView, UserDAO userDAO) {
        this.hotelUserSearchView = hotelUserSearchView;
        this.userDAO = userDAO;

        this.hotelUserSearchView.searchUserIdBtnListener(new SearchUserByIdActionListener());
        this.hotelUserSearchView.searchUserAllBtnListener(new SearchAllUserActionListener());
    }

    private class SearchAllUserActionListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            DefaultTableModel model = (DefaultTableModel)hotelUserSearchView.getTblUser().getModel();
            model.setRowCount(0);

            List<User> userList = UserDAO.fetchAllUserRecords();
            for(User userObject : userList){
                Object[] row = {
                userObject.getUserId(),
                userObject.getUsername(),
                userObject.getPassword(),
                userObject.getUserType(),
            };
            model.addRow(row);
            }
        }
    }

    private class SearchUserByIdActionListener implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            int userID = Integer.parseInt(hotelUserSearchView.getTxtSearchUser().getText());
            
            User userObject = null;
            
            DefaultTableModel model = (DefaultTableModel)hotelUserSearchView.getTblUser().getModel();
            model.setRowCount(0);
            
            if(userID != 0){
               userObject = UserDAO.fetchUserByIdForTable(userID);
                Object[] row = {
                    userObject.getUserId(),
                    userObject.getUsername(),
                    userObject.getPassword(),
                    userObject.getUserType()
                }; 
               model.addRow(row);
            }
        }
    }

}
