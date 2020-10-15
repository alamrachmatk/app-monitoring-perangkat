 
package Forms;
 
public class JendelaLogin extends javax.swing.JDialog {

   
    public JendelaLogin(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
    }

   
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelInput = new javax.swing.JPanel();
        lblPemakai = new javax.swing.JLabel();
        txtuser = new javax.swing.JTextField();
        lblPass = new javax.swing.JLabel();
        txtPass = new javax.swing.JPasswordField();
        jLabel1 = new javax.swing.JLabel();
        lblPemakai1 = new javax.swing.JLabel();
        tblBatal = new javax.swing.JButton();
        tblLogin = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Login");

        panelInput.setBackground(new java.awt.Color(0, 102, 102));
        panelInput.setBorder(javax.swing.BorderFactory.createTitledBorder("Login"));

        lblPemakai.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblPemakai.setText("Username");

        txtuser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtuserActionPerformed(evt);
            }
        });
        txtuser.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtuserKeyPressed(evt);
            }
        });

        lblPass.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblPass.setText("Password");

        txtPass.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtPassKeyPressed(evt);
            }
        });

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/logologin.jpg"))); // NOI18N

        lblPemakai1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblPemakai1.setText("APLIKASI MONITORING PERANGKAT");

        tblBatal.setBackground(new java.awt.Color(255, 255, 255));
        tblBatal.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/door_out.png"))); // NOI18N
        tblBatal.setText("Cancel");
        tblBatal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tblBatalActionPerformed(evt);
            }
        });

        tblLogin.setBackground(new java.awt.Color(255, 255, 255));
        tblLogin.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/login.jpg"))); // NOI18N
        tblLogin.setText("Login");
        tblLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tblLoginActionPerformed(evt);
            }
        });
        tblLogin.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                tblLoginKeyPressed(evt);
            }
        });

        javax.swing.GroupLayout panelInputLayout = new javax.swing.GroupLayout(panelInput);
        panelInput.setLayout(panelInputLayout);
        panelInputLayout.setHorizontalGroup(
            panelInputLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelInputLayout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addGroup(panelInputLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblPemakai1, javax.swing.GroupLayout.PREFERRED_SIZE, 410, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(panelInputLayout.createSequentialGroup()
                        .addGroup(panelInputLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblPemakai, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblPass, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(6, 6, 6)
                        .addGroup(panelInputLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panelInputLayout.createSequentialGroup()
                                .addComponent(tblLogin)
                                .addGap(10, 10, 10)
                                .addComponent(tblBatal))
                            .addGroup(panelInputLayout.createSequentialGroup()
                                .addGroup(panelInputLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtuser, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtPass, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 49, Short.MAX_VALUE)
                                .addComponent(jLabel1)))))
                .addGap(39, 39, 39))
        );
        panelInputLayout.setVerticalGroup(
            panelInputLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelInputLayout.createSequentialGroup()
                .addComponent(lblPemakai1)
                .addGroup(panelInputLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelInputLayout.createSequentialGroup()
                        .addGap(37, 37, 37)
                        .addComponent(lblPemakai)
                        .addGap(23, 23, 23)
                        .addComponent(lblPass))
                    .addGroup(panelInputLayout.createSequentialGroup()
                        .addGap(33, 33, 33)
                        .addGroup(panelInputLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addGroup(panelInputLayout.createSequentialGroup()
                                .addComponent(txtuser, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(11, 11, 11)
                                .addComponent(txtPass, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addGap(13, 13, 13)
                .addGroup(panelInputLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(tblLogin)
                    .addComponent(tblBatal, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelInput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelInput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tblBatalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tblBatalActionPerformed
this.dispose();       
    }//GEN-LAST:event_tblBatalActionPerformed

    private void tblLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tblLoginActionPerformed
String user = "admin";
String pass = "admin";
if(user.equalsIgnoreCase(txtuser.getText()) && pass.equalsIgnoreCase(txtPass.getText())){
this.setVisible(false);
new MenuUtama().setVisible(true);
}
else {
javax.swing.JOptionPane.showMessageDialog(null,"kombinasi nama dan password salah");
txtuser.setText("");
txtuser.requestFocus();
txtPass.setText("");
}

 
    }//GEN-LAST:event_tblLoginActionPerformed

    private void txtuserKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtuserKeyPressed
       
//if(evt.getKeyCode() == evt.VK_ENTER)
//txtPass.requestFocus();
if(evt.getKeyCode() == evt.VK_ENTER)
txtPass.requestFocus();      
        
        
    }//GEN-LAST:event_txtuserKeyPressed

    private void tblLoginKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tblLoginKeyPressed
        // TODO add your handling code here:
        String user = "admin";
String pass = "admin";
if(user.equalsIgnoreCase(txtuser.getText()) && pass.equalsIgnoreCase(txtPass.getText())){
this.setVisible(false);
new MenuUtama().setVisible(true);
}
else {
javax.swing.JOptionPane.showMessageDialog(null,"kombinasi nama dan password salah");
txtuser.setText("");
txtuser.requestFocus();
txtPass.setText("");
}

    }//GEN-LAST:event_tblLoginKeyPressed

    private void txtuserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtuserActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtuserActionPerformed

    private void txtPassKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPassKeyPressed
   if(evt.getKeyCode() == evt.VK_ENTER)
   tblLogin.doClick();
    }//GEN-LAST:event_txtPassKeyPressed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /*
         * Set the Nimbus look and feel
         */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /*
         * If Nimbus (introduced in Java SE 6) is not available, stay with the
         * default look and feel. For details see
         * http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(JendelaLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JendelaLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JendelaLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JendelaLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /*
         * Create and display the dialog
         */
        java.awt.EventQueue.invokeLater(new Runnable() {

            public void run() {
                JendelaLogin dialog = new JendelaLogin(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {

                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel lblPass;
    private javax.swing.JLabel lblPemakai;
    private javax.swing.JLabel lblPemakai1;
    private javax.swing.JPanel panelInput;
    private javax.swing.JButton tblBatal;
    private javax.swing.JButton tblLogin;
    private javax.swing.JPasswordField txtPass;
    private javax.swing.JTextField txtuser;
    // End of variables declaration//GEN-END:variables
}
