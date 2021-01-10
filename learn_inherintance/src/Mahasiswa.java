// subclass dari superclass Orang
public class Mahasiswa extends Orang {
    String nim;
    
    void info() {
        super.info(); // memanggil info dr superclass
        System.out.println("NIM  : " + nim);
    }
}