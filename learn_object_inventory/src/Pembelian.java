
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Pembelian {
    private Suplier suplier;
    private Date tanggalBeli;
    private List<PembelianDetail> pembelianDetail =
            new ArrayList<PembelianDetail>();

    public Suplier getSuplier() {
        return suplier;
    }

    public void setSuplier(Suplier suplier) {
        this.suplier = suplier;
    }

    public Date getTanggalBeli() {
        return tanggalBeli;
    }

    public void setTanggalBeli(Date tanggalBeli) {
        this.tanggalBeli = tanggalBeli;
    }

    public List<PembelianDetail> getPembelianDetail() {
        return pembelianDetail;
    }

    public void setPembelianDetail(List<PembelianDetail> pembelianDetail) {
        this.pembelianDetail = pembelianDetail;
    }
    
    
}
