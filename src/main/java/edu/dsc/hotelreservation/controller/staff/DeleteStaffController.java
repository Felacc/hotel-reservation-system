package edu.dsc.hotelreservation.controller.staff;

import edu.dsc.hotelreservation.dao.StaffMemberDAO;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;
import edu.dsc.hotelreservation.view.HotelStaffDeleteView;


/**
 *
 *
 * @author kale
 */
public class DeleteStaffController {
    private HotelStaffDeleteView hotelstaffDeleteView;
    private StaffMemberDAO staffDAO;

    public DeleteStaffController(HotelStaffDeleteView hotelstaffDeleteView, StaffMemberDAO staffDAO) {
        this.hotelstaffDeleteView = hotelstaffDeleteView;
        this.staffDAO = staffDAO;

        hotelstaffDeleteView.deleteStaffBtnListener(new DeletestaffRecord());
    }

    private class DeletestaffRecord implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            int staffId = Integer.parseInt(hotelstaffDeleteView.getTxtDeleteStaff().getText());
                boolean result = staffDAO.deleteStaffRecord(staffId);
                if (result) {
                    JOptionPane.showMessageDialog(null, "Successfully removed staff");
                } else {
                    JOptionPane.showMessageDialog(null, "staff ID does not exist");
                }
            
        }
    } 
}
