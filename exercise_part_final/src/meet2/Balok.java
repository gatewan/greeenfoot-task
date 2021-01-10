/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package meet2;

/**
 *
 * @author arael
 */
public class Balok extends PersegiPanjang{
  private int tinggi;
  int volume;

   
  Balok(){
    System.out.println("Konstruktor Balok Runing");

  }

    Balok(int pPanjang, int pLebar, int Tinggi){
      super(pPanjang, pLebar);
      tinggi = Tinggi;
    }



  int  getVolume(){
   int vol;
   vol = luas * this.tinggi;
   return vol;
  }

    /**
     * @return the tinggi
     */
    public int getTinggi() {
        return tinggi;
    }

    /**
     * @param tinggi the tinggi to set
     */
    public void setTinggi(int tinggi) {
        this.tinggi = tinggi;
    }


}


