package DAO;

import KoneksiDataBase.Koneksi;
import Model.Akun;
import java.security.NoSuchAlgorithmException;
//import java.security.SecureRandom;
import java.security.spec.InvalidKeySpecException;
import java.security.spec.KeySpec;
import java.sql.*;
import java.util.Arrays;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.PBEKeySpec;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class CekAkun {

    Koneksi konekDB;
    Connection koneksi;
    DefaultTableModel tb;
    ResultSet r;

    public CekAkun() {
        konekDB = new Koneksi();
        koneksi = konekDB.buatKoneksi();
    }

    public boolean cekLogin(Akun akun) {
        try {
            Statement stm = (Statement) koneksi.createStatement();
            r = stm.executeQuery("Select * from akun where username = '" + akun.getUsername() + "'");

            if (r.next()) {
                return Arrays.equals(hashPassword(akun.getPassword(), akun.getUsername().getBytes()), r.getBytes("kata_sandi"));
            } else {
                return false;
            }
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, ex);
            return false;
        }
    }
    
    public byte[] hashPassword(String password, byte[] salt) throws NoSuchAlgorithmException, InvalidKeySpecException {
//            SecureRandom random = new SecureRandom();
//            byte[] salt = new byte[16];
//            random.nextBytes(salt);

            KeySpec spec = new PBEKeySpec(password.toCharArray(), salt, 65536, 128);
            SecretKeyFactory factory = SecretKeyFactory.getInstance("PBKDF2WithHmacSHA1");

            byte[] hash = factory.generateSecret(spec).getEncoded();
            
            return hash;
    }

    public int tambahAkun(Akun akun) {
        int hasil = 0;
        try {Statement stm = (Statement) koneksi.createStatement();
            r = stm.executeQuery("Select * from akun where username = '" + akun.getUsername() + "'");

            if (r.next()) {
                return 1;
            } else {
                PreparedStatement stmt = koneksi.prepareStatement("INSERT INTO akun VALUES (?, ?)");
                stmt.setString(1, akun.getUsername());
                stmt.setBytes(2, hashPassword(akun.getPassword(), akun.getUsername().getBytes()));
                hasil = stmt.executeUpdate();
                return 0;
            }
        } catch (NoSuchAlgorithmException | InvalidKeySpecException | SQLException e) {
            System.out.println("gagal" + e);
        }
        return hasil;
    }

}
