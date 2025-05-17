package app.hotelreservationsystem.controllers.reservation;

import app.hotelreservationsystem.daos.reservation.ReservationDAO;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;
import javax.swing.table.DefaultTableModel;
import app.hotelreservationsystem.models.reservation.Reservation;
import app.hotelreservationsystem.views.reservation.HotelReservationSearchView;

/**
 *
 * @author felix
 */
public class SearchReservationController {

    private HotelReservationSearchView hotelReservationSearchView;
    private ReservationDAO reservationDAO;

    public SearchReservationController(HotelReservationSearchView hotelReservationSearchView, ReservationDAO reservationDAO) {
        this.hotelReservationSearchView = hotelReservationSearchView;
        this.reservationDAO = reservationDAO;

        this.hotelReservationSearchView.searchReservationByIDBtnListener(new SearchReservationByIDActionListener());
        this.hotelReservationSearchView.searchAllReservationsBtnListener(new SearchAllReservationsActionListener());
    }

    private class SearchAllReservationsActionListener implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            DefaultTableModel model = (DefaultTableModel) hotelReservationSearchView.getTblReservation().getModel();
            model.setRowCount(0);

            List<Reservation> reservationList = reservationDAO.fetchAllReservations();
            for (Reservation reservation : reservationList) {
                Object[] row = {
                    reservation.getReservationID(),
                    reservation.getCustomerID(),
                    reservation.getRoomID(),
                    reservation.getEmployeeID(),
                    reservation.getCheckInDate(),
                    reservation.getCheckOutDate(),
                    reservation.getStatus()
                };
                model.addRow(row);

            }
        }

    }

    private class SearchReservationByIDActionListener implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            int reservationID = Integer.valueOf(hotelReservationSearchView.getTxtReservationID().getText());

            Reservation reservation = null;

            DefaultTableModel model = (DefaultTableModel) hotelReservationSearchView.getTblReservation().getModel();
            model.setRowCount(0);

            if (reservationID != 0) {
                reservation = reservationDAO.fetchReservationByReservationID(reservationID);
                Object[] row = {
                    reservation.getReservationID(),
                    reservation.getCustomerID(),
                    reservation.getRoomID(),
                    reservation.getEmployeeID(),
                    reservation.getCheckInDate(),
                    reservation.getCheckOutDate(),
                    reservation.getStatus()
                };
                model.addRow(row);
            }
        }
    }
}