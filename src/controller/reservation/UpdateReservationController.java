package controller.reservation;

import dao.ReservationDAO;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;
import model.Reservation;
import view.HotelReservationUpdateView;

/**
 *
 * @author felix
 */
public class UpdateReservationController {

    private HotelReservationUpdateView hotelReservationUpdateView;
    private ReservationDAO reservationDAO;

    public UpdateReservationController(HotelReservationUpdateView hotelReservationUpdateView, ReservationDAO reservationDAO) {
        this.hotelReservationUpdateView = hotelReservationUpdateView;
        this.reservationDAO = reservationDAO;

        this.hotelReservationUpdateView.getReservationInfoBtnListener(new GetReservationInfo());
        this.hotelReservationUpdateView.updateReservationBtnListener(new UpdateReservationRecord());
        this.hotelReservationUpdateView.clearAllBtnListener(new ClearAllFields());
    }

    private class GetReservationInfo implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            int reservationID = Integer.parseInt(hotelReservationUpdateView.getTxtReservationID().getText());

            Reservation reservation = reservationDAO.fetchReservationByReservationID(reservationID);
            String customerID = String.valueOf(reservation.getCustomerID());
            String roomID = String.valueOf(reservation.getRoomID());
            String employeeID = String.valueOf(reservation.getEmployeeID());
            String checkInDate = String.valueOf(reservation.getCheckInDate());
            String checkOutDate = String.valueOf(reservation.getCheckOutDate());
            String status = String.valueOf(reservation.getStatus());

            hotelReservationUpdateView.getTxtReservationCustomerID().setText(customerID);
            hotelReservationUpdateView.getTxtReservationRoomID().setText(roomID);
            hotelReservationUpdateView.getTxtReservationEmployeeID().setText(employeeID);
            hotelReservationUpdateView.getTxtReservationCheckInDate().setText(checkInDate);
            hotelReservationUpdateView.getTxtReservationCheckOutDate().setText(checkOutDate);
            hotelReservationUpdateView.getTxtReservationStatus().setText(status);
        }
    }

    private class UpdateReservationRecord implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            int reservationID = Integer.parseInt(hotelReservationUpdateView.getTxtReservationID().getText());
            
            int customerID = Integer.valueOf(hotelReservationUpdateView.getTxtReservationCustomerID().getText());
            int roomID = Integer.valueOf(hotelReservationUpdateView.getTxtReservationRoomID().getText());
            int employeeID = Integer.valueOf(hotelReservationUpdateView.getTxtReservationEmployeeID().getText());
            String checkInDate = hotelReservationUpdateView.getTxtReservationCheckInDate().getText();
            String checkOutDate = hotelReservationUpdateView.getTxtReservationCheckOutDate().getText();
            String status = hotelReservationUpdateView.getTxtReservationStatus().getText();

            boolean result = reservationDAO.updateReservationRecord(customerID, roomID, employeeID, checkInDate, checkOutDate, status);
            if (result) {
                JOptionPane.showMessageDialog(null, "Successfully updated reservation record");
            } else {
                JOptionPane.showMessageDialog(null, "Reservation record does not exist");
            }
        }
    }

    private class ClearAllFields implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            hotelReservationUpdateView.getTxtReservationCustomerID().setText("");
            hotelReservationUpdateView.getTxtReservationRoomID().setText("");
            hotelReservationUpdateView.getTxtReservationEmployeeID().setText("");
            hotelReservationUpdateView.getTxtReservationCheckInDate().setText("");
            hotelReservationUpdateView.getTxtReservationCheckOutDate().setText("");
            hotelReservationUpdateView.getTxtReservationStatus().setText("");
        }
    }
}
