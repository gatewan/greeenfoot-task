import greenfoot.*;

/**
 * Write a description of class hunter here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class hunter extends Actor
{
    /**
     * Act - do whatever the hunter wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        if ( isAtEdge() )
        {
            turn(5);
        }
        
        if ( Greenfoot.getRandomNumber(100) > 60 )
        {
            turn(Greenfoot.getRandomNumber(90)-45);
        }
        
        if ( isTouching(elephant.class))
       {
           removeTouching(elephant.class);
           World world = getWorld();
           world.addObject(new GameOver(), world.getWidth()/2, world.getHeight()/2);
           Greenfoot.stop();
           GreenfootSound end = new GreenfootSound("tamat.wav");
           end.play();
       }
       
       move(3);
    }    
}
