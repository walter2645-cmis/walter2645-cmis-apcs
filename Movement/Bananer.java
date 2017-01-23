import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Bananer here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Bananer extends Actor
{
    /**
     * Act - do whatever the Bananer wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    private Actor target;
    public Bananer(Actor target)
    {
        this.target = target;
    }
    public void act() 
    {
        turnTowards(target.getX(), target.getY());
        move(2);
    }
}
