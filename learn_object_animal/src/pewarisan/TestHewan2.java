package pewarisan;
public class TestHewan2 {
    public static void main(String[] args) {
       System.out.println("\nTest Penguin : ");
       Penguin p = new Penguin();
       p.bergerak();
       p.makan();
       p.bertelur();
       p.menyelam();
       
       System.out.println("\nTest Kucing : ");
       Kucing k = new Kucing();
       k.bergerak();
       k.makan();
       k.menyusui();
       k.mengeong();
    }
}
