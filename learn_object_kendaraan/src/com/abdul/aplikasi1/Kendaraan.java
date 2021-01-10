
package com.abdul.aplikasi1;

public class Kendaraan {
    public static int jumlah; // static bisa diakses tanpa membuat objek
    
    public Kendaraan() {
        jumlah++;
    }
    
    public void maju() {
        System.out.println("Kendaraan Maju");
    }
    
    public void mundur() {
        System.out.println("Kendaraan Mundur");
    }
    
    // protected bisa diakses dlm class yg bersangkutan
    // dan class turunan dlm satu package
    protected void berhenti() {
        System.out.println("Kendaraan Berhenti");
    }
}
