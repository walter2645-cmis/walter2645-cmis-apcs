import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Pizza here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Pizza extends Actor
{
    private int decision = Greenfoot.getRandomNumber(3);
    /**
     * Act - do whatever the Pizza wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        if(Greenfoot.getRandomNumber(100) < 13 )
        {
            decision = Greenfoot.getRandomNumber(3);
        }//end if
        if( decision == 0 )
        {
            turn(-3);
            move(4);
        }//end if
        else if( decision == 1 )
        {
            turn(3);
            move(4);
        }//end else if
        else if( decision == 2 )
        {
            move(4);
        }//end else if
        if( isTouching( Balls.class ) )
        {
            removeTouching( Balls.class );
        }
    }    
}
