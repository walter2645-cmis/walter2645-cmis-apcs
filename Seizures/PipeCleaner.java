import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class PipeCleaner here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class PipeCleaner extends Actor
{
    /**
     * Act - do whatever the PipeCleaner wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public PipeCleaner()
    {
        GreenfootImage img = new GreenfootImage(1, 400);
        setImage(img);
    }
    public void act()
    {
        removeTouching(Bong.class);
    }
}
