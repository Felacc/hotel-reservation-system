/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package view;

import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JTextField;

/**
 *
 * @author JekKath
 */
public class HotelStaffUpdateView extends javax.swing.JFrame {

    /**
     * Creates new form HotelStaffUpdateView
     */
    public HotelStaffUpdateView() {
        initComponents();
    }

    public JTextField getTxtStaffId() {
        return txtStaffId;
    }

    public void setTxtStaffId(JTextField txtStaffId) {
        this.txtStaffId = txtStaffId;
    }

    
    
    public JButton getBtnClear() {
        return btnClear;
    }

    public void setBtnClear(JButton btnClear) {
        this.btnClear = btnClear;
    }

    public JButton getBtnUpdateAddress() {
        return btnUpdateAddress;
    }

    public void setBtnUpdateAddress(JButton btnUpdateAddress) {
        this.btnUpdateAddress = btnUpdateAddress;
    }

    public JButton getBtnUpdateCitizen() {
        return btnUpdateCitizen;
    }

    public void setBtnUpdateCitizen(JButton btnUpdateCitizen) {
        this.btnUpdateCitizen = btnUpdateCitizen;
    }

    public JButton getBtnUpdateCity() {
        return btnUpdateCity;
    }

    public void setBtnUpdateCity(JButton btnUpdateCity) {
        this.btnUpdateCity = btnUpdateCity;
    }

    public JButton getBtnUpdateCountry() {
        return btnUpdateCountry;
    }

    public void setBtnUpdateCountry(JButton btnUpdateCountry) {
        this.btnUpdateCountry = btnUpdateCountry;
    }

    public JButton getBtnUpdateEmail() {
        return btnUpdateEmail;
    }

    public void setBtnUpdateEmail(JButton btnUpdateEmail) {
        this.btnUpdateEmail = btnUpdateEmail;
    }

    public JButton getBtnUpdateFirst() {
        return btnUpdateFirst;
    }

    public void setBtnUpdateFirst(JButton btnUpdateFirst) {
        this.btnUpdateFirst = btnUpdateFirst;
    }

    public JButton getBtnUpdateLast() {
        return btnUpdateLast;
    }

