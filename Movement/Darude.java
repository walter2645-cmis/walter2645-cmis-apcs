import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Darude here.
 * 
 * @author (your name)
 * @version (a version number or a date)
 */

public class Darude extends Actor
{
    private int decision = Greenfoot.getRandomNumber(4);
    /**
     * Act - do whatever the Darude wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        if( Greenfoot.getRandomNumber(100) < 7 )
        {
            decision = Greenfoot.getRandomNumber(4);
        }//end if
        if( decision == 0 )
        {
            move(-4);
        }//end if
        else if( decision == 1 )
        {
            move(4);
        }//end else if
        else if( decision == 2 )
        {
            setLocation(getX(), getY()-4);
        }//end else if
        else if( decision == 3 )
        {
            setLocation(getX(), getY()+4);
        }//end else if
    }
}
