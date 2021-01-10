package pertemuan8;
public class Pistol extends Senjata{
    private int max=7;
    public Pistol()
    {
        setpeluru(max);
    }
    @Override
    public void tembak()
    {
        if(getpeluru()==0)
        {
        System.out.println("Peluru kosong......");
        return;
        }
        kurangi();
        System.out.println("Pistol Ditembak Target Mati");
        System.out.println("Sisa Peluru : "+getpeluru());
    }
    @Override
    public void isipeluru(int i)
    {
    if(i<=0)
        {
        return;
        }
    else if(i>max)
        {
        setpeluru(max);
        }
    else
        {
        setpeluru(i);
        }
    System.out.println("Jumlah Peluru : "+getpeluru());
    }
    @Override
    public void isipeluru()
        {
        setpeluru(max);   
        System.out.println("Peluru Penuh Sebanyak : "+getpeluru()+" Peluru ");  
    }
}