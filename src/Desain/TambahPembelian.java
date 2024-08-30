package Desain;

import KoneksiDataBase.Koneksi;
import DAO.*;
import Model.Distributor;
import Model.Pembelian;
import Model.Produk;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

public class TambahPembelian extends javax.swing.JFrame {

    Koneksi konekDB;
    Connection koneksi;
    ResultSet r;

    CrudPembelian crudPembelian = new CrudPembelian();
    CrudProduk crudProduk = new CrudProduk();
    CrudDistributor crudDistributor = new CrudDistributor();

    Produk produk = new Produk();
    Distributor distributor = new Distributor();

    Pembelian pembelian = new Pembelian();

    public TambahPembelian() {
        initComponents();

        tampilIdProduk.setVisible(false);
        labelDistributor.setVisible(false);
        tampilIdDistributor.setVisible(false);

        konekDB = new Koneksi();
        koneksi = konekDB.buatKoneksi();

        buatIdPembelian();
        tampilTablePembelian();

        DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
        DateFormat timeFormat = new SimpleDateFormat("HH:mm:ss");
        Date date = new Date();

        tampilTanggalPembelian.setText(dateFormat.format(date));
        tampilWaktuPembelian.setText(timeFormat.format(date));

        comboNamaProduk.addItemListener(new ItemListener() {
            @Override
            public void itemStateChanged(ItemEvent arg0) {
                LihatProduk lihatProduk = new LihatProduk();
                for (int i = 1; i < lihatProduk.tampilTableProduk().getRowCount(); i++) {
                    produk.setNamaProduk((String) comboNamaProduk.getSelectedItem());
                    tampilIdProduk.setText(crudProduk.cekTampilIdProdukCombo(produk));
                    tampilIdKategori.setText(crudProduk.cekTampilIdKategoriProdukCombo(produk));
                    tampilNamaKategori.setText(crudProduk.cekTampilNamaKategoriProdukCombo(produk));
                    tampilHargaProduk.setText(crudProduk.cekTampilHargaProdukCombo(produk));
                    tampilBerat.setText(crudProduk.cekTampilBeratProdukCombo(produk));
                    tampilSatuanBerat.setText(crudProduk.cekTampilSatuanBeratProdukCombo(produk));
                    tampilTanggalProduksi.setText(crudProduk.cekTampilTanggalProduksi(produk));
                    tampilTanggalKadaluwarsa.setText(crudProduk.cekTampilTanggalKadaluwarsa(produk));
                }
            }
        });

        ChangeListener listener = new ChangeListener() {
            public void stateChanged(ChangeEvent e) {
                int totalHarga = (int) spinnerJumlahPembelian.getValue() * Integer.parseInt(tampilHargaProduk.getText());
                String tampilTotalHarga = String.valueOf(totalHarga);
                tampilTotalHargaPembelian.setText(tampilTotalHarga);
            }
        };
        spinnerJumlahPembelian.addChangeListener(listener);

        comboNamaDistributor.addItemListener(new ItemListener() {
            @Override
            public void itemStateChanged(ItemEvent arg0) {
                LihatDistributor lihatDistributor = new LihatDistributor();
                for (int i = 1; i < lihatDistributor.tampilTableDistributor().getRowCount(); i++) {
                    distributor.setNamaDistributor((String) comboNamaDistributor.getSelectedItem());
                    tampilIdDistributor.setText(crudDistributor.cekTampilIdDistributor(distributor));
                }
            }
        });

    }

    public void tampilTablePembelian() {
        tablePembelian.setModel(crudPembelian.tampilTablePembelian());
    }

