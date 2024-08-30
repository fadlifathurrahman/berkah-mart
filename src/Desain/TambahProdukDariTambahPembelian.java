package Desain;

import KoneksiDataBase.Koneksi;
import DAO.*;
import Model.Kategori;
import Model.Produk;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class TambahProdukDariTambahPembelian extends javax.swing.JFrame {

    Koneksi konekDB;
    Connection koneksi;
    ResultSet r;

    CrudProduk crudProduk = new CrudProduk();
    CrudKategori crudKategori = new CrudKategori();

    Produk produk = new Produk();
    Kategori kategori = new Kategori();

    public TambahProdukDariTambahPembelian() {
        initComponents();

        tampilIdKategori.setVisible(false);

        // settingan awal tanggal produksi
        spinnerTahunProduksi.setValue(2022);
        spinnerBulanProduksi.setValue(1);
        spinnerHariProduksi.setValue(1);

        // settingan awal tanggal kadaluwarsa
        spinnerTahunKadaluwarsa.setValue(2022);
        spinnerBulanKadaluwarsa.setValue(1);
        spinnerHariKadaluwarsa.setValue(1);

        konekDB = new Koneksi();
        koneksi = konekDB.buatKoneksi();

        tampilTableProduk();
        buatIdProduk();

        comboNamaKategori.addItemListener(new ItemListener() {
            @Override
            public void itemStateChanged(ItemEvent arg0) {
                LihatKategori lihatKategori = new LihatKategori();
                for (int i = 1; i < lihatKategori.tampilTableKategori().getRowCount(); i++) {
                    kategori.setKategoriProduk((String) comboNamaKategori.getSelectedItem());
                    tampilIdKategori.setText(crudKategori.cekTampilIdKategori(kategori));
                }
            }
        });
    }

    public void tampilTableProduk() {
        tableProduk.setModel(crudProduk.tampilProduk());
    }

    public void buatIdProduk() {
        Produk produk = new Produk();

        int randomNumber1 = (int) (Math.random() * 9);
        int randomNumber2 = (int) (Math.random() * 9);
        int randomNumber3 = (int) (Math.random() * 9);
        tampilIdProduk.setText("PD" + randomNumber1 + randomNumber2 + randomNumber3);

        if (new CrudProduk().cekTampilIdProduk(produk) == 0) {
            tampilIdProduk.setText(tampilIdProduk.getText());
        } else {
            randomNumber1 = (int) (Math.random() * 9);
            randomNumber2 = (int) (Math.random() * 9);
            randomNumber3 = (int) (Math.random() * 9);
            tampilIdProduk.setText("PD" + randomNumber1 + randomNumber2 + randomNumber3);
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        comboNamaKategori = new javax.swing.JComboBox<>();
        buttonCariKategori = new javax.swing.JButton();
        buttonLogIn1 = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        inputNamaProduk = new javax.swing.JTextField();
        jLabel22 = new javax.swing.JLabel();
        tampilIdProduk = new javax.swing.JLabel();
        spinnerTahunProduksi = new javax.swing.JSpinner();
        spinnerBeratProduk = new javax.swing.JSpinner();
        jLabel20 = new javax.swing.JLabel();
        spinnerBulanProduksi = new javax.swing.JSpinner();
        jLabel21 = new javax.swing.JLabel();
        spinnerHariProduksi = new javax.swing.JSpinner();
        jLabel24 = new javax.swing.JLabel();
        spinnerTahunKadaluwarsa = new javax.swing.JSpinner();
        jLabel25 = new javax.swing.JLabel();
        spinnerBulanKadaluwarsa = new javax.swing.JSpinner();
        jLabel26 = new javax.swing.JLabel();
        spinnerHariKadaluwarsa = new javax.swing.JSpinner();
        jLabel27 = new javax.swing.JLabel();
        buttonTambahProduk = new javax.swing.JButton();
        buttonKembaliKeTambahPembelian = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        tableProduk = new javax.swing.JTable();
        jLabel16 = new javax.swing.JLabel();
        spinnerHargaProduk = new javax.swing.JSpinner();
        jLabel9 = new javax.swing.JLabel();
        comboSatuanBerat = new javax.swing.JComboBox<>();
        tampilIdKategori = new javax.swing.JLabel();
        jLabel29 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(91, 187, 147));

        jPanel3.setBackground(new java.awt.Color(0, 153, 102));
        jPanel3.setForeground(new java.awt.Color(0, 153, 102));

        jLabel4.setFont(new java.awt.Font("Segoe Print", 1, 36)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Tambah Produk");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel3Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jLabel4)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 65, Short.MAX_VALUE)
            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel3Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jLabel4)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        jLabel11.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("Nama produk");

        jLabel13.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setText("Satuan berat");

        jLabel14.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(255, 255, 255));
        jLabel14.setText("Berat produk");

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Kategori produk");

        comboNamaKategori.setBackground(new java.awt.Color(238, 238, 238));
        comboNamaKategori.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        comboNamaKategori.setForeground(new java.awt.Color(0, 153, 102));
        comboNamaKategori.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                comboNamaKategoriItemStateChanged(evt);
            }
        });
        comboNamaKategori.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                comboNamaKategoriMouseClicked(evt);
            }
        });
        comboNamaKategori.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboNamaKategoriActionPerformed(evt);
            }
        });
        comboNamaKategori.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                comboNamaKategoriPropertyChange(evt);
            }
        });
        comboNamaKategori.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                comboNamaKategoriKeyReleased(evt);
            }
        });

        buttonCariKategori.setBackground(new java.awt.Color(0, 153, 102));
        buttonCariKategori.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        buttonCariKategori.setForeground(new java.awt.Color(255, 255, 255));
        buttonCariKategori.setText("Cari Kategori");
        buttonCariKategori.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(255, 255, 255)));
        buttonCariKategori.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonCariKategoriActionPerformed(evt);
            }
        });

        buttonLogIn1.setBackground(new java.awt.Color(0, 153, 102));
        buttonLogIn1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        buttonLogIn1.setForeground(new java.awt.Color(255, 255, 255));
        buttonLogIn1.setText("Tambah Kategori Baru");
        buttonLogIn1.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(255, 255, 255)));
        buttonLogIn1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonLogIn1ActionPerformed(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("(per pcs)");

        jLabel18.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(255, 255, 255));
        jLabel18.setText("Tanggal kadaluwarsa");

        jLabel19.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(255, 255, 255));
        jLabel19.setText("Tanggal produksi");

        inputNamaProduk.setBackground(new java.awt.Color(238, 238, 238));
        inputNamaProduk.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        inputNamaProduk.setForeground(new java.awt.Color(0, 153, 102));
        inputNamaProduk.setText("Masukkan nama produk");
        inputNamaProduk.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                inputNamaProdukFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                inputNamaProdukFocusLost(evt);
            }
        });
        inputNamaProduk.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inputNamaProdukActionPerformed(evt);
            }
        });

        jLabel22.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel22.setForeground(new java.awt.Color(255, 255, 255));
        jLabel22.setText("ID produk");

        tampilIdProduk.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        tampilIdProduk.setForeground(new java.awt.Color(255, 255, 255));
        tampilIdProduk.setText("IdProduk");

        spinnerTahunProduksi.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        spinnerTahunProduksi.setPreferredSize(new java.awt.Dimension(108, 32));

        spinnerBeratProduk.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        spinnerBeratProduk.setPreferredSize(new java.awt.Dimension(108, 32));

        jLabel20.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel20.setForeground(new java.awt.Color(255, 255, 255));
        jLabel20.setText("(Tahun)");

        spinnerBulanProduksi.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        spinnerBulanProduksi.setPreferredSize(new java.awt.Dimension(108, 32));

        jLabel21.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel21.setForeground(new java.awt.Color(255, 255, 255));
        jLabel21.setText("(Bulan)");

        spinnerHariProduksi.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        spinnerHariProduksi.setPreferredSize(new java.awt.Dimension(108, 32));

        jLabel24.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel24.setForeground(new java.awt.Color(255, 255, 255));
        jLabel24.setText("(Hari)");

        spinnerTahunKadaluwarsa.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        spinnerTahunKadaluwarsa.setPreferredSize(new java.awt.Dimension(108, 32));

        jLabel25.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel25.setForeground(new java.awt.Color(255, 255, 255));
        jLabel25.setText("(Tahun)");

        spinnerBulanKadaluwarsa.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        spinnerBulanKadaluwarsa.setPreferredSize(new java.awt.Dimension(108, 32));

        jLabel26.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel26.setForeground(new java.awt.Color(255, 255, 255));
        jLabel26.setText("(Bulan)");

        spinnerHariKadaluwarsa.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        spinnerHariKadaluwarsa.setPreferredSize(new java.awt.Dimension(108, 32));

        jLabel27.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel27.setForeground(new java.awt.Color(255, 255, 255));
        jLabel27.setText("(Hari)");

        buttonTambahProduk.setBackground(new java.awt.Color(0, 153, 102));
        buttonTambahProduk.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        buttonTambahProduk.setForeground(new java.awt.Color(255, 255, 255));
        buttonTambahProduk.setText("Simpan Data Produk");
        buttonTambahProduk.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(255, 255, 255)));
        buttonTambahProduk.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonTambahProdukActionPerformed(evt);
            }
        });

        buttonKembaliKeTambahPembelian.setBackground(new java.awt.Color(0, 153, 102));
        buttonKembaliKeTambahPembelian.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        buttonKembaliKeTambahPembelian.setForeground(new java.awt.Color(255, 255, 255));
        buttonKembaliKeTambahPembelian.setText("Kembali");
        buttonKembaliKeTambahPembelian.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(255, 255, 255)));
        buttonKembaliKeTambahPembelian.setPreferredSize(new java.awt.Dimension(245, 35));
        buttonKembaliKeTambahPembelian.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonKembaliKeTambahPembelianActionPerformed(evt);
            }
        });

        tableProduk.setBackground(new java.awt.Color(0, 153, 102));
        tableProduk.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        tableProduk.setForeground(new java.awt.Color(255, 255, 255));
        tableProduk.setModel(new javax.swing.table.DefaultTableModel(
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
        tableProduk.setEnabled(false);
        jScrollPane3.setViewportView(tableProduk);

        jLabel16.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(255, 255, 255));
        jLabel16.setText("Harga produk");

        spinnerHargaProduk.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        spinnerHargaProduk.setPreferredSize(new java.awt.Dimension(108, 32));
        spinnerHargaProduk.setRequestFocusEnabled(false);

        jLabel9.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("(rupiah per pcs)");

        comboSatuanBerat.setBackground(new java.awt.Color(238, 238, 238));
        comboSatuanBerat.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        comboSatuanBerat.setForeground(new java.awt.Color(0, 153, 102));
        comboSatuanBerat.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "kg", "gram", "mg", "liter", "ml", "pcs" }));

        tampilIdKategori.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        tampilIdKategori.setForeground(new java.awt.Color(255, 255, 255));
        tampilIdKategori.setText("IdKategori");

        jLabel29.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel29.setForeground(new java.awt.Color(255, 255, 255));
        jLabel29.setText("ID kategori");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel16)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel22)
                            .addComponent(jLabel11)
                            .addComponent(jLabel13)
                            .addComponent(jLabel7)
                            .addComponent(jLabel14)
                            .addComponent(jLabel29))
                        .addGap(70, 70, 70)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(tampilIdKategori)
                            .addComponent(tampilIdProduk)
                            .addComponent(spinnerHargaProduk, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(1, 1, 1)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(comboNamaKategori, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(buttonCariKategori, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(inputNamaProduk, javax.swing.GroupLayout.PREFERRED_SIZE, 339, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                            .addComponent(spinnerBeratProduk, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(jLabel9)
                                                .addComponent(jLabel8))))
                                    .addComponent(buttonLogIn1, javax.swing.GroupLayout.PREFERRED_SIZE, 339, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(comboSatuanBerat, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel19)
                            .addComponent(jLabel18))
                        .addGap(30, 30, 30)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel20)
                            .addComponent(spinnerTahunProduksi, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(spinnerTahunKadaluwarsa, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel25))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel26)
                                    .addComponent(spinnerBulanKadaluwarsa, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(32, 32, 32))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel21)
                                    .addComponent(spinnerBulanProduksi, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(41, 41, 41)))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel24)
                            .addComponent(spinnerHariProduksi, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel27)
                            .addComponent(spinnerHariKadaluwarsa, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(0, 10, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(buttonTambahProduk, javax.swing.GroupLayout.PREFERRED_SIZE, 262, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(buttonKembaliKeTambahPembelian, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 643, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 466, Short.MAX_VALUE)
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(buttonKembaliKeTambahPembelian, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(buttonTambahProduk, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(19, 19, 19))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel7)
                            .addComponent(buttonCariKategori, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(comboNamaKategori, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(buttonLogIn1, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel29)
                            .addComponent(tampilIdKategori))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel22)
                            .addComponent(tampilIdProduk))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(inputNamaProduk, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel11))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel14)
                            .addComponent(spinnerBeratProduk, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel8))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel13)
                            .addComponent(comboSatuanBerat, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel16)
                            .addComponent(spinnerHargaProduk, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel9))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(spinnerHariProduksi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jLabel24))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(spinnerBulanProduksi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jLabel21)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(spinnerBulanKadaluwarsa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jLabel26))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(spinnerHariKadaluwarsa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jLabel27))))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel19)
                                .addGap(44, 44, 44)
                                .addComponent(jLabel18))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(spinnerTahunProduksi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel20)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(spinnerTahunKadaluwarsa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel25)))
                        .addGap(90, 90, 90))))
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

    private void buttonCariKategoriActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonCariKategoriActionPerformed
        if (comboNamaKategori.getItemCount() == 0) {
            Statement stm;
            try {
                stm = (Statement) koneksi.createStatement();
                r = stm.executeQuery("Select * from kategori where id_kategori != '00000'");
                while (r.next()) {
                    comboNamaKategori.addItem(r.getString("kategori_produk"));
                }

                kategori.setKategoriProduk((String) comboNamaKategori.getSelectedItem());
                tampilIdKategori.setText(crudKategori.cekTampilIdKategori(kategori));

                tampilIdKategori.setVisible(true);
            } catch (SQLException ex) {
                Logger.getLogger(TambahProdukDariTambahPembelian.class.getName()).log(Level.SEVERE, null, ex);
            }

            if (comboNamaKategori.getItemCount() == 0) {
                JOptionPane.showMessageDialog(null, "Kategori masih kosong");
            } else {
                buttonCariKategori.setVisible(false);
            }
        }
    }//GEN-LAST:event_buttonCariKategoriActionPerformed

    private void buttonLogIn1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonLogIn1ActionPerformed
        TambahKategoriDariTambahProdukPembelian tambahKategoriDariTambahProdukPembelian = new TambahKategoriDariTambahProdukPembelian();
        tambahKategoriDariTambahProdukPembelian.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_buttonLogIn1ActionPerformed

    private void inputNamaProdukActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inputNamaProdukActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_inputNamaProdukActionPerformed

    private void buttonTambahProdukActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonTambahProdukActionPerformed

        if (comboNamaKategori.getItemCount() == 0) {
            JOptionPane.showMessageDialog(null, "Kategori produk invalid !");
        } else if (inputNamaProduk.getText().equals("Masukkan nama produk")) {
            JOptionPane.showMessageDialog(null, "Nama produk invalid !");
        } else if ((int) spinnerBeratProduk.getValue() <= 0) {
            JOptionPane.showMessageDialog(null, "Berat produk invalid !");
        } else if ((int) spinnerHargaProduk.getValue() <= 0) {
            JOptionPane.showMessageDialog(null, "Harga produk invalid !");
        } else if ((int) spinnerTahunProduksi.getValue() <= 2010 || (int) spinnerTahunProduksi.getValue() > 2022) {
            JOptionPane.showMessageDialog(null, "Tahun produksi invalid !");
        } else if ((int) spinnerBulanProduksi.getValue() < 1 || (int) spinnerBulanProduksi.getValue() > 12) {
            JOptionPane.showMessageDialog(null, "Bulan produksi invalid !");
        } else if ((int) spinnerHariProduksi.getValue() < 1 || (int) spinnerHariProduksi.getValue() > 30) {
            JOptionPane.showMessageDialog(null, "Hari produksi invalid !");
        } else if ((int) spinnerTahunKadaluwarsa.getValue() < (int) spinnerTahunProduksi.getValue()) {
            JOptionPane.showMessageDialog(null, "Tahun kadaluwarsa invalid !");
        } else if ((int) spinnerTahunKadaluwarsa.getValue() == (int) spinnerTahunProduksi.getValue()) {
            if ((int) spinnerBulanKadaluwarsa.getValue() == (int) spinnerBulanProduksi.getValue()) {
                if ((int) spinnerHariKadaluwarsa.getValue() < (int) spinnerHariProduksi.getValue() || (int) spinnerHariKadaluwarsa.getValue() > 30) {
                    JOptionPane.showMessageDialog(null, "Hari kadaluwarsa invalid !");
                } else if ((int) spinnerHariKadaluwarsa.getValue() == (int) spinnerHariProduksi.getValue()) {
                    JOptionPane.showMessageDialog(null, "Tanggal kadaluwarsa invalid !");
                } else {
                    produk.setIdProduk(tampilIdProduk.getText());
                    produk.setNamaProduk(inputNamaProduk.getText());
                    produk.setIdKategori(tampilIdKategori.getText());
                    produk.setKategoriProduk((String) comboNamaKategori.getSelectedItem());
                    produk.setHarga((int) spinnerHargaProduk.getValue());
                    produk.setUkuranPerPcs((int) spinnerBeratProduk.getValue());
                    produk.setSatuanPerPcs((String) comboSatuanBerat.getSelectedItem());
                    String tahunProduksi = spinnerTahunProduksi.getValue().toString();
                    String bulanProduksi = spinnerBulanProduksi.getValue().toString();
                    String hariProduksi = spinnerHariProduksi.getValue().toString();
                    produk.setTanggalProduksi(tahunProduksi + "-" + bulanProduksi + "-" + hariProduksi);
                    String tahunKadaluwarsa = spinnerTahunKadaluwarsa.getValue().toString();
                    String bulanKadaluwarsa = spinnerBulanKadaluwarsa.getValue().toString();
                    String hariKadaluwarsa = spinnerHariKadaluwarsa.getValue().toString();
                    produk.setTanggalKadaluwarsa(tahunKadaluwarsa + "-" + bulanKadaluwarsa + "-" + hariKadaluwarsa);
                    produk.setSisa_stok(0);

                    if (new CrudProduk().tambahProduk(produk) == 0) {
                        crudProduk.tambahProduk(produk);
                        JOptionPane.showMessageDialog(null, "Produk berhasil ditambah");
                        tableProduk.setModel(crudProduk.tampilProduk());

                        TambahPembelian tambahPembelian = new TambahPembelian();
                        tambahPembelian.setVisible(true);
                        this.dispose();
                    } else {
                        JOptionPane.showMessageDialog(null, "Nama produk dengan berat yang sama sudah ada");
                    }

                }
            } else if ((int) spinnerBulanKadaluwarsa.getValue() < (int) spinnerBulanProduksi.getValue() || (int) spinnerBulanKadaluwarsa.getValue() > 12) {
                JOptionPane.showMessageDialog(null, "Bulan kadaluwarsa invalid !");
            } else {
                produk.setIdProduk(tampilIdProduk.getText());
                produk.setNamaProduk(inputNamaProduk.getText());
                produk.setIdKategori(tampilIdKategori.getText());
                produk.setKategoriProduk((String) comboNamaKategori.getSelectedItem());
                produk.setHarga((int) spinnerHargaProduk.getValue());
                produk.setUkuranPerPcs((int) spinnerBeratProduk.getValue());
                produk.setSatuanPerPcs((String) comboSatuanBerat.getSelectedItem());
                String tahunProduksi = spinnerTahunProduksi.getValue().toString();
                String bulanProduksi = spinnerBulanProduksi.getValue().toString();
                String hariProduksi = spinnerHariProduksi.getValue().toString();
                produk.setTanggalProduksi(tahunProduksi + "-" + bulanProduksi + "-" + hariProduksi);
                String tahunKadaluwarsa = spinnerTahunKadaluwarsa.getValue().toString();
                String bulanKadaluwarsa = spinnerBulanKadaluwarsa.getValue().toString();
                String hariKadaluwarsa = spinnerHariKadaluwarsa.getValue().toString();
                produk.setTanggalKadaluwarsa(tahunKadaluwarsa + "-" + bulanKadaluwarsa + "-" + hariKadaluwarsa);
                produk.setSisa_stok(0);

                if (new CrudProduk().tambahProduk(produk) == 0) {
                    crudProduk.tambahProduk(produk);
                    JOptionPane.showMessageDialog(null, "Produk berhasil ditambah");
                    tableProduk.setModel(crudProduk.tampilProduk());

                    TambahPembelian tambahPembelian = new TambahPembelian();
                    tambahPembelian.setVisible(true);
                    this.dispose();
                } else {
                    JOptionPane.showMessageDialog(null, "Nama produk dengan berat yang sama sudah ada");
                }
            }
        } else if ((int) spinnerBulanKadaluwarsa.getValue() < 1 || (int) spinnerBulanKadaluwarsa.getValue() > 12) {
            JOptionPane.showMessageDialog(null, "Bulan kadaluwarsa invalid !");
        } else if ((int) spinnerHariKadaluwarsa.getValue() < 1 || (int) spinnerHariKadaluwarsa.getValue() > 30) {
            JOptionPane.showMessageDialog(null, "Hari kadaluwarsa invalid !");
        } else {
            produk.setIdProduk(tampilIdProduk.getText());
            produk.setNamaProduk(inputNamaProduk.getText());
            produk.setIdKategori(tampilIdKategori.getText());
            produk.setKategoriProduk((String) comboNamaKategori.getSelectedItem());
            produk.setHarga((int) spinnerHargaProduk.getValue());
            produk.setUkuranPerPcs((int) spinnerBeratProduk.getValue());
            produk.setSatuanPerPcs((String) comboSatuanBerat.getSelectedItem());
            String tahunProduksi = spinnerTahunProduksi.getValue().toString();
            String bulanProduksi = spinnerBulanProduksi.getValue().toString();
            String hariProduksi = spinnerHariProduksi.getValue().toString();
            produk.setTanggalProduksi(tahunProduksi + "-" + bulanProduksi + "-" + hariProduksi);
            String tahunKadaluwarsa = spinnerTahunKadaluwarsa.getValue().toString();
            String bulanKadaluwarsa = spinnerBulanKadaluwarsa.getValue().toString();
            String hariKadaluwarsa = spinnerHariKadaluwarsa.getValue().toString();
            produk.setTanggalKadaluwarsa(tahunKadaluwarsa + "-" + bulanKadaluwarsa + "-" + hariKadaluwarsa);
            produk.setSisa_stok(0);

            if (new CrudProduk().tambahProduk(produk) == 0) {
                crudProduk.tambahProduk(produk);
                JOptionPane.showMessageDialog(null, "Produk berhasil ditambah");
                tableProduk.setModel(crudProduk.tampilProduk());

                TambahPembelian tambahPembelian = new TambahPembelian();
                tambahPembelian.setVisible(true);
                this.dispose();
            } else {
                JOptionPane.showMessageDialog(null, "Nama produk dengan berat yang sama sudah ada");
            }
        }


    }//GEN-LAST:event_buttonTambahProdukActionPerformed

    private void buttonKembaliKeTambahPembelianActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonKembaliKeTambahPembelianActionPerformed
        TambahPembelian tambahPembelian = new TambahPembelian();
        tambahPembelian.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_buttonKembaliKeTambahPembelianActionPerformed

    private void comboNamaKategoriKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_comboNamaKategoriKeyReleased

    }//GEN-LAST:event_comboNamaKategoriKeyReleased

    private void comboNamaKategoriActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboNamaKategoriActionPerformed

    }//GEN-LAST:event_comboNamaKategoriActionPerformed

    private void comboNamaKategoriPropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_comboNamaKategoriPropertyChange


    }//GEN-LAST:event_comboNamaKategoriPropertyChange

    private void comboNamaKategoriItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_comboNamaKategoriItemStateChanged

    }//GEN-LAST:event_comboNamaKategoriItemStateChanged

    private void comboNamaKategoriMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_comboNamaKategoriMouseClicked

    }//GEN-LAST:event_comboNamaKategoriMouseClicked

    private void inputNamaProdukFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_inputNamaProdukFocusGained
        if (inputNamaProduk.getText().equals("Masukkan nama produk")) {
            inputNamaProduk.setText("");
        } else {
            inputNamaProduk.setText(inputNamaProduk.getText());
        }
    }//GEN-LAST:event_inputNamaProdukFocusGained

    private void inputNamaProdukFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_inputNamaProdukFocusLost
        if (inputNamaProduk.getText().equals("")) {
            inputNamaProduk.setText("Masukkan nama produk");
        } else {
            inputNamaProduk.setText(inputNamaProduk.getText());
        }
    }//GEN-LAST:event_inputNamaProdukFocusLost

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TambahProdukDariTambahPembelian().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buttonCariKategori;
    private javax.swing.JButton buttonKembaliKeTambahPembelian;
    private javax.swing.JButton buttonLogIn1;
    private javax.swing.JButton buttonTambahProduk;
    private javax.swing.JComboBox<String> comboNamaKategori;
    private javax.swing.JComboBox<String> comboSatuanBerat;
    private javax.swing.JTextField inputNamaProduk;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JSpinner spinnerBeratProduk;
    private javax.swing.JSpinner spinnerBulanKadaluwarsa;
    private javax.swing.JSpinner spinnerBulanProduksi;
    private javax.swing.JSpinner spinnerHargaProduk;
    private javax.swing.JSpinner spinnerHariKadaluwarsa;
    private javax.swing.JSpinner spinnerHariProduksi;
    private javax.swing.JSpinner spinnerTahunKadaluwarsa;
    private javax.swing.JSpinner spinnerTahunProduksi;
    private javax.swing.JTable tableProduk;
    private javax.swing.JLabel tampilIdKategori;
    private javax.swing.JLabel tampilIdProduk;
    // End of variables declaration//GEN-END:variables
}