    public void setBtnUpdateLast(JButton btnUpdateLast) {
        this.btnUpdateLast = btnUpdateLast;
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

    public JButton getBtnUpdateSIN() {
        return btnUpdateSIN;
    }

    public void setBtnUpdateSIN(JButton btnUpdateSIN) {
        this.btnUpdateSIN = btnUpdateSIN;
    }

    public JButton getBtnUpdateUnit() {
        return btnUpdateUnit;
    }

    public void setBtnUpdateUnit(JButton btnUpdateUnit) {
        this.btnUpdateUnit = btnUpdateUnit;
    }

    public JTextField getTxtStaffAddress() {
        return txtStaffAddress;
    }

    public void setTxtStaffAddress(JTextField txtStaffAddress) {
        this.txtStaffAddress = txtStaffAddress;
    }

    public JTextField getTxtStaffCity() {
        return txtStaffCity;
    }

    public void setTxtStaffCity(JTextField txtStaffCity) {
        this.txtStaffCity = txtStaffCity;
    }

    public JTextField getTxtStaffCountry() {
        return txtStaffCountry;
    }

    public void setTxtStaffCountry(JTextField txtStaffCountry) {
        this.txtStaffCountry = txtStaffCountry;
    }

    public JTextField getTxtStaffEmail() {
        return txtStaffEmail;
    }

    public void setTxtStaffEmail(JTextField txtStaffEmail) {
        this.txtStaffEmail = txtStaffEmail;
    }

    public JTextField getTxtStaffFirstName() {
        return txtStaffFirstName;
    }

    public void setTxtStaffFirstName(JTextField txtStaffFirstName) {
        this.txtStaffFirstName = txtStaffFirstName;
    }

    public JTextField getTxtStaffLastName() {
        return txtStaffLastName;
    }

    public void setTxtStaffLastName(JTextField txtStaffLastName) {
        this.txtStaffLastName = txtStaffLastName;
    }

    public JTextField getTxtStaffPhone() {
        return txtStaffPhone;
    }

    public void setTxtStaffPhone(JTextField txtStaffPhone) {
        this.txtStaffPhone = txtStaffPhone;
    }

    public JTextField getTxtStaffPostalCode() {
        return txtStaffPostalCode;
    }

    public void setTxtStaffPostalCode(JTextField txtStaffPostalCode) {
        this.txtStaffPostalCode = txtStaffPostalCode;
    }

    public JTextField getTxtStaffSIN() {
        return txtStaffSIN;
    }

    public void setTxtStaffSIN(JTextField txtStaffSIN) {
        this.txtStaffSIN = txtStaffSIN;
    }

    public JComboBox<String> getBoxCitizenType() {
        return boxCitizenType;
    }

    public void setBoxCitizenType(JComboBox<String> boxCitizenType) {
        this.boxCitizenType = boxCitizenType;
    }

    public JTextField getTxtUnitNumber() {
        return txtUnitNumber;
    }

    public void setTxtUnitNumber(JTextField txtUnitNumber) {
        this.txtUnitNumber = txtUnitNumber;
    }
    
    

     public void updateFirstNameBtnListener(ActionListener myActionListener) {
        btnUpdateFirst.addActionListener(myActionListener);
    }

    public void updateLastNameBtnListener(ActionListener myActionListener) {
        btnUpdateLast.addActionListener(myActionListener);
    }

    public void updatePhoneBtnListener(ActionListener myActionListener) {
        btnUpdatePhone.addActionListener(myActionListener);
    }

    public void updateEmailBtnListener(ActionListener myActionListener) {
        btnUpdateEmail.addActionListener(myActionListener);
    }
    public void updateSINBtnListener(ActionListener myActionListener) {
        btnUpdateSIN.addActionListener(myActionListener);
    }
     public void updateCountryBtnListener(ActionListener myActionListener) {
        btnUpdateCountry.addActionListener(myActionListener);
    }

    public void updatePostalBtnListener(ActionListener myActionListener) {
        btnUpdatePostal.addActionListener(myActionListener);
    }

    public void updateAddressBtnListener(ActionListener myActionListener) {
        btnUpdateAddress.addActionListener(myActionListener);
    }

    public void updateUnitBtnListener(ActionListener myActionListener) {
        btnUpdateUnit.addActionListener(myActionListener);
    }

    public void updateCitizenBtnListener(ActionListener myActionListener) {
        btnUpdateCitizen.addActionListener(myActionListener);
    }

    public void updateCityBtnListener(ActionListener myActionListener) {
        btnUpdateCity.addActionListener(myActionListener);
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        javax.swing.JPanel childPanel = new javax.swing.JPanel();
        javax.swing.JPanel enterInfoPanel = new javax.swing.JPanel();
        javax.swing.JLabel lblFirstName = new javax.swing.JLabel();
        txtStaffFirstName = new javax.swing.JTextField();
        javax.swing.JLabel lblLastName = new javax.swing.JLabel();
        txtStaffLastName = new javax.swing.JTextField();
        javax.swing.JLabel lblAddress = new javax.swing.JLabel();
        txtStaffEmail = new javax.swing.JTextField();
        javax.swing.JLabel lblSIN = new javax.swing.JLabel();
        txtStaffSIN = new javax.swing.JTextField();
        javax.swing.JLabel lblStaffStatus = new javax.swing.JLabel();
        javax.swing.JLabel lblUnitNumber = new javax.swing.JLabel();
        javax.swing.JLabel lblBillingAddress = new javax.swing.JLabel();
        txtUnitNumber = new javax.swing.JTextField();
        txtStaffPhone = new javax.swing.JTextField();
        txtStaffCity = new javax.swing.JTextField();
        javax.swing.JLabel lblStaffAddress = new javax.swing.JLabel();
        txtStaffAddress = new javax.swing.JTextField();
        javax.swing.JLabel lblStaffPostalCode = new javax.swing.JLabel();
        javax.swing.JLabel lblStaffCity = new javax.swing.JLabel();
        javax.swing.JLabel lblStaffCountry = new javax.swing.JLabel();
        txtStaffCountry = new javax.swing.JTextField();
        txtStaffPostalCode = new javax.swing.JTextField();
        btnUpdateCountry = new javax.swing.JButton();
        btnClear = new javax.swing.JButton();
        btnUpdatePhone = new javax.swing.JButton();
        btnUpdatePostal = new javax.swing.JButton();
        btnUpdateCity = new javax.swing.JButton();
        btnUpdateAddress = new javax.swing.JButton();
        btnUpdateUnit = new javax.swing.JButton();
        btnUpdateCitizen = new javax.swing.JButton();
        btnUpdateSIN = new javax.swing.JButton();
        btnUpdateFirst = new javax.swing.JButton();
        btnUpdateEmail = new javax.swing.JButton();
        btnUpdateLast = new javax.swing.JButton();
        txtStaffId = new javax.swing.JTextField();
        javax.swing.JLabel lblFirstName1 = new javax.swing.JLabel();
        boxCitizenType = new javax.swing.JComboBox<>();
        javax.swing.JLabel lblStaffRegister = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Update Staff Account");

        childPanel.setBackground(java.awt.Color.white);

        enterInfoPanel.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Enter Information:", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Helvetica Neue", 1, 14))); // NOI18N
        enterInfoPanel.setOpaque(false);

        lblFirstName.setFont(new java.awt.Font("Helvetica Neue", 0, 14)); // NOI18N
        lblFirstName.setText("First Name:");

        lblLastName.setFont(new java.awt.Font("Helvetica Neue", 0, 14)); // NOI18N
        lblLastName.setText("Last Name:");

        txtStaffLastName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtStaffLastNameActionPerformed(evt);
            }
        });

        lblAddress.setFont(new java.awt.Font("Helvetica Neue", 0, 14)); // NOI18N
        lblAddress.setText("Email:");

        txtStaffEmail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtStaffEmailActionPerformed(evt);
            }
        });

        lblSIN.setFont(new java.awt.Font("Helvetica Neue", 0, 14)); // NOI18N
        lblSIN.setText("SIN:");

        lblStaffStatus.setFont(new java.awt.Font("Helvetica Neue", 0, 14)); // NOI18N
        lblStaffStatus.setText("Status:");

        lblUnitNumber.setFont(new java.awt.Font("Helvetica Neue", 0, 14)); // NOI18N
        lblUnitNumber.setText("Unit Number:");

        lblBillingAddress.setFont(new java.awt.Font("Helvetica Neue", 0, 14)); // NOI18N
        lblBillingAddress.setText("Phone:");

        lblStaffAddress.setFont(new java.awt.Font("Helvetica Neue", 0, 14)); // NOI18N
        lblStaffAddress.setText("Street Address:");

        lblStaffPostalCode.setFont(new java.awt.Font("Helvetica Neue", 0, 14)); // NOI18N
        lblStaffPostalCode.setText("Postal Code:");

        lblStaffCity.setFont(new java.awt.Font("Helvetica Neue", 0, 14)); // NOI18N
        lblStaffCity.setText("City:");

        lblStaffCountry.setFont(new java.awt.Font("Helvetica Neue", 0, 14)); // NOI18N
        lblStaffCountry.setText("Country:");

        txtStaffCountry.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtStaffCountryActionPerformed(evt);
            }
        });

        btnUpdateCountry.setBackground(javax.swing.UIManager.getDefaults().getColor("Actions.Grey"));
        btnUpdateCountry.setFont(new java.awt.Font("Helvetica Neue", 0, 18)); // NOI18N
        btnUpdateCountry.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/icons/update.png"))); // NOI18N
        btnUpdateCountry.setText("Update");
        btnUpdateCountry.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateCountryActionPerformed(evt);
            }
        });

        btnClear.setBackground(javax.swing.UIManager.getDefaults().getColor("Actions.Grey"));
        btnClear.setForeground(javax.swing.UIManager.getDefaults().getColor("Actions.Red"));
        btnClear.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/icons/clear.png"))); // NOI18N
        btnClear.setText("Clear All...");
        btnClear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnClearActionPerformed(evt);
            }
        });

        btnUpdatePhone.setBackground(javax.swing.UIManager.getDefaults().getColor("Actions.Grey"));
        btnUpdatePhone.setFont(new java.awt.Font("Helvetica Neue", 0, 18)); // NOI18N
        btnUpdatePhone.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/icons/update.png"))); // NOI18N
        btnUpdatePhone.setText("Update");
        btnUpdatePhone.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdatePhoneActionPerformed(evt);
            }
        });

        btnUpdatePostal.setBackground(javax.swing.UIManager.getDefaults().getColor("Actions.Grey"));
        btnUpdatePostal.setFont(new java.awt.Font("Helvetica Neue", 0, 18)); // NOI18N
        btnUpdatePostal.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/icons/update.png"))); // NOI18N
        btnUpdatePostal.setText("Update");
        btnUpdatePostal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdatePostalActionPerformed(evt);
            }
        });

        btnUpdateCity.setBackground(javax.swing.UIManager.getDefaults().getColor("Actions.Grey"));
        btnUpdateCity.setFont(new java.awt.Font("Helvetica Neue", 0, 18)); // NOI18N
        btnUpdateCity.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/icons/update.png"))); // NOI18N
        btnUpdateCity.setText("Update");
        btnUpdateCity.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateCityActionPerformed(evt);
            }
        });

        btnUpdateAddress.setBackground(javax.swing.UIManager.getDefaults().getColor("Actions.Grey"));
        btnUpdateAddress.setFont(new java.awt.Font("Helvetica Neue", 0, 18)); // NOI18N
        btnUpdateAddress.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/icons/update.png"))); // NOI18N
        btnUpdateAddress.setText("Update");
        btnUpdateAddress.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateAddressActionPerformed(evt);
            }
        });

        btnUpdateUnit.setBackground(javax.swing.UIManager.getDefaults().getColor("Actions.Grey"));
        btnUpdateUnit.setFont(new java.awt.Font("Helvetica Neue", 0, 18)); // NOI18N
        btnUpdateUnit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/icons/update.png"))); // NOI18N
        btnUpdateUnit.setText("Update");
        btnUpdateUnit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateUnitActionPerformed(evt);
            }
        });

        btnUpdateCitizen.setBackground(javax.swing.UIManager.getDefaults().getColor("Actions.Grey"));
        btnUpdateCitizen.setFont(new java.awt.Font("Helvetica Neue", 0, 18)); // NOI18N
        btnUpdateCitizen.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/icons/update.png"))); // NOI18N
        btnUpdateCitizen.setText("Update");
        btnUpdateCitizen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateCitizenActionPerformed(evt);
            }
        });

        btnUpdateSIN.setBackground(javax.swing.UIManager.getDefaults().getColor("Actions.Grey"));
        btnUpdateSIN.setFont(new java.awt.Font("Helvetica Neue", 0, 18)); // NOI18N
        btnUpdateSIN.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/icons/update.png"))); // NOI18N
        btnUpdateSIN.setText("Update");
        btnUpdateSIN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateSINActionPerformed(evt);
            }
        });

        btnUpdateFirst.setBackground(javax.swing.UIManager.getDefaults().getColor("Actions.Grey"));
        btnUpdateFirst.setFont(new java.awt.Font("Helvetica Neue", 0, 18)); // NOI18N
        btnUpdateFirst.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/icons/update.png"))); // NOI18N
        btnUpdateFirst.setText("Update");
        btnUpdateFirst.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateFirstActionPerformed(evt);
            }
        });

        btnUpdateEmail.setBackground(javax.swing.UIManager.getDefaults().getColor("Actions.Grey"));
        btnUpdateEmail.setFont(new java.awt.Font("Helvetica Neue", 0, 18)); // NOI18N
        btnUpdateEmail.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/icons/update.png"))); // NOI18N
        btnUpdateEmail.setText("Update");
        btnUpdateEmail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateEmailActionPerformed(evt);
            }
        });

        btnUpdateLast.setBackground(javax.swing.UIManager.getDefaults().getColor("Actions.Grey"));
        btnUpdateLast.setFont(new java.awt.Font("Helvetica Neue", 0, 18)); // NOI18N
        btnUpdateLast.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/icons/update.png"))); // NOI18N
        btnUpdateLast.setText("Update");
        btnUpdateLast.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateLastActionPerformed(evt);
            }
        });

        txtStaffId.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtStaffIdActionPerformed(evt);
            }
        });

        lblFirstName1.setFont(new java.awt.Font("Helvetica Neue", 1, 24)); // NOI18N
        lblFirstName1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblFirstName1.setText("STAFF ID:");

        boxCitizenType.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Permanent", "Temporary" }));
        boxCitizenType.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boxCitizenTypeActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout enterInfoPanelLayout = new javax.swing.GroupLayout(enterInfoPanel);
        enterInfoPanel.setLayout(enterInfoPanelLayout);
        enterInfoPanelLayout.setHorizontalGroup(
            enterInfoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, enterInfoPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(enterInfoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, enterInfoPanelLayout.createSequentialGroup()
                        .addComponent(lblFirstName, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(243, 243, 243))
                    .addComponent(lblLastName, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblAddress, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblSIN, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblStaffStatus, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblUnitNumber, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblBillingAddress, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblStaffAddress, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblStaffPostalCode, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblStaffCity, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblStaffCountry, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(enterInfoPanelLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btnClear))
                    .addComponent(lblFirstName1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, enterInfoPanelLayout.createSequentialGroup()
                        .addGroup(enterInfoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, enterInfoPanelLayout.createSequentialGroup()
                                .addComponent(txtStaffLastName, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnUpdateLast, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, enterInfoPanelLayout.createSequentialGroup()
                                .addComponent(txtStaffFirstName, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnUpdateFirst, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, enterInfoPanelLayout.createSequentialGroup()
                                .addComponent(txtStaffEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnUpdateEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, enterInfoPanelLayout.createSequentialGroup()
                                .addComponent(txtStaffPhone, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnUpdatePhone, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, enterInfoPanelLayout.createSequentialGroup()
                                .addComponent(txtStaffSIN, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnUpdateSIN, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, enterInfoPanelLayout.createSequentialGroup()
                                .addComponent(boxCitizenType, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnUpdateCitizen, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, enterInfoPanelLayout.createSequentialGroup()
                                .addComponent(txtUnitNumber, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnUpdateUnit, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, enterInfoPanelLayout.createSequentialGroup()
                                .addComponent(txtStaffAddress, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnUpdateAddress, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, enterInfoPanelLayout.createSequentialGroup()
                                .addComponent(txtStaffCity, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnUpdateCity, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, enterInfoPanelLayout.createSequentialGroup()
                                .addComponent(txtStaffPostalCode, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnUpdatePostal, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, enterInfoPanelLayout.createSequentialGroup()
                                .addComponent(txtStaffCountry, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnUpdateCountry, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(enterInfoPanelLayout.createSequentialGroup()
                .addGap(166, 166, 166)
                .addComponent(txtStaffId, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(166, Short.MAX_VALUE))
        );
        enterInfoPanelLayout.setVerticalGroup(
            enterInfoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(enterInfoPanelLayout.createSequentialGroup()
                .addComponent(lblFirstName1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtStaffId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(8, 8, 8)
                .addComponent(lblFirstName)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(enterInfoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtStaffFirstName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnUpdateFirst))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblLastName)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(enterInfoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtStaffLastName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnUpdateLast))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblAddress)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(enterInfoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtStaffEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnUpdateEmail))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblBillingAddress)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(enterInfoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(enterInfoPanelLayout.createSequentialGroup()
                        .addComponent(txtStaffPhone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(12, 12, 12)
                        .addComponent(lblSIN))
                    .addComponent(btnUpdatePhone))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(enterInfoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(enterInfoPanelLayout.createSequentialGroup()
                        .addComponent(txtStaffSIN, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(lblStaffStatus))
                    .addComponent(btnUpdateSIN))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(enterInfoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(enterInfoPanelLayout.createSequentialGroup()
                        .addComponent(boxCitizenType, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(12, 12, 12)
                        .addComponent(lblUnitNumber))
                    .addComponent(btnUpdateCitizen))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(enterInfoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(enterInfoPanelLayout.createSequentialGroup()
                        .addComponent(txtUnitNumber, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(lblStaffAddress))
                    .addComponent(btnUpdateUnit))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(enterInfoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(enterInfoPanelLayout.createSequentialGroup()
                        .addComponent(txtStaffAddress, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(11, 11, 11)
                        .addComponent(lblStaffCity))
                    .addComponent(btnUpdateAddress))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(enterInfoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(enterInfoPanelLayout.createSequentialGroup()
                        .addComponent(txtStaffCity, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(lblStaffPostalCode)
                        .addGap(7, 7, 7)
                        .addGroup(enterInfoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(enterInfoPanelLayout.createSequentialGroup()
                                .addComponent(txtStaffPostalCode, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(12, 12, 12)
                                .addComponent(lblStaffCountry)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(enterInfoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(enterInfoPanelLayout.createSequentialGroup()
                                        .addComponent(txtStaffCountry, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(53, 53, 53)
                                        .addComponent(btnClear))
                                    .addComponent(btnUpdateCountry)))
                            .addComponent(btnUpdatePostal)))
                    .addComponent(btnUpdateCity))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        lblStaffRegister.setFont(new java.awt.Font("Helvetica Neue", 1, 24)); // NOI18N
        lblStaffRegister.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblStaffRegister.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/icons/update.png"))); // NOI18N
        lblStaffRegister.setText("Update Staff Account:");
        lblStaffRegister.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));

        javax.swing.GroupLayout childPanelLayout = new javax.swing.GroupLayout(childPanel);
        childPanel.setLayout(childPanelLayout);
        childPanelLayout.setHorizontalGroup(
            childPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(childPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(childPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(enterInfoPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblStaffRegister, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        childPanelLayout.setVerticalGroup(
            childPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(childPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblStaffRegister)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(enterInfoPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(childPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(childPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtStaffLastNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtStaffLastNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtStaffLastNameActionPerformed

    private void txtStaffEmailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtStaffEmailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtStaffEmailActionPerformed

    private void txtStaffCountryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtStaffCountryActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtStaffCountryActionPerformed

    private void btnUpdateCountryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateCountryActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnUpdateCountryActionPerformed

    private void btnClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnClearActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnClearActionPerformed

    private void btnUpdatePhoneActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdatePhoneActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnUpdatePhoneActionPerformed

    private void btnUpdatePostalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdatePostalActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnUpdatePostalActionPerformed

    private void btnUpdateCityActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateCityActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnUpdateCityActionPerformed

    private void btnUpdateAddressActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateAddressActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnUpdateAddressActionPerformed

    private void btnUpdateUnitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateUnitActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnUpdateUnitActionPerformed

    private void btnUpdateCitizenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateCitizenActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnUpdateCitizenActionPerformed

    private void btnUpdateSINActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateSINActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnUpdateSINActionPerformed

    private void btnUpdateFirstActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateFirstActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnUpdateFirstActionPerformed

    private void btnUpdateEmailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateEmailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnUpdateEmailActionPerformed

    private void btnUpdateLastActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateLastActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnUpdateLastActionPerformed

    private void txtStaffIdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtStaffIdActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtStaffIdActionPerformed

    private void boxCitizenTypeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boxCitizenTypeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_boxCitizenTypeActionPerformed

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
            java.util.logging.Logger.getLogger(HotelStaffUpdateView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(HotelStaffUpdateView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(HotelStaffUpdateView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(HotelStaffUpdateView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new HotelStaffUpdateView().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> boxCitizenType;
    private javax.swing.JButton btnClear;
    private javax.swing.JButton btnUpdateAddress;
    private javax.swing.JButton btnUpdateCitizen;
    private javax.swing.JButton btnUpdateCity;
    private javax.swing.JButton btnUpdateCountry;
    private javax.swing.JButton btnUpdateEmail;
    private javax.swing.JButton btnUpdateFirst;
    private javax.swing.JButton btnUpdateLast;
    private javax.swing.JButton btnUpdatePhone;
    private javax.swing.JButton btnUpdatePostal;
    private javax.swing.JButton btnUpdateSIN;
    private javax.swing.JButton btnUpdateUnit;
    private javax.swing.JTextField txtStaffAddress;
    private javax.swing.JTextField txtStaffCity;
    private javax.swing.JTextField txtStaffCountry;
    private javax.swing.JTextField txtStaffEmail;
    private javax.swing.JTextField txtStaffFirstName;
    private javax.swing.JTextField txtStaffId;
    private javax.swing.JTextField txtStaffLastName;
    private javax.swing.JTextField txtStaffPhone;
    private javax.swing.JTextField txtStaffPostalCode;
    private javax.swing.JTextField txtStaffSIN;
    private javax.swing.JTextField txtUnitNumber;
    // End of variables declaration//GEN-END:variables

}
