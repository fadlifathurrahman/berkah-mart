package Desain;

import DAO.CrudKategori;
import Model.Kategori;
import javax.swing.JOptionPane;

public class TambahKategoriDariTambahProdukPembelian extends javax.swing.JFrame {

    CrudKategori crudKategori = new CrudKategori();

    public TambahKategoriDariTambahProdukPembelian() {
        initComponents();

        buatIdKategori();
        tampilTableKategori();
    }

    public void buatIdKategori() {
        Kategori kategori = new Kategori(tampilIdKategori.getText(), inputNamaKategori.getText());

        int randomNumber1 = (int) (Math.random() * 9);
        int randomNumber2 = (int) (Math.random() * 9);
        int randomNumber3 = (int) (Math.random() * 9);
        tampilIdKategori.setText("KT" + randomNumber1 + randomNumber2 + randomNumber3);

        if (new CrudKategori().cekIdKategori(kategori) == 0) {
            tampilIdKategori.setText(tampilIdKategori.getText());
        } else {
            randomNumber1 = (int) (Math.random() * 9);
            randomNumber2 = (int) (Math.random() * 9);
            randomNumber3 = (int) (Math.random() * 9);
            tampilIdKategori.setText("KT" + randomNumber1 + randomNumber2 + randomNumber3);
        }

    }

    public void tampilTableKategori() {
        tableKategori.setModel(crudKategori.tampilKategori());
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        buttonLogIn5 = new javax.swing.JButton();
        buttonLogIn6 = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        tampilIdKategori = new javax.swing.JLabel();
        inputNamaKategori = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tableKategori = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(91, 187, 147));

        buttonLogIn5.setBackground(new java.awt.Color(0, 153, 102));
        buttonLogIn5.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        buttonLogIn5.setForeground(new java.awt.Color(255, 255, 255));
        buttonLogIn5.setText("Simpan Data Kategori");
        buttonLogIn5.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(255, 255, 255)));
        buttonLogIn5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonLogIn5ActionPerformed(evt);
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

        jPanel4.setBackground(new java.awt.Color(0, 153, 102));
        jPanel4.setForeground(new java.awt.Color(0, 153, 102));

        jLabel5.setFont(new java.awt.Font("Segoe Print", 1, 36)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Tambah Kategori");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
            .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel4Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jLabel5)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 65, Short.MAX_VALUE)
            .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel4Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jLabel5)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        jLabel11.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("Nama Kategori");

        tampilIdKategori.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        tampilIdKategori.setForeground(new java.awt.Color(255, 255, 255));
        tampilIdKategori.setText("idKategori");

        inputNamaKategori.setBackground(new java.awt.Color(238, 238, 238));
        inputNamaKategori.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        inputNamaKategori.setForeground(new java.awt.Color(0, 153, 102));
        inputNamaKategori.setText("Masukkan nama kategori");
        inputNamaKategori.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                inputNamaKategoriFocusGained(evt);
            }
        });
        inputNamaKategori.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inputNamaKategoriActionPerformed(evt);
            }
        });

        jLabel13.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setText("ID Kategori");

        tableKategori.setBackground(new java.awt.Color(0, 153, 102));
        tableKategori.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        tableKategori.setForeground(new java.awt.Color(255, 255, 255));
        tableKategori.setModel(new javax.swing.table.DefaultTableModel(
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
        tableKategori.setEnabled(false);
        tableKategori.setFocusable(false);
        tableKategori.setRowSelectionAllowed(false);
        tableKategori.setUpdateSelectionOnSort(false);
        tableKategori.setVerifyInputWhenFocusTarget(false);
        jScrollPane1.setViewportView(tableKategori);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(53, 53, 53)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(buttonLogIn5, javax.swing.GroupLayout.PREFERRED_SIZE, 396, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel11)
                            .addComponent(jLabel13))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(tampilIdKategori)
                            .addComponent(inputNamaKategori, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(buttonLogIn6, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 70, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(71, 71, 71)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(tampilIdKategori)
                            .addComponent(jLabel13))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel11)
                            .addComponent(inputNamaKategori, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(68, 68, 68)
                        .addComponent(buttonLogIn5, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(buttonLogIn6, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 27, Short.MAX_VALUE)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 484, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(24, Short.MAX_VALUE))
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

    private void buttonLogIn5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonLogIn5ActionPerformed
        if (inputNamaKategori.getText().equals("Masukkan nama kategori")) {
            JOptionPane.showMessageDialog(null, "Nama kategori harus diisi !");
        } else if (inputNamaKategori.getText().length() < 3 || inputNamaKategori.getText().length() > 20) {
            JOptionPane.showMessageDialog(null, "Nama kategori harus lebih dari 3 karakter\ndan kurang dari 20 karakter");
        } else {
            Kategori kategori = new Kategori(tampilIdKategori.getText(), inputNamaKategori.getText());

            if (new CrudKategori().tambahKategori(kategori) == 0) {
                JOptionPane.showMessageDialog(null, "Kategori berhasil ditambah");
                buatIdKategori();
                tableKategori.setModel(crudKategori.tampilKategori());
            } else {
                JOptionPane.showMessageDialog(null, "Nama kategori sudah ada");
            }
        }
        inputNamaKategori.setText("Masukkan nama kategori");
    }//GEN-LAST:event_buttonLogIn5ActionPerformed

    private void buttonLogIn6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonLogIn6ActionPerformed
        TambahProdukDariTambahPembelian tambahProdukDariTambahPembelian = new TambahProdukDariTambahPembelian();
        tambahProdukDariTambahPembelian.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_buttonLogIn6ActionPerformed

    private void inputNamaKategoriActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inputNamaKategoriActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_inputNamaKategoriActionPerformed

    private void inputNamaKategoriFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_inputNamaKategoriFocusGained
        if (inputNamaKategori.getText().equals("Masukkan nama kategori")) {
            inputNamaKategori.setText("");
        } else {
            inputNamaKategori.setText(inputNamaKategori.getText());
        }
    }//GEN-LAST:event_inputNamaKategoriFocusGained

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TambahKategoriDariTambahProdukPembelian().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buttonLogIn5;
    private javax.swing.JButton buttonLogIn6;
    private javax.swing.JTextField inputNamaKategori;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tableKategori;
    private javax.swing.JLabel tampilIdKategori;
    // End of variables declaration//GEN-END:variables
}
