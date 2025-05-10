package edu.dsc.hotelreservation.controller.guest;


import edu.dsc.hotelreservation.dao.GuestDAO;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;
import javax.swing.table.DefaultTableModel;
import edu.dsc.hotelreservation.model.Guest;

import edu.dsc.hotelreservation.view.HotelGuestSearchView;



/**
 *
 *
 * @author Caleb Irvine
 */
public class SearchGuestController {
    private HotelGuestSearchView hotelGuestSearchView;
    private GuestDAO guestDAO;

    public SearchGuestController(HotelGuestSearchView hotelGuestSearchView, GuestDAO guestDAO) {
        this.hotelGuestSearchView = hotelGuestSearchView;
        this.guestDAO = guestDAO;

        this.hotelGuestSearchView.searchGuestIdBtnListener(new SearchGuestByIdActionListener());
        this.hotelGuestSearchView.searchGuestAllBtnListener(new SearchAllGuestsActionListener());
    }

    private class SearchAllGuestsActionListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            DefaultTableModel model = (DefaultTableModel)hotelGuestSearchView.getTblGuest().getModel();
            model.setRowCount(0);

            List<Guest> guestList = guestDAO.fetchAllGuestRecords();
            for(Guest guestObject : guestList){
                Object[] row = {
                guestObject.getGuestId(),
                guestObject.getFirstName(),
                guestObject.getLastName(),
                guestObject.getEmail(),
                guestObject.getPhoneNumber(),
                guestObject.getUnit(),
                guestObject.getStreetAddress(),
                guestObject.getCity(),
                guestObject.getPostalCode(),
                guestObject.getCountry()
            };
            model.addRow(row);
            }
        }
    }

    private class SearchGuestByIdActionListener implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            int guestID = Integer.parseInt(hotelGuestSearchView.getTxtSearchGuest().getText());
            
            Guest guestObject = null;
            
            DefaultTableModel model = (DefaultTableModel)hotelGuestSearchView.getTblGuest().getModel();
            model.setRowCount(0);
            
            if(guestID != 0){
               guestObject = (Guest) guestDAO.fetchGuestByIdForTable(guestID);
                Object[] row = {
                    guestObject.getGuestId(),
                    guestObject.getFirstName(),
                    guestObject.getLastName(),
                    guestObject.getEmail(),
                    guestObject.getPhoneNumber(),
                    guestObject.getUnit(),
                    guestObject.getStreetAddress(),
                    guestObject.getCity(),
                    guestObject.getPostalCode(),
                    guestObject.getCountry()
                }; 
               model.addRow(row);
            }
        }
    }

}
