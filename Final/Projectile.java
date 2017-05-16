import greenfoot.*;
import java.awt.Color;
public class Projectile extends CanMove
{
    private GreenfootImage img;
    private int x, y;
    private boolean aim = true;
    public Projectile(int x, int y, Color color)
    {
        img = new GreenfootImage(20, 3);
        img.setColor(color);
        img.fill();
        setImage(img);
        this.x = x;
        this.y = y;

    }

    public void movement(int speed)
    {
        move(speed);
    }

    public void aim()
    {
        if( aim )
        {
            turnTowards(x, y);
            aim = false;
        }
    }

    public void edgy()
    {
        if( isAtEdge() )
        {
            MyWorld w = (MyWorld)getWorld();
            w.removeObject(this);
        }
    }
    public void act() 
    {
        movement(6);
        aim();
        edgy();
    }
}
