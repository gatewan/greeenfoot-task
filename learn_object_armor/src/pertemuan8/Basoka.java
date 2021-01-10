package pertemuan8;

public class Basoka extends Senjata{
    private int max=5;
    public Basoka()
        {
            setpeluru(max);
        }
    @Override 
    public void tembak()
        {
            if (getpeluru()==0)
            {
                System.out.println("Peluru Habis....");
                return;
            }
            kurangi();
            System.out.println("Basoka : Musnahkan Target");
            System.out.println("Peluru Habis....");
        }    
}
