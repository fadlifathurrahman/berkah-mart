package DAO;

import KoneksiDataBase.Koneksi;
import Model.Distributor;
import java.sql.*;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class CrudDistributor {
    
    Koneksi konekDB;
    Connection koneksi;
    DefaultTableModel tb;
    ResultSet r;

    public CrudDistributor() {
        konekDB = new Koneksi();
        koneksi = konekDB.buatKoneksi();
    }
    
    public DefaultTableModel tampilDistributor() {
        try {
            tb = new DefaultTableModel(new String[]{"ID Distributor", "Nama Distributor"}, 0);
            Statement stm = (Statement) koneksi.createStatement();
            r = stm.executeQuery("Select * from distributor where id_distributor != '00000'");

            while (r.next()) {
                tb.addRow(new Object[]{
                    r.getString("id_distributor"),
                    r.getString("nama_distributor"),});
            }
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, ex);
        }
        return tb;
    }
    
    public int tambahDistributor(Distributor dis) {
        int hasil = 0;
        try {
            Statement stm = koneksi.createStatement();
            r = stm.executeQuery("Select * from distributor where nama_distributor = '" + dis.getNamaDistributor()+ "'");

            if (r.next()) {
                return 1;
            } else {
                hasil = stm.executeUpdate("insert into distributor values ('" + dis.getIdDistributor() + "'," + "'" + dis.getNamaDistributor()+ "')");
                return 0;
            }
        } catch (Exception e) {
            System.out.println("tambah table " + e);
        }
        return hasil;
    }
    
    public int cekIdDistributor(Distributor dis) {
        int hasil = 0;
        try {
            Statement stm = koneksi.createStatement();
            r = stm.executeQuery("Select * from distributor where id_distributor = '" + dis.getIdDistributor()+ "'");

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
    
    public String cekTampilIdDistributor(Distributor dis) {
        int hasil = 0;
        try {
            Statement stm = koneksi.createStatement();
            r = stm.executeQuery("Select id_distributor from distributor where nama_distributor = '" + dis.getNamaDistributor()+ "'");

            if (r.next()) 
            {
                // jika ada id_distributor yang sama
                return r.getString("id_distributor");
            } 
            else 
            {
                // jika id_distributor belum ada
                return "null";
            }
        } catch (Exception e) {
            System.out.println(e);
        }
        return "";
    }
    
    public int hapusDistributor (Distributor dis) {
        int hasil = 0;
        try {
            Statement stm = koneksi.createStatement();
            hasil = stm.executeUpdate("delete from distributor where id_distributor='" + dis.getIdDistributor()+ "';");
        } catch (Exception e) {
            System.out.println(e);
        }
        return hasil;
    }
    
    public int updateDistributor(Distributor dis) {
        int hasil = 0;
        try {
            Statement stm = koneksi.createStatement();
            hasil = stm.executeUpdate("update distributor set nama_distributor = '" + dis.getNamaDistributor()
                    + "' where id_distributor='" + dis.getIdDistributor()+ "'");
        } catch (Exception e) {
            System.out.println(e);
        }
        return hasil;
    }
}
