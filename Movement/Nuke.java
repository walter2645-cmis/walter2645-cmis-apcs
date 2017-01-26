import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Nuke here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Nuke extends Actor
{
    /**
     * Act - do whatever the Nuke wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    private boolean leader;
    private int decision = Greenfoot.getRandomNumber(3);
    private Actor katyperry;
    public Nuke(boolean status, Actor katyperry)
    {
        this.leader = status;
        this.katyperry = katyperry;
    }

    public void act() 
    {
        if( leader )
        {
            if(Greenfoot.getRandomNumber(100) < 13 )
            {
                decision = Greenfoot.getRandomNumber(3);
            }//end if
            if( getX() > getWorld().getWidth() - 3 )
            {
                turnTowards(3, getY());
                move(2);
            }
            else if( getX() < 3 )
            {
                turnTowards(getWorld().getWidth() - 3, getY());
                move(2);
            }
            else if( getY() > getWorld().getHeight() - 3 )
            {
                turnTowards(getX(), 3);
                move(2);
            }
            else if( getY() < 3 )
            {
                turnTowards(getX(), getWorld().getHeight() - 3);
                move(2);
            }
            else if( decision == 0 )
            {
                turn(-3);
                move(2);
            }//end if
            else if( decision == 1 )
            {
                turn(3);
                move(2);
            }//end else if
            else if( decision == 2 )
            {
                move(2);
            }//end else if
        }
        else
        {
            if( intersects( katyperry ) )
            {

            }
            else
            {
                turnTowards(katyperry.getX(), katyperry.getY());
                move(2);
            }
        }
    }
}
