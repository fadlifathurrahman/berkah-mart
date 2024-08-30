package Model;

public class Produk {

    
    private String idProduk;
    private String namaProduk;
    private String idKategori;
    private String kategoriProduk;
    private int ukuranPerPcs;
    private String satuanPerPcs;
    private String tanggalProduksi;
    private String tanggalKadaluwarsa;
    private int harga;
    private int sisa_stok;

    public String getIdProduk() {
        return idProduk;
    }

    public void setIdProduk(String idProduk) {
        this.idProduk = idProduk;
    }

    public String getNamaProduk() {
        return namaProduk;
    }

    public void setNamaProduk(String namaProduk) {
        this.namaProduk = namaProduk;
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

    public int getUkuranPerPcs() {
        return ukuranPerPcs;
    }

    public void setUkuranPerPcs(int ukuranPerPcs) {
        this.ukuranPerPcs = ukuranPerPcs;
    }

    public String getSatuanPerPcs() {
        return satuanPerPcs;
    }

    public void setSatuanPerPcs(String satuanPerPcs) {
        this.satuanPerPcs = satuanPerPcs;
    }

    public String getTanggalProduksi() {
        return tanggalProduksi;
    }

    public void setTanggalProduksi(String tanggalProduksi) {
        this.tanggalProduksi = tanggalProduksi;
    }

    public String getTanggalKadaluwarsa() {
        return tanggalKadaluwarsa;
    }

    public void setTanggalKadaluwarsa(String tanggalKadaluwarsa) {
        this.tanggalKadaluwarsa = tanggalKadaluwarsa;
    }

    public int getHarga() {
        return harga;
    }

    public void setHarga(int harga) {
        this.harga = harga;
    }
    
    public int getSisa_stok() {
        return sisa_stok;
    }

    public void setSisa_stok(int sisa_stok) {
        this.sisa_stok = sisa_stok;
    }
}
