/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package meet2;

/**
 *
 * @author arael
 */
public class Items {
  
   String NamaItems;
   int    Harga;

   Items(int pHarga){
    
      this.Harga = pHarga;
       System.out.println("Items Konstruktor running");
    }

   

     public void setDisc() {
        return;
    }
  

    /**
     * @param Harga the Harga to set
     */
    public void setHarga(int Harga) {
        this.Harga = Harga;
    }

    /**
     * @return the Harga
     */
    public int getHarga() {
        return Harga;
    }

}
