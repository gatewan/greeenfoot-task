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
        
        elephant gajah1 = new elephant();
        addObject(gajah1,500,300);
        
        grass grass1 = new grass();
        addObject(grass1,200,300);
        
         grass grass2 = new grass();
        addObject(grass2,20,300);
        
         grass grass3 = new grass();
        addObject(grass3,200,30);
        
         grass grass4 = new grass();
        addObject(grass4,250,35);
        
         grass grass5 = new grass();
        addObject(grass5,100,100);
        
         grass grass6 = new grass();
        addObject(grass6,10,50);
        
         hunter hunter1 = new hunter();
        addObject(hunter1,28,70);
        
         hunter hunter2 = new hunter();
        addObject(hunter2,98,50);
        
         Rejeki rejeki = new Rejeki();
        addObject(rejeki,298,209);
        
         nilai n = new nilai();
        addObject(n,348,34);
                 
    }
   
}
