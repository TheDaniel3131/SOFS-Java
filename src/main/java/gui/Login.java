/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package gui;

import java.awt.Color;
import java.io.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;


public class Login extends javax.swing.JFrame {

    File f = new File("C:\\Users\\danie\\Documents\\NetBeansProjects\\JavaAssignment\\customerdatabase");
    int ln;
    String Username,Password;
    

    
    public Login() {
        initComponents();
        this.setLocationRelativeTo(null);
        this.setResizable(false);
        
        Color color= new Color(255,255,255);
        chbxShowPassword.setForeground(color);
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
                Logger.getLogger(Login.class.getName()).log(Level.SEVERE, null,ex1);
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
            }    
            raf.writeBytes("Username: "+usr+ "\r\n");
            raf.writeBytes("Password: "+pwd);
            
        }catch (FileNotFoundException ex) { 
            Logger.getLogger(Login.class.getName()).log(Level.SEVERE, null,ex);
        }catch (IOException ex){
            Logger.getLogger(Login.class.getName()).log(Level.SEVERE, null,ex);
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
                    JOptionPane.showMessageDialog(null, "You have successfully login!");    
                    
                    setVisible(false);
                    new JAGUIDisplay4().setVisible(true);                   



                    dispose();                   
                    break;
                }else if(i==(ln-2)){
                    JOptionPane.showMessageDialog(null, "Invalid username or password");     
                    break;
                    
                }

                for(int k=1;k<=1;k++){
                    raf.readLine();
                }
                
            }
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Login.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(Login.class.getName()).log(Level.SEVERE, null, ex);
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
            Logger.getLogger(Login.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(Login.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        tfusr = new javax.swing.JTextField();
        btnclear = new javax.swing.JButton();
        btnlogin = new javax.swing.JButton();
        ButtonBack = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        chbxShowPassword = new javax.swing.JCheckBox();
        pfpwd = new javax.swing.JPasswordField();
        jLabel6 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 51, 153));

        jPanel1.setBackground(new java.awt.Color(216, 65, 65));
        jPanel1.setForeground(new java.awt.Color(255, 255, 255));
        jPanel1.setPreferredSize(new java.awt.Dimension(682, 384));
        jPanel1.setLayout(null);

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 48)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Login");
        jPanel1.add(jLabel4);
        jLabel4.setBounds(400, 30, 127, 65);

        tfusr.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        tfusr.setToolTipText("Username Field For Login User");
        tfusr.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfusrActionPerformed(evt);
            }
        });
        jPanel1.add(tfusr);
        tfusr.setBounds(350, 110, 230, 40);

        btnclear.setFont(new java.awt.Font("Poppins", 1, 12)); // NOI18N
        btnclear.setText("Clear");
        btnclear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnclearActionPerformed(evt);
            }
        });
        jPanel1.add(btnclear);
        btnclear.setBounds(350, 260, 100, 40);

        btnlogin.setFont(new java.awt.Font("Poppins", 1, 12)); // NOI18N
        btnlogin.setText("Login");
        btnlogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnloginActionPerformed(evt);
            }
        });
        jPanel1.add(btnlogin);
        btnlogin.setBounds(480, 260, 100, 40);

        ButtonBack.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        ButtonBack.setText("BACK");
        ButtonBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonBackActionPerformed(evt);
            }
        });
        jPanel1.add(ButtonBack);
        ButtonBack.setBounds(20, 20, 90, 40);

        jLabel2.setFont(new java.awt.Font("Poppins", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("NOT A MEMBER? REGISTER NOW");
        jLabel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel2MouseClicked(evt);
            }
        });
        jPanel1.add(jLabel2);
        jLabel2.setBounds(310, 330, 310, 20);

        chbxShowPassword.setBackground(new java.awt.Color(255, 255, 255));
        chbxShowPassword.setFont(new java.awt.Font("Poppins", 1, 12)); // NOI18N
        chbxShowPassword.setText("Show Password");
        chbxShowPassword.setToolTipText("Show Password Visiblity");
        chbxShowPassword.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chbxShowPasswordActionPerformed(evt);
            }
        });
        jPanel1.add(chbxShowPassword);
        chbxShowPassword.setBounds(450, 220, 130, 24);

        pfpwd.setFont(new java.awt.Font("Poppins", 1, 12)); // NOI18N
        pfpwd.setToolTipText("Password Field For Login User");
        pfpwd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pfpwdActionPerformed(evt);
            }
        });
        jPanel1.add(pfpwd);
        pfpwd.setBounds(350, 170, 230, 40);

        jLabel6.setFont(new java.awt.Font("Poppins", 1, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Password :");

        jLabel5.setFont(new java.awt.Font("Poppins", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Username :");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(226, 226, 226)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(336, Short.MAX_VALUE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(114, 114, 114)
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(177, Short.MAX_VALUE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 384, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tfusrActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfusrActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfusrActionPerformed

    private void btnclearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnclearActionPerformed
        // TODO add your handling code here:
        tfusr.setText("");
        pfpwd.setText("");
    }//GEN-LAST:event_btnclearActionPerformed

    private void btnloginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnloginActionPerformed
        // TODO add your handling code here:
        createFolder();
        readFiles();
        countLines();
        login(tfusr.getText(), pfpwd.getText());
    }//GEN-LAST:event_btnloginActionPerformed

    private void ButtonBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonBackActionPerformed
        // TODO add your handling code here:
        JAGUIDisplay jd1 = new JAGUIDisplay();
        jd1.show(); //display second frame

        dispose(); //close current frame (JAGuiDisplay)
    }//GEN-LAST:event_ButtonBackActionPerformed

    private void jLabel2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MouseClicked
        // TODO add your handling code here:

        Register rg = new Register();
        rg.setVisible(true);
        rg.pack();
        rg.setLocationRelativeTo(null);
        rg.setDefaultCloseOperation(Register.EXIT_ON_CLOSE);
        this.dispose();
    }//GEN-LAST:event_jLabel2MouseClicked

    private void chbxShowPasswordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chbxShowPasswordActionPerformed
        String check_pass = new String(pfpwd.getPassword());
        if (chbxShowPassword.isSelected() ) {
            pfpwd.setEchoChar((char)0);
        }
        else if (!(chbxShowPassword.isSelected()) & (check_pass.equals("") | check_pass.equals("Enter the password...") ) ) {
            pfpwd.setEchoChar((char)0);
        }
        else {
            pfpwd.setEchoChar('\u25cf');
        }
    }//GEN-LAST:event_chbxShowPasswordActionPerformed

    private void pfpwdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pfpwdActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_pfpwdActionPerformed

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
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ButtonBack;
    private javax.swing.JButton btnclear;
    private javax.swing.JButton btnlogin;
    private javax.swing.JCheckBox chbxShowPassword;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPasswordField pfpwd;
    private javax.swing.JTextField tfusr;
    // End of variables declaration//GEN-END:variables
}
