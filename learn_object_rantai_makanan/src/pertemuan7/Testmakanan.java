package pertemuan7;
public class Testmakanan {
    public static void main(String[] args) {
        Bakso b=new Bakso();
        Soto s=new Soto();
        
        System.out.println("\nBakso");
        b.icip();
        b.porsi();
        b.harga();
        
        System.out.println("\nSoto");
        s.icip();
        s.porsi();
        s.harga();
    }
}
