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
    private Frustration fk;
    private Calculus integration;
    private GlueMonkey gg;
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
        addObject(new PipeCleaner(), 0, 200);
        fk = new Frustration();
        addObject(fk, 20, 380);
        integration = new Calculus();
        addObject(integration, 100, 200);
        gg = new GlueMonkey();
        addObject(gg, 475, 200);
    }

    public void act()
    {
        if( pipe < 0 )
        {
            pipe = 85;
            height = Greenfoot.getRandomNumber(130) + 50;
            Bong1 = new Bong(height);
            addObject(Bong1, 600, height / 2);
            int high = 400 - height - 100;
            Bong2 = new Bong(high);
            addObject(Bong2, 600, high / 2 + height + 100);
        }
        pipe--;
    }
    
    public Frustration getFrustration()
    {
        return fk;
    }
}
