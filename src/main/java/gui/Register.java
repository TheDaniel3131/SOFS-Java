/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package gui;

import java.io.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

class RegisterGreeting {

  // field and method of the parent class
  String name;
  public void CustomerGreeting() {
    System.out.println("Hi Customer! We serve online foods!");
  }
}

// inherit fromRegisterGreeting
class ToUser extends RegisterGreeting {

  // new method in subclass
  public void NameProgram() {
    System.out.println("My name is " + name);
  }
}


class Main {
  public static void main(String[] args) {

    // create an object of the subclass
    ToUser tu = new ToUser();

    // access field of superclass
    tu.name = "Spiderman";
    tu.NameProgram();

    // call method of superclass
    // using object of subclass
    tu.CustomerGreeting();

  }
}

public class Register extends javax.swing.JFrame {

    File f = new File("C:\\Users\\danie\\Documents\\NetBeansProjects\\JavaAssignment\\customerdatabase");
    int ln;
    String Username,Password;
    
    public Register() {
        initComponents();
        this.setLocationRelativeTo(null);
        this.setResizable(false);
    }
    
    void createFolder(){
        if(!f.exists()){
            f.mkdirs();
        }
    }
    
    void readFiles(){
        try {
            FileReader fr = new FileReader(f+"\\customerdetail.txt");
            System.out.println("File exists!");
        } catch (FileNotFoundException ex) {
            try {
              FileWriter fw = new FileWriter(f+"\\customerdetail.txt");
              System.out.println("File Created");
            } catch (IOException ex1){
                Logger.getLogger(Register.class.getName()).log(Level.SEVERE, null,ex1);
            }
        }
    }
    
    void addData(String usr, String pwd){
        try{
            RandomAccessFile raf = new RandomAccessFile(f+"\\customerdetail.txt","rw");
                for(int i=0;i<ln;i++){
                raf.readLine();
                }
            if(ln>0){
            raf.writeBytes("\r\n");
            raf.writeBytes("\r\n");
            }    
            raf.writeBytes("Username: "+usr+ "\r\n");
            raf.writeBytes("Password: "+pwd);

        }catch (FileNotFoundException ex) { 
            Logger.getLogger(Register.class.getName()).log(Level.SEVERE, null,ex);
        }catch (IOException ex){
            Logger.getLogger(Register.class.getName()).log(Level.SEVERE, null,ex);
        }
    }
    
    void login(String usr,String pwd){
        try {
            RandomAccessFile raf = new RandomAccessFile(f+"\\customerdetail.txt", "rw");
            for(int i=0;i<ln;i+=3){System.out.println("count "+i);
                String forUser = raf.readLine().substring(10);
                String forPwd = raf.readLine().substring(10);
//                System.out.println(forUser);
                if(usr.equals(forUser) & pwd.equals(forPwd)){
                    JOptionPane.showMessageDialog(null, "Successfully Register!");    
                    setVisible(false);
                    new Login().setVisible(true);
                    
                    break;
                }else if(i==(ln-2)){
                    JOptionPane.showMessageDialog(null, "Username Has Been Taken");     
                    break;
                    
                }

                for(int k=1;k<=1;k++){
                    raf.readLine();
                }
                
            }
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Register.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(Register.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
    
    void countLines(){
        try {
            ln=0;
            RandomAccessFile raf = new RandomAccessFile(f+"\\customerdetail.txt", "rw");
            for(int i=0;raf.readLine()!=null;i++){
                ln++;
            }
            System.out.println("number of lines:"+ln);
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Register.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(Register.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        tfusr = new javax.swing.JTextField();
        tfpwd = new javax.swing.JTextField();
        btnclear = new javax.swing.JButton();
        btnregister = new javax.swing.JButton();
        ButtonBack = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 51, 153));

        jPanel1.setBackground(new java.awt.Color(216, 65, 65));
        jPanel1.setPreferredSize(new java.awt.Dimension(626, 360));
        jPanel1.setLayout(null);

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 48)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Register");
        jPanel1.add(jLabel4);
        jLabel4.setBounds(370, 40, 200, 65);

        jLabel5.setFont(new java.awt.Font("Poppins", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Username :");
        jPanel1.add(jLabel5);
        jLabel5.setBounds(230, 120, 110, 33);

        jLabel6.setFont(new java.awt.Font("Poppins", 1, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Password :");
        jPanel1.add(jLabel6);
        jLabel6.setBounds(240, 180, 110, 33);

        tfusr.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfusrActionPerformed(evt);
            }
        });
        jPanel1.add(tfusr);
        tfusr.setBounds(350, 120, 233, 40);

        tfpwd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfpwdActionPerformed(evt);
            }
        });
        jPanel1.add(tfpwd);
        tfpwd.setBounds(350, 180, 233, 40);

        btnclear.setFont(new java.awt.Font("Poppins", 1, 12)); // NOI18N
        btnclear.setText("Clear");
        btnclear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnclearActionPerformed(evt);
            }
        });
        jPanel1.add(btnclear);
        btnclear.setBounds(350, 250, 100, 40);

        btnregister.setFont(new java.awt.Font("Poppins", 1, 12)); // NOI18N
        btnregister.setText("Register");
        btnregister.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnregisterActionPerformed(evt);
            }
        });
        jPanel1.add(btnregister);
        btnregister.setBounds(480, 250, 100, 40);

        ButtonBack.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        ButtonBack.setText("BACK");
        ButtonBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonBackActionPerformed(evt);
            }
        });
        jPanel1.add(ButtonBack);
        ButtonBack.setBounds(20, 20, 90, 40);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 626, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 626, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 360, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tfusrActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfusrActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfusrActionPerformed

    private void tfpwdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfpwdActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfpwdActionPerformed

    private void btnclearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnclearActionPerformed
        // TODO add your handling code here:
        tfusr.setText("");
        tfpwd.setText("");
    }//GEN-LAST:event_btnclearActionPerformed

    private void btnregisterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnregisterActionPerformed
        // TODO add your handling code here:
        createFolder();
        readFiles();
        countLines();
        addData(tfusr.getText(),tfpwd.getText());
        JOptionPane.showMessageDialog(null,"Data Registered");
    }//GEN-LAST:event_btnregisterActionPerformed

    private void ButtonBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonBackActionPerformed
        // TODO add your handling code here:
        Login lg = new Login();
        lg.show(); //display second frame

        dispose(); //close current frame (JAGuiDisplay)
    }//GEN-LAST:event_ButtonBackActionPerformed

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
            java.util.logging.Logger.getLogger(Register.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Register.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Register.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Register.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Register().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ButtonBack;
    private javax.swing.JButton btnclear;
    private javax.swing.JButton btnregister;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField tfpwd;
    private javax.swing.JTextField tfusr;
    // End of variables declaration//GEN-END:variables
}
