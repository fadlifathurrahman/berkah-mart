package DAO;

import KoneksiDataBase.Koneksi;
import Model.Kategori;
import java.sql.*;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class CrudKategori {

    Koneksi konekDB;
    Connection koneksi;
    DefaultTableModel tb;
    ResultSet r;

    public CrudKategori() {
        konekDB = new Koneksi();
        koneksi = konekDB.buatKoneksi();
    }

    public int tambahKategori(Kategori ktg) {
        int hasil = 0;
        try {
            Statement stm = koneksi.createStatement();
            r = stm.executeQuery("Select * from kategori where kategori_produk = '" + ktg.getKategoriProduk() + "'");

            if (r.next()) {
                return 1;
            } else {
                hasil = stm.executeUpdate("insert into kategori values ('" + ktg.getIdKategori() + "'," + "'" + ktg.getKategoriProduk() + "')");
                return 0;
            }
        } catch (Exception e) {
            System.out.println(e);
        }
        return hasil;
    }
    
    public int cekIdKategori(Kategori ktg) {
        int hasil = 0;
        try {
            Statement stm = koneksi.createStatement();
            r = stm.executeQuery("Select * from kategori where id_kategori = '" + ktg.getKategoriProduk() + "'");

            if (r.next()) 
            {
                // jika ada id_kategori yang sama
                return 1;
            } 
            else 
            {
                // jika id_kategori belum ada
                return 0;
            }
        } catch (Exception e) {
            System.out.println(e);
        }
        return hasil;
    }

    public DefaultTableModel tampilKategori() {
        try {
            tb = new DefaultTableModel(new String[]{"ID Kategori", "Nama Kategori"}, 0);
            Statement stm = (Statement) koneksi.createStatement();
            r = stm.executeQuery("Select * from kategori where id_kategori != '00000'");

            while (r.next()) {
                tb.addRow(new Object[]{
                    r.getString("id_kategori"),
                    r.getString("kategori_produk"),});
            }
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, ex);
        }
        return tb;
    }
    
    public String cekTampilIdKategori(Kategori ktg) {
        int hasil = 0;
        try {
            Statement stm = koneksi.createStatement();
            r = stm.executeQuery("Select id_kategori from kategori where kategori_produk = '" + ktg.getKategoriProduk()+ "'");

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
//    
//    public int updateAnggota (Anggota agt) {
//        int hasil = 0;
//        try {
//            Statement stm = koneksi.createStatement();
//            hasil = stm.executeUpdate("update anggota set nama = '" + agt.getNama() 
//                    + "', jurusan = '" + agt.getJurusan() + "' where id='" 
//                    + agt.getIdAnggota() + "';");
//        } catch (Exception e) {
//            System.out.println(e);
//        }
//        return hasil;
//    }
//    
    public int deleteKategori (Kategori ktg) {
        int hasil = 0;
        try {
            Statement stm = koneksi.createStatement();
            hasil = stm.executeUpdate("delete from kategori where id_kategori='" + ktg.getIdKategori()+ "'");
        } catch (Exception e) {
            System.out.println(e);
        }
        return hasil;
    }
}
