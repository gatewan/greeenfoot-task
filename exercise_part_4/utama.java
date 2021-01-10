
public class utama {

       public static void main(String[] args) {
        Segitiga ss = new Segitiga ();
        persegi psg = new persegi ();
        Lingkaran lk = new Lingkaran ();
      
        System.out.println("==HITUNG SEGITIGA==");
        ss.setAlas();
        ss.setTinggi();
        ss.setSiring();
        
        System.out.println("Luas segitiga     : " + ss.getLuas());
        System.out.println("Keliling segitiga : " + ss.getKeliling());
        System.out.println("=======================================");
//---------------------------------------------------------------------
        
        System.out.println("==HITUNG PERSEGI=="); 
        psg.setPanjang();
        psg.setLebar();
      
        System.out.println("Luas persegi     : " + psg.getLuas());
        System.out.println("Keliling persegi : " + psg.getKeliling());
        System.out.println("=======================================");
//---------------------------------------------------------------------------        
        System.out.println("==HITUNG Lingkaran=="); 
        lk.setR();
      
        System.out.println("Luas Lingkaran     : " + lk.getLuas());
        System.out.println("Keliling Lingkaran : " + lk.getKeliling());
        System.out.println("=======================================");
        System.out.println("MUCHAMAD ASROR"); 
        System.out.println("12131271"); 
        
      
 
    }
}
