import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class RatDisease here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class RatDisease extends Actor
{
    /**
     * Act - do whatever the RatDisease wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    private long startTime;
    public RatDisease()
    {
        startTime = System.currentTimeMillis();
    }
    public void act() 
    {
        if( isTouching(Exterminator.class) )
        {
            MyWorld w = (MyWorld)getWorld();
            w.removeObject(this);
            w.killRats();
        }
        if( System.currentTimeMillis() > startTime + 5000 )
        {
            MyWorld w = (MyWorld)getWorld();
            w.removeObject(this);
        }
    }    
}
