public class Percabangan {
    public static void main(String[] args) {
        int hari = 3;
        String namaHari;
            if(hari == 1) namaHari = "Ahad";
            else if(hari == 2) namaHari = "Senin";
            else if(hari == 3) namaHari = "Selasa";
            else if(hari == 4) namaHari = "Rabu";
            else if(hari == 5) namaHari = "Kamis";
            else if(hari == 6) namaHari = "Jumat";
            else if(hari == 7) namaHari = "Sabtu";
            else namaHari = "???";
            
            System.out.println("Sekarang Hari " + namaHari);
    }
}
