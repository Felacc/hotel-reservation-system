package controller.reservation;

import dao.ReservationDAO;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;
import view.HotelReservationDeleteView;

/**
 *
 * @author felix
 */
public class DeleteReservationController {
 private HotelReservationDeleteView hotelReservationDeleteView;
    private ReservationDAO reservationDAO;

    public DeleteReservationController (HotelReservationDeleteView hotelReservationDeleteView, ReservationDAO reservationDAO) {
        this.hotelReservationDeleteView = hotelReservationDeleteView;
        this.reservationDAO = reservationDAO;

        hotelReservationDeleteView.deleteReservationBtnListener(new DeleteReservationRecord());
    }

    private class DeleteReservationRecord implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            int reservationID = Integer.valueOf(hotelReservationDeleteView.getTxtDeleteReservation().getText());
            boolean result = reservationDAO.deleteReservationRecord(reservationID);
            if (result) {
                    JOptionPane.showMessageDialog(null, "Successfully removed reservation");
                } else {
                    JOptionPane.showMessageDialog(null, "Reservation ID does not exist");
                }
        }
    }   
}
