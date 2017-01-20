import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MyWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MyWorld extends World
{

    /**
     * Constructor for objects of class MyWorld.
     * 
     */
    public MyWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1);
        Brick b = new Brick();
        addObject(b, Greenfoot.getRandomNumber(600), Greenfoot.getRandomNumber(400));
        
        Darude d = new Darude();
        addObject(d, Greenfoot.getRandomNumber(600), Greenfoot.getRandomNumber(400));
        
        DRocket r = new DRocket();
        addObject(r, Greenfoot.getRandomNumber(600), Greenfoot.getRandomNumber(400));
        
        Pizza p = new Pizza();
        addObject(p, Greenfoot.getRandomNumber(600), Greenfoot.getRandomNumber(400));
    }
}
