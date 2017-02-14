import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MyWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MyWorld extends World
{
    private Bong Bong1, Bong2;
    private int pipe;
    private int height;
    /**
     * Constructor for objects of class MyWorld.
     * 
     */
    public MyWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1);
        addObject(new Thing(), 169, 200);
        pipe = 120;
        addObject(new PipeCleaner(), 0, 0);
    }

    public void act()
    {
        if( pipe < 0 )
        {
            pipe = 120;
            height = Greenfoot.getRandomNumber(320);
            Bong1 = new Bong(height);
            Bong2 = new Bong(320 - height);
            addObject(Bong1, 600, height / 2);
            addObject(Bong2, 600, (320 - height) / 2);
        }
        pipe--;
    }
}
