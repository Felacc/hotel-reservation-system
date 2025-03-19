/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package view;

import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JTextField;

/**
 *
 * @author kale
 */

public class HotelGuestUpdateView extends javax.swing.JFrame {

    /**
     * Creates new form HotelStaffView
     */
    public HotelGuestUpdateView() {
        initComponents();
    }

    public JTextField getTxtGuestId() {
        return txtGuestId;
    }

    public void setTxtGuestId(JTextField txtGuestId) {
        this.txtGuestId = txtGuestId;
    }  

    public JButton getBtnClear() {
        return btnClear;
    }

    public void setBtnClear(JButton btnClear) {
        this.btnClear = btnClear;
    }

    public JButton getBtnUpdateCity() {
        return btnUpdateCity;
    }

    public void setBtnUpdateCity(JButton btnUpdateCity) {
        this.btnUpdateCity = btnUpdateCity;
    }

    public JButton getBtnUpdateEmail() {
        return btnUpdateEmail;
    }

    public void setBtnUpdateEmail(JButton btnUpdateEmail) {
        this.btnUpdateEmail = btnUpdateEmail;
    }

    public JButton getBtnUpdateFirstName() {
        return btnUpdateFirstName;
    }

    public void setBtnUpdateFirstName(JButton btnUpdateFirstName) {
        this.btnUpdateFirstName = btnUpdateFirstName;
    }

    public JButton getBtnUpdateGuest() {
        return btnUpdateCountry;
    }

    public void setBtnUpdateGuest(JButton btnUpdateGuest) {
        this.btnUpdateCountry = btnUpdateGuest;
    }

    public JButton getBtnUpdateLastName() {
        return btnUpdateLastName;
    }

    public void setBtnUpdateLastName(JButton btnUpdateLastName) {
        this.btnUpdateLastName = btnUpdateLastName;
    }

    public JButton getBtnUpdatePhone() {
        return btnUpdatePhone;
    }

    public void setBtnUpdatePhone(JButton btnUpdatePhone) {
        this.btnUpdatePhone = btnUpdatePhone;
    }

    public JButton getBtnUpdatePostal() {
        return btnUpdatePostal;
    }

    public void setBtnUpdatePostal(JButton btnUpdatePostal) {
        this.btnUpdatePostal = btnUpdatePostal;
    }

    public JButton getBtnUpdateStreetAddress() {
        return btnUpdateStreetAddress;
    }

    public void setBtnUpdateStreetAddress(JButton btnUpdateStreetAddress) {
        this.btnUpdateStreetAddress = btnUpdateStreetAddress;
    }

    public JButton getBtnUpdateUnit() {
        return btnUpdateUnit;
    }

    public JButton getBtnUpdateCountry() {
        return btnUpdateCountry;
    }

    public void setBtnUpdateCountry(JButton btnUpdateCountry) {
        this.btnUpdateCountry = btnUpdateCountry;
    }
    
    public void setBtnUpdateUnit(JButton btnUpdateUnit) {
        this.btnUpdateUnit = btnUpdateUnit;
    }

    public JTextField getTxtCity() {
        return txtCity;
    }

    public void setTxtCity(JTextField txtCity) {
        this.txtCity = txtCity;
    }

    public JTextField getTxtCountry() {
        return txtCountry;
    }

    public void setTxtCountry(JTextField txtCountry) {
        this.txtCountry = txtCountry;
    }

    public JTextField getTxtEmail() {
        return txtEmail;
    }

    public void setTxtEmail(JTextField txtEmail) {
        this.txtEmail = txtEmail;
    }

    public JTextField getTxtFirstName() {
        return txtFirstName;
    }

    public void setTxtFirstName(JTextField txtFirstName) {
        this.txtFirstName = txtFirstName;
    }

    public JTextField getTxtLastName() {
        return txtLastName;
    }

    public void setTxtLastName(JTextField txtLastName) {
        this.txtLastName = txtLastName;
    }

    public JTextField getTxtPhone() {
        return txtPhone;
    }

    public void setTxtPhone(JTextField txtPhone) {
        this.txtPhone = txtPhone;
    }

    public JTextField getTxtPostal() {
        return txtPostal;
    }

    public void setTxtPostal(JTextField txtPostal) {
        this.txtPostal = txtPostal;
    }

    public JTextField getTxtStreetAddress() {
        return txtStreetAddress;
    }

    public void setTxtStreetAddress(JTextField txtStreetAddress) {
        this.txtStreetAddress = txtStreetAddress;
    }

    public JTextField getTxtUnit() {
        return txtUnit;
    }

    public void setTxtUnit(JTextField txtUnit) {
        this.txtUnit = txtUnit;
    }

    

