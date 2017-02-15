import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.awt.Color;

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
    public Bong(int bongLength)
    {
        img = new GreenfootImage(69, bongLength);
        img.setColor(Color.green);
        //img.drawRect(0, 0, 69, bongLength);
        img.fill();
        setImage(img);
    }
    public void act() 
    {
        move(-4);
    }    
}
