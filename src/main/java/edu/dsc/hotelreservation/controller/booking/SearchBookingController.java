package edu.dsc.hotelreservation.controller.booking;

import edu.dsc.hotelreservation.dao.BookingDAO;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;
import javax.swing.table.DefaultTableModel;
import edu.dsc.hotelreservation.model.Booking;
import edu.dsc.hotelreservation.view.HotelBookingSearchView;

/**
 *
 * @author felix
 */
public class SearchBookingController {
    private HotelBookingSearchView hotelBookingSearchView;
    private BookingDAO bookingDAO;

    public SearchBookingController(HotelBookingSearchView hotelBookingSearchView, BookingDAO bookingDAO) {
        this.hotelBookingSearchView = hotelBookingSearchView;
        this.bookingDAO = bookingDAO;

        this.hotelBookingSearchView.searchBookingIDBtnListener(new SearchBookingByIDActionListener());
        this.hotelBookingSearchView.searchAllBookingsBtnListener(new SearchAllBookingsActionListener());
    }

    private class SearchAllBookingsActionListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            DefaultTableModel model = (DefaultTableModel)hotelBookingSearchView.getTblBooking().getModel();
            model.setRowCount(0);

            List<Booking> bookingList = bookingDAO.fetchAllBookings();
            for(Booking booking : bookingList){
                Object[] row = {
                booking.getBookingID(),
                booking.getReservationID(),
                booking.getBookingDate(),
                booking.getTotalPrice()
            };
            model.addRow(row);
            }
        }
    }

    private class SearchBookingByIDActionListener implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            int bookingID = Integer.valueOf(hotelBookingSearchView.getTxtBookingID().getText());
            
            Booking booking = null;
            
            DefaultTableModel model = (DefaultTableModel)hotelBookingSearchView.getTblBooking().getModel();
            model.setRowCount(0);
            
            if(bookingID != 0){
               booking = bookingDAO.fetchBookingByBookingID(bookingID);
                Object[] row = {
                    booking.getBookingID(),
                    booking.getReservationID(),
                    booking.getBookingDate(),
                    booking.getTotalPrice()
                }; 
               model.addRow(row);
            }
        }
    }
}
