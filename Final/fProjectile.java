import greenfoot.*;
import java.awt.Color;
public class fProjectile extends Projectile
{
    private GreenfootImage img;
    private int x, y;
    private boolean aim = true;
    private int damage;
    public fProjectile(int x, int y, Color color, int damage)
    {
        img = new GreenfootImage(20, 3);
        img.setColor(color);
        img.fill();
        setImage(img);
        this.x = x;
        this.y = y;
        this.damage = damage;
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
    
    public int getDamage()
    {
        return damage;
    }
    
    public void setDamage(int newDamage)
    {
        damage = newDamage;
    }
}
