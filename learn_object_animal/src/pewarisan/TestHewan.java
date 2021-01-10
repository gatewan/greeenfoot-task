package pewarisan;
public class TestHewan {
public static void main(String[] args) {
       System.out.println("Test Mamalia : ");
       Mamalia m = new Mamalia();
       m.bergerak();
       m.makan();
       m.menyusui();
       
       System.out.println("\nTest Unggas : ");
       Unggas u = new Unggas();
       u.bergerak();
       u.makan();
       u.bertelur();

    }
}
