/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package meet2;

/**
 *
 * @author arael
 */
public class Main {

    public static void main(String[] args) {

      Items objItems[] = new Items[2];
      objItems[0] = new Komputer(100);
      objItems[1] = new Kaos(23);

      System.out.println("Harga Komputer "+objItems[0].getHarga());
      System.out.println("Harga Kaos "+objItems[1].getHarga());

      objItems[0].setDisc();
      objItems[1].setDisc();

      System.out.println("Harga Komputer "+objItems[0].getHarga());
      System.out.println("Harga Kaos "+objItems[1].getHarga());


       
    }
}









/*
 *

 * To change this template, choose Tools | Templates
 * and open the template in the editor.

    Items obItems[] = new Items[2];
    obItems[0] = new Komputer(200);
    obItems[1] = new TShirt(100);

    System.out.println("Harga "+obItems[0].getHarga());
    System.out.println("Harga "+obItems[1].getHarga());

    obItems[0].setDisc();
    obItems[1].setDisc();

    System.out.println("Harga "+obItems[0].getHarga());
    System.out.println("Harga "+obItems[1].getHarga());
 *
 *

 * To change this template, choose Tools | Templates
 * and open the template in the editor.
public class TShirt extends Items {
    String Size;


    TShirt( int pHarga){
     super(pHarga);
     System.out.println("TShirt Konstruktor running");
    }

    public void setDisc() {
        this.Harga = this.Harga - 5;
    }
}

 *
 */
