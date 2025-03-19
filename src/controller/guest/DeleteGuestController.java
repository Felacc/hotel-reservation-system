/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller.guest;

import dao.GuestDAO;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;
import model.Guest;
import view.HotelGuestDeleteView;



/**
 *
 *
 * @author kale
 */
public class DeleteGuestController {
    private HotelGuestDeleteView hotelGuestDeleteView;
    private GuestDAO guestDAO;

    public DeleteGuestController(HotelGuestDeleteView deleteHotelGuestView, GuestDAO guestDAO) {
        this.hotelGuestDeleteView = hotelGuestDeleteView;
        this.guestDAO = guestDAO;

        deleteHotelGuestView.deleteGuestBtnListener(new DeleteGuestRecord());
    }

    private class DeleteGuestRecord implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            int guestId = Integer.parseInt(hotelGuestDeleteView.getTxtDeleteGuest().getText());
            boolean result = GuestDAO.deleteGuestRecord(guestId);
            if (result) {
                    JOptionPane.showMessageDialog(null, "Successfully removed user");
                } else {
                    JOptionPane.showMessageDialog(null, "Guest ID does not exist");
                }
        }
    } 
}
