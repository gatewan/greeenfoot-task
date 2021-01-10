package meet4;

public class Balok extends PersegiPanjang{
    private int t;
    private int vol;

   public Balok(){}

   public Balok(int pP, int pL, int pT){
     super(pP, pL);
     t = pT;
   }

   public int getVolume(){
      vol = this.getLuas() * this.getT();

      return getVol();
   }

    /**
     * @return the t
     */
    public int getT() {
        return t;
    }

    /**
     * @param t the t to set
     */
    public void setT(int t) {
        this.t = t;
    }

    /**
     * @return the vol
     */
    public int getVol() {
        return vol;
    }
}
