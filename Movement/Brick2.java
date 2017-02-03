import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Brick here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Brick2 extends Actor
{
    private boolean borderLeft = true;
    private boolean borderRight = true;
    private boolean borderUp = true;
    private boolean borderDown = true;
    /**
     * Act - do whatever the Brick wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        //Mexican();
        if( Greenfoot.isKeyDown("a") && borderLeft )
        {
            move(-4);
        }//end if
        if( Greenfoot.isKeyDown("d") && borderRight )
        {
            move(4);
        }//end if
        if( Greenfoot.isKeyDown("w") && borderUp )
        {
            setLocation(getX(), getY()-4);
        }//end if
        if( Greenfoot.isKeyDown("s") && borderDown)
        {
            setLocation(getX(), getY()+4);
        }//end if
        worldEnd();
    }
    
    
    
    /*public void Mexican()
    {
        boolean upLeft = getOneObjectAtOffset( -25, -25, Trump.class ) != null;
        boolean downLeft = getOneObjectAtOffset( -25, 25, Trump.class ) != null;
        boolean upRight = getOneObjectAtOffset( 25, -25, Trump.class ) != null;
        boolean downRight = getOneObjectAtOffset( 25, 25, Trump.class ) != null;
        boolean left = getOneObjectAtOffset( -25, 0, Trump.class ) != null;
        boolean right = getOneObjectAtOffset( 25, 0, Trump.class ) != null;
        boolean up = getOneObjectAtOffset( 0, -25, Trump.class ) != null;
        boolean down = getOneObjectAtOffset( 0, 25, Trump.class ) != null;
        if( upLeft || downLeft || left )
        {
            borderLeft = false;
        }
        else
        {
            borderLeft = true;
        }
        if( upRight || downRight || right )
        {
            borderRight = false;
        }
        else
        {
            borderRight = true;
        }
        if( downLeft || downRight || down )
        {
            borderDown = false;
        }
        else
        {
            borderDown = true;
        }
        if( upLeft || upRight || up )
        {
            borderUp = false;
        }
        else
        {
            borderUp = true;
        }
    }*/

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