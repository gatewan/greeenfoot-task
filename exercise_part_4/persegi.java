
import java.util.Scanner;


public class persegi {
  Scanner input = new Scanner(System.in);
    private double Luas;
    private double Keliling;
    private double Panjang;
    private double Lebar;

    void setPanjang() {
       System.out.print("Masukan panjang   : ");
        Panjang = input.nextInt(); 
    }
    
    void setLebar() {
       System.out.print("Masukan Lebar     : ");
        Lebar = input.nextInt();
    }
    
    
    public double getLuas(){
        Luas = this.Panjang * this.Lebar  ;
        return Luas;
    }
    
      public double getKeliling(){
        Keliling = (this.Panjang + this.Lebar)*2   ;
        return Keliling;
    }
}
