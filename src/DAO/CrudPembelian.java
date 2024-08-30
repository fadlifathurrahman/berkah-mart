package DAO;

import KoneksiDataBase.Koneksi;
import Model.Pembelian;
import java.sql.*;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class CrudPembelian {

    Koneksi konekDB;
    Connection koneksi;
    DefaultTableModel tb;
    ResultSet r;

    public CrudPembelian() {
        konekDB = new Koneksi();
        koneksi = konekDB.buatKoneksi();
    }
    
    public DefaultTableModel tampilTablePembelian() {
        try {
            tb = new DefaultTableModel(new String[]{"ID Pembelian","Produk", "Kategori", "Harga", "Berat", "Satuan", "Distributor", "Tanggal Produksi", "Tanggal Kadaluwarsa", "Tanggal Pembelian", "Waktu", "Banyak", "Total Harga"}, 0);
            Statement stm = (Statement) koneksi.createStatement();
            r = stm.executeQuery("Select * from pembelian");

            while (r.next()) {
                tb.addRow(new Object[]{
                    r.getString("id_pembelian"),
                    r.getString("nama_produk"),
                    r.getString("kategori_produk"),
                    r.getString("harga"),
                    r.getString("berat_per_pcs"),
                    r.getString("satuan_berat_per_pcs"),
                    r.getString("nama_distributor"),
                    r.getString("tanggal_produksi"),
                    r.getString("tanggal_kadaluwarsa"),
                    r.getString("tanggal_pembelian"),
                    r.getString("waktu_pembelian"),
                    r.getString("banyak_pembelian"),
                    r.getString("total_pembelian"),
                });
            }
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, ex);
        }
        return tb;
    }
    
    public int cekTampilIdPembelian(Pembelian pb) {
        int hasil = 0;
        try {
            Statement stm = koneksi.createStatement();
            r = stm.executeQuery("Select * from pembelian where id_pembelian = '" + pb.getIdPembelian() + "'");

            if (r.next()) {
                // jika ada id_pembelian yang sama
                return 1;
            } else {
                // jika id_pembelian belum ada
                return 0;
            }
        } catch (Exception e) {
            System.out.println(e);
        }
        return hasil;
    }

    public int tambahPembelian(Pembelian pb) {
        int hasil = 0;
        try {
            Statement stm = koneksi.createStatement();

            hasil = stm.executeUpdate("insert into pembelian values ('" + pb.getIdPembelian()+ "',"
                    + "'" + pb.getIdProduk()+ "', "
                    + "'" + pb.getNamaProduk() + "', "
                    + "'" + pb.getIdKategori() + "', "
                    + "'" + pb.getKategoriProduk() + "', "
                    + "'" + pb.getHarga() + "', "
                    + "'" + pb.getUkuranPerPcs() + "', "
                    + "'" + pb.getSatuanPerPcs() + "', "
                    + "'" + pb.getIdDistributor()+ "', "
                    + "'" + pb.getNamaDistributor()+ "', "
                    + "'" + pb.getTanggalProduksi() + "', "
                    + "'" + pb.getTanggalKadaluwarsa() + "', "
                    + "'" + pb.getTanggalPembelian()+ "', "
                    + "'" + pb.getWaktuPembelian()+ "', "
                    + "'" + pb.getBanyakPembelian()+ "', "
                    + "'" + pb.getTotalPembelian()+ "')");

        } catch (Exception e) {
            System.out.println(e);
        }
        return hasil;
    }
}
