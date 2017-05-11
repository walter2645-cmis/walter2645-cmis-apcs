import greenfoot.*;
import java.awt.Color;
public class Player extends CanMove implements HP
{
    private int HP;
    private GreenfootImage img;
    public Player()
    {
        img = new GreenfootImage(25, 25);
        img.setColor(new Color(255, 51, 255));
        img.fill();
        setImage(img);
    }
    public void takeDamage(int damage)
    {
        
    }
    public void movement(int speed)
    {
        if( Greenfoot.isKeyDown("a") )
        {
            move(-speed);
        }//end if
        if( Greenfoot.isKeyDown("d") )
        {
            move(speed);
        }//end if
        if( Greenfoot.isKeyDown("w") )
        {
            setLocation(getX(), getY()-speed);
        }//end if
        if( Greenfoot.isKeyDown("s") )
        {
            setLocation(getX(), getY()+speed);
        }//end if
    }
    public void act() 
    {
        movement(3);
    }    
}