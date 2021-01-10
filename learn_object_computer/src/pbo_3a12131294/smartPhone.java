
package pbo_3a12131294;


public class smartPhone extends monitor implements pwrButton{

   @Override
    public void display() {
        System.out.println("Welcome to My SmartPhone");   
    }

    public void sendMessage(){
        System.out.println("Message Sent");
    }
    public void receiveMessage(){
        System.out.println("New Messages");
    }        
    public void playVideo(){
        System.out.println("Video is Playing");
    }

}

