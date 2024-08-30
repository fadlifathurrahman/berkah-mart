package DAO;

import KoneksiDataBase.Koneksi;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class CrudAkun {
    Koneksi konekDB;
    Connection koneksi;
    DefaultTableModel tb;
    ResultSet r;
    
    public CrudAkun() {
        konekDB =  new Koneksi();
        koneksi = konekDB.buatKoneksi();
    }
    public DefaultTableModel tampilAkun() {
        try {
            tb = new DefaultTableModel (new String[]{"username", "kata_sandi"}, 0);
            Statement stm = (Statement) koneksi.createStatement();
            r = stm.executeQuery("Select * from akun");
            
            while (r.next()) {
                tb.addRow(new Object[] {
                    r.getString("username"),
                    r.getString("kata_sandi"),
            });
            }
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, ex);
        }
        return tb;
    }
}