    public void updateFirstNameBtnListener(ActionListener myActionListener) {
        btnUpdateFirstName.addActionListener(myActionListener);
    }

    public void updateLastNameBtnListener(ActionListener myActionListener) {
        btnUpdateLastName.addActionListener(myActionListener);
    }

    public void updatePhoneBtnListener(ActionListener myActionListener) {
        btnUpdatePhone.addActionListener(myActionListener);
    }

    public void updateEmailBtnListener(ActionListener myActionListener) {
        btnUpdateEmail.addActionListener(myActionListener);
    }

    public void updatePostalBtnListener(ActionListener myActionListener) {
        btnUpdatePostal.addActionListener(myActionListener);
    }

    public void updateAddressBtnListener(ActionListener myActionListener) {
        btnUpdateStreetAddress.addActionListener(myActionListener);
    }

    public void updateUnitBtnListener(ActionListener myActionListener) {
        btnUpdateUnit.addActionListener(myActionListener);
    }

    public void updateCountryBtnListener(ActionListener myActionListener) {
        btnUpdateCountry.addActionListener(myActionListener);
    }

    public void updateCityBtnListener(ActionListener myActionListener) {
        btnUpdateCity.addActionListener(myActionListener);
    }

    public void clearAllBtnListener(ActionListener myActionListener) {
        btnClear.addActionListener(myActionListener);
    }
  
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        javax.swing.JPanel parentPanel = new javax.swing.JPanel();
        javax.swing.JPanel childPanel = new javax.swing.JPanel();
        javax.swing.JLabel lblRegister = new javax.swing.JLabel();
        javax.swing.JPanel enterInfoPanel = new javax.swing.JPanel();
        javax.swing.JLabel lblFirstName = new javax.swing.JLabel();
        txtGuestId = new javax.swing.JTextField();
        javax.swing.JLabel lblLastName = new javax.swing.JLabel();
        txtLastName = new javax.swing.JTextField();
        javax.swing.JLabel lblPhone = new javax.swing.JLabel();
        txtPhone = new javax.swing.JTextField();
        javax.swing.JLabel lblEmail = new javax.swing.JLabel();
        txtEmail = new javax.swing.JTextField();
        btnUpdateCountry = new javax.swing.JButton();
        btnClear = new javax.swing.JButton();
        txtUnit = new javax.swing.JTextField();
        javax.swing.JLabel lblUnit = new javax.swing.JLabel();
        txtStreetAddress = new javax.swing.JTextField();
        javax.swing.JLabel lblStreetAddress = new javax.swing.JLabel();
        txtCity = new javax.swing.JTextField();
        javax.swing.JLabel lblCity = new javax.swing.JLabel();
        javax.swing.JLabel lblPostal = new javax.swing.JLabel();
        txtPostal = new javax.swing.JTextField();
        txtCountry = new javax.swing.JTextField();
        javax.swing.JLabel lblCountry = new javax.swing.JLabel();
        btnUpdatePhone = new javax.swing.JButton();
        btnUpdatePostal = new javax.swing.JButton();
        btnUpdateCity = new javax.swing.JButton();
        btnUpdateStreetAddress = new javax.swing.JButton();
        btnUpdateUnit = new javax.swing.JButton();
        btnUpdateEmail = new javax.swing.JButton();
        btnUpdateFirstName = new javax.swing.JButton();
        btnUpdateLastName = new javax.swing.JButton();
        txtFirstName = new javax.swing.JTextField();
        javax.swing.JLabel lblFirstName1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Update Guest Account");

        parentPanel.setBackground(java.awt.Color.white);

        childPanel.setBackground(java.awt.Color.white);

