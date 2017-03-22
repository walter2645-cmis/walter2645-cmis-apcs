import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class ExtraGuy here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class ExtraGuy extends Actor
{
    /**
     * Act - do whatever the ExtraGuy wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    private long startTime;
    public ExtraGuy()
    {
        startTime = System.currentTimeMillis();
    }
    public void act() 
    {
        if( isTouching(Exterminator.class) )
        {
            MyWorld w = (MyWorld)getWorld();
            w.removeObject(this);
            w.addChance();
        }
        else if( System.currentTimeMillis() > startTime + 5000 )
        {
            MyWorld w = (MyWorld)getWorld();
            w.removeObject(this);
        }
    }
}
