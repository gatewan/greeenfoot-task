// superclass
public class Orang {
        
    String nama; // hanya diakses di class ini, tdk bisa diturunkan / diwariskan
    protected String hobi; // bisa diturunkan / diwariskan
    int usia;
    
    void info() {
        System.out.println("\nNama : " + nama);
        System.out.println("Hobi : " + hobi);
        System.out.println("Usia : " + usia);
    }
    
}