        lblRegister.setFont(new java.awt.Font("Helvetica Neue", 1, 24)); // NOI18N
        lblRegister.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblRegister.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/icons/update.png"))); // NOI18N
        lblRegister.setText("Update Guest Account:");
        lblRegister.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));

        enterInfoPanel.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Enter Information:", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Helvetica Neue", 1, 14))); // NOI18N
        enterInfoPanel.setOpaque(false);

        lblFirstName.setFont(new java.awt.Font("Helvetica Neue", 0, 14)); // NOI18N
        lblFirstName.setText("First Name:");

        lblLastName.setFont(new java.awt.Font("Helvetica Neue", 0, 14)); // NOI18N
        lblLastName.setText("Last Name:");

        lblPhone.setFont(new java.awt.Font("Helvetica Neue", 0, 14)); // NOI18N
        lblPhone.setText("Phone Number:");

        txtPhone.setText("555-555-5555");

        lblEmail.setFont(new java.awt.Font("Helvetica Neue", 0, 14)); // NOI18N
        lblEmail.setText("Email:");

        txtEmail.setText("email@host.com");

        btnUpdateCountry.setBackground(javax.swing.UIManager.getDefaults().getColor("Actions.Grey"));
        btnUpdateCountry.setFont(new java.awt.Font("Helvetica Neue", 0, 18)); // NOI18N
        btnUpdateCountry.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/icons/update.png"))); // NOI18N
        btnUpdateCountry.setText("Update...");

        btnClear.setBackground(javax.swing.UIManager.getDefaults().getColor("Actions.Grey"));
        btnClear.setForeground(javax.swing.UIManager.getDefaults().getColor("Actions.Red"));
        btnClear.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/icons/clear.png"))); // NOI18N
        btnClear.setText("Clear All...");

        lblUnit.setFont(new java.awt.Font("Helvetica Neue", 0, 14)); // NOI18N
        lblUnit.setText("Unit:");

        lblStreetAddress.setFont(new java.awt.Font("Helvetica Neue", 0, 14)); // NOI18N
        lblStreetAddress.setText("Street Address:");

        lblCity.setFont(new java.awt.Font("Helvetica Neue", 0, 14)); // NOI18N
        lblCity.setText("City:");

        lblPostal.setFont(new java.awt.Font("Helvetica Neue", 0, 14)); // NOI18N
        lblPostal.setText("Postal Code:");

        lblCountry.setFont(new java.awt.Font("Helvetica Neue", 0, 14)); // NOI18N
        lblCountry.setText("Country:");

        btnUpdatePhone.setBackground(javax.swing.UIManager.getDefaults().getColor("Actions.Grey"));
        btnUpdatePhone.setFont(new java.awt.Font("Helvetica Neue", 0, 18)); // NOI18N
        btnUpdatePhone.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/icons/update.png"))); // NOI18N
        btnUpdatePhone.setText("Update...");

        btnUpdatePostal.setBackground(javax.swing.UIManager.getDefaults().getColor("Actions.Grey"));
        btnUpdatePostal.setFont(new java.awt.Font("Helvetica Neue", 0, 18)); // NOI18N
        btnUpdatePostal.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/icons/update.png"))); // NOI18N
        btnUpdatePostal.setText("Update...");

        btnUpdateCity.setBackground(javax.swing.UIManager.getDefaults().getColor("Actions.Grey"));
        btnUpdateCity.setFont(new java.awt.Font("Helvetica Neue", 0, 18)); // NOI18N
        btnUpdateCity.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/icons/update.png"))); // NOI18N
        btnUpdateCity.setText("Update...");

        btnUpdateStreetAddress.setBackground(javax.swing.UIManager.getDefaults().getColor("Actions.Grey"));
        btnUpdateStreetAddress.setFont(new java.awt.Font("Helvetica Neue", 0, 18)); // NOI18N
        btnUpdateStreetAddress.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/icons/update.png"))); // NOI18N
        btnUpdateStreetAddress.setText("Update...");

        btnUpdateUnit.setBackground(javax.swing.UIManager.getDefaults().getColor("Actions.Grey"));
        btnUpdateUnit.setFont(new java.awt.Font("Helvetica Neue", 0, 18)); // NOI18N
        btnUpdateUnit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/icons/update.png"))); // NOI18N
        btnUpdateUnit.setText("Update...");

        btnUpdateEmail.setBackground(javax.swing.UIManager.getDefaults().getColor("Actions.Grey"));
        btnUpdateEmail.setFont(new java.awt.Font("Helvetica Neue", 0, 18)); // NOI18N
        btnUpdateEmail.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/icons/update.png"))); // NOI18N
        btnUpdateEmail.setText("Update...");

        btnUpdateFirstName.setBackground(javax.swing.UIManager.getDefaults().getColor("Actions.Grey"));
        btnUpdateFirstName.setFont(new java.awt.Font("Helvetica Neue", 0, 18)); // NOI18N
        btnUpdateFirstName.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/icons/update.png"))); // NOI18N
        btnUpdateFirstName.setText("Update...");

        btnUpdateLastName.setBackground(javax.swing.UIManager.getDefaults().getColor("Actions.Grey"));
        btnUpdateLastName.setFont(new java.awt.Font("Helvetica Neue", 0, 18)); // NOI18N
        btnUpdateLastName.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/icons/update.png"))); // NOI18N
        btnUpdateLastName.setText("Update...");

        lblFirstName1.setFont(new java.awt.Font("Helvetica Neue", 1, 24)); // NOI18N
        lblFirstName1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblFirstName1.setText("Guest ID:");

        javax.swing.GroupLayout enterInfoPanelLayout = new javax.swing.GroupLayout(enterInfoPanel);
        enterInfoPanel.setLayout(enterInfoPanelLayout);
        enterInfoPanelLayout.setHorizontalGroup(
            enterInfoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(enterInfoPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(enterInfoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblFirstName, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblEmail, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblPhone, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblLastName, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblUnit, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblStreetAddress, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblCity, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, enterInfoPanelLayout.createSequentialGroup()
                        .addComponent(lblPostal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(97, 97, 97))
                    .addComponent(lblCountry, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, enterInfoPanelLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btnClear))
                    .addGroup(enterInfoPanelLayout.createSequentialGroup()
                        .addGroup(enterInfoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(enterInfoPanelLayout.createSequentialGroup()
                                .addComponent(txtFirstName, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnUpdateFirstName, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(enterInfoPanelLayout.createSequentialGroup()
                                .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnUpdateEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(enterInfoPanelLayout.createSequentialGroup()
                                .addComponent(txtPhone, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnUpdatePhone, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(enterInfoPanelLayout.createSequentialGroup()
                                .addComponent(txtLastName, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnUpdateLastName, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(enterInfoPanelLayout.createSequentialGroup()
                                .addComponent(txtUnit, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnUpdateUnit, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(enterInfoPanelLayout.createSequentialGroup()
                                .addComponent(txtStreetAddress, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnUpdateStreetAddress, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(enterInfoPanelLayout.createSequentialGroup()
                                .addComponent(txtCity, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnUpdateCity, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(enterInfoPanelLayout.createSequentialGroup()
                                .addComponent(txtCountry, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnUpdateCountry, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(enterInfoPanelLayout.createSequentialGroup()
                                .addComponent(txtPostal, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnUpdatePostal, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(lblFirstName1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
            .addGroup(enterInfoPanelLayout.createSequentialGroup()
                .addGap(143, 143, 143)
                .addComponent(txtGuestId, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        enterInfoPanelLayout.setVerticalGroup(
            enterInfoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(enterInfoPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblFirstName1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtGuestId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblFirstName)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(enterInfoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtFirstName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnUpdateFirstName, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lblLastName)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(enterInfoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtLastName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnUpdateLastName, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(12, 12, 12)
                .addComponent(lblEmail)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(enterInfoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnUpdateEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lblPhone)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(enterInfoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtPhone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnUpdatePhone, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lblUnit)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(enterInfoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtUnit, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnUpdateUnit, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lblStreetAddress)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(enterInfoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtStreetAddress, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnUpdateStreetAddress, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lblCity)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(enterInfoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtCity, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnUpdateCity, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lblPostal)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(enterInfoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtPostal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnUpdatePostal, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lblCountry)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(enterInfoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtCountry, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnUpdateCountry, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnClear)
                .addContainerGap())
        );

        javax.swing.GroupLayout childPanelLayout = new javax.swing.GroupLayout(childPanel);
        childPanel.setLayout(childPanelLayout);
        childPanelLayout.setHorizontalGroup(
            childPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, childPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(childPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(enterInfoPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblRegister, javax.swing.GroupLayout.DEFAULT_SIZE, 547, Short.MAX_VALUE))
                .addContainerGap())
        );
        childPanelLayout.setVerticalGroup(
            childPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(childPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblRegister)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(enterInfoPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout parentPanelLayout = new javax.swing.GroupLayout(parentPanel);
        parentPanel.setLayout(parentPanelLayout);
        parentPanelLayout.setHorizontalGroup(
            parentPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(childPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        parentPanelLayout.setVerticalGroup(
            parentPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(childPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        getContentPane().add(parentPanel, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
/* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new HotelGuestUpdateView().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnClear;
    private javax.swing.JButton btnUpdateCity;
    private javax.swing.JButton btnUpdateCountry;
    private javax.swing.JButton btnUpdateEmail;
    private javax.swing.JButton btnUpdateFirstName;
    private javax.swing.JButton btnUpdateLastName;
    private javax.swing.JButton btnUpdatePhone;
    private javax.swing.JButton btnUpdatePostal;
    private javax.swing.JButton btnUpdateStreetAddress;
    private javax.swing.JButton btnUpdateUnit;
    private javax.swing.JTextField txtCity;
    private javax.swing.JTextField txtCountry;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtFirstName;
    private javax.swing.JTextField txtGuestId;
    private javax.swing.JTextField txtLastName;
    private javax.swing.JTextField txtPhone;
    private javax.swing.JTextField txtPostal;
    private javax.swing.JTextField txtStreetAddress;
    private javax.swing.JTextField txtUnit;
    // End of variables declaration//GEN-END:variables
}
