import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MyWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MyWorld extends World
{
    private Brick b;
    private Darude d;
    private DRocket r;
    private Pizza p;
    private Bananer n;
    /**
     * Constructor for objects of class MyWorld.
     * 
     */
    public MyWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1);
        populate();
    }
    public void populate()
    {
        b = new Brick();
        addObject(b, Greenfoot.getRandomNumber(600), Greenfoot.getRandomNumber(400));
        
        d = new Darude();
        addObject(d, Greenfoot.getRandomNumber(600), Greenfoot.getRandomNumber(400));
        
        r = new DRocket();
        addObject(r, Greenfoot.getRandomNumber(600), Greenfoot.getRandomNumber(400));
        
        p = new Pizza();
        addObject(p, Greenfoot.getRandomNumber(600), Greenfoot.getRandomNumber(400));
        
        n = new Bananer(b);
        addObject(n, Greenfoot.getRandomNumber(600), Greenfoot.getRandomNumber(400));
    }
    public Brick getBrick()
    {
        return b;
    }
    public Darude getDarude()
    {
        return d;
    }
    public DRocket getDRocket()
    {
        return r;
    }
    public Pizza getPizza()
    {
        return p;
    }
}
