package controller.booking;

import dao.BookingDAO;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import view.HotelBookingAddView;

/**
 *
 * @author felix
 */
public class AddBookingController {
    private BookingDAO bookingDao;
    private HotelBookingAddView hotelBookingAddView;
    
    public AddBookingController(BookingDAO bookingDao, HotelBookingAddView hotelBookingAddView) {
        this.bookingDao = bookingDao;
        this.hotelBookingAddView = hotelBookingAddView;
        
        this.hotelBookingAddView.addBookingBtnListener(new AddBookingRecord());
        this.hotelBookingAddView.clearAllBtnListener(new ClearAllTextFields());
    }
    
    private class AddBookingRecord implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            
        }
    }
    
    private class ClearAllTextFields implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            
        }
    }
    
}   
