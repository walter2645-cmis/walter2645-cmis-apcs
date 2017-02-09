import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Bong here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Bong extends Actor
{
    private GreenfootImage img;
    private int bongLength = 0;
    /**
     * Act - do whatever the Bong wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public Bong()
    {
        img = new GreenfootImage(69, bongLength);
    }
    public void act() 
    {
        move(-3);
    }    
}
