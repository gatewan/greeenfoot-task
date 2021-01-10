
public class PembelianDetail {
    private Barang barang;
    private int jumlah;

    public PembelianDetail(Barang barang, int jumlah) {
        this.barang = barang;
        this.jumlah = jumlah;
    }

    public Barang getBarang() {
        return barang;
    }

    public int getJumlah() {
        return jumlah;
    }
    
    public int subTotal() {
        return barang.getHarga() * jumlah;
    }
       
}
