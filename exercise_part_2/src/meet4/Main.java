/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package meet4;

/**
 *
 * @author arael
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      
        int p = 10;
        int l = 20;
        int t = 5;

        Balok bl1 = new Balok(p, l, t);
        System.out.println("Balok dengan p : "+p+" l : "+l+" t : "+t+" mempunyai volume : "+bl1.getVolume());

    }
}


