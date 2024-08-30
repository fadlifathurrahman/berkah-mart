package Desain;

import DAO.CrudPenjualan;
import DAO.CrudProduk;
import KoneksiDataBase.Koneksi;
import Model.Penjualan;
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

public class TambahPenjualan extends javax.swing.JFrame {

    Koneksi konekDB;
    Connection koneksi;
    ResultSet r;

    CrudPenjualan crudPenjualan = new CrudPenjualan();
    CrudProduk crudProduk = new CrudProduk();
    Penjualan penjualan = new Penjualan();

    Model.Produk produk = new Model.Produk();

    public TambahPenjualan() {
        initComponents();

        konekDB = new Koneksi();
        koneksi = konekDB.buatKoneksi();

        buatIdPenjualan();
        tampilTablePenjualan();

        DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
        DateFormat timeFormat = new SimpleDateFormat("HH:mm:ss");
        Date date = new Date();

        tampilTanggalPenjualan.setText(dateFormat.format(date));
        tampilWaktuPenjualan.setText(timeFormat.format(date));

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
                int totalHarga = (int) spinnerJumlahPenjualan.getValue() * Integer.parseInt(tampilHargaProduk.getText());
                String tampilTotalHarga = String.valueOf(totalHarga);
                tampilTotalHargaPenjualan.setText(tampilTotalHarga);
            }
        };
        spinnerJumlahPenjualan.addChangeListener(listener);
    }

    public void buatIdPenjualan() {
        Penjualan penjualan = new Penjualan();

        int randomNumber1 = (int) (Math.random() * 9);
        int randomNumber2 = (int) (Math.random() * 9);
        int randomNumber3 = (int) (Math.random() * 9);
        tampilIdPenjualan.setText("PJ" + randomNumber1 + randomNumber2 + randomNumber3);

        if (new CrudPenjualan().cekTampilIdPenjualan(penjualan) == 0) {
            tampilIdPenjualan.setText(tampilIdPenjualan.getText());
        } else {
            randomNumber1 = (int) (Math.random() * 9);
            randomNumber2 = (int) (Math.random() * 9);
            randomNumber3 = (int) (Math.random() * 9);
            tampilIdPenjualan.setText("PJ" + randomNumber1 + randomNumber2 + randomNumber3);
        }
    }

    public void tampilTablePenjualan() {
        tablePenjualan.setModel(crudPenjualan.tampilTablePenjualan());
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel10 = new javax.swing.JLabel();
        jComboBox4 = new javax.swing.JComboBox<>();
        buttonCariKategori3 = new javax.swing.JButton();
        buttonLogIn4 = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenu2 = new javax.swing.JMenu();
        jScrollPane1 = new javax.swing.JScrollPane();
        buttonGroup1 = new javax.swing.ButtonGroup();
        jScrollPane2 = new javax.swing.JScrollPane();
        jList1 = new javax.swing.JList<>();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        buttonCariProduk = new javax.swing.JButton();
        jLabel11 = new javax.swing.JLabel();
        tampilBerat = new javax.swing.JLabel();
        tampilSatuanBerat = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        spinnerJumlahPenjualan = new javax.swing.JSpinner();
        tampilTanggalProduksi = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        tampilTanggalPenjualan = new javax.swing.JLabel();
        tampilTanggalKadaluwarsa = new javax.swing.JLabel();
        buttonLogIn5 = new javax.swing.JButton();
        buttonLogIn6 = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        tablePenjualan = new javax.swing.JTable();
        jLabel22 = new javax.swing.JLabel();
        tampilIdKategori = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        tampilIdProduk = new javax.swing.JLabel();
        tampilHargaProduk = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        jLabel28 = new javax.swing.JLabel();
        tampilWaktuPenjualan = new javax.swing.JLabel();
        jLabel30 = new javax.swing.JLabel();
        tampilNamaKategori = new javax.swing.JLabel();
        tampilIdPenjualan = new javax.swing.JLabel();
        jLabel33 = new javax.swing.JLabel();
        tampilTotalHargaPenjualan = new javax.swing.JLabel();
        comboNamaProduk = new javax.swing.JComboBox<>();

        jLabel10.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("Produsen");

        jComboBox4.setBackground(new java.awt.Color(238, 238, 238));
        jComboBox4.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jComboBox4.setForeground(new java.awt.Color(91, 187, 147));
        jComboBox4.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        buttonCariKategori3.setBackground(new java.awt.Color(238, 238, 238));
        buttonCariKategori3.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        buttonCariKategori3.setForeground(new java.awt.Color(91, 187, 147));
        buttonCariKategori3.setText("Cari Produsen");
        buttonCariKategori3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonCariKategori3ActionPerformed(evt);
            }
        });

        buttonLogIn4.setBackground(new java.awt.Color(238, 238, 238));
        buttonLogIn4.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        buttonLogIn4.setForeground(new java.awt.Color(91, 187, 147));
        buttonLogIn4.setText("Tambah Produsen Baru");
        buttonLogIn4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonLogIn4ActionPerformed(evt);
            }
        });

        jMenu1.setText("File");
        jMenuBar1.add(jMenu1);

        jMenu2.setText("Edit");
        jMenuBar1.add(jMenu2);

        jList1.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jScrollPane2.setViewportView(jList1);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(91, 187, 147));

        jPanel2.setBackground(new java.awt.Color(0, 153, 102));
        jPanel2.setForeground(new java.awt.Color(0, 153, 102));

        jLabel3.setFont(new java.awt.Font("Segoe Print", 1, 36)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Tambah Penjualan");

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

        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("(per pcs)");

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

        jLabel11.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("ID kategori");

        tampilBerat.setBackground(new java.awt.Color(238, 238, 238));
        tampilBerat.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        tampilBerat.setForeground(new java.awt.Color(255, 255, 255));
        tampilBerat.setText("xx");

        tampilSatuanBerat.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        tampilSatuanBerat.setForeground(new java.awt.Color(255, 255, 255));
        tampilSatuanBerat.setText("satuan");

        jLabel14.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(255, 255, 255));
        jLabel14.setText("Berat produk");

        jLabel15.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(255, 255, 255));
        jLabel15.setText("Jumlah jual");

        spinnerJumlahPenjualan.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        spinnerJumlahPenjualan.setPreferredSize(new java.awt.Dimension(108, 32));

        tampilTanggalProduksi.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        tampilTanggalProduksi.setForeground(new java.awt.Color(255, 255, 255));
        tampilTanggalProduksi.setText("tgl produksi");

        jLabel17.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(255, 255, 255));
        jLabel17.setText("Tanggal penjualan");

        jLabel18.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(255, 255, 255));
        jLabel18.setText("Tanggal kadaluwarsa");

        jLabel19.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(255, 255, 255));
        jLabel19.setText("Tanggal produksi");

        tampilTanggalPenjualan.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        tampilTanggalPenjualan.setForeground(new java.awt.Color(255, 255, 255));
        tampilTanggalPenjualan.setText("tgl penjualan");

        tampilTanggalKadaluwarsa.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        tampilTanggalKadaluwarsa.setForeground(new java.awt.Color(255, 255, 255));
        tampilTanggalKadaluwarsa.setText("tgl kadaluwarsa");

        buttonLogIn5.setBackground(new java.awt.Color(0, 153, 102));
        buttonLogIn5.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        buttonLogIn5.setForeground(new java.awt.Color(255, 255, 255));
        buttonLogIn5.setText("Simpan Data Penjualan");
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

        tablePenjualan.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        tablePenjualan.setForeground(new java.awt.Color(0, 153, 102));
        tablePenjualan.setModel(new javax.swing.table.DefaultTableModel(
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
        tablePenjualan.setEnabled(false);
        jScrollPane3.setViewportView(tablePenjualan);

        jLabel22.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel22.setForeground(new java.awt.Color(255, 255, 255));
        jLabel22.setText("Nama produk");

        tampilIdKategori.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        tampilIdKategori.setForeground(new java.awt.Color(255, 255, 255));
        tampilIdKategori.setText("IdKategori");

        jLabel24.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel24.setForeground(new java.awt.Color(255, 255, 255));
        jLabel24.setText("ID produk");

        tampilIdProduk.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        tampilIdProduk.setForeground(new java.awt.Color(255, 255, 255));
        tampilIdProduk.setText("IdProduk");

        tampilHargaProduk.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        tampilHargaProduk.setForeground(new java.awt.Color(255, 255, 255));
        tampilHargaProduk.setText("0");

        jLabel27.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel27.setForeground(new java.awt.Color(255, 255, 255));
        jLabel27.setText("Harga produk");

        jLabel28.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel28.setForeground(new java.awt.Color(255, 255, 255));
        jLabel28.setText("Total penjualan");

        tampilWaktuPenjualan.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        tampilWaktuPenjualan.setForeground(new java.awt.Color(255, 255, 255));
        tampilWaktuPenjualan.setText("totalPenjualan");

        jLabel30.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel30.setForeground(new java.awt.Color(255, 255, 255));
        jLabel30.setText("Nama kategori");

        tampilNamaKategori.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        tampilNamaKategori.setForeground(new java.awt.Color(255, 255, 255));
        tampilNamaKategori.setText("namaKategori");

        tampilIdPenjualan.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        tampilIdPenjualan.setForeground(new java.awt.Color(255, 255, 255));
        tampilIdPenjualan.setText("IdPenjualan");

        jLabel33.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel33.setForeground(new java.awt.Color(255, 255, 255));
        jLabel33.setText("ID penjualan");

        tampilTotalHargaPenjualan.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        tampilTotalHargaPenjualan.setForeground(new java.awt.Color(255, 255, 255));
        tampilTotalHargaPenjualan.setText("totalPenjualan");

        comboNamaProduk.setBackground(new java.awt.Color(238, 238, 238));
        comboNamaProduk.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        comboNamaProduk.setForeground(new java.awt.Color(0, 153, 102));
        comboNamaProduk.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboNamaProdukActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(spinnerJumlahPenjualan, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(196, 196, 196))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel15)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel14)
                                .addGap(22, 22, 22)
                                .addComponent(tampilBerat)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(tampilSatuanBerat))
                            .addComponent(jLabel8)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel22)
                                .addGap(20, 20, 20)
                                .addComponent(comboNamaProduk, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(buttonCariProduk, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel24)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel11)
                                .addGap(47, 47, 47)
                                .addComponent(tampilIdKategori))
                            .addComponent(jLabel33)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 1, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel30))
                                    .addComponent(jLabel27))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(tampilHargaProduk)
                                    .addComponent(tampilNamaKategori)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(141, 141, 141)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(tampilIdProduk)
                                    .addComponent(tampilIdPenjualan)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel19)
                                    .addComponent(jLabel18)
                                    .addComponent(jLabel17)
                                    .addComponent(jLabel28))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(tampilTotalHargaPenjualan)
                                    .addComponent(tampilTanggalKadaluwarsa)
                                    .addComponent(tampilTanggalProduksi)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(tampilTanggalPenjualan)
                                        .addGap(20, 20, 20)
                                        .addComponent(tampilWaktuPenjualan)))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(buttonLogIn5, javax.swing.GroupLayout.PREFERRED_SIZE, 254, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(110, 110, 110)
                        .addComponent(buttonLogIn6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane3))
                .addGap(16, 16, 16))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(tampilIdPenjualan)
                            .addComponent(jLabel33))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(buttonCariProduk, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel22)
                            .addComponent(comboNamaProduk, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(tampilIdProduk)
                            .addComponent(jLabel24))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(tampilIdKategori)
                            .addComponent(jLabel11))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(tampilNamaKategori)
                            .addComponent(jLabel30))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(tampilHargaProduk)
                            .addComponent(jLabel27))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel15)
                            .addComponent(spinnerJumlahPenjualan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel14)
                            .addComponent(tampilBerat)
                            .addComponent(tampilSatuanBerat))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel8)
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
                            .addComponent(tampilTanggalPenjualan)
                            .addComponent(tampilWaktuPenjualan)))
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 401, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(buttonLogIn6, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(buttonLogIn5, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel28)
                        .addComponent(tampilTotalHargaPenjualan)))
                .addContainerGap(30, Short.MAX_VALUE))
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

    private void buttonCariProdukActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonCariProdukActionPerformed
        if (comboNamaProduk.getItemCount() == 0) {
            Statement stm;
            try {
                stm = (Statement) koneksi.createStatement();
                r = stm.executeQuery("Select * from produk where id_produk != '00000'");
                while (r.next()) {
                    comboNamaProduk.addItem(r.getString("nama_produk"));
                }
                spinnerJumlahPenjualan.setValue(1);
            } catch (SQLException ex) {
                Logger.getLogger(TambahPenjualan.class.getName()).log(Level.SEVERE, null, ex);
            }

            if (comboNamaProduk.getItemCount() == 0) {
                JOptionPane.showMessageDialog(null, "Produk masih kosong");
            } else {

            }
        }
    }//GEN-LAST:event_buttonCariProdukActionPerformed

    private void buttonCariKategori3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonCariKategori3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_buttonCariKategori3ActionPerformed

    private void buttonLogIn4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonLogIn4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_buttonLogIn4ActionPerformed

    private void buttonLogIn5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonLogIn5ActionPerformed
        if (comboNamaProduk.getItemCount() == 0) {
            JOptionPane.showMessageDialog(null, "Produk invalid !");
        } else if ((int) spinnerJumlahPenjualan.getValue() <= 0) {
            JOptionPane.showMessageDialog(null, "Jumlah produk invalid !");
        } else {
            penjualan.setIdPenjualan(tampilIdPenjualan.getText());
            penjualan.setIdProduk(tampilIdProduk.getText());
            penjualan.setNamaProduk((String) comboNamaProduk.getSelectedItem());
            penjualan.setIdKategori(tampilIdKategori.getText());
            penjualan.setKategoriProduk(tampilIdKategori.getText());
            penjualan.setHarga(Integer.parseInt(tampilHargaProduk.getText()));
            penjualan.setUkuranPerPcs(Integer.parseInt(tampilBerat.getText()));
            penjualan.setSatuanPerPcs(tampilSatuanBerat.getText());
            penjualan.setTanggalProduksi(tampilTanggalProduksi.getText());
            penjualan.setTanggalKadaluwarsa(tampilTanggalProduksi.getText());
            penjualan.setTanggalPenjualan(tampilTanggalPenjualan.getText());
            penjualan.setWaktuPenjualan(tampilWaktuPenjualan.getText());
            penjualan.setBanyakPenjualan((int) spinnerJumlahPenjualan.getValue());
            penjualan.setTotal(Integer.parseInt(tampilTotalHargaPenjualan.getText()));

            crudPenjualan.tambahPenjualan(penjualan);
            JOptionPane.showMessageDialog(null, "Data penjualan berhasil ditambah");
            tablePenjualan.setModel(crudPenjualan.tampilTablePenjualan());

            TambahPenjualan tambahPenjualan = new TambahPenjualan();
            tambahPenjualan.setVisible(true);
            this.dispose();
        }
    }//GEN-LAST:event_buttonLogIn5ActionPerformed

    private void buttonLogIn6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonLogIn6ActionPerformed
        LandingPenjualan penjualan = new LandingPenjualan();
        penjualan.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_buttonLogIn6ActionPerformed

    private void comboNamaProdukActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboNamaProdukActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_comboNamaProdukActionPerformed

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TambahPenjualan().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buttonCariKategori3;
    private javax.swing.JButton buttonCariProduk;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton buttonLogIn4;
    private javax.swing.JButton buttonLogIn5;
    private javax.swing.JButton buttonLogIn6;
    private javax.swing.JComboBox<String> comboNamaProduk;
    private javax.swing.JComboBox<String> jComboBox4;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JList<String> jList1;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JSpinner spinnerJumlahPenjualan;
    private javax.swing.JTable tablePenjualan;
    private javax.swing.JLabel tampilBerat;
    private javax.swing.JLabel tampilHargaProduk;
    private javax.swing.JLabel tampilIdKategori;
    private javax.swing.JLabel tampilIdPenjualan;
    private javax.swing.JLabel tampilIdProduk;
    private javax.swing.JLabel tampilNamaKategori;
    private javax.swing.JLabel tampilSatuanBerat;
    private javax.swing.JLabel tampilTanggalKadaluwarsa;
    private javax.swing.JLabel tampilTanggalPenjualan;
    private javax.swing.JLabel tampilTanggalProduksi;
    private javax.swing.JLabel tampilTotalHargaPenjualan;
    private javax.swing.JLabel tampilWaktuPenjualan;
    // End of variables declaration//GEN-END:variables
}
