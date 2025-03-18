/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

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
 * @author kale
 */
public class SearchGuestController {
    private HotelGuestSearchView searchHotelGuestView;
    private GuestDAO guestDAO;

    public SearchGuestController(HotelGuestSearchView hotelGuestRegistrationView, GuestDAO guestDAO) {
        this.searchHotelGuestView = hotelGuestRegistrationView;
        this.guestDAO = guestDAO;

        this.searchHotelGuestView.searchGuestIdBtnListener(new SearchGuestByIdActionListener());
        this.searchHotelGuestView.searchGuestAllBtnListener(new SearchAllGuestsActionListener());
    }

    private class SearchAllGuestsActionListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            DefaultTableModel model = (DefaultTableModel)searchHotelGuestView.getTblGuest().getModel();
            model.setRowCount(0);

            List<Guest> guestList = guestDAO.fetchAllGuestRecords();
            for(Guest guestObject : guestList){
                Object[] row = {
                guestObject.getGuestObject().getGuestID(),
                guestObject.getGuestObject().getFirstName(),
                guestObject.getGuestObject().getLastName(),
                guestObject.getGuestObject().getEmail(),
                guestObject.getGuestObject().getPhone(),
                guestObject.getGuestObject().getUnit(),
                guestObject.getGuestObject().getCity()
                guestObject.getGuestObject().getPostal()
                guestObject.getGuestObject().getCountry()

            }; 
                
                model.addRow(row);
            }
        }
    }

    class SearchGuestByIdActionListener implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            int guestID = Integer.parseInt(searchHotelGuestView.setTxtSearchGuest().getText());
            
            Guest guest = null;
            
            DefaultTableModel model = (DefaultTableModel)searchHotelGuestView.getTblGuest().getModel();
            model.setRowCount(0);
            
            if(classID != 0){
               guestObject = guestDAO.fetchClassByIdForTable(guestID);
               Object[] row = {
                    guestObject.getGuestObject().getGuestID(),
                    guestObject.getGuestObject().getFirstName(),
                    guestObject.getGuestObject().getLastName(),
                    guestObject.getGuestObject().getEmail(),
                    guestObject.getGuestObject().getPhone(),
                    guestObject.getGuestObject().getUnit(),
                    guestObject.getGuestObject().getCity()
                    guestObject.getGuestObject().getPostal()
                    guestObject.getGuestObject().getCountry()
            }; 
               model.addRow(row);
            }
        }
    }

}
