/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import controller.LoginController;
import java.sql.Connection;
import java.sql.PreparedStatement;


import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import model.DBConnection;

/**
 *
 * @author user
 */
public class userregister extends javax.swing.JFrame {

    /**
     * Creates new form userregister
     */
    public userregister() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        firstName = new javax.swing.JTextField();
        lastName = new javax.swing.JTextField();
        email = new javax.swing.JTextField();
        username = new javax.swing.JTextField();
        password = new javax.swing.JPasswordField();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        jLabel1.setText("First Name");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 170, -1, -1));

        jLabel2.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        jLabel2.setText("Last Name");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 250, -1, -1));

        jLabel3.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        jLabel3.setText("E-mail");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 330, 70, -1));

        jLabel4.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        jLabel4.setText("Username");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 400, -1, -1));

        jLabel5.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        jLabel5.setText("PassWord");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 470, -1, -1));

        jButton1.setBackground(new java.awt.Color(135, 226, 240));
        jButton1.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/icons8-back-48.png"))); // NOI18N
        jButton1.setText("Register");
        jButton1.setBorderPainted(false);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(820, 570, 180, 50));

        jButton2.setBackground(new java.awt.Color(135, 226, 240));
        jButton2.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/icons8-back-48.png"))); // NOI18N
        jButton2.setText("Back to login");
        jButton2.setBorderPainted(false);
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 570, 190, 50));

        firstName.setBackground(new java.awt.Color(204, 204, 204));
        firstName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                firstNameActionPerformed(evt);
            }
        });
        getContentPane().add(firstName, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 162, 210, 30));

        lastName.setBackground(new java.awt.Color(204, 204, 204));
        getContentPane().add(lastName, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 242, 210, 30));

        email.setBackground(new java.awt.Color(204, 204, 204));
        getContentPane().add(email, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 322, 210, 30));

        username.setBackground(new java.awt.Color(204, 204, 204));
        getContentPane().add(username, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 402, 210, 30));

        password.setBackground(new java.awt.Color(204, 204, 204));
        getContentPane().add(password, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 470, 210, 30));

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/icons8-name-tag-50.png"))); // NOI18N
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(990, 150, -1, 50));

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/icons8-name-tag-50 (1).png"))); // NOI18N
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(990, 220, 50, -1));

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/icons8-email-50.png"))); // NOI18N
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(990, 280, 70, 80));

        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/icons8-user-50.png"))); // NOI18N
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(990, 390, 50, -1));

        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/icons8-password-48.png"))); // NOI18N
        getContentPane().add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(990, 460, -1, 40));

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/welcome to the world of Health care (1).png"))); // NOI18N
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1570, -1));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void firstNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_firstNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_firstNameActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
     
      String FIRSTNAME = firstName.getText();
      String LASTENAME = lastName.getText();
      String STUDENTEMAIL = email.getText();
      String USERNAME = username.getText(); 
      String PASSWORD =  password.getText();
      
       if (FIRSTNAME.isEmpty() ||LASTENAME.isEmpty()||STUDENTEMAIL.isEmpty()|| USERNAME.isEmpty()|| PASSWORD.isEmpty()) {
        // Show an error message for empty fields
        JOptionPane.showMessageDialog(this, "Fill up the form properly", "Error", JOptionPane.ERROR_MESSAGE);
    } else if (!isPasswordStrong(PASSWORD)) {
        // Show an error message for weak password
        JOptionPane.showMessageDialog(this, "Password must be at least 8 characters long and contain at least one number, one uppercase letter, one lowercase letter, and one special character", "Error", JOptionPane.ERROR_MESSAGE);
    } else{
         //start the regiter process
        userregister(FIRSTNAME,LASTENAME,STUDENTEMAIL, USERNAME,PASSWORD);
         
     }
       
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
         new view.userlogin().setVisible(true);
         dispose();
    }//GEN-LAST:event_jButton2ActionPerformed

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
            java.util.logging.Logger.getLogger(userregister.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(userregister.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(userregister.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(userregister.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new userregister().setVisible(true);
            }
        });
    }
    
  



    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField email;
    private javax.swing.JTextField firstName;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JTextField lastName;
    private javax.swing.JPasswordField password;
    private javax.swing.JTextField username;
    // End of variables declaration//GEN-END:variables

   private void userregister(String FIRSTNAME, String LASTNAME, String STUDENTEMAIL, String USERNAME, String PASSWORD) {
    Connection dbconn = DBConnection.getConnection();
    if (dbconn != null) {
        try {
            PreparedStatement st;
            st = dbconn.prepareStatement("INSERT INTO login (Username, password,First_Name,Last_Name,E_mail) VALUES(?,?,?,?,?)");
            
            st.setString(1, USERNAME);
            st.setString(2, PASSWORD);
            st.setString(3, FIRSTNAME);
            st.setString(4, LASTNAME);
            st.setString(5, STUDENTEMAIL);
            
            int res = st.executeUpdate();
            JOptionPane.showMessageDialog(null, "User data inserted.", "Success", JOptionPane.INFORMATION_MESSAGE);
            
        } catch (SQLException ex) {
            Logger.getLogger(userregister.class.getName()).log(Level.SEVERE, null, ex);
        }
    } else {
        System.out.println("The connection is not available");
    }
}

private boolean isPasswordStrong(String password) {
    int passwordLength = password.length();
    boolean hasNumber = false;
    boolean hasUppercase = false;
    boolean hasLowercase = false;
    boolean hasSpecialChar = false;

    if (passwordLength < 8) {
        return false;
    }

    for (char c : password.toCharArray()) {
        if (Character.isDigit(c)) {
            hasNumber = true;
        } else if (Character.isUpperCase(c)) {
            hasUppercase = true;
        } else if (Character.isLowerCase(c)) {
            hasLowercase = true;
        } else if (!Character.isLetterOrDigit(c)) {
            hasSpecialChar = true;
        }
    }

    return hasNumber && hasUppercase && hasLowercase && hasSpecialChar;
}

}