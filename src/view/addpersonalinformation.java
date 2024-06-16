
package view;

import controller.PatientController;


public class addpersonalinformation extends javax.swing.JFrame {

   
    public addpersonalinformation() {
        initComponents();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        submitBtn = new javax.swing.JButton();
        resetBtn = new javax.swing.JButton();
        exitBtn = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        nameTF = new javax.swing.JTextField();
        addresTF = new javax.swing.JTextField();
        maleRBtn = new javax.swing.JRadioButton();
        femaleRBtn = new javax.swing.JRadioButton();
        ageTF = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel1.setText("NMAE");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 170, -1, -1));

        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel2.setText("Address");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 240, -1, -1));

        jLabel3.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel3.setText("Age");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 310, -1, -1));

        jLabel4.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel4.setText("Gender");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 380, -1, -1));

        submitBtn.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        submitBtn.setText("submit");
        submitBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                submitBtnActionPerformed(evt);
            }
        });
        getContentPane().add(submitBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 500, -1, -1));

        resetBtn.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        resetBtn.setText("reset");
        resetBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                resetBtnActionPerformed(evt);
            }
        });
        getContentPane().add(resetBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 500, -1, 40));

        exitBtn.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        exitBtn.setText("exit");
        exitBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitBtnActionPerformed(evt);
            }
        });
        getContentPane().add(exitBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(950, 490, 100, 50));

        jButton4.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jButton4.setText("back");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 90, -1, -1));
        getContentPane().add(nameTF, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 160, 350, -1));
        getContentPane().add(addresTF, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 210, 350, -1));

        maleRBtn.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        maleRBtn.setText("Male");
        getContentPane().add(maleRBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 380, 100, -1));

        femaleRBtn.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        femaleRBtn.setText("female");
        getContentPane().add(femaleRBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(930, 380, 120, -1));
        getContentPane().add(ageTF, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 310, 350, -1));

        jButton1.setFont(new java.awt.Font("Tahoma", 3, 18)); // NOI18N
        jButton1.setText("clear");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 500, 100, 40));

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/Add a subheading (1).png"))); // NOI18N
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void submitBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_submitBtnActionPerformed
       
             String gender = null;
             if (maleRBtn.isSelected()) {
             gender = "Male";
             } else if (femaleRBtn.isSelected()) {
             gender = "Female";
             }
   
   PatientController.Form(ageTF.getText(),nameTF.getText(), addresTF.getText(),gender);
   clearField();

    }//GEN-LAST:event_submitBtnActionPerformed

    private void resetBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_resetBtnActionPerformed
      maleRBtn.setSelected(false);
      femaleRBtn.setSelected(false);
     
    }//GEN-LAST:event_resetBtnActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
         clearField();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void exitBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitBtnActionPerformed
         System.exit(0);
    }//GEN-LAST:event_exitBtnActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
         new view.user_interface().setVisible(true);
         dispose();
    }//GEN-LAST:event_jButton4ActionPerformed
  public void clearField() {
        nameTF.setText("");
        addresTF.setText("");
        maleRBtn.setSelected(false);
        femaleRBtn.setSelected(false);
        ageTF.setText("");
        
 }

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
            java.util.logging.Logger.getLogger(addpersonalinformation.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(addpersonalinformation.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(addpersonalinformation.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(addpersonalinformation.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new addpersonalinformation().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField addresTF;
    private javax.swing.JTextField ageTF;
    private javax.swing.JButton exitBtn;
    private javax.swing.JRadioButton femaleRBtn;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JRadioButton maleRBtn;
    private javax.swing.JTextField nameTF;
    private javax.swing.JButton resetBtn;
    private javax.swing.JButton submitBtn;
    // End of variables declaration//GEN-END:variables
}
