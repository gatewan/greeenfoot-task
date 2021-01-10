package pertemuan7;
public class Testhewan {
    public static void main(String[] args) {
        Kelinci kc=new Kelinci();
        Kambing kb=new Kambing();
        
        System.out.println("\nKelinci");
        kc.makan();
        kc.minum();
        kc.berlari();
        
        System.out.println("\nKambing");
        kb.makan();
        kb.minum();
        kb.berlari();
    }
}
