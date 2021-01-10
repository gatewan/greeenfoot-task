/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package meet2;

/**
 *
 * @author arael
 */
public class Komputer extends Items{
    String Processor;

    //Komputer(){}
    Komputer(int pHarga){
     super(pHarga);
     System.out.println("Komputer Konstruktor running");
    }

    /* Overide */
    public void setDisc() {
        this.Harga = this.getHarga() - 25;
    }

}
