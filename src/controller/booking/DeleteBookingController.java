package controller.booking;

import dao.BookingDAO;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;
import view.HotelBookingDeleteView;

/**
 *
 * @author felix
 */
public class DeleteBookingController {
    private HotelBookingDeleteView hotelBookingDeleteView;
    private BookingDAO bookingDAO;

    public DeleteBookingController(HotelBookingDeleteView hotelBookingDeleteView, BookingDAO bookingDAO) {
        this.hotelBookingDeleteView = hotelBookingDeleteView;
        this.bookingDAO = bookingDAO;

        hotelBookingDeleteView.deleteBookingBtnListener(new DeleteBookingRecord());
    }

    private class DeleteBookingRecord implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            int bookingID = Integer.valueOf(hotelBookingDeleteView.getTxtDeleteBooking().getText());
            boolean result = bookingDAO.deleteBookingRecord(bookingID);
            if (result) {
                    JOptionPane.showMessageDialog(null, "Successfully removed booking");
                } else {
                    JOptionPane.showMessageDialog(null, "Booking ID does not exist");
                }
        }
    } 
}
