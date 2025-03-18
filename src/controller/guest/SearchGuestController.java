/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller.guest;


import dao.GuestDAO;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;
import javax.swing.table.DefaultTableModel;
import model.Guest;

import view.HotelGuestSearchView;



/**
 *
 *
 * @author Caleb Irvine
 */
public class SearchGuestController {
    private HotelGuestSearchView hotelGuestSearchView;
    private GuestDAO guestDAO;

    public SearchGuestController(HotelGuestSearchView hotelGuestSearchView, GuestDAO GuestDAO) {
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

            List<Guest> guestList = GuestDAO.fetchAllGuestRecords();
            for(Guest guestObject : guestList){
                Object[] row = {
                guestObject.getFirstName(),
                guestObject.getLastName(),
                guestObject.getEmail(),
                guestObject.getPhoneNumber(),
                guestObject.getUnit(),
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
               guestObject = GuestDAO.fetchGuestByIdForTable(guestID);
                Object[] row = {
                    guestObject.getFirstName(),
                    guestObject.getLastName(),
                    guestObject.getEmail(),
                    guestObject.getPhoneNumber(),
                    guestObject.getUnit(),
                    guestObject.getCity(),
                    guestObject.getPostalCode(),
                    guestObject.getCountry()
                }; 
               model.addRow(row);
            }
        }
    }

}
