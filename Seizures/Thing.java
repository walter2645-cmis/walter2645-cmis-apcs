import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Bong here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Thing extends Actor
{
    private int cheese = 1;
    private int slow = 0;
    public Thing()
    {
        GreenfootImage rescale = getImage();
        rescale.scale(30, 24);
        
    }

    public void act()
    {
        flap();
        gravity();
        if( isTouching( null ) || isAtEdge() )
        {
            Greenfoot.stop();
        }
    }
    
    public void flap()
    {
        String key = Greenfoot.getKey();
        if(key != null){
            if( key.equals("space")){
                setRotation(315);
                cheese = 1;
                setLocation(getX(), getY()-40);
            }
        }
    }
    
    public void gravity()
    {
        turn(cheese);
        if( slow <= 0 )
        {
            cheese++;
            slow = 7;
        }
        else
        {
            slow--;
        }
        if( getRotation() > 85 && getRotation() < 180 )
        {
            turn(-cheese);
        }
        setLocation(getX(), getY()+cheese);
    }
}