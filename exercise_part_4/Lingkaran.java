
import java.util.Scanner;

public class Lingkaran {
Scanner input = new Scanner(System.in);
    private double phi= 3.14;
    private double r;
    private double Luas;
    private double Keliling;
    
    public double setR (){
        System.out.print("Masukan panjang rusuk: ");
        r = input.nextInt(); 
        return r;
    }
    
    public double getLuas(){
        Luas = this.r * this.r *phi ;
        return Luas;
    }
    
    public double getKeliling(){
        Keliling = phi * r * 2;
        return Keliling;

    }

    
}

