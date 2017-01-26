import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Brick here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Brick extends Actor
{
    private int karma = 50;
    /**
     * Act - do whatever the Brick wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        if( isTouching( Balls.class ) && karma == 0 )
        {
            getWorld().addObject(new Balls(), Greenfoot.getRandomNumber(600), Greenfoot.getRandomNumber(400));
            karma += 50;
        }
        if( Greenfoot.isKeyDown("a") )
        {
            move(-4);
        }//end if
        if( Greenfoot.isKeyDown("d") )
        {
            move(4);
        }//end if
        if( Greenfoot.isKeyDown("w") )
        {
            setLocation(getX(), getY()-4);
        }//end if
        if( Greenfoot.isKeyDown("s") )
        {
            setLocation(getX(), getY()+4);
        }//end if
        karma--;
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
