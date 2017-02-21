import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class PipeCleaner here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Calculus extends Actor
{
    /**
     * Act - do whatever the PipeCleaner wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    private int score = 0;
    public Calculus()
    {
        GreenfootImage img = new GreenfootImage(1, 400);
        setImage(img);
    }
    public void act()
    {
        if( score <= 0 )
        {
            if( getOneIntersectingObject( Bong.class ) != null )
            {
                score = 80;
                MyWorld world = (MyWorld) getWorld();
                Frustration fk = world.getFrustration();
                fk.increment();
            }
        }
        score--;
    }
}
