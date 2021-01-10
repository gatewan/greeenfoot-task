/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package meet2;

/**
 *
 * @author arael
 */
import java.util.Scanner;

//include();

public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        // Saya cinta padamu
      String NamaBarang;
      int JmBeli;
      float Harga, Total;

      Scanner input = new Scanner(System.in);

      System.out.print("Nama Barang  :"); NamaBarang = input.next();
      System.out.print("Harga Barang :"); Harga =input.nextFloat();
      System.out.print("Jumlah Beli  :"); JmBeli = input.nextInt();
      Total = Harga * JmBeli;
      System.out.println("Total Beli : "+Total);
    }
}
