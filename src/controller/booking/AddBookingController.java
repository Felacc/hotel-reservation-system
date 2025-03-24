package controller.booking;

import dao.BookingDAO;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;
import model.Booking;
import view.HotelBookingAddView;

/**
 *
 * @author felix
 */
public class AddBookingController {
    private BookingDAO bookingDAO;
    private HotelBookingAddView hotelBookingAddView;
    
    public AddBookingController(BookingDAO bookingDAO, HotelBookingAddView hotelBookingAddView) {
        this.bookingDAO = bookingDAO;
        this.hotelBookingAddView = hotelBookingAddView;
        
        this.hotelBookingAddView.addBookingBtnListener(new AddBookingRecord());
        this.hotelBookingAddView.clearAllBtnListener(new ClearAllTextFields());
    }
    
    private class AddBookingRecord implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            int reservationID = Integer.valueOf(hotelBookingAddView.getTxtReservationId().getText());
            String bookingDate = hotelBookingAddView.getTxtDate().getText();
            double totalPrice = Double.valueOf(hotelBookingAddView.getTxtFormatPrice().getText());
            
            
            Booking newBooking = new Booking(reservationID, bookingDate, totalPrice);
            
            boolean result = bookingDAO.addBookingRecord(newBooking);
            if (result) {
                JOptionPane.showMessageDialog(null, "Successfull booking!");
            } else {
                JOptionPane.showMessageDialog(null, "Was not able to book :(");
            }
        }
    }
    
    private class ClearAllTextFields implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            hotelBookingAddView.getTxtReservationId().setText("");
            hotelBookingAddView.getTxtDate().setText("");
            hotelBookingAddView.getTxtFormatPrice().setText("");
        }
    }
    
}   
