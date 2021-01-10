import greenfoot.*;
import java.util.List;
/**
 * Write a description of class elephant here.
 * 
 * @author (Wawan Chahyo Nugroho/12131294) 
 * @version (a version number or a date)
 */
public class elephant extends Actor
{
 
    
    int x;
    /**
     * Act - do whatever the elephant wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        // implementasi praktik 1 dan 2
/**          
        if ( isAtEdge() )
        {
            turn(5);
        }
        
        if ( Greenfoot.getRandomNumber(100) > 60 )
        {
            turn(Greenfoot.getRandomNumber(90)-45);
        }
*/
     // implementasi praktik 3
     //kontrol keyboard panah kiri dan kanan
/**
     if (Greenfoot.isKeyDown("left"))
     {
         turn(-4);
      }
    
     if (Greenfoot.isKeyDown("right"))
     {
         turn(4);
      }
*/  

//implementasi praktik 4. memanggil sub-sub modul. 
//bergerak dengan kecepatan 5 step
checkTombol();
move(4);    
makanRumput(); 


    
//implementasi praktik 3

/**
      if ( isTouching(grass.class))
       {
           removeTouching(grass.class);
       }
*/

    } 

//implementasi praktik 4, membuat sub-sub modul.    
 public void checkTombol()
{
     if (Greenfoot.isKeyDown("left"))
     {
         turn(-4);
      }
    
     if (Greenfoot.isKeyDown("right"))
     {
         turn(4);
      }
}   
    
public void makanRumput(){
      
      if ( isTouching(grass.class))
       {
           removeTouching(grass.class);
           x++;
           if( x==1) {
           World bar1 = getWorld();
           bar1.addObject(new Bar1(),298,209);
           }
                      
           if(x==6){
           World bar2 = getWorld();
           bar2.addObject(new Bar2(),3*x*x+298,209);
           World poin6 = getWorld();
           poin6.addObject(new skor6(),564,34);
           World world = getWorld();
           world.addObject(new win(), world.getWidth()/2, world.getHeight()/2);
                      
            }
           GreenfootSound makan = new GreenfootSound("eat.wav");
           makan.play();
           
       }
     
}    




}







