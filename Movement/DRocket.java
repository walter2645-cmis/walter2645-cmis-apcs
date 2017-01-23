import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class DRocket here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class DRocket extends Actor
{
    /**
     * Act - do whatever the DRocket wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        if( Greenfoot.isKeyDown("left") )
        {
            turn(-3);
        }//end if
        if( Greenfoot.isKeyDown("right") )
        {
            turn(3);
        }//end if
        if( Greenfoot.isKeyDown("up") )
        {
            move(4);
        }//end if
        if( Greenfoot.isKeyDown("down") )
        {
            move(-4);
        }//end if
    }//end method act
}//end class DRocket
