
package inputdatamhs;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class InputDataMhs {

    public static void main(String[] args) {
        //List<String> listNim = new ArrayList<String>();
        //List<String> listNama = new ArrayList<String>();
        List<Mahasiswa> listMhs = new ArrayList<Mahasiswa>();
        
        Scanner input = new Scanner(System.in);
        char jawaban = 'y';
        
        do {
            Mahasiswa mhs = new Mahasiswa();
            System.out.println("Entri Nama Mahasiswa");
            System.out.print("NIM    : ");
            mhs.nim = input.nextLine();

            System.out.print("Nama   : ");
            mhs.nama = input.nextLine();
            listMhs.add(mhs);

            System.out.println("Entri Data Lagi (Y/T) ? ");
            jawaban = input.nextLine().charAt(0);
        } while(jawaban == 'y' || jawaban == 'Y');
        
        //System.out.println("Jumlah Mahasiswa: " + listNim.size());
        System.out.println("NIM       Nama      Jurusan      Angkatan");
    }  
}

    class Mahasiswa {
        String nim;
        String nama;
        
        void tampilNim(){
            System.out.println(nim);
        }
        
        void tampilNama() {
            System.out.println(nama);
        }
    }
