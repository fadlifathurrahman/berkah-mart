package MainBerkahMart;

import Desain.LogIn;
import KoneksiDataBase.Koneksi;
import com.formdev.flatlaf.FlatLightLaf;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        FlatLightLaf.setup();

        Koneksi konek = new Koneksi();
        konek.buatKoneksi();

        LogIn login = new LogIn();
        login.setVisible(true);
    }
}
