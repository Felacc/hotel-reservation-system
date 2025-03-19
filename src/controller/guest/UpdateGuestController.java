/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller.guest;


import dao.GuestDAO;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;
import view.HotelGuestUpdateView;

/**
 *
 *
 * @author kale
 */
public class UpdateGuestController {
    private HotelGuestUpdateView hotelGuestUpdateView;
    private GuestDAO GuestDAO;

    public UpdateGuestController(HotelGuestUpdateView hotelGuestUpdateView, GuestDAO GuestDAO) {
        this.hotelGuestUpdateView = hotelGuestUpdateView;
        this.GuestDAO = GuestDAO;
        
        this.hotelGuestUpdateView.updateFirstNameBtnListener(new UpdateFirstNameRecord());
        this.hotelGuestUpdateView.updateLastNameBtnListener(new UpdateLastNameRecord());
        this.hotelGuestUpdateView.updateEmailBtnListener(new UpdateEmailRecord());
    }
}
