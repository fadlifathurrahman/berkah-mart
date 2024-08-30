package Desain;

import DAO.CrudDistributor;
import Model.Distributor;
import javax.swing.JOptionPane;

public class TambahDistributorDariTambahPembelian extends javax.swing.JFrame {

    CrudDistributor crudDistributor = new CrudDistributor();

    public TambahDistributorDariTambahPembelian() {
        initComponents();
        
        buatIdDistributor();
        tampilTableDistributor();
    }
    
    public void buatIdDistributor() {
        Distributor distributor = new Distributor(tampilIdDistributor.getText(), inputNamaDistributor.getText());

        int randomNumber1 = (int) (Math.random() * 9);
        int randomNumber2 = (int) (Math.random() * 9);
        int randomNumber3 = (int) (Math.random() * 9);
        tampilIdDistributor.setText("DT" + randomNumber1 + randomNumber2 + randomNumber3);

        if (new CrudDistributor().cekIdDistributor(distributor) == 0) {
            tampilIdDistributor.setText(tampilIdDistributor.getText());
        } else {
            randomNumber1 = (int) (Math.random() * 9);
            randomNumber2 = (int) (Math.random() * 9);
            randomNumber3 = (int) (Math.random() * 9);
            tampilIdDistributor.setText("DT" + randomNumber1 + randomNumber2 + randomNumber3);
        }
    }
    
    public void tampilTableDistributor() {
        tableDistributor.setModel(crudDistributor.tampilDistributor());
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        buttonLogIn7 = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        tableDistributor = new javax.swing.JTable();
        buttonLogIn8 = new javax.swing.JButton();
        jLabel14 = new javax.swing.JLabel();
        tampilIdDistributor = new javax.swing.JLabel();
        inputNamaDistributor = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(91, 187, 147));

        buttonLogIn7.setBackground(new java.awt.Color(0, 153, 102));
        buttonLogIn7.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        buttonLogIn7.setForeground(new java.awt.Color(255, 255, 255));
        buttonLogIn7.setText("Simpan Data Distributor");
        buttonLogIn7.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(255, 255, 255)));
        buttonLogIn7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonLogIn7ActionPerformed(evt);
            }
        });

        tableDistributor.setBackground(new java.awt.Color(0, 153, 102));
        tableDistributor.setFont(new java.awt.Font("Segoe UI", 1, 17)); // NOI18N
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
        jScrollPane2.setViewportView(tableDistributor);

        buttonLogIn8.setBackground(new java.awt.Color(0, 153, 102));
        buttonLogIn8.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        buttonLogIn8.setForeground(new java.awt.Color(255, 255, 255));
        buttonLogIn8.setText("Kembali");
        buttonLogIn8.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(255, 255, 255)));
        buttonLogIn8.setPreferredSize(new java.awt.Dimension(245, 35));
        buttonLogIn8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonLogIn8ActionPerformed(evt);
            }
        });

        jLabel14.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(255, 255, 255));
        jLabel14.setText("Nama Distributor");

        tampilIdDistributor.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        tampilIdDistributor.setForeground(new java.awt.Color(255, 255, 255));
        tampilIdDistributor.setText("idDistributor");

        inputNamaDistributor.setBackground(new java.awt.Color(238, 238, 238));
        inputNamaDistributor.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        inputNamaDistributor.setForeground(new java.awt.Color(0, 153, 102));
        inputNamaDistributor.setText("Masukkan nama distributor");
        inputNamaDistributor.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                inputNamaDistributorFocusGained(evt);
            }
        });
        inputNamaDistributor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inputNamaDistributorActionPerformed(evt);
            }
        });

        jPanel2.setBackground(new java.awt.Color(0, 153, 102));
        jPanel2.setForeground(new java.awt.Color(0, 153, 102));

        jLabel3.setFont(new java.awt.Font("Segoe Print", 1, 36)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Tambah Distributor");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1000, Short.MAX_VALUE)
            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel2Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jLabel3)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 65, Short.MAX_VALUE)
            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel2Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jLabel3)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        jLabel16.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(255, 255, 255));
        jLabel16.setText("ID Distributor");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel14)
                            .addComponent(jLabel16))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(tampilIdDistributor)
                            .addComponent(inputNamaDistributor, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(buttonLogIn8, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(buttonLogIn7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 45, Short.MAX_VALUE)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(76, 76, 76)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(tampilIdDistributor)
                            .addComponent(jLabel16))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel14)
                            .addComponent(inputNamaDistributor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(68, 68, 68)
                        .addComponent(buttonLogIn7, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(buttonLogIn8, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 27, Short.MAX_VALUE)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 484, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(24, 24, 24))
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

    private void buttonLogIn7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonLogIn7ActionPerformed
         if (inputNamaDistributor.getText().equals("Masukkan nama distributor")) 
        {
            JOptionPane.showMessageDialog(null, "Nama distributor harus diisi !");
        } 
        else if (inputNamaDistributor.getText().length() < 3 || inputNamaDistributor.getText().length() > 30) 
        {
            JOptionPane.showMessageDialog(null, "Nama distributor harus lebih dari 3 karakter\ndan kurang dari 30 karakter");
        } 
        else 
        {
            Distributor distributor = new Distributor(tampilIdDistributor.getText(), inputNamaDistributor.getText());

            if (new CrudDistributor().tambahDistributor(distributor) == 0) {
                JOptionPane.showMessageDialog(null, "Distributor berhasil ditambah");
                buatIdDistributor();
                tableDistributor.setModel(crudDistributor.tampilDistributor());
            } else {
                JOptionPane.showMessageDialog(null, "Nama distributor sudah ada");
            }
        }
        inputNamaDistributor.setText("Masukkan nama distributor");
    }//GEN-LAST:event_buttonLogIn7ActionPerformed

    private void buttonLogIn8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonLogIn8ActionPerformed
        TambahPembelian tambahPembelian = new TambahPembelian();
        tambahPembelian.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_buttonLogIn8ActionPerformed

    private void inputNamaDistributorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inputNamaDistributorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_inputNamaDistributorActionPerformed

    private void inputNamaDistributorFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_inputNamaDistributorFocusGained
        if (inputNamaDistributor.getText().equals("Masukkan nama distributor")) {
            inputNamaDistributor.setText("");
        } else {
            inputNamaDistributor.setText(inputNamaDistributor.getText());
        }
    }//GEN-LAST:event_inputNamaDistributorFocusGained

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TambahDistributorDariTambahPembelian().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buttonLogIn7;
    private javax.swing.JButton buttonLogIn8;
    private javax.swing.JTextField inputNamaDistributor;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable tableDistributor;
    private javax.swing.JLabel tampilIdDistributor;
    // End of variables declaration//GEN-END:variables
}
