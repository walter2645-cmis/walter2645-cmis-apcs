import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Brick here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Brick2 extends Actor
{
    /**
     * Act - do whatever the Brick wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        if( Greenfoot.isKeyDown("a") )
        {
            if( isTouching( Trump.class ) )
            {
                move(1);
            }
            else
            {
                move(-1);
            }
        }//end if
        if( Greenfoot.isKeyDown("d") )
        {
            if( isTouching( Trump.class ) )
            {
                move(-1);
            }
            else
            {
                move(1);
            }
        }//end if
        if( Greenfoot.isKeyDown("w") )
        {
            if( isTouching( Trump.class ) )
            {
                setLocation(getX(), getY()+1);
            }
            else{
                setLocation(getX(), getY()-1);
            }
        }//end if
        if( Greenfoot.isKeyDown("s") )
        {
            if( isTouching( Trump.class ) )
            {
                setLocation(getX(), getY()-1);
            }
            else
            {
                setLocation(getX(), getY()+1);
            }
        }//end if
        worldEnd();
    }

    public void worldEnd()
    {
        if( getX() > getWorld().getWidth() - 3 )
        {
            setLocation(3, getY());
        }
        if( getX() < 3 )
        {
            setLocation(getWorld().getWidth() - 3, getY());
        }
        if( getY() > getWorld().getHeight() - 3 )
        {
            setLocation(getX(), 3);
        }
        if( getY() < 3 )
        {
            setLocation(getX(), getWorld().getHeight() - 3);
        }
    }
}