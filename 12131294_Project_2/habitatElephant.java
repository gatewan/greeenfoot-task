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
        
        grass g1 = new grass();
        addObject(g1, 312,95);
        
         grass g2 = new grass();
        addObject(g2, 170,200);
        
         grass g3 = new grass();
        addObject(g3, 290,300);
        
         grass g4 = new grass();
        addObject(g4, 420,200);
    }
}
