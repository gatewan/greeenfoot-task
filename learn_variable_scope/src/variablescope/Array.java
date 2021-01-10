package variablescope;

public class Array {
    public static void main(String[] args) {
        
        // deklarasi array
        // tipe-data variable[] = new tipe-data[N]
        // tipe-data[] variable = new tipe-data[N] (bisa jg spt ini)
        
        // String daftarMahasiswa[] = new String[3];
        // daftarMahasiswa[0] = "Andi";
        // daftarMahasiswa[1] = "Azis";
        // daftarMahasiswa[2] = "Budi";
        String daftarMahasiswa[] = {"Andi", "Aziz", "Budi"};
        
       // int[] daftarNilai = new int[3];
       // daftarNilai[0] = 90;
       // daftarNilai[1] = 100;
       // daftarNilai[2] = 70;
        int[] daftarNilai = {90, 100, 70};
        
        int jumlah = daftarMahasiswa.length;
        for(int i=0; i<jumlah; i++) {
            System.out.print(daftarMahasiswa[i]);
            System.out.println(" = " + daftarNilai[i]);
        }
       
        int nilaiMin = daftarNilai[0], nilaiMax = daftarNilai[0], total=0, rata;
        for(int i=1; i<jumlah; i++) {
            if(nilaiMin < daftarNilai[i]) {
                nilaiMin = daftarNilai[i];
            }
            if(nilaiMax > daftarNilai[i]) {
                nilaiMax = daftarNilai[i];
            }
        }
        System.out.println("Nilai Terendah = " + nilaiMin);
        System.out.println("Nilai Tertinggi = " + nilaiMax);
            
        for(int i=0; i < jumlah; i++) {
            total = total + daftarNilai[i];
        }
        rata = total / daftarNilai.length;
        System.out.println("Nilai Rata-rata = " + rata);
        
    }
}
