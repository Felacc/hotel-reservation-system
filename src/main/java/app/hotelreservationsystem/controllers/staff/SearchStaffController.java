package app.hotelreservationsystem.controllers.staff;


import app.hotelreservationsystem.daos.staff.StaffMemberDAO;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;
import javax.swing.table.DefaultTableModel;
import app.hotelreservationsystem.models.staff.StaffMember;
import app.hotelreservationsystem.views.staff.HotelStaffSearchView;
/**
 *
 *
 * @author Caleb Irvine | C0522047
 */
public class SearchStaffController {
    private HotelStaffSearchView hotelStaffSearchView;
    private StaffMemberDAO staffDAO;

    public SearchStaffController(HotelStaffSearchView hotelStaffSearchView, StaffMemberDAO staffDAO) {
        this.hotelStaffSearchView = hotelStaffSearchView;
        this.staffDAO = staffDAO;

        this.hotelStaffSearchView.searchStaffIdBtnListener(new SearchStaffByIdActionListener());
        this.hotelStaffSearchView.searchStaffAllBtnListener(new SearchAllStaffActionListener());
    }

    private class SearchAllStaffActionListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            DefaultTableModel model = (DefaultTableModel)hotelStaffSearchView.getTblStaff().getModel();
            model.setRowCount(0);

            List<StaffMember> StaffList = StaffMemberDAO.fetchAllStaffRecords();
            for(StaffMember staffObject : StaffList){
                Object[] row = {
                staffObject.getStaffId(),
                    staffObject.getFirstName(),
                    staffObject.getLastName(),
                    staffObject.getEmail(),
                    staffObject.getPhoneNumber(),
                    staffObject.getSIN(),
                    staffObject.getCitizenshipStatus(),
                    staffObject.getUnitNumber(),
                    staffObject.getStreetAddress(),
                    staffObject.getCity(),
                    staffObject.getPostalCode(),
                    staffObject.getCountry(),
                    staffObject.getCreatedBy()
            };
            model.addRow(row);
            }
        }
    }

    private class SearchStaffByIdActionListener implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            int StaffID = Integer.parseInt(hotelStaffSearchView.getTxtSearchStaff().getText());
            
            StaffMember staffObject = null;
            
            DefaultTableModel model = (DefaultTableModel)hotelStaffSearchView.getTblStaff().getModel();
            model.setRowCount(0);
            
            if(StaffID != 0){
               staffObject = StaffMemberDAO.fetchStaffByIdForTable(StaffID);
                Object[] row = {
                    staffObject.getStaffId(),
                    staffObject.getFirstName(),
                    staffObject.getLastName(),
                    staffObject.getEmail(),
                    staffObject.getPhoneNumber(),
                    staffObject.getSIN(),
                    staffObject.getCitizenshipStatus(),
                    staffObject.getUnitNumber(),
                    staffObject.getStreetAddress(),
                    staffObject.getCity(),
                    staffObject.getPostalCode(),
                    staffObject.getCountry(),
                    staffObject.getCreatedBy()
                }; 
               model.addRow(row);
            }
        }
    }

}
