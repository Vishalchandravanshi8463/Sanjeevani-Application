package FrameLogin;

import java.sql.SQLException;
import java.util.Map;
import java.util.Set;
import javax.swing.JOptionPane;
import sanjeevaniapp.dao.ReceptionistDao;
import sanjeevaniapp.dao.UserDao;
import sanjeevaniapp.dbutil.DBConnection;
import sanjeevaniapp.pojo.ReceptionistPojo;
import sanjeevaniapp.pojo.UserPojo;
import sanjeevaniapp.utility.PasswordEncryption;

public class UpdateReceptionistScreen extends javax.swing.JFrame {

    /**
     * Creates new form UpdateReceptionistScreeen
     */
    private String recName, LoginId;
    String password;
    String rePassword;
    String recId;

    private Map<String, String> RecList;

    public UpdateReceptionistScreen() {
        initComponents();
        loadReceptionist();
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
        jLabel9 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        cmbRecId = new javax.swing.JComboBox<>();
        txtRecName = new javax.swing.JTextField();
        txtLogin = new javax.swing.JTextField();
        cmbGender = new javax.swing.JComboBox<>();
        txtpwd = new javax.swing.JPasswordField();
        txtRePwd = new javax.swing.JPasswordField();
        jLabel8 = new javax.swing.JLabel();
        btnUpdate = new javax.swing.JButton();
        btnBack = new javax.swing.JButton();
        btnLogout = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel9.setText("Sanjeevani Application");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 20, -1, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/sanjeevaniapp/icons/icons/HomePageBG1.jpg"))); // NOI18N
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, -60, 1080, 400));

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2), "Receptionist Details", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 18))); // NOI18N
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel2.setText("Receptionist ID");
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 60, -1, -1));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel3.setText("Receptionist Name");
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 100, -1, -1));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel4.setText("Login ID");
        jPanel2.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 140, -1, -1));

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel5.setText("Password");
        jPanel2.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 180, -1, -1));

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel6.setText("Retype Password");
        jPanel2.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 230, -1, -1));

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel7.setText("Gender");
        jPanel2.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 280, -1, -1));

        cmbRecId.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        cmbRecId.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cmbRecIdItemStateChanged(evt);
            }
        });
        cmbRecId.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbRecIdActionPerformed(evt);
            }
        });
        jPanel2.add(cmbRecId, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 60, 270, -1));

        txtRecName.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jPanel2.add(txtRecName, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 100, 270, -1));

        txtLogin.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jPanel2.add(txtLogin, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 140, 270, -1));

        cmbGender.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        cmbGender.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Male ", "Female", "Other" }));
        jPanel2.add(cmbGender, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 270, 270, -1));

        txtpwd.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jPanel2.add(txtpwd, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 180, 270, -1));

        txtRePwd.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jPanel2.add(txtRePwd, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 230, 270, -1));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 370, 770, 340));

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/sanjeevaniapp/icons/icons/images (2).jpg"))); // NOI18N
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(930, 380, 210, 230));

        btnUpdate.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnUpdate.setForeground(new java.awt.Color(0, 255, 255));
        btnUpdate.setText("UPDATE");
        btnUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateActionPerformed(evt);
            }
        });
        jPanel1.add(btnUpdate, new org.netbeans.lib.awtextra.AbsoluteConstraints(930, 620, 210, -1));

        btnBack.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnBack.setForeground(new java.awt.Color(0, 255, 255));
        btnBack.setText("BACK");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });
        jPanel1.add(btnBack, new org.netbeans.lib.awtextra.AbsoluteConstraints(930, 660, -1, -1));

        btnLogout.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnLogout.setForeground(new java.awt.Color(0, 255, 255));
        btnLogout.setText("LOGOUT");
        btnLogout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLogoutActionPerformed(evt);
            }
        });
        jPanel1.add(btnLogout, new org.netbeans.lib.awtextra.AbsoluteConstraints(1060, 660, -1, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1390, 770));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        // TODO add your handling code here:
        ManageReceptionist frame = new ManageReceptionist();
        frame.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnBackActionPerformed

    private void btnUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateActionPerformed
        // TODO add your handling code here:
        boolean isInputValid = validateInputs();
        if (!isInputValid) {
            JOptionPane.showMessageDialog(null, "Please input all fields", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }
        String result = matchPasswords();
        if (result != null) {
            JOptionPane.showMessageDialog(null, result);
            return;
        }

        try {
            String encPassword = new String(PasswordEncryption.getEncryption(password.toCharArray()));
            ReceptionistPojo rescep = new ReceptionistPojo();
            rescep.setReceptionistId(cmbRecId.getSelectedItem().toString());
            rescep.setGender(cmbGender.getSelectedItem().toString());
            rescep.setReceptionistName(recName);

            UserPojo recUser = new UserPojo();
            recUser.setUserName(recName);
            recUser.setLoginId(LoginId);
            recUser.setUserType(cmbGender.getSelectedItem().toString());
            recUser.setPassword(encPassword);

            boolean result1 = ReceptionistDao.updateReceptionist(rescep);
            boolean result2 = UserDao.updateReceptionist(recUser, recName);

            if (result1 == true || result2 == true) {
                JOptionPane.showMessageDialog(null, "Record updated successfully!", "Success", JOptionPane.INFORMATION_MESSAGE);
                 clearAll();
                return;
            }
            JOptionPane.showMessageDialog(null, "Record not updated!", "Failure!", JOptionPane.ERROR_MESSAGE);

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error In DB" + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
            e.printStackTrace();
        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(null, "Please input numeric value for salary", "Error", JOptionPane.ERROR_MESSAGE);
            ex.printStackTrace();
        }

    }//GEN-LAST:event_btnUpdateActionPerformed

    private void cmbRecIdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbRecIdActionPerformed
        // TODO add your handling code here:


    }//GEN-LAST:event_cmbRecIdActionPerformed

   
    private void cmbRecIdItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cmbRecIdItemStateChanged
        if (cmbRecId.getSelectedIndex() == -1) {
            return;
        }
        recId = cmbRecId.getSelectedItem().toString();
        recName = RecList.get(recId);
        txtRecName.setText(recName);

    }//GEN-LAST:event_cmbRecIdItemStateChanged

    private void btnLogoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLogoutActionPerformed
        // TODO add your handling code here:
          int ans;
        ans = JOptionPane.showConfirmDialog(null, "Are you sure to Logout", "LOGOUT", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
        if (ans == JOptionPane.YES_OPTION) {
           
             LoginScrrenn fr=new LoginScrrenn();
            fr.setVisible(true);
            this.dispose();
        }
    }//GEN-LAST:event_btnLogoutActionPerformed

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
            java.util.logging.Logger.getLogger(UpdateReceptionistScreen.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(UpdateReceptionistScreen.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(UpdateReceptionistScreen.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(UpdateReceptionistScreen.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new UpdateReceptionistScreen().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnLogout;
    private javax.swing.JButton btnUpdate;
    private javax.swing.JComboBox<String> cmbGender;
    private javax.swing.JComboBox<String> cmbRecId;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JTextField txtLogin;
    private javax.swing.JPasswordField txtRePwd;
    private javax.swing.JTextField txtRecName;
    private javax.swing.JPasswordField txtpwd;
    // End of variables declaration//GEN-END:variables

    private void loadReceptionist() {

        try {
            RecList = ReceptionistDao.getAllReceptionistId();
            Set<String> recIdSet = RecList.keySet();
            for (String s : recIdSet) {
                cmbRecId.addItem(s);
            }
            
            
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error In DB" + ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
            ex.printStackTrace();
        }

    }

    private boolean validateInputs() {

        recName = txtRecName.getText().trim();
        LoginId = txtLogin.getText().trim();
        char[] pw1 = txtpwd.getPassword();
        char[] pw2 = this.txtRePwd.getPassword();

        if (recName.isEmpty() || LoginId.isEmpty() || pw1.length == 0 || pw2.length == 0) {
            return false;
        }

        password = new String(pw1);
        rePassword = new String(pw2);
        return true;
    }

    private String matchPasswords() {

        if (password.length() < 3 || rePassword.length() < 3) {
            return "Password must be at least 3 characters long ";
        }
        if (password.equals(rePassword) == false) {
            return "Password do not match";
        }
        return null;
    }

    private void clearAll() {

        this.txtLogin.setText("");
        this.txtpwd.setText("");
        this.txtRePwd.setText("");
        return;
    }
}