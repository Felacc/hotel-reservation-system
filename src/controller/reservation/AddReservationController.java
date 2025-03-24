package controller.reservation;

import dao.ReservationDAO;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;
import model.Reservation;
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
            int customerID = Integer.valueOf(hotelReservationAddView.getTxtReservationCustomerID().getText());
            int roomID = Integer.valueOf(hotelReservationAddView.getTxtReservationRoomID().getText());
            int employeeID = Integer.valueOf(hotelReservationAddView.getTxtReservationEmployeeID().getText());
            String checkInDate =hotelReservationAddView.getTxtReservationCheckInDate().getText();
            String checkOutDate = hotelReservationAddView.getTxtReservationCheckOutDate().getText();
            String status = hotelReservationAddView.getTxtReservationStatus().getText();
            
            
            Reservation newReservation = new Reservation(customerID, roomID, employeeID, checkInDate, checkOutDate, status);
            
            boolean result = reservationDAO.addReservationRecord(newReservation);
            if (result) {
                JOptionPane.showMessageDialog(null, "Successfull reservation!");
            } else {
                JOptionPane.showMessageDialog(null, "Was not able to reserve :(");
            }
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
