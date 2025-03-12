/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import dao.PaymentDAO;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;
import model.Payment;
import view.HotelPaymentAddView;

/**
 *
 *
 * @author kale
 */
public class PaymentController {
    private HotelPaymentAddView hotelPaymentRegistrationView;
    private PaymentDAO PaymentDAO;

    public PaymentController(HotelPaymentAddView hotelPaymentRegistrationView, PaymentDAO PaymentDAO) {
        this.hotelPaymentRegistrationView = hotelPaymentRegistrationView;
        this.PaymentDAO = PaymentDAO;

        
        //We need to make event listeners
//        hotelPaymentRegistrationView.addPaymentBtnListener(new AddPaymentRecord());
//        hotelPaymentRegistrationView.addClearAllBtnListener(new ClearAllTextFields());
    }

    private class ClearAllTextFields implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            hotelPaymentRegistrationView.getTxtFirstName().setText("");
            hotelPaymentRegistrationView.getTxtFirstName().setText("");
            hotelPaymentRegistrationView.getTxtLastName().setText("");
            hotelPaymentRegistrationView.getTxtAddress().setText("");
            hotelPaymentRegistrationView.getTxtBillingAddress().setText("");
            hotelPaymentRegistrationView.getTxtPhone().setText("");
            hotelPaymentRegistrationView.getTxtEmail().setText("");
            hotelPaymentRegistrationView.getTxtPassword().setText("");
        }
    }

    private class AddPaymentRecord implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {


           
            boolean result = PaymentDAO.addPaymentRecord(newPayment);
       //make this result once implemented)
            if (result) {
                JOptionPane.showMessageDialog(null, "Successfully added a new payment");
            } else {
                JOptionPane.showMessageDialog(null, "Was not able to add a new payment record");
            }

        }

    }

}
