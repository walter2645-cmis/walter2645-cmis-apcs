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
    private int[][] physics = new int[50][50];
    public void act() 
    {
        int ox = getX();
        int oy = getY();
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
        hit(ox, oy);
        if( Greenfoot.isKeyDown("r") )
        {
            setLocation(Greenfoot.getRandomNumber(600), Greenfoot.getRandomNumber(400));
        }//end if
        worldEnd();
    }
    
    public void hit(int ox, int oy)
    {
        for( int y = 0; y < physics.length; y++ )
        {
            for( int x = 0; x < physics[0].length; x++ )
            {
                if( getOneObjectAtOffset(x - 25, y - 25, Trump.class) != null )
                {
                    setLocation(ox, oy);
                }
            }
        }
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