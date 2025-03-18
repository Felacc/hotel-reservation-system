/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import dao.GuestDAO;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import model.Guest;
import view.HotelGuestDeleteView;



/**
 *
 *
 * @author kale
 */
public class DeleteGuestController {
    private HotelGuestDeleteView deleteHotelGuestView;
    private GuestDAO guestDAO;

    public DeleteGuestController(HotelGuestDeleteView deleteHotelGuestView, GuestDAO guestDAO) {
        this.deleteHotelGuestView = deleteHotelGuestView;
        this.guestDAO = guestDAO;

        deleteHotelGuestView.deleteGuestBtnListener(new DeleteGuestRecord());
    }

    private class DeleteGuestRecord implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            int guestId = Integer.parseInt(deleteHotelGuestView.getTxtDeleteGuest().getText());
            
            Guest guestObject = null;
           
            if(guestId != 0){
                guestObject = guestDAO.fetchGuestByIdForDelete(guestId);
            }
        }
    } 
}
