package Desain;

import DAO.CekAkun;
import Model.Akun;
import javax.swing.JOptionPane;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;

public class Register extends javax.swing.JFrame {

    public Register() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        inputUsername = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        inputPassword = new javax.swing.JPasswordField();
        buttonRegister = new javax.swing.JButton();
        buttonLogIn = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(238, 238, 238));

        jPanel2.setBackground(new java.awt.Color(91, 187, 147));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 48)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(221, 221, 221));
        jLabel5.setText("Register");

        jPanel3.setBackground(new java.awt.Color(238, 238, 238));

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(91, 187, 147));
        jLabel7.setText("Username");

        inputUsername.setBackground(new java.awt.Color(91, 187, 147));
        inputUsername.setFont(new java.awt.Font("Segoe UI", 3, 22)); // NOI18N
        inputUsername.setForeground(new java.awt.Color(255, 255, 255));
        inputUsername.setText("Masukkan username");
        inputUsername.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                inputUsernameFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                inputUsernameFocusLost(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(91, 187, 147));
        jLabel8.setText("Password");

        inputPassword.setBackground(new java.awt.Color(91, 187, 147));
        inputPassword.setFont(new java.awt.Font("Segoe UI", 2, 24)); // NOI18N
        inputPassword.setForeground(new java.awt.Color(255, 255, 255));
        inputPassword.setText("Masukkan password");
        inputPassword.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                inputPasswordFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                inputPasswordFocusLost(evt);
            }
        });
        inputPassword.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inputPasswordActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(inputPassword)
                    .addComponent(jLabel8)
                    .addComponent(jLabel7)
                    .addComponent(inputUsername, javax.swing.GroupLayout.DEFAULT_SIZE, 377, Short.MAX_VALUE))
                .addContainerGap(18, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(inputUsername, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(inputPassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(40, Short.MAX_VALUE))
        );

        buttonRegister.setBackground(new java.awt.Color(238, 238, 238));
        buttonRegister.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        buttonRegister.setForeground(new java.awt.Color(91, 187, 147));
        buttonRegister.setText("Register");
        buttonRegister.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonRegisterActionPerformed(evt);
            }
        });

        buttonLogIn.setBackground(new java.awt.Color(238, 238, 238));
        buttonLogIn.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        buttonLogIn.setForeground(new java.awt.Color(91, 187, 147));
        buttonLogIn.setText("Log In");
        buttonLogIn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonLogInActionPerformed(evt);
            }
        });

        jLabel9.setFont(new java.awt.Font("Segoe Print", 1, 22)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Sudah punya akun?");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(131, 131, 131)
                .addComponent(jLabel5)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(25, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel9)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(buttonLogIn, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(buttonRegister, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(22, 22, 22))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 42, Short.MAX_VALUE)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(buttonRegister)
                .addGap(52, 52, 52)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(buttonLogIn)
                    .addComponent(jLabel9))
                .addGap(22, 22, 22))
        );

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 48)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(91, 187, 147));
        jLabel4.setText("Berkah Mart");

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Gambar/4016257-preview.png"))); // NOI18N

        jLabel1.setFont(new java.awt.Font("Segoe Print", 1, 40)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(91, 187, 147));
        jLabel1.setText("Daftar !");

        jLabel2.setFont(new java.awt.Font("Segoe Print", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(91, 187, 147));
        jLabel2.setText("Untuk mengakses berbagai fitur di");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 52, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(53, 53, 53)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel4)
                            .addComponent(jLabel6))))
                .addGap(39, 39, 39))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(30, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel6)
                .addGap(52, 52, 52))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void buttonLogInActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonLogInActionPerformed
        LogIn login = new LogIn();
        login.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_buttonLogInActionPerformed

    private void buttonRegisterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonRegisterActionPerformed

        if (inputUsername.getText().equals("Masukkan username") || inputPassword.getText().equals("Masukkan password")) {
            JOptionPane.showMessageDialog(null, "Masukkan Username dan Password !");
        }
        else if (inputUsername.getText().length() < 6 || inputUsername.getText().length() > 20) {
            JOptionPane.showMessageDialog(null, "Username dan Password harus lebih dari 6 karakter\ndan kurang dari 20 karakter");
        } else {

            Akun akun = new Akun(inputUsername.getText(), inputPassword.getText());
            if (new CekAkun().tambahAkun(akun) == 0) {
                JOptionPane.showMessageDialog(null, "Register berhasil");
            } else {
                JOptionPane.showMessageDialog(null, "Username sudah ada");
            }
        }
        inputUsername.setText("Masukkan username");
        inputPassword.setText("Masukkan password");
    }//GEN-LAST:event_buttonRegisterActionPerformed

    private void inputUsernameFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_inputUsernameFocusGained
        if (inputUsername.getText().equals("Masukkan username")) {
            inputUsername.setText("");
        } else {
            inputUsername.setText(inputUsername.getText());
        }
    }//GEN-LAST:event_inputUsernameFocusGained

    private void inputUsernameFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_inputUsernameFocusLost
        if (inputUsername.getText().equals("")) {
            inputUsername.setText("Masukkan username");
        } else {
            inputUsername.setText(inputUsername.getText());
        }
    }//GEN-LAST:event_inputUsernameFocusLost

    private void inputPasswordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inputPasswordActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_inputPasswordActionPerformed

    private void inputPasswordFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_inputPasswordFocusLost
        if (inputPassword.getText().equals("")) {
            inputPassword.setText("Masukkan password");
        } else {
            inputPassword.setText(inputPassword.getText());
        }
    }//GEN-LAST:event_inputPasswordFocusLost

    private void inputPasswordFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_inputPasswordFocusGained
        if (inputPassword.getText().equals("Masukkan password")) {
            inputPassword.setText("");
        } else {
            inputPassword.setText(inputPassword.getText());
        }
    }//GEN-LAST:event_inputPasswordFocusGained

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Register().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buttonLogIn;
    private javax.swing.JButton buttonRegister;
    private javax.swing.JPasswordField inputPassword;
    private javax.swing.JTextField inputUsername;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    // End of variables declaration//GEN-END:variables
}