    public void buatIdPembelian() {
        Pembelian pembelian = new Pembelian();

        int randomNumber1 = (int) (Math.random() * 9);
        int randomNumber2 = (int) (Math.random() * 9);
        int randomNumber3 = (int) (Math.random() * 9);
        tampilIdPembelian.setText("PB" + randomNumber1 + randomNumber2 + randomNumber3);

        if (new CrudPembelian().cekTampilIdPembelian(pembelian) == 0) {
            tampilIdPembelian.setText(tampilIdPembelian.getText());
        } else {
            randomNumber1 = (int) (Math.random() * 9);
            randomNumber2 = (int) (Math.random() * 9);
            randomNumber3 = (int) (Math.random() * 9);
            tampilIdPembelian.setText("PD" + randomNumber1 + randomNumber2 + randomNumber3);
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jList1 = new javax.swing.JList<>();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        tampilTanggalPembelian = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        tampilTanggalKadaluwarsa = new javax.swing.JLabel();
        spinnerJumlahPembelian = new javax.swing.JSpinner();
        jLabel8 = new javax.swing.JLabel();
        comboNamaProduk = new javax.swing.JComboBox<>();
        jLabel11 = new javax.swing.JLabel();
        tampilTanggalProduksi = new javax.swing.JLabel();
        buttonCariProduk = new javax.swing.JButton();
        tampilBerat = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        buttonLogIn2 = new javax.swing.JButton();
        tampilSatuanBerat = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        buttonCariDistributor = new javax.swing.JButton();
        buttonLogIn3 = new javax.swing.JButton();
        comboNamaDistributor = new javax.swing.JComboBox<>();
        jLabel22 = new javax.swing.JLabel();
        buttonLogIn5 = new javax.swing.JButton();
        buttonLogIn6 = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        tablePembelian = new javax.swing.JTable();
        tampilNamaKategori = new javax.swing.JLabel();
        jLabel30 = new javax.swing.JLabel();
        tampilIdKategori = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        tampilIdPembelian = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        tampilIdProduk = new javax.swing.JLabel();
        jLabel31 = new javax.swing.JLabel();
        tampilHargaProduk = new javax.swing.JLabel();
        labelDistributor = new javax.swing.JLabel();
        tampilIdDistributor = new javax.swing.JLabel();
        tampilTotalHargaPembelian = new javax.swing.JLabel();
        jLabel32 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        tampilWaktuPembelian = new javax.swing.JLabel();

        jList1.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jScrollPane1.setViewportView(jList1);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(91, 187, 147));

        jPanel2.setBackground(new java.awt.Color(0, 153, 102));
        jPanel2.setForeground(new java.awt.Color(0, 153, 102));

        jLabel3.setFont(new java.awt.Font("Segoe Print", 1, 36)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Tambah Pembelian");

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
            .addGap(0, 65, Short.MAX_VALUE)
            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel2Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jLabel3)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        tampilTanggalPembelian.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        tampilTanggalPembelian.setForeground(new java.awt.Color(255, 255, 255));
        tampilTanggalPembelian.setText("tgl pembelian");

        jLabel15.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(255, 255, 255));
        jLabel15.setText("Jumlah pembelian");

        tampilTanggalKadaluwarsa.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        tampilTanggalKadaluwarsa.setForeground(new java.awt.Color(255, 255, 255));
        tampilTanggalKadaluwarsa.setText("tgl kadaluwarsa");

        spinnerJumlahPembelian.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        spinnerJumlahPembelian.setPreferredSize(new java.awt.Dimension(108, 32));

        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("(per pcs)");

        comboNamaProduk.setBackground(new java.awt.Color(238, 238, 238));
        comboNamaProduk.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        comboNamaProduk.setForeground(new java.awt.Color(0, 153, 102));

        jLabel11.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("Nama produk");

        tampilTanggalProduksi.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        tampilTanggalProduksi.setForeground(new java.awt.Color(255, 255, 255));
        tampilTanggalProduksi.setText("tgl produksi");

