import java.util.Scanner;


public class Segitiga {

    Scanner input = new Scanner(System.in);
    
    private double Luas;
    private double Keliling;
    private double Alas;
    private double Tinggi;
    private double Siring;
    private double bantu;
   
    
    void setAlas() {
       System.out.print("Masukan panjang alas       : ");
        Alas = input.nextInt(); 
    }
    
    void setTinggi() {
       System.out.print("Masukan panjang tinggi     : ");
        Tinggi = input.nextInt(); 
    }
    
     void setSiring() {
      // System.out.print("Masukan panjang sisi miring: ");
       // Siring = input.nextInt(); 
         
      bantu = this.Alas * this.Alas + this.Tinggi * this.Tinggi ;
       Siring = Math.sqrt(bantu); //untuk meng akarkan
    }
    
    
    public double getLuas(){
        Luas = this.Alas * this.Tinggi * 1/2 ;
        return Luas;
    }
    
      public double getKeliling(){
        Keliling = this.Alas + this.Tinggi + this.Siring  ;
        return Keliling;
    }

  
}


