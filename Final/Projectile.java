import greenfoot.*;
import java.awt.Color;
public class Projectile extends CanMove
{
    private GreenfootImage img;
    public Projectile(int x, int y, Color color)
    {
        img = new GreenfootImage(20, 3);
        img.setColor(color);
        img.fill();
        setImage(img);
        turnTowards(x, y);
        
    }
    public void movement(int speed)
    {
        move(speed);
    }
    public void act() 
    {
        movement(5);
    }
}
