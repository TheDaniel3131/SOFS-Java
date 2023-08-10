/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package gui;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author Daniel
 */
public class Payment extends javax.swing.JFrame {

    /**
     * Creates new form Payment
     */
    public Payment() {
        initComponents();
        this.setLocationRelativeTo(null);
        this.setResizable(false);
        
      System.out.println("Index 0 (First Item) is disabled... ");
      comboBoxPM.addItemListener(e -> {
         if (comboBoxPM.getSelectedIndex() == 0) {
             comboBoxPM.setEnabled(false);
            System.out.println("Index = " + comboBoxPM.getSelectedIndex());
         }
      });
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        txtCardNo = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        btnPayNow = new javax.swing.JButton();
        btnClear = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtareaAddress = new javax.swing.JTextArea();
        jLabel7 = new javax.swing.JLabel();
        comboBoxPM = new javax.swing.JComboBox<>();
        jLabel8 = new javax.swing.JLabel();
        txtPayFN = new javax.swing.JTextField();
        txtCardCVV = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(216, 65, 65));
        jPanel1.setLayout(null);

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Order Payment Details");
        jPanel1.add(jLabel4);
        jLabel4.setBounds(70, 20, 440, 65);

        txtCardNo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCardNoActionPerformed(evt);
            }
        });
        jPanel1.add(txtCardNo);
        txtCardNo.setBounds(230, 350, 270, 40);

        jLabel5.setFont(new java.awt.Font("Poppins", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Card Number:");
        jLabel5.setToolTipText("");
        jPanel1.add(jLabel5);
        jLabel5.setBounds(40, 350, 180, 33);

        jLabel6.setFont(new java.awt.Font("Poppins", 1, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Address:");
        jPanel1.add(jLabel6);
        jLabel6.setBounds(40, 170, 90, 33);

        btnPayNow.setFont(new java.awt.Font("Poppins", 1, 12)); // NOI18N
        btnPayNow.setText("Submit");
        btnPayNow.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPayNowActionPerformed(evt);
            }
        });
        jPanel1.add(btnPayNow);
        btnPayNow.setBounds(480, 490, 100, 40);

        btnClear.setFont(new java.awt.Font("Poppins", 1, 12)); // NOI18N
        btnClear.setText("Clear");
        btnClear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnClearActionPerformed(evt);
            }
        });
        jPanel1.add(btnClear);
        btnClear.setBounds(350, 490, 100, 40);

        txtareaAddress.setColumns(20);
        txtareaAddress.setRows(5);
        jScrollPane1.setViewportView(txtareaAddress);

        jPanel1.add(jScrollPane1);
        jScrollPane1.setBounds(230, 170, 270, 90);

        jLabel7.setFont(new java.awt.Font("Poppins", 1, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Full Name:");
        jPanel1.add(jLabel7);
        jLabel7.setBounds(40, 100, 110, 33);

        comboBoxPM.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "<!--SELECT-YOUR-CARD-->", "Credit Card", "Debit Card" }));
        jPanel1.add(comboBoxPM);
        comboBoxPM.setBounds(230, 290, 270, 40);

        jLabel8.setFont(new java.awt.Font("Poppins", 1, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Payment Method:");
        jLabel8.setToolTipText("");
        jPanel1.add(jLabel8);
        jLabel8.setBounds(40, 290, 180, 33);

        txtPayFN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPayFNActionPerformed(evt);
            }
        });
        jPanel1.add(txtPayFN);
        txtPayFN.setBounds(230, 100, 270, 40);

        txtCardCVV.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCardCVVActionPerformed(evt);
            }
        });
        jPanel1.add(txtCardCVV);
        txtCardCVV.setBounds(230, 420, 70, 40);

        jLabel9.setFont(new java.awt.Font("Poppins", 1, 18)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("CVV:");
        jLabel9.setToolTipText("");
        jPanel1.add(jLabel9);
        jLabel9.setBounds(40, 420, 180, 33);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 612, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 557, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public void setData(){
      String filePath = "C:\\Users\\danie\\Documents\\NetBeansProjects\\JavaAssignment\\customerdatabase\\paymentdetail.txt";
      File file = new File(filePath);
     
      if(!file.exists()){
          try {
              file.createNewFile();
          } catch (IOException ex) {
              Logger.getLogger(Payment.class.getName()).log(Level.SEVERE, null, ex);
          }
      }
      
      try{
          FileWriter fw = new FileWriter(file, true);
          BufferedWriter bw = new BufferedWriter(fw);
//          PrintWriter pw = new PrintWriter(bw);
//          bw.write("\r");
          bw.write(txtPayFN.getText()+ "\n" +txtareaAddress.getText()+ "\n" + comboBoxPM.getSelectedItem().toString() + "\n" + txtCardNo.getText() + "\n" + txtCardCVV.getText() + "\r\n");
          bw.close();
          fw.close();
          JOptionPane.showMessageDialog(this, "Payment Successful!");
     
      } catch (IOException ex) {
            Logger.getLogger(Payment.class.getName()).log(Level.SEVERE, null, ex);
             JOptionPane.showMessageDialog(rootPane, "Please Complete Filling Your Payment Details!", "Incomplete Payment", JOptionPane.ERROR_MESSAGE);
        }
    }

    public void paymentAlert(){
         if (txtPayFN.getText().equals("")){
            JOptionPane.showMessageDialog(rootPane, "Please Enter Your Full Name!", "Incomplete Payment", JOptionPane.ERROR_MESSAGE);
            //set cursor to the textbox
            txtPayFN.requestFocus();           
        } else if (txtareaAddress.getText().equals("")){
            JOptionPane.showMessageDialog(rootPane, "Please Enter Your Address!", "Incomplete Payment", JOptionPane.ERROR_MESSAGE);
            //set cursor to the textbox
            txtareaAddress.requestFocus();   
       }  else if (comboBoxPM.getSelectedItem().equals("") || comboBoxPM.getSelectedIndex() == 0){
            JOptionPane.showMessageDialog(rootPane, "Please Select Your Payment Method!", "Incomplete Payment", JOptionPane.ERROR_MESSAGE);
            //set cursor to the textbox
            comboBoxPM.requestFocus();   
       }  else if (txtCardNo.getText().equals("")){
            JOptionPane.showMessageDialog(rootPane, "Please Enter Your Card Number!", "Incomplete Payment", JOptionPane.ERROR_MESSAGE);
            //set cursor to the textbox
            txtCardNo.requestFocus();   
       }  else if (txtCardCVV.getText().equals("")){
            JOptionPane.showMessageDialog(rootPane, "Please Enter Your  CVV!", "Incomplete Payment", JOptionPane.ERROR_MESSAGE);
            //set cursor to the textbox
            txtCardCVV.requestFocus();  
     }  else if (comboBoxPM.getSelectedIndex() == 0){
             JOptionPane.showMessageDialog(rootPane, "Please Select Your Payment Method!", "Incomplete Payment", JOptionPane.ERROR_MESSAGE);
            //set cursor to the textbox
            comboBoxPM.requestFocus();  
            
     }
         
    }
    
    
    private void btnPayNowActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPayNowActionPerformed
      
      paymentAlert();
      setData();

    
    
    }//GEN-LAST:event_btnPayNowActionPerformed

    private void btnClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnClearActionPerformed
        txtCardNo.setText("");
        txtareaAddress.setText("");
        comboBoxPM.setSelectedIndex(0);
        txtPayFN.setText("");
        txtCardCVV.setText("");
       
        
        //        C# // JavaFX
//        comboBoxPM.getSelectedItem = null;
//        comboBoxPM.SelectedText = "<!--SELECT-YOUR-CARD-->";
//        comboBoxPM.getSelectionModel().selectFirst();
//        comboBoxPM.getSelectionModel().clearSelection();
        
    }//GEN-LAST:event_btnClearActionPerformed

    private void txtCardNoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCardNoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCardNoActionPerformed

    private void txtPayFNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPayFNActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPayFNActionPerformed

    private void txtCardCVVActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCardCVVActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCardCVVActionPerformed

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
            java.util.logging.Logger.getLogger(Payment.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Payment.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Payment.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Payment.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Payment().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnClear;
    private javax.swing.JButton btnPayNow;
    private javax.swing.JComboBox<String> comboBoxPM;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField txtCardCVV;
    private javax.swing.JTextField txtCardNo;
    private javax.swing.JTextField txtPayFN;
    private javax.swing.JTextArea txtareaAddress;
    // End of variables declaration//GEN-END:variables
}