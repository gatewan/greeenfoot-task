

package meet4;
public class PersegiPanjang {
    //Taribute
    private int p;
    private int l;
    private int luas;

    //Konstruktor
    public PersegiPanjang(){

    }

    public PersegiPanjang(int pP, int pL){
       this.p = pP;
       this.l = pL;
    }

    public void setP(int pP){
        p=pP;
    }

    //Methode
    public int HitungLuas(){
        setLuas(getP() * getL());
      return getLuas();
    }

    public int Hitung3(){
        setLuas(getP() / getL());
      return getLuas();
    }

    /**
     * @return the p
     */
    public int getP() {
        return p;
    }

    /**
     * @return the l
     */
    public int getL() {
        return l;
    }

    /**
     * @param l the l to set
     */
    public void setL(int l) {
       this.l = l;
    }

    /**
     * @return the luas
     */
    public int getLuas() {
        return luas;
    }

    /**
     * @param luas the luas to set
     */
    public void setLuas(int luas) {
        this.luas = luas;
    }
}
