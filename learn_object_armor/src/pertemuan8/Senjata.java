package pertemuan8;
public abstract class Senjata {
    private int peluru;
    
    public int getpeluru()
    {
        return peluru;
    }
    public void setpeluru(int peluru)
    {
        this.peluru=peluru;
    }
    public void kurangi()
    {
        this.peluru--;
    }
    public abstract void tembak();
    public abstract void isipeluru(int i);
    public abstract void isipeluru();   
}
