public class TipeData {
    public static void main(String[] args) {
        
        // TIPE DATA KLASIK
        
        int intNum = 1233456; // Integer.MAX_VALUE;
        long longNum = 123456789L; // Long.MAX_VALUE;
        // tipe data long diakhirnya harus dikasih "L", klo tidak akan dianggap integer
        short shortNum = 12345; // Short.MAX_VALUE;
        byte byteNum = 45; // Byte.MAX_VALUE;
        
        System.out.println(intNum);
        System.out.println(longNum);
        System.out.println(shortNum);
        System.out.println(byteNum);
        
        float floatNum = 123.45F; // Float.MAX_VALUE;
        // tipe data float diakhirnya harus dikasih "F", klo tidak akan dianggap double
        double doubleNum = 1213.45; // Double.MAX_VALUE;
        System.out.println(floatNum);
        System.out.println(doubleNum);
        
        char karakter1 = 76;
        char karakter2 = 'A';
        System.out.println(karakter1);
        System.out.println(karakter2);
        
        boolean boolValue = false;
        System.out.println(boolValue);
        
        
        // TIPE DATA
        // nama-class nama-variable = new konstruktor
        
        Integer intObj = new Integer(1200);
        String str = "STMIK El Rahma";
        System.out.println(intObj);
        System.out.println(str);
        
        // KONSTANTA
        // final tipe-data NAMA_KONSTANTA =nilai
        
        final int NILAI_MAX = 10;
        for(int i = 0; i < NILAI_MAX; i++) {
            System.out.println(i);
        }
        
    }
}
