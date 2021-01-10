/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package meet2;

/**
 *
 * @author arael
 */
public class PersegiPanjang {
    private int panjang;
    private int lebar;
    int luas;

   PersegiPanjang(){

        System.out.println("Konstruktor PersegiPanjang");

   }

   PersegiPanjang(int pPanjang, int pLebar){

        System.out.println("Konstruktor PersegiPanjang");
        this.panjang = pPanjang;
        this.lebar = pLebar;

   }
  /* Method */



  int HitungLuas(){
       luas = getPanjang() * getLebar();
       return getLuas();
     }

    int HitungLuas(String data){
       luas = getPanjang() * getLebar();
       return getLuas();
     }

    /**
     * @param panjang the panjang to set
     */
    public void setPanjang(int panjang) {
        this.panjang = panjang;
    }

    /**
     * @param lebar the lebar to set
     */
    public void setLebar(int lebar) {
        this.lebar = lebar;
    }

    /**
     * @return the luas
     */
    public int getLuas() {
        return luas;
    }

    /**
     * @return the panjang
     */
    public int getPanjang() {
        return panjang;
    }

    /**
     * @return the lebar
     */
    public int getLebar() {
        return lebar;
    }

 
}



/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 *
 *
 *
 * 
 */
