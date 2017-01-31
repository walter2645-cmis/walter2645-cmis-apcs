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
            //turn(Greenfoot.getRandomNumber(180) - 90);
            //move(4);
        //}
        /*if (getY() == 0 || getY() == getWorld().getHeight()-1)
        {
            setRotation(360-getRotation());
        }
        else if (getX()==0 || getX() == getWorld().getWidth()-1)
        {
            setRotation(180-getRotation());
        }*/
        int a = getRotation();
        if( (a < 45 || a > 315) || (a > 135 && a < 225) )
        {
            setRotation(179-getRotation());
        }
        if( (a >= 45 && a <= 135) || (a >= 225 && a <= 315) )
        {
            setRotation(359-getRotation());
        }
    }
        //{
            move(3);
        //}
    } 
}
