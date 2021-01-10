
public class Test {
    public static void main(String[] args) {
        ISenjata senjata1 = new Basoka();
        senjata1.tembak();
        senjata1.isiPeluru();
        
        ISenjata tank1 = new Tank();
        tank1.isiPeluru();
        tank1.tembak();
        /* method belok() dan melaju() tidak dapat diakses karena saat
         * membuat objek, kita menggunakan referensi dari interface senjata
        */
        
        Tank tank2 = new Tank();
        tank2.isiPeluru();
        tank2.tembak();
        tank2.belok();
        tank2.melaju();
    }
}
