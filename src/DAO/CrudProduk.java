package DAO;

import KoneksiDataBase.Koneksi;
import Model.Produk;
import java.sql.*;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class CrudProduk {

    Koneksi konekDB;
    Connection koneksi;
    DefaultTableModel tb;
    ResultSet r;

    public CrudProduk() {
        konekDB = new Koneksi();
        koneksi = konekDB.buatKoneksi();
    }

    public DefaultTableModel tampilProduk() {
        try {
            tb = new DefaultTableModel(new String[]{"Nama Produk", "Nama Kategori", "Harga", "Berat", "Satuan", "Tanggal Produksi", "Tanggal Kadaluwarsa", "Sisa Stok"}, 0);
            Statement stm = (Statement) koneksi.createStatement();
            r = stm.executeQuery("Select * from produk where id_produk != '00000'");

            while (r.next()) {
                tb.addRow(new Object[]{
                    r.getString("nama_produk"),
                    r.getString("kategori_produk"),
                    r.getString("harga"),
                    r.getString("berat_per_pcs"),
                    r.getString("satuan_berat_per_pcs"),
                    r.getString("tanggal_produksi"),
                    r.getString("tanggal_kadaluwarsa"),
                    r.getString("sisa_stok"),});
            }
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, ex + "\ntable produk");
        }
        return tb;
    }

    public int tambahProduk(Produk pro) {
        int hasil = 0;
        try {
            Statement stm = koneksi.createStatement();
            r = stm.executeQuery("Select * from produk where nama_produk = '" + pro.getNamaProduk() + "' AND berat_per_pcs = '" + pro.getUkuranPerPcs() + "'");

            if (r.next()) {
                return 1;
            } else {
                hasil = stm.executeUpdate("insert into produk values ('" + pro.getIdProduk() + "',"
                        + "'" + pro.getNamaProduk() + "', "
                        + "'" + pro.getIdKategori() + "', "
                        + "'" + pro.getKategoriProduk() + "', "
                        + "'" + pro.getHarga() + "', "
                        + "'" + pro.getUkuranPerPcs() + "', "
                        + "'" + pro.getSatuanPerPcs() + "', "
                        + "'" + pro.getTanggalProduksi() + "', "
                        + "'" + pro.getTanggalKadaluwarsa() + "', "
                        + "'" + pro.getSisa_stok()+ "')");
                return 0;
            }

        } catch (Exception e) {
            System.out.println(e);
        }
        return hasil;
    }

    public int cekTampilIdProduk(Produk pd) {
        int hasil = 0;
        try {
            Statement stm = koneksi.createStatement();
            r = stm.executeQuery("Select * from produk where id_produk = '" + pd.getNamaProduk() + "'");

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
    
    public String cekTampilIdProdukCombo(Produk pd) {
        int hasil = 0;
        try {
            Statement stm = koneksi.createStatement();
            r = stm.executeQuery("Select id_produk from produk where nama_produk = '" + pd.getNamaProduk()+ "'");

            if (r.next()) 
            {
                // jika ada id_produk yang sama
                return r.getString("id_produk");
            } 
            else 
            {
                // jika id_produk belum ada
                return "null";
            }
        } catch (Exception e) {
            System.out.println(e);
        }
        return "";
    }
    
    public String cekTampilIdKategoriProdukCombo(Produk pd) {
        int hasil = 0;
        try {
            Statement stm = koneksi.createStatement();
            r = stm.executeQuery("Select id_kategori from produk where nama_produk = '" + pd.getNamaProduk()+ "'");

            if (r.next()) 
            {
                // jika ada id_kategori yang sama
                return r.getString("id_kategori");
            } 
            else 
            {
                // jika id_kategori belum ada
                return "null";
            }
        } catch (Exception e) {
            System.out.println(e);
        }
        return "";
    }
    
    public String cekTampilNamaKategoriProdukCombo(Produk pd) {
        int hasil = 0;
        try {
            Statement stm = koneksi.createStatement();
            r = stm.executeQuery("Select kategori_produk from produk where nama_produk = '" + pd.getNamaProduk()+ "'");

            if (r.next()) 
            {
                // jika ada kategori_produk yang sama
                return r.getString("kategori_produk");
            } 
            else 
            {
                // jika kategori_produk belum ada
                return "null";
            }
        } catch (Exception e) {
            System.out.println(e);
        }
        return "";
    }
    
    public String cekTampilHargaProdukCombo(Produk pd) {
        int hasil = 0;
        try {
            Statement stm = koneksi.createStatement();
            r = stm.executeQuery("Select harga from produk where nama_produk = '" + pd.getNamaProduk()+ "'");

            if (r.next()) 
            {
                // jika ada harga yang sama
                return r.getString("harga");
            } 
            else 
            {
                // jika harga belum ada
                return "null";
            }
        } catch (Exception e) {
            System.out.println(e);
        }
        return "";
    }
    
    public String cekTampilBeratProdukCombo(Produk pd) {
        int hasil = 0;
        try {
            Statement stm = koneksi.createStatement();
            r = stm.executeQuery("Select berat_per_pcs from produk where nama_produk = '" + pd.getNamaProduk()+ "'");

            if (r.next()) 
            {
                // jika ada berat_per_pcs yang sama
                return r.getString("berat_per_pcs");
            } 
            else 
            {
                // jika berat_per_pcs belum ada
                return "null";
            }
        } catch (Exception e) {
            System.out.println(e);
        }
        return "";
    }
    
    public String cekTampilSatuanBeratProdukCombo(Produk pd) {
        int hasil = 0;
        try {
            Statement stm = koneksi.createStatement();
            r = stm.executeQuery("Select satuan_berat_per_pcs from produk where nama_produk = '" + pd.getNamaProduk()+ "'");

            if (r.next()) 
            {
                // jika ada satuan_berat_per_pcs yang sama
                return r.getString("satuan_berat_per_pcs");
            } 
            else 
            {
                // jika satuan_berat_per_pcs belum ada
                return "null";
            }
        } catch (Exception e) {
            System.out.println(e);
        }
        return "";
    }
    
    public String cekTampilTanggalProduksi(Produk pd) {
        int hasil = 0;
        try {
            Statement stm = koneksi.createStatement();
            r = stm.executeQuery("Select tanggal_produksi from produk where nama_produk = '" + pd.getNamaProduk()+ "'");

            if (r.next()) 
            {
                // jika ada tanggal_produksi yang sama
                return r.getString("tanggal_produksi");
            } 
            else 
            {
                // jika tanggal_produksi belum ada
                return "null";
            }
        } catch (Exception e) {
            System.out.println(e);
        }
        return "";
    }
    
    public String cekTampilTanggalKadaluwarsa(Produk pd) {
        int hasil = 0;
        try {
            Statement stm = koneksi.createStatement();
            r = stm.executeQuery("Select tanggal_kadaluwarsa from produk where nama_produk = '" + pd.getNamaProduk()+ "'");

            if (r.next()) 
            {
                // jika ada tanggal_kadaluwarsa yang sama
                return r.getString("tanggal_kadaluwarsa");
            } 
            else 
            {
                // jika tanggal_kadaluwarsa belum ada
                return "null";
            }
        } catch (Exception e) {
            System.out.println(e);
        }
        return "";
    }

}
