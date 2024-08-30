package Desain;

import DAO.CrudDistributor;
import Model.Distributor;
import javax.swing.JOptionPane;

public class HapusDistributor extends javax.swing.JFrame {

    CrudDistributor crudDistributor = new CrudDistributor();
    Distributor distributor = new Distributor();

    public HapusDistributor() {
        initComponents();

        buttonHapus.setVisible(false);
        tampilNamaDistributor.setVisible(false);
        labelNama.setVisible(false);

        tampilTableDistributor();
    }

    public void tampilTableDistributor() {
        tableDistributor.setModel(crudDistributor.tampilDistributor());
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        labelNama = new javax.swing.JLabel();
        buttonHapus = new javax.swing.JButton();
        buttonLogIn6 = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        tableDistributor = new javax.swing.JTable();
        inputID = new javax.swing.JTextField();
        jLabel22 = new javax.swing.JLabel();
        buttonCariKategori2 = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        tampilNamaDistributor = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(91, 187, 147));

        labelNama.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        labelNama.setForeground(new java.awt.Color(255, 255, 255));
        labelNama.setText("Nama distributor");

        buttonHapus.setBackground(new java.awt.Color(0, 153, 102));
        buttonHapus.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        buttonHapus.setForeground(new java.awt.Color(255, 255, 255));
        buttonHapus.setText("Hapus Data Distributor");
        buttonHapus.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(255, 255, 255)));
        buttonHapus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonHapusActionPerformed(evt);
            }
        });

        buttonLogIn6.setBackground(new java.awt.Color(0, 153, 102));
        buttonLogIn6.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        buttonLogIn6.setForeground(new java.awt.Color(255, 255, 255));
        buttonLogIn6.setText("Kembali");
        buttonLogIn6.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(255, 255, 255)));
        buttonLogIn6.setPreferredSize(new java.awt.Dimension(245, 35));
        buttonLogIn6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonLogIn6ActionPerformed(evt);
            }
        });

        tableDistributor.setBackground(new java.awt.Color(0, 153, 102));
        tableDistributor.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        tableDistributor.setForeground(new java.awt.Color(255, 255, 255));
        tableDistributor.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        tableDistributor.setEnabled(false);
        jScrollPane3.setViewportView(tableDistributor);

        inputID.setBackground(new java.awt.Color(238, 238, 238));
        inputID.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        inputID.setForeground(new java.awt.Color(0, 153, 102));
        inputID.setText("Masukkan id distributor");
        inputID.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                inputIDFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                inputIDFocusLost(evt);
            }
        });
        inputID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inputIDActionPerformed(evt);
            }
        });

        jLabel22.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel22.setForeground(new java.awt.Color(255, 255, 255));
        jLabel22.setText("ID distributor");

        buttonCariKategori2.setBackground(new java.awt.Color(0, 153, 102));
        buttonCariKategori2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        buttonCariKategori2.setForeground(new java.awt.Color(255, 255, 255));
        buttonCariKategori2.setText("Cari ID");
        buttonCariKategori2.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(255, 255, 255)));
        buttonCariKategori2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonCariKategori2ActionPerformed(evt);
            }
        });

        jPanel2.setBackground(new java.awt.Color(0, 153, 102));

        jLabel3.setFont(new java.awt.Font("Segoe Print", 1, 40)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Hapus Distributor");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1211, Short.MAX_VALUE)
            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel2Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jLabel3)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 80, Short.MAX_VALUE)
            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel2Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jLabel3)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        tampilNamaDistributor.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        tampilNamaDistributor.setForeground(new java.awt.Color(255, 255, 255));
        tampilNamaDistributor.setText("namaDistributor");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addComponent(buttonLogIn6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 324, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(buttonHapus, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(labelNama)
                                    .addComponent(jLabel22))
                                .addGap(18, 18, Short.MAX_VALUE)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(inputID, javax.swing.GroupLayout.PREFERRED_SIZE, 225, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(buttonCariKategori2, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(tampilNamaDistributor))))
                        .addGap(26, 26, 26)))
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 589, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(16, 16, 16))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel22)
                            .addComponent(inputID)
                            .addComponent(buttonCariKategori2, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(labelNama)
                            .addComponent(tampilNamaDistributor))
                        .addGap(69, 69, 69)
                        .addComponent(buttonHapus, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(246, 246, 246)
                        .addComponent(buttonLogIn6, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 483, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(19, 19, 19))
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

    private void buttonHapusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonHapusActionPerformed
        distributor.setIdDistributor(inputID.getText());

        crudDistributor.hapusDistributor(distributor);

        JOptionPane.showMessageDialog(null, "Data dengan ID: " + inputID.getText() + " berhasil dihapus");
        tableDistributor.setModel(crudDistributor.tampilDistributor());

        buttonHapus.setVisible(false);
        tampilNamaDistributor.setVisible(false);
        labelNama.setVisible(false);

        inputID.setText("Masukkan id distributor");
    }//GEN-LAST:event_buttonHapusActionPerformed

    private void buttonLogIn6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonLogIn6ActionPerformed
        LandingDistributor distributor = new LandingDistributor();
        distributor.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_buttonLogIn6ActionPerformed

    private void buttonCariKategori2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonCariKategori2ActionPerformed
        if (inputID.getText().equals("Masukkan id distributor")) {
            JOptionPane.showMessageDialog(null, "Masukkan id distributor!");
        } else {
            int i, cek = 0;
            for (i = 0; i < tableDistributor.getModel().getRowCount(); i++) {
                if (tableDistributor.getValueAt(i, 0).toString().equals(inputID.getText())) {
                    tampilNamaDistributor.setText(tableDistributor.getValueAt(i, 1).toString());
                    cek++;
                }
            }
            if (cek == 0) {
                JOptionPane.showMessageDialog(null, "Data dengan ID: " + inputID.getText() + " tidak ditemukan");
            } else {
                tampilNamaDistributor.setVisible(true);
                buttonHapus.setVisible(true);
                labelNama.setVisible(true);
            }
        }
    }//GEN-LAST:event_buttonCariKategori2ActionPerformed

    private void inputIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inputIDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_inputIDActionPerformed

    private void inputIDFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_inputIDFocusGained
        if (inputID.getText().equals("Masukkan id distributor")) {
            inputID.setText("");
        } else {
            inputID.setText(inputID.getText());
            buttonHapus.setVisible(false);
            tampilNamaDistributor.setVisible(false);
            labelNama.setVisible(false);
        }
    }//GEN-LAST:event_inputIDFocusGained

    private void inputIDFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_inputIDFocusLost
        if (inputID.getText().equals("")) {
            inputID.setText("Masukkan id distributor");
        } else {
            inputID.setText(inputID.getText());
        }
    }//GEN-LAST:event_inputIDFocusLost

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new HapusDistributor().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buttonCariKategori2;
    private javax.swing.JButton buttonHapus;
    private javax.swing.JButton buttonLogIn6;
    private javax.swing.JTextField inputID;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JLabel labelNama;
    private javax.swing.JTable tableDistributor;
    private javax.swing.JLabel tampilNamaDistributor;
    // End of variables declaration//GEN-END:variables
}
