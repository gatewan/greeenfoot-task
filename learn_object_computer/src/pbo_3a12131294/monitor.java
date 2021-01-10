
package pbo_3a12131294;

public class monitor implements pwrButton{

    @Override
    public void on() {
        System.out.println("Starting Up ...100%");
    }

    @Override
    public void off() {
        System.out.println("Shutting Down ...100%");
    }

    @Override
    public void display() {
        System.out.println("Welcome to My Monitor");    
    }
  
}
