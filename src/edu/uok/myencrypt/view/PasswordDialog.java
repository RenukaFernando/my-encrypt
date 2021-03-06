package edu.uok.myencrypt.view;

import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;

/**
 * Created by Renuka on 06/03/2016.
 */
class PasswordDialog extends javax.swing.JDialog {

    private static final int MIN_PASSWORD_CHAR_COUNT = 3;

    private String passwordText = "";

    /**
     * Creates new form passwordDialog
     */
    PasswordDialog(Frame parent) {
        super(parent, true);
        initComponents();
        setLocationRelativeTo(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        JPanel jPanel1 = new JPanel();
        JPanel jPanel2 = new JPanel();
        JLabel jLabel1 = new JLabel();
        JLabel jLabel2 = new JLabel();
        passwordPasswordField = new javax.swing.JPasswordField();
        JButton okButton = new JButton();

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
                jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
                jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGap(0, 100, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setLayout(null);

        jLabel1.setFont(new java.awt.Font("Tahoma", Font.PLAIN, 18)); // NOI18N
        jLabel1.setText("Encryption / Decryption Password");
        jPanel2.add(jLabel1);
        jLabel1.setBounds(20, 20, 280, 20);

        jLabel2.setFont(new java.awt.Font("Tahoma", Font.PLAIN, 14)); // NOI18N
        jLabel2.setText("password");
        jPanel2.add(jLabel2);
        jLabel2.setBounds(20, 60, 70, 30);

        passwordPasswordField.addActionListener(evt -> passwordPasswordFieldActionPerformed());
        passwordPasswordField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                passwordPasswordFieldKeyPressed(evt);
            }
        });
        jPanel2.add(passwordPasswordField);
        passwordPasswordField.setBounds(90, 60, 250, 30);

        okButton.setText("OK");
        okButton.addActionListener(evt -> okButtonActionPerformed());
        jPanel2.add(okButton);
        okButton.setBounds(267, 100, 73, 23);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 367, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    String getPassword() {
        return passwordText;
    }

    private void okButtonActionPerformed() {//GEN-FIRST:event_okButtonActionPerformed
        String password = String.valueOf(passwordPasswordField.getPassword());
        if (password.length() < MIN_PASSWORD_CHAR_COUNT) {
            JOptionPane.showMessageDialog(this, "Password must be at least "
                    + MIN_PASSWORD_CHAR_COUNT + " characters.");
            passwordPasswordField.setText("");
            passwordPasswordField.requestFocus();
        } else {
            passwordText = password;
            this.dispose();
        }
    }//GEN-LAST:event_okButtonActionPerformed

    private void passwordPasswordFieldActionPerformed() {//GEN-FIRST:event_passwordPasswordFieldActionPerformed
        okButtonActionPerformed();
    }//GEN-LAST:event_passwordPasswordFieldActionPerformed

    private void passwordPasswordFieldKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_passwordPasswordFieldKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ESCAPE) {
            dispose();
        }
    }//GEN-LAST:event_passwordPasswordFieldKeyPressed

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
        } catch (ClassNotFoundException | javax.swing.UnsupportedLookAndFeelException | IllegalAccessException | InstantiationException ex) {
            java.util.logging.Logger.getLogger(PasswordDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(() -> {
            PasswordDialog dialog = new PasswordDialog(new JFrame());
            dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                @Override
                public void windowClosing(java.awt.event.WindowEvent e) {
                    System.exit(0);
                }
            });
            dialog.setVisible(true);
        });
    }

    private javax.swing.JPasswordField passwordPasswordField;
    // End of variables declaration//GEN-END:variables
}
