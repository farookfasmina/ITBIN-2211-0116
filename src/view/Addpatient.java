/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import controller.AddpatientController;
import javax.swing.JOptionPane;

/**
 *
 * @author user
 */
public class Addpatient extends javax.swing.JFrame {

    /**
     * Creates new form Addpatient
     */
    public Addpatient() {
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
        jButton1 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jButton6 = new javax.swing.JButton();
        Pname = new javax.swing.JTextField();
        pnumber = new javax.swing.JTextField();
        doctorname = new javax.swing.JTextField();
        payment = new javax.swing.JTextField();
        TReatment = new javax.swing.JComboBox<>();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel1.setText("patient Name");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(292, 217, 170, -1));

        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel2.setText("patient contact number");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(292, 271, -1, -1));

        jLabel3.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel3.setText("patient Treatment type");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(292, 322, 250, 29));

        jLabel4.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel4.setText("Doctor Nmae");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(292, 380, 230, -1));

        jButton1.setBackground(new java.awt.Color(102, 102, 255));
        jButton1.setText("add patient");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 570, 130, 49));

        jButton4.setBackground(new java.awt.Color(102, 102, 255));
        jButton4.setText("Clear ");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 570, 150, 49));

        jButton5.setBackground(new java.awt.Color(102, 102, 255));
        jButton5.setText("Back to DashBord");
        getContentPane().add(jButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        jLabel5.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel5.setText("patient payment info");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(292, 434, 240, -1));

        jButton6.setBackground(new java.awt.Color(102, 102, 255));
        jButton6.setText("Exit");
        getContentPane().add(jButton6, new org.netbeans.lib.awtextra.AbsoluteConstraints(870, 570, 130, 49));
        getContentPane().add(Pname, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 210, 230, 30));
        getContentPane().add(pnumber, new org.netbeans.lib.awtextra.AbsoluteConstraints(609, 260, 230, 30));
        getContentPane().add(doctorname, new org.netbeans.lib.awtextra.AbsoluteConstraints(609, 369, 230, 30));
        getContentPane().add(payment, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 430, 230, 30));

        TReatment.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Electronic Health Records", "Telemedicine", "Clinical Decision Support", "Appointment Management", "Lab Management" }));
        TReatment.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TReatmentActionPerformed(evt);
            }
        });
        getContentPane().add(TReatment, new org.netbeans.lib.awtextra.AbsoluteConstraints(609, 317, 230, 30));

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/Add a subheading (3).png"))); // NOI18N
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1250, 700));

        jLabel7.setText("jLabel7");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 130, -1, -1));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        
 
 
 AddpatientController.patient(Pname.getText(), pnumber.getText(),doctorname.getText(), (String)TReatment.getSelectedItem(), payment.getText());

 JOptionPane.showMessageDialog(null, "New Record hasbeen inserted", "Successfull",JOptionPane.INFORMATION_MESSAGE);
    clearField();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void TReatmentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TReatmentActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TReatmentActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton4ActionPerformed

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
            java.util.logging.Logger.getLogger(Addpatient.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Addpatient.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Addpatient.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Addpatient.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Addpatient().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField Pname;
    private javax.swing.JComboBox<String> TReatment;
    private javax.swing.JTextField doctorname;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JTextField payment;
    private javax.swing.JTextField pnumber;
    // End of variables declaration//GEN-END:variables

    private void clearField() {
 Pname.setText("");
 doctorname.setText("");
 payment.setText("");
  pnumber.setText(""); 
    }
}