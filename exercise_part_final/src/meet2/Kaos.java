/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package meet2;

/**
 *
 * @author arael
 */
public class Kaos extends Items{
    String Size;
    
    Kaos(int pHarga){
     super(pHarga);
     System.out.println("Kaos Konstruktor running");
    }
      /* Overide */
    public void setDisc() {
        this.Harga = this.getHarga() - 5;
    }

}
