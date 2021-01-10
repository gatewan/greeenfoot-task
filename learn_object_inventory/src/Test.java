
import java.util.Date;

public class Test {
    
    public static void main(String[] args) {
        Pembelian pembelian = new Pembelian();
        // Suplier s = new Suplier("ABC", "Jl. SS");
        pembelian.setSuplier(new Suplier("ABC", "Jl. SS"));
        pembelian.setTanggalBeli(new Date());
                
        Barang b1 = new Barang(12345, "Flashdisk", 135000);
        Barang b2 = new Barang(12346, "Mouse", 100000);
        Barang b3 = new Barang(12347, "Hard Disk 1T", 900000);
        
        PembelianDetail pd1 = new PembelianDetail(b1, 2);        
        PembelianDetail pd2 = new PembelianDetail(b2, 3);
        PembelianDetail pd3 = new PembelianDetail(b3, 5);
        
        pembelian.getPembelianDetail().add(pd1);
        pembelian.getPembelianDetail().add(pd2);
        pembelian.getPembelianDetail().add(pd3);
        
        // tampil data
        System.out.println("Nama Suplier : " + 
                pembelian.getSuplier().getNama());
        System.out.println("Alamat       : " +
                pembelian.getSuplier().getAlamat());
        System.out.println("Detail Barang dibeli:");
        
        System.out.println("Kode\t Nama\t\t Harga\t Jumlah\t Subtotal");
        for (PembelianDetail pd : pembelian.getPembelianDetail()) {
           Barang b = pd.getBarang();
            System.out.print(b.getKode() + "\t");
            System.out.print(b.getNama() + "\t\t");
            System.out.print(b.getHarga() + "\t");
            System.out.print(pd.getJumlah() + "\t");
            System.out.print(pd.subTotal() + "\n");
       }
        
        System.out.println("Jumlah Item dibeli : "); // ?
        System.out.println("Total Belanja      : "); // ?
    }
 
}
