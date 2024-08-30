package Model;

public class Distributor {

    private String idDistributor;
    private String namaDistributor;

    public Distributor(String idDis, String namaDis) {
        this.idDistributor = idDis;
        this.namaDistributor = namaDis;
    }

    public Distributor() {
    }

    public String getIdDistributor() {
        return idDistributor;
    }

    public void setIdDistributor(String idDistributor) {
        this.idDistributor = idDistributor;
    }

    public String getNamaDistributor() {
        return namaDistributor;
    }

    public void setNamaDistributor(String namaDistributor) {
        this.namaDistributor = namaDistributor;
    }

    
}
