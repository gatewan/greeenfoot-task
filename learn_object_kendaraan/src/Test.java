
// import com.abdul.aplikasi1.Kendaraan;
// import com.abdul.aplikasi1.Tank;
import com.abdul.aplikasi1.*; // * mengimpor semua class di suatu package

import com.abdul.aplikasi3.*;

public class Test {
    public static void main(String[] args) {
        Kendaraan k1 = new Kendaraan();
        
        k1.maju();
        k1.mundur();
        // k1.berhenti();
        
        Tank t1 = new Tank();
        t1.tankBerhenti();
        
        Motor m1 = new Motor();
        Mobil m2 = new Mobil();
        Pesawat p1 = new Pesawat();
        
        m1.motorMaju();
        m1.motorMundur();
        m1.motorBerhenti();
        
        m2.mobilMaju();
        m2.mobilMundur();
        m2.mobilBerhenti();
        
        p1.pesawatMaju();
        p1.pesawatMundur();
        p1.pesawatBerhenti();
        
        System.out.println("Jumlah Kendaraan : " + Kendaraan.jumlah);
    }
}
