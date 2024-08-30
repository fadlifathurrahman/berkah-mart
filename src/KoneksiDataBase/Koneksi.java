package KoneksiDataBase;

import java.sql.Connection;
import java.sql.DriverManager;
        
public class Koneksi {
    
    public Connection koneksi;
    
    public Connection buatKoneksi()
    {
        if (koneksi == null)
        {
            try 
            {
                String db = "jdbc:mysql://localhost/berkahmart";
                String user = "root";
                String password = "";
                DriverManager.registerDriver(new com.mysql.cj.jdbc.Driver());
                koneksi = (Connection) DriverManager.getConnection(db, user, password);
                System.out.println("Connected");
            } 
            catch(Exception e)
            {
                System.out.println("Connection error");
            }
        }
        return koneksi;
    }
}