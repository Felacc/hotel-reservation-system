package app.hotelreservationsystem.views.staff;

import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JTable;
import javax.swing.JTextField;

/**
 *
 * @author JekKath
 */
public class HotelStaffSearchView extends javax.swing.JFrame {

    /**
     * Creates new form HotelStaffSearchView
     */
    public HotelStaffSearchView() {
        initComponents();
    }

    public JButton getBtnSearchStaff() {
        return btnSearchStaffId;
    }

    public void setBtnSearchStaff(JButton btnSearchStaff) {
        this.btnSearchStaffId = btnSearchStaff;
    }

    public JButton getBtnSearchStaffAll() {
        return btnSearchStaffAll;
    }

    public void setBtnSearchStaffAll(JButton btnSearchStaffAll) {
        this.btnSearchStaffAll = btnSearchStaffAll;
    }

    public JTable getTblStaff() {
        return tblStaff;
    }

    public void setTblStaff(JTable tblStaff) {
        this.tblStaff = tblStaff;
    }

    public JTextField getTxtSearchStaff() {
        return txtSearchStaff;
    }

    public void setTxtSearchStaff(JTextField txtSearchStaff) {
        this.txtSearchStaff = txtSearchStaff;
    }
    
    
    
    public void searchStaffAllBtnListener(ActionListener myActionListener) {
        btnSearchStaffId.addActionListener(myActionListener);
    }

    public void searchStaffIdBtnListener(ActionListener myActionListener) {
        btnSearchStaffAll.addActionListener(myActionListener);
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnSeachStaff1 = new javax.swing.JButton();
        javax.swing.JPanel childPanel = new javax.swing.JPanel();
        javax.swing.JLabel lblStaffRegister = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblStaff = new javax.swing.JTable();
        btnSearchStaffAll = new javax.swing.JButton();
        txtSearchStaff = new javax.swing.JTextField();
        btnSearchStaffId = new javax.swing.JButton();

        btnSeachStaff1.setBackground(javax.swing.UIManager.getDefaults().getColor("Actions.Grey"));
        btnSeachStaff1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/icons/search.png"))); // NOI18N
        btnSeachStaff1.setText("Search By StaffID...");
        btnSeachStaff1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSeachStaff1ActionPerformed(evt);
            }
        });

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Search Staff Account");

        childPanel.setBackground(java.awt.Color.white);

        lblStaffRegister.setFont(new java.awt.Font("Helvetica Neue", 1, 24)); // NOI18N
        lblStaffRegister.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblStaffRegister.setIcon(new javax.swing.ImageIcon(getClass().getResource("/app/hotelreservationsystem/views/icons/search.png"))); // NOI18N
        lblStaffRegister.setText("Search for Staff");
        lblStaffRegister.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));

        tblStaff.setAutoCreateRowSorter(true);
        tblStaff.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Employee ID", "First Name", "Last Name", "Email", "Phone", "SIN", "Status", "Unit Number", "Street Address", "City", "Postal Code", "Country", "Created By"
            }
        ));
        tblStaff.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_ALL_COLUMNS);
        jScrollPane1.setViewportView(tblStaff);

        btnSearchStaffAll.setBackground(javax.swing.UIManager.getDefaults().getColor("Actions.Grey"));
        btnSearchStaffAll.setIcon(new javax.swing.ImageIcon(getClass().getResource("/app/hotelreservationsystem/views/icons/search.png"))); // NOI18N
        btnSearchStaffAll.setText("Search All Staff...");
        btnSearchStaffAll.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSearchStaffAllActionPerformed(evt);
            }
        });

        txtSearchStaff.setBackground(javax.swing.UIManager.getDefaults().getColor("Actions.Grey"));
        txtSearchStaff.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtSearchStaffActionPerformed(evt);
            }
        });

        btnSearchStaffId.setBackground(javax.swing.UIManager.getDefaults().getColor("Actions.Grey"));
        btnSearchStaffId.setIcon(new javax.swing.ImageIcon(getClass().getResource("/app/hotelreservationsystem/views/icons/search.png"))); // NOI18N
        btnSearchStaffId.setText("Search By StaffID...");
        btnSearchStaffId.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSearchStaffIdActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout childPanelLayout = new javax.swing.GroupLayout(childPanel);
        childPanel.setLayout(childPanelLayout);
        childPanelLayout.setHorizontalGroup(
            childPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(childPanelLayout.createSequentialGroup()
                .addGroup(childPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(childPanelLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(childPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblStaffRegister, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jScrollPane1)))
                    .addGroup(childPanelLayout.createSequentialGroup()
                        .addGap(0, 546, Short.MAX_VALUE)
                        .addComponent(txtSearchStaff, javax.swing.GroupLayout.PREFERRED_SIZE, 278, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnSearchStaffId, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnSearchStaffAll, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        childPanelLayout.setVerticalGroup(
            childPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(childPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblStaffRegister)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 433, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(childPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtSearchStaff, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnSearchStaffAll)
                    .addComponent(btnSearchStaffId))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(childPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(childPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnSearchStaffAllActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSearchStaffAllActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnSearchStaffAllActionPerformed

    private void txtSearchStaffActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSearchStaffActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtSearchStaffActionPerformed

    private void btnSeachStaff1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSeachStaff1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnSeachStaff1ActionPerformed

    private void btnSearchStaffIdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSearchStaffIdActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnSearchStaffIdActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(HotelStaffSearchView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(HotelStaffSearchView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(HotelStaffSearchView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(HotelStaffSearchView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new HotelStaffSearchView().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnSeachStaff1;
    private javax.swing.JButton btnSearchStaffAll;
    private javax.swing.JButton btnSearchStaffId;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblStaff;
    private javax.swing.JTextField txtSearchStaff;
    // End of variables declaration//GEN-END:variables

  
}
