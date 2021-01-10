package variablescope;
public class VariableScope {
    
    static int classVar = 70; //global
    
    public static void main(String[] args) {
       int localVar =100;
       
        System.out.println(localVar);
        System.out.println(classVar);
        
        {
            int blockVar = 80; // hanya dikenali dalam blok
            System.out.println(blockVar);
        }
        
        System.out.println(localVar);
        // blockVar tidak akan dikenali
        // System.out.println(blockVar);
        
        tampil();
    }
    
    static void tampil() {
        System.out.println(classVar);
        // System.out.println(localVar);
    }
}