        buttonCariProduk.setBackground(new java.awt.Color(0, 153, 102));
        buttonCariProduk.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        buttonCariProduk.setForeground(new java.awt.Color(255, 255, 255));
        buttonCariProduk.setText("Cari Produk");
        buttonCariProduk.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(255, 255, 255)));
        buttonCariProduk.setPreferredSize(new java.awt.Dimension(145, 32));
        buttonCariProduk.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonCariProdukActionPerformed(evt);
            }
        });

        tampilBerat.setBackground(new java.awt.Color(238, 238, 238));
        tampilBerat.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        tampilBerat.setForeground(new java.awt.Color(255, 255, 255));
        tampilBerat.setText("xx");

        jLabel17.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(255, 255, 255));
        jLabel17.setText("Tanggal pembelian");

        buttonLogIn2.setBackground(new java.awt.Color(0, 153, 102));
        buttonLogIn2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        buttonLogIn2.setForeground(new java.awt.Color(255, 255, 255));
        buttonLogIn2.setText("Tambah Produk Baru");
        buttonLogIn2.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(255, 255, 255)));
        buttonLogIn2.setPreferredSize(new java.awt.Dimension(216, 32));
        buttonLogIn2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonLogIn2ActionPerformed(evt);
            }
        });

        tampilSatuanBerat.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        tampilSatuanBerat.setForeground(new java.awt.Color(255, 255, 255));
        tampilSatuanBerat.setText("satuan");

        jLabel18.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(255, 255, 255));
        jLabel18.setText("Tanggal kadaluwarsa");

        jLabel14.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(255, 255, 255));
        jLabel14.setText("Berat produk");

        jLabel19.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(255, 255, 255));
        jLabel19.setText("Tanggal produksi");

        buttonCariDistributor.setBackground(new java.awt.Color(0, 153, 102));
        buttonCariDistributor.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        buttonCariDistributor.setForeground(new java.awt.Color(255, 255, 255));
        buttonCariDistributor.setText("Cari Distributor");
        buttonCariDistributor.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(255, 255, 255)));
        buttonCariDistributor.setPreferredSize(new java.awt.Dimension(145, 32));
        buttonCariDistributor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonCariDistributorActionPerformed(evt);
            }
        });

        buttonLogIn3.setBackground(new java.awt.Color(0, 153, 102));
        buttonLogIn3.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        buttonLogIn3.setForeground(new java.awt.Color(255, 255, 255));
        buttonLogIn3.setText("Tambah Distributor Baru");
        buttonLogIn3.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(255, 255, 255)));
        buttonLogIn3.setPreferredSize(new java.awt.Dimension(216, 32));
        buttonLogIn3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonLogIn3ActionPerformed(evt);
            }
        });

        comboNamaDistributor.setBackground(new java.awt.Color(238, 238, 238));
        comboNamaDistributor.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        comboNamaDistributor.setForeground(new java.awt.Color(0, 153, 102));

        jLabel22.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel22.setForeground(new java.awt.Color(255, 255, 255));
        jLabel22.setText("Nama distributor");

        buttonLogIn5.setBackground(new java.awt.Color(0, 153, 102));
        buttonLogIn5.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        buttonLogIn5.setForeground(new java.awt.Color(255, 255, 255));
        buttonLogIn5.setText("Simpan Data Pembelian");
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

        tablePembelian.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        tablePembelian.setForeground(new java.awt.Color(0, 153, 102));
        tablePembelian.setModel(new javax.swing.table.DefaultTableModel(
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
        tablePembelian.setEnabled(false);
        jScrollPane3.setViewportView(tablePembelian);

        tampilNamaKategori.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        tampilNamaKategori.setForeground(new java.awt.Color(255, 255, 255));
        tampilNamaKategori.setText("namaKategori");

        jLabel30.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel30.setForeground(new java.awt.Color(255, 255, 255));
        jLabel30.setText("Nama kategori");

        tampilIdKategori.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        tampilIdKategori.setForeground(new java.awt.Color(255, 255, 255));
        tampilIdKategori.setText("IdKategori");

        jLabel24.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel24.setForeground(new java.awt.Color(255, 255, 255));
        jLabel24.setText("ID kategori");

        jLabel25.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel25.setForeground(new java.awt.Color(255, 255, 255));
        jLabel25.setText("ID pembelian");

        tampilIdPembelian.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        tampilIdPembelian.setForeground(new java.awt.Color(255, 255, 255));
        tampilIdPembelian.setText("IdPembelian");

        jLabel26.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel26.setForeground(new java.awt.Color(255, 255, 255));
        jLabel26.setText("ID produk");

        tampilIdProduk.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        tampilIdProduk.setForeground(new java.awt.Color(255, 255, 255));
        tampilIdProduk.setText("IdKategori");

        jLabel31.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel31.setForeground(new java.awt.Color(255, 255, 255));
        jLabel31.setText("Harga produk");

        tampilHargaProduk.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        tampilHargaProduk.setForeground(new java.awt.Color(255, 255, 255));
        tampilHargaProduk.setText("0");

        labelDistributor.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        labelDistributor.setForeground(new java.awt.Color(255, 255, 255));
        labelDistributor.setText("ID distributor");

        tampilIdDistributor.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        tampilIdDistributor.setForeground(new java.awt.Color(255, 255, 255));
        tampilIdDistributor.setText("IdDistributor");

        tampilTotalHargaPembelian.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        tampilTotalHargaPembelian.setForeground(new java.awt.Color(255, 255, 255));
        tampilTotalHargaPembelian.setText("0");

        jLabel32.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel32.setForeground(new java.awt.Color(255, 255, 255));
        jLabel32.setText("Total harga pembelian");

        jLabel9.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("(rupiah per pcs)");

        tampilWaktuPembelian.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        tampilWaktuPembelian.setForeground(new java.awt.Color(255, 255, 255));
        tampilWaktuPembelian.setText("tgl pembelian");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel24)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 1, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel30))
                            .addComponent(jLabel25))
                        .addGap(36, 36, 36)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(3, 3, 3)
                                        .addComponent(tampilIdProduk))
                                    .addComponent(tampilIdKategori)
                                    .addComponent(tampilHargaProduk)
                                    .addComponent(tampilNamaKategori)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(tampilBerat)
                                        .addGap(18, 18, 18)
                                        .addComponent(tampilSatuanBerat)))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel9)
                                    .addComponent(jLabel8)))
                            .addComponent(tampilIdPembelian)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(buttonLogIn2, javax.swing.GroupLayout.PREFERRED_SIZE, 336, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                    .addComponent(comboNamaProduk, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(buttonCariProduk, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 671, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel19)
                            .addComponent(jLabel18)
                            .addComponent(jLabel17))
                        .addGap(324, 324, 324)
                        .addComponent(buttonLogIn5, javax.swing.GroupLayout.PREFERRED_SIZE, 254, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(buttonLogIn6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel22)
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(buttonLogIn3, javax.swing.GroupLayout.PREFERRED_SIZE, 333, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(comboNamaDistributor, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(buttonCariDistributor, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addComponent(jLabel26)
                            .addComponent(jLabel14)
                            .addComponent(jLabel11)
                            .addComponent(jLabel31)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(labelDistributor)
                                    .addComponent(jLabel15))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(2, 2, 2)
                                        .addComponent(tampilIdDistributor))
                                    .addComponent(spinnerJumlahPembelian, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel32)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(tampilTanggalKadaluwarsa)
                                    .addComponent(tampilTanggalProduksi)
                                    .addComponent(tampilTotalHargaPembelian)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(tampilTanggalPembelian)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(tampilWaktuPembelian)))))
                        .addGap(680, 680, 680)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(tampilIdPembelian)
                            .addComponent(jLabel25))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel11)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(comboNamaProduk, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(buttonCariProduk, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(buttonLogIn2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(tampilIdProduk)
                            .addComponent(jLabel26))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(tampilIdKategori)
                            .addComponent(jLabel24))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel30)
                            .addComponent(tampilNamaKategori))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel31)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(tampilHargaProduk)
                                .addComponent(jLabel9)))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel8)
                                    .addComponent(jLabel14))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(tampilBerat)
                                    .addComponent(tampilSatuanBerat))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel22)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(comboNamaDistributor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(buttonCariDistributor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(buttonLogIn3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(labelDistributor)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel15))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(tampilIdDistributor)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(spinnerJumlahPembelian, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(tampilTanggalProduksi)
                            .addComponent(jLabel19))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel18)
                            .addComponent(tampilTanggalKadaluwarsa))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel17)
                            .addComponent(tampilTanggalPembelian)
                            .addComponent(tampilWaktuPembelian))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel32)
                            .addComponent(tampilTotalHargaPembelian, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(15, 15, 15))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jScrollPane3)
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(buttonLogIn5, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(buttonLogIn6, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(19, 19, 19))))
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

    private void buttonCariDistributorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonCariDistributorActionPerformed
        if (comboNamaDistributor.getItemCount() == 0) {
            Statement stm;
            try {
                stm = (Statement) koneksi.createStatement();
                r = stm.executeQuery("Select * from distributor where id_distributor != '00000'");
                while (r.next()) {
                    comboNamaDistributor.addItem(r.getString("nama_distributor"));
                }

                tampilIdDistributor.setVisible(true);
                labelDistributor.setVisible(true);
            } catch (SQLException ex) {
                Logger.getLogger(TambahPembelian.class.getName()).log(Level.SEVERE, null, ex);
            }

            if (comboNamaDistributor.getItemCount() == 0) {
                JOptionPane.showMessageDialog(null, "Distributor masih kosong");
            } else {
                distributor.setNamaDistributor((String) comboNamaDistributor.getSelectedItem());
                tampilIdDistributor.setText(crudDistributor.cekTampilIdDistributor(distributor));
//                buttonCariDistributor.setVisible(false);
            }
        }
    }//GEN-LAST:event_buttonCariDistributorActionPerformed

    private void buttonLogIn3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonLogIn3ActionPerformed
        TambahDistributorDariTambahPembelian tambahDistributorDariTambahPembelian = new TambahDistributorDariTambahPembelian();
        tambahDistributorDariTambahPembelian.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_buttonLogIn3ActionPerformed

    private void buttonLogIn5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonLogIn5ActionPerformed
        if (comboNamaProduk.getItemCount() == 0) {
            JOptionPane.showMessageDialog(null, "Produk invalid !");
        } else if ((int) spinnerJumlahPembelian.getValue() <= 0) {
            JOptionPane.showMessageDialog(null, "Jumlah produk invalid !");
        } else {
            pembelian.setIdPembelian(tampilIdPembelian.getText());
            pembelian.setIdProduk(tampilIdProduk.getText());
            pembelian.setNamaProduk((String) comboNamaProduk.getSelectedItem());
            pembelian.setIdKategori(tampilIdKategori.getText());
            pembelian.setKategoriProduk(tampilIdKategori.getText());
            pembelian.setHarga(Integer.parseInt(tampilHargaProduk.getText()));
            pembelian.setUkuranPerPcs(Integer.parseInt(tampilBerat.getText()));
            pembelian.setSatuanPerPcs(tampilSatuanBerat.getText());
            pembelian.setIdDistributor(tampilIdDistributor.getText());
            pembelian.setNamaDistributor((String) comboNamaDistributor.getSelectedItem());
            pembelian.setTanggalProduksi(tampilTanggalProduksi.getText());
            pembelian.setTanggalKadaluwarsa(tampilTanggalProduksi.getText());
            pembelian.setTanggalPembelian(tampilTanggalPembelian.getText());
            pembelian.setWaktuPembelian(tampilWaktuPembelian.getText());
            pembelian.setBanyakPembelian((int) spinnerJumlahPembelian.getValue());
            produk.setSisa_stok(pembelian.getBanyakPembelian());
            pembelian.setTotalPembelian(Integer.parseInt(tampilTotalHargaPembelian.getText()));

            crudPembelian.tambahPembelian(pembelian);
            JOptionPane.showMessageDialog(null, "Data pembelian berhasil ditambah");
            tablePembelian.setModel(crudPembelian.tampilTablePembelian());

            TambahPembelian tambahPembelian = new TambahPembelian();
            tambahPembelian.setVisible(true);
            this.dispose();
        }
    }//GEN-LAST:event_buttonLogIn5ActionPerformed

    private void buttonLogIn6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonLogIn6ActionPerformed
        LandingPembelian pembelian = new LandingPembelian();
        pembelian.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_buttonLogIn6ActionPerformed

    private void buttonCariProdukActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonCariProdukActionPerformed
        if (comboNamaProduk.getItemCount() == 0) {
            Statement stm;
            try {
                stm = (Statement) koneksi.createStatement();
                r = stm.executeQuery("Select * from produk where id_produk != '00000'");
                while (r.next()) {
                    comboNamaProduk.addItem(r.getString("nama_produk"));
                }

                tampilIdProduk.setVisible(true);
                spinnerJumlahPembelian.setValue(1);
//                    produk.setNamaProduk((String) comboNamaProduk.getSelectedItem());
                produk.setNamaProduk((String) comboNamaProduk.getSelectedItem());
                tampilIdProduk.setText(crudProduk.cekTampilIdProdukCombo(produk));
                tampilIdKategori.setText(crudProduk.cekTampilIdKategoriProdukCombo(produk));
                tampilNamaKategori.setText(crudProduk.cekTampilNamaKategoriProdukCombo(produk));
                tampilHargaProduk.setText(crudProduk.cekTampilHargaProdukCombo(produk));
                tampilBerat.setText(crudProduk.cekTampilBeratProdukCombo(produk));
                tampilSatuanBerat.setText(crudProduk.cekTampilSatuanBeratProdukCombo(produk));
                tampilTanggalProduksi.setText(crudProduk.cekTampilTanggalProduksi(produk));
                tampilTanggalKadaluwarsa.setText(crudProduk.cekTampilTanggalKadaluwarsa(produk));
            } catch (SQLException ex) {
                Logger.getLogger(TambahPembelian.class.getName()).log(Level.SEVERE, null, ex);
            }

            if (comboNamaProduk.getItemCount() == 0) {
                JOptionPane.showMessageDialog(null, "Produk masih kosong");
            } else {
                buttonCariProduk.setVisible(false);
            }
        }
    }//GEN-LAST:event_buttonCariProdukActionPerformed

    private void buttonLogIn2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonLogIn2ActionPerformed
        TambahProdukDariTambahPembelian tambahProdukDariTambahPembelian = new TambahProdukDariTambahPembelian();
        tambahProdukDariTambahPembelian.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_buttonLogIn2ActionPerformed

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TambahPembelian().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buttonCariDistributor;
    private javax.swing.JButton buttonCariProduk;
    private javax.swing.JButton buttonLogIn2;
    private javax.swing.JButton buttonLogIn3;
    private javax.swing.JButton buttonLogIn5;
    private javax.swing.JButton buttonLogIn6;
    private javax.swing.JComboBox<String> comboNamaDistributor;
    private javax.swing.JComboBox<String> comboNamaProduk;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JList<String> jList1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JLabel labelDistributor;
    private javax.swing.JSpinner spinnerJumlahPembelian;
    private javax.swing.JTable tablePembelian;
    private javax.swing.JLabel tampilBerat;
    private javax.swing.JLabel tampilHargaProduk;
    private javax.swing.JLabel tampilIdDistributor;
    private javax.swing.JLabel tampilIdKategori;
    private javax.swing.JLabel tampilIdPembelian;
    private javax.swing.JLabel tampilIdProduk;
    private javax.swing.JLabel tampilNamaKategori;
    private javax.swing.JLabel tampilSatuanBerat;
    private javax.swing.JLabel tampilTanggalKadaluwarsa;
    private javax.swing.JLabel tampilTanggalPembelian;
    private javax.swing.JLabel tampilTanggalProduksi;
    private javax.swing.JLabel tampilTotalHargaPembelian;
    private javax.swing.JLabel tampilWaktuPembelian;
    // End of variables declaration//GEN-END:variables
}
