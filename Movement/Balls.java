import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Balls here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Balls extends Actor
{
    /**
     * Act - do whatever the Balls wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public Balls()
    {
        turn(Greenfoot.getRandomNumber(360));
    }
    public void act() 
    {
        if( isAtEdge() || isTouching(null) )
        {
            turn(Greenfoot.getRandomNumber(180) - 90);
            move(4);
        }
        else
        {
            move(3);
        }
    } 
}
