
public class Tank extends Kendaraan implements ISenjata {

    @Override
    public void tembak() {
        System.out.println("Tank Menembak");
    }

    @Override
    public void isiPeluru() {
        System.out.println("Tank Isi Peluru");
    }
    
}
