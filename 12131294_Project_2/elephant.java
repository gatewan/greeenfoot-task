import greenfoot.*;

/**
 * Write a description of class elephant here.
 * 
 * @author (Wawan Chahyo Nugroho)
 * @blog (www.gatewan.com)
 * @version (a version number or a date)
 */
public class elephant extends Actor
{
    /**
     * Act - do whatever the elephant wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        // implementasi praktik 1 dan 2
 /*        
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
/*
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
move(5);    
makanRumput();       
//implementasi praktik 3

      if ( isTouching(grass.class))
       {
           removeTouching(grass.class);
       }


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
       }
}    
    
    
}




