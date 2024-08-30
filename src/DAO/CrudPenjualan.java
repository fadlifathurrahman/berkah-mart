package DAO;

import KoneksiDataBase.Koneksi;
import Model.Penjualan;
import java.sql.*;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class CrudPenjualan {

    Koneksi konekDB;
    Connection koneksi;
    DefaultTableModel tb;
    ResultSet r;

    public CrudPenjualan() {
        konekDB = new Koneksi();
        koneksi = konekDB.buatKoneksi();
    }

    public DefaultTableModel tampilTablePenjualan() {
        try {
            tb = new DefaultTableModel(new String[]{"ID Penjualan", "Produk", "Kategori", "Harga", "Berat", "Satuan", "Tanggal Produksi", "Tanggal Kadaluwarsa", "Tanggal Penjualan", "Waktu", "Banyak", "Total Harga"}, 0);
            Statement stm = (Statement) koneksi.createStatement();
            r = stm.executeQuery("Select * from penjualan");

            while (r.next()) {
                tb.addRow(new Object[]{
                    r.getString("id_penjualan"),
                    r.getString("nama_produk"),
                    r.getString("kategori_produk"),
                    r.getString("harga"),
                    r.getString("berat_per_pcs"),
                    r.getString("satuan_berat_per_pcs"),
                    r.getString("tanggal_produksi"),
                    r.getString("tanggal_kadaluwarsa"),
                    r.getString("tanggal_penjualan"),
                    r.getString("waktu_penjualan"),
                    r.getString("banyak_penjualan"),
                    r.getString("total_penjualan"),});
            }
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, ex);
        }
        return tb;
    }

    public int cekTampilIdPenjualan(Penjualan pj) {
        int hasil = 0;
        try {
            Statement stm = koneksi.createStatement();
            r = stm.executeQuery("Select * from penjualan where id_penjualan = '" + pj.getIdPenjualan() + "'");

            if (r.next()) {
                // jika ada id_produk yang sama
                return 1;
            } else {
                // jika id_produk belum ada
                return 0;
            }
        } catch (Exception e) {
            System.out.println(e);
        }
        return hasil;
    }

    public int tambahPenjualan(Penjualan pj) {
        int hasil = 0;
        try {
            Statement stm = koneksi.createStatement();

            hasil = stm.executeUpdate("insert into penjualan values ('" + pj.getIdPenjualan()+ "',"
                    + "'" + pj.getIdProduk()+ "', "
                    + "'" + pj.getNamaProduk() + "', "
                    + "'" + pj.getIdKategori() + "', "
                    + "'" + pj.getKategoriProduk() + "', "
                    + "'" + pj.getHarga() + "', "
                    + "'" + pj.getUkuranPerPcs() + "', "
                    + "'" + pj.getSatuanPerPcs() + "', "
                    + "'" + pj.getTanggalProduksi() + "', "
                    + "'" + pj.getTanggalKadaluwarsa() + "', "
                    + "'" + pj.getTanggalPenjualan()+ "', "
                    + "'" + pj.getWaktuPenjualan()+ "', "
                    + "'" + pj.getBanyakPenjualan()+ "', "
                    + "'" + pj.getTotal()+ "')");

        } catch (Exception e) {
            System.out.println(e);
        }
        return hasil;
    }
}
