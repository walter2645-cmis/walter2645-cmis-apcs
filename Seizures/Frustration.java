import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.awt.Color;

/**
 * Write a description of class Frustration here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Frustration extends Actor
{
    private int happiness = 0;
    /**
     * Act - do whatever the Frustration wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public Frustration()
    {
        setImage(new GreenfootImage("0", 20, Color.black, Color.white));
    }

    public void act() 
    {
        // Add your action code here.
    }
    
    public void increment()
    {
        happiness++;
        setImage(new GreenfootImage("" + happiness, 20, Color.black, Color.white));
    }
}
