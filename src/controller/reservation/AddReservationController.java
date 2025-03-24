package controller.reservation;

import dao.ReservationDAO;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import view.HotelReservationAddView;

/**
 *
 * @author felix
 */
public class AddReservationController {
    private ReservationDAO reservationDAO;
    private HotelReservationAddView hotelReservationAddView;
    
    public AddReservationController(ReservationDAO reservationDAO, HotelReservationAddView hotelReservationAddView) {
        this.reservationDAO = reservationDAO;
        this.hotelReservationAddView = hotelReservationAddView;
        
        this.hotelReservationAddView.addReservationBtnListener(new AddReservationRecord());
        this.hotelReservationAddView.clearReservationBtnListener(new ClearAllTextFields());
    }
    
    private class AddReservationRecord implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            
        }
    }
    
    private class ClearAllTextFields implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            hotelReservationAddView.getTxtReservationCustomerID().setText("");
            hotelReservationAddView.getTxtReservationRoomID().setText("");
            hotelReservationAddView.getTxtReservationEmployeeID().setText("");
            hotelReservationAddView.getTxtReservationCheckInDate().setText("");
            hotelReservationAddView.getTxtReservationCheckOutDate().setText("");
            hotelReservationAddView.getTxtReservationStatus().setText("");
        }
    }
    
}
