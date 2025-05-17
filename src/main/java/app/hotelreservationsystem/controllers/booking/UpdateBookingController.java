package app.hotelreservationsystem.controllers.booking;

import app.hotelreservationsystem.daos.booking.BookingDAO;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;
import app.hotelreservationsystem.models.booking.Booking;
import app.hotelreservationsystem.views.booking.HotelBookingUpdateView;

/**
 *
 * @author felix
 */
public class UpdateBookingController {
    private HotelBookingUpdateView hotelBookingUpdateView;
    private BookingDAO bookingDAO;

    public UpdateBookingController(HotelBookingUpdateView hotelBookingUpdateView, BookingDAO bookingDAO) {
        this.hotelBookingUpdateView = hotelBookingUpdateView;
        this.bookingDAO = bookingDAO;
        
        this.hotelBookingUpdateView.getBookingInfoBtnListener(new GetBookingInfo());
        this.hotelBookingUpdateView.updateBookingBtnListener(new UpdateBookingRecord());
        this.hotelBookingUpdateView.clearAllBtnListener(new ClearAllFields());
    }
    
    private class GetBookingInfo implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            int bookingID = Integer.parseInt(hotelBookingUpdateView.getTxtBookingID().getText());
            
            Booking booking = bookingDAO.fetchBookingByBookingID(bookingID);
            String reservationID = String.valueOf(booking.getReservationID());
            String bookingDate = String.valueOf(booking.getBookingDate());
            String totalPrice = String.valueOf(booking.getTotalPrice());
            
            hotelBookingUpdateView.getTxtReservationId().setText(reservationID);
            hotelBookingUpdateView.getTxtDate().setText(bookingDate);
            hotelBookingUpdateView.getTxtPrice().setText(totalPrice);
        }
    }
    
    private class UpdateBookingRecord implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            int bookingID = Integer.parseInt(hotelBookingUpdateView.getTxtBookingID().getText());
            int reservationID = Integer.valueOf(hotelBookingUpdateView.getTxtReservationId().getText());
            String bookingDate = hotelBookingUpdateView.getTxtDate().getText();
            double totalPrice = Double.valueOf(hotelBookingUpdateView.getTxtPrice().getText());
            
            boolean result = bookingDAO.updateBookingRecord(bookingID, reservationID, bookingDate, totalPrice);
            if (result) {
                JOptionPane.showMessageDialog(null, "Successfully updated booking record");
            } else {
                JOptionPane.showMessageDialog(null, "Booking record does not exist");
            }
        }
    }
    
    private class ClearAllFields implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            hotelBookingUpdateView.getTxtReservationId().setText("");
            hotelBookingUpdateView.getTxtDate().setText("");
            hotelBookingUpdateView.getTxtPrice().setText("");
        }
    }
}


