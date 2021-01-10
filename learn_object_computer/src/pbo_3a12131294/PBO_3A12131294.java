
package pbo_3a12131294;

public class PBO_3A12131294 {

    public static void main(String[] args) {
        System.out.println("1). Monitor");
        monitor Monitor = new monitor();
        Monitor.on();
        Monitor.display();
        Monitor.off();
        
        System.out.println("***************");
        System.out.println("2). SmartPhone");
        smartPhone hp = new smartPhone();
        hp.on();
        hp.display();
        hp.sendMessage();
        hp.receiveMessage();
        hp.playVideo();
        hp.off();
        
        System.out.println("***************");
        System.out.println("3). Computer");
        computer pc = new computer();
        pc.on();
        pc.display();
        pc.playVideo();
        pc.off();
    }
    
}
