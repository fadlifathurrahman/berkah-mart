package Desain;

import DAO.CrudDistributor;
import Model.Distributor;
import javax.swing.JOptionPane;

public class UpdateDistributor extends javax.swing.JFrame {

    CrudDistributor crudDistributor = new CrudDistributor();
    Distributor distributor = new Distributor();

    public UpdateDistributor() {
        initComponents();

        buttonUpdate.setVisible(false);
        inputNama.setVisible(false);
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
        buttonLogIn6 = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        tableDistributor = new javax.swing.JTable();
        jPanel2 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        inputID = new javax.swing.JTextField();
        jLabel22 = new javax.swing.JLabel();
        buttonCariKategori2 = new javax.swing.JButton();
        buttonUpdate = new javax.swing.JButton();
        labelNama = new javax.swing.JLabel();
        inputNama = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(91, 187, 147));

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
        jScrollPane3.setViewportView(tableDistributor);

        jPanel2.setBackground(new java.awt.Color(0, 153, 102));

        jLabel3.setFont(new java.awt.Font("Segoe Print", 1, 40)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Update Distributor");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel2Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jLabel3)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 72, Short.MAX_VALUE)
            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel2Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jLabel3)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

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

        buttonUpdate.setBackground(new java.awt.Color(0, 153, 102));
        buttonUpdate.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        buttonUpdate.setForeground(new java.awt.Color(255, 255, 255));
        buttonUpdate.setText("Update Data Distributor");
        buttonUpdate.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(255, 255, 255)));
        buttonUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonUpdateActionPerformed(evt);
            }
        });

        labelNama.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        labelNama.setForeground(new java.awt.Color(255, 255, 255));
        labelNama.setText("Nama distributor");

        inputNama.setBackground(new java.awt.Color(238, 238, 238));
        inputNama.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        inputNama.setForeground(new java.awt.Color(0, 153, 102));
        inputNama.setText("Masukkan nama distributor");
        inputNama.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                inputNamaFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                inputNamaFocusLost(evt);
            }
        });
        inputNama.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inputNamaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(buttonLogIn6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(labelNama)
                                        .addGap(18, 18, 18)
                                        .addComponent(inputNama))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel22)
                                        .addGap(50, 50, 50)
                                        .addComponent(inputID, javax.swing.GroupLayout.DEFAULT_SIZE, 237, Short.MAX_VALUE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(buttonCariKategori2, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(64, 64, 64)
                                .addComponent(buttonUpdate, javax.swing.GroupLayout.PREFERRED_SIZE, 428, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 589, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(28, 28, 28))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 12, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 441, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel22)
                            .addComponent(inputID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(buttonCariKategori2, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(labelNama)
                            .addComponent(inputNama, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 332, Short.MAX_VALUE)
                        .addComponent(buttonUpdate, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addComponent(buttonLogIn6, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(15, 15, 15))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

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
                    inputNama.setText(tableDistributor.getValueAt(i, 1).toString());
                    cek++;
                }
            }

            if (cek == 0) {
                JOptionPane.showMessageDialog(null, "Data dengan ID: " + inputID.getText() + " tidak ditemukan");
            } else {
                buttonUpdate.setVisible(true);
                inputNama.setVisible(true);
                labelNama.setVisible(true);
            }
        }
    }//GEN-LAST:event_buttonCariKategori2ActionPerformed

    private void buttonUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonUpdateActionPerformed
        distributor.setIdDistributor(inputID.getText());
        distributor.setNamaDistributor(inputNama.getText());
        crudDistributor.updateDistributor(distributor);

        JOptionPane.showMessageDialog(null, "Data dengan ID: " + inputID.getText() + " berhasil diupdate");
        tableDistributor.setModel(crudDistributor.tampilDistributor());

        buttonUpdate.setVisible(false);
        inputNama.setVisible(false);
        labelNama.setVisible(false);

        inputID.setText("Masukkan id distributor");
    }//GEN-LAST:event_buttonUpdateActionPerformed

    private void inputNamaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inputNamaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_inputNamaActionPerformed

    private void inputIDFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_inputIDFocusGained
        if (inputID.getText().equals("Masukkan id distributor")) {
            inputID.setText("");
        } else {
            inputID.setText("");
            buttonUpdate.setVisible(false);
            inputNama.setVisible(false);
            labelNama.setVisible(false);
        }
    }//GEN-LAST:event_inputIDFocusGained

    private void inputNamaFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_inputNamaFocusGained
        if (inputNama.getText().equals("Masukkan nama distributor")) {
            inputNama.setText("");
        } else {
            inputNama.setText(inputNama.getText());
        }
    }//GEN-LAST:event_inputNamaFocusGained

    private void inputIDFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_inputIDFocusLost
        if (inputID.getText().equals("")) {
            inputID.setText("Masukkan id distributor");
        } else {
            inputID.setText(inputID.getText());
        }
    }//GEN-LAST:event_inputIDFocusLost

    private void inputNamaFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_inputNamaFocusLost
        if (inputNama.getText().equals("")) {
            inputNama.setText("Masukkan nama distributor");
        } else {
            inputNama.setText(inputNama.getText());
        }
    }//GEN-LAST:event_inputNamaFocusLost

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new UpdateDistributor().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buttonCariKategori2;
    private javax.swing.JButton buttonLogIn6;
    private javax.swing.JButton buttonUpdate;
    private javax.swing.JTextField inputID;
    private javax.swing.JTextField inputNama;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JLabel labelNama;
    private javax.swing.JTable tableDistributor;
    // End of variables declaration//GEN-END:variables
}
