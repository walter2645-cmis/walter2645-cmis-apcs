import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Bong here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Thing extends Actor
{
    private int lipWeight = 1;
    private int botox = 0;
    public Thing()
    {
        GreenfootImage rescale = getImage();
        rescale.scale(30, 24);
        
    }

    public void act()
    {
        flap();
        gravity();
        if( isTouching( Bong.class ) || isAtEdge() )
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
                lipWeight = 1;
                setLocation(getX(), getY()-40);
            }
        }
    }
    
    public void gravity()
    {
        turn(lipWeight);
        if( botox <= 0 )
        {
            lipWeight++;
            botox = 7;
        }
        else
        {
            botox--;
        }
        if( getRotation() > 85 && getRotation() < 180 )
        {
            turn(-lipWeight);
        }
        setLocation(getX(), getY()+lipWeight);
    }
}