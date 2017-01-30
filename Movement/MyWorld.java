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
    private Glitch g;
    private Nuke s;
    private Nuke s7;
    private DePasta c;
    /**
     * Constructor for objects of class MyWorld.
     * 
     */
    public MyWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1);
        populate3();
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
        
        g = new Glitch();
        addObject(g, Greenfoot.getRandomNumber(600), Greenfoot.getRandomNumber(400));
        
        n = new Bananer(b);
        addObject(n, Greenfoot.getRandomNumber(600), Greenfoot.getRandomNumber(400));
    }
    public void populate2()
    {
        s = new Nuke(true, null);
        addObject(s, 0, 0);
        
        s7 = s;
        s = new Nuke(false, s7);
        addObject(s, 0, 0);
        
        s7 = s;
        s = new Nuke(false, s7);
        addObject(s, 0, 0);
        
        s7 = s;
        s = new Nuke(false, s7);
        addObject(s, 0, 0);
        
        s7 = s;
        s = new Nuke(false, s7);
        addObject(s, 0, 0);
        
        s7 = s;
        s = new Nuke(false, s7);
        addObject(s, 0, 0);
        
        s7 = s;
        s = new Nuke(false, s7);
        addObject(s, 0, 0);
        
        s7 = s;
        s = new Nuke(false, s7);
        addObject(s, 0, 0);
    }
    public void populate3()
    {
        Balls q = new Balls();
        Balls w = new Balls();
        Balls e = new Balls();
        Balls r = new Balls();
        Balls t = new Balls();
        Balls y = new Balls();
        b = new Brick();
        p = new Pizza();
        c = new DePasta();
        addObject(c, 30, 370);
        addObject(p, Greenfoot.getRandomNumber(600), Greenfoot.getRandomNumber(400));
        addObject(b, Greenfoot.getRandomNumber(600), Greenfoot.getRandomNumber(400));
        addObject(q, Greenfoot.getRandomNumber(600), Greenfoot.getRandomNumber(400));
        addObject(w, Greenfoot.getRandomNumber(600), Greenfoot.getRandomNumber(400));
        addObject(e, Greenfoot.getRandomNumber(600), Greenfoot.getRandomNumber(400));
        addObject(r, Greenfoot.getRandomNumber(600), Greenfoot.getRandomNumber(400));
        addObject(t, Greenfoot.getRandomNumber(600), Greenfoot.getRandomNumber(400));
        addObject(y, Greenfoot.getRandomNumber(600), Greenfoot.getRandomNumber(400));
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
    public DePasta getCount()
    {
        return c;
    }
}
