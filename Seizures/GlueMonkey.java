import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class GlueMonkey here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class GlueMonkey extends Actor
{
    /**
     * Act - do whatever the GlueMonkey wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public GlueMonkey()
    {
     GreenfootImage rescale = getImage();
     rescale.scale(31, 35);
    }
    int dir;
    public void act() 
    {
        if( Greenfoot.getRandomNumber(100) < 7 )
        {
            dir = Greenfoot.getRandomNumber(8);
        }
        moves();
    }
    
    public void moves()
    {
        if(dir == 0)
        {
            move(4);
        }
        if(dir == 1)
        {
            move(-4);
        }
        if(dir == 2)
        {
            setLocation(getX(), getY()-4);
        }
        if(dir == 3)
        {
            setLocation(getX(), getY()+4);
        }
        if(dir == 4)
        {
            setLocation(getX()-2, getY()-2);
        }
        if(dir == 5)
        {
            setLocation(getX()+2, getY()-2);
        }
        if(dir == 6)
        {
            setLocation(getX()+2, getY()-2);
        }
        if(dir == 7)
        {
            setLocation(getX()+2, getY()+2);
        }
    }
}
