import greenfoot.*;

/**
 * Write a description of class habitatElephant here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class habitatElephant extends World
{

    /**
     * Constructor for objects of class habitatElephant.
     * 
     */
    public habitatElephant()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1); 
        
        elephant e = new elephant();
        addObject(e, 70,200);
    }
}
