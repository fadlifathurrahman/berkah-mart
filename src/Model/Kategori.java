package Model;

public class Kategori {
    private String idKategori;
    private String kategoriProduk;

    public Kategori(String id, String ktg) {
        this.idKategori = id;
        this.kategoriProduk = ktg;
    }

    public Kategori() {

    }

    public String getIdKategori() {
        return idKategori;
    }

    public void setIdKategori(String idKategori) {
        this.idKategori = idKategori;
    }

    public String getKategoriProduk() {
        return kategoriProduk;
    }

    public void setKategoriProduk(String kategoriProduk) {
        this.kategoriProduk = kategoriProduk;
    }
}
