import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.awt.Color;
/**
 * Write a description of class dePasta here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class DePasta extends Actor
{
    /**
     * Act - do whatever the dePasta wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    private int count = 0;
    public DePasta()
    {
        setImage(new GreenfootImage("0", 20, Color.BLACK, Color.WHITE));
    }
    public void nom()
    {
        count++;
        setImage(new GreenfootImage("" + count, 20, Color.BLACK, Color.WHITE));
    }
    public void act() 
    {
        // Add your action code here.
    }
}
