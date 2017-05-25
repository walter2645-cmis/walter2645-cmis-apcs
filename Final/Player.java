import greenfoot.*;
import java.util.*;
import java.awt.Color;
public class Player extends CanMove implements HP
{
    private int HP;
    private GreenfootImage img;
    private int spf;//shots per frame
    private int shot;
    public Player()
    {
        img = new GreenfootImage(13, 13);
        img.setColor(new Color(255, 51, 255));
        img.fill();
        setImage(img);
        spf = 10;
        shot = spf;
    }

    public void shoot()
    {
        shot--;
        if( shot < 0 )
        {
            MouseInfo pointer = Greenfoot.getMouseInfo();
            if( pointer != null )
            {
                Projectile nerf = new Projectile(pointer.getX(), pointer.getY(), new Color(255, 51, 255), 5, 1);
                getWorld().addObject(nerf, getX(), getY());
                shot = spf;
            }
        }
    }

    public int getSpf()
    {
        return spf;
    }

    public void setSpf(int change)
    {
        spf += change;
    }

    public void takeDamage()
    {
        List<Projectile> bullets = getObjectsInRange(7, Projectile.class);
        if( bullets.size() == 1 )
        {
            Projectile imhit = bullets.get(0);
            if( imhit.getTeam() != 1 )
            {
                int damage = imhit.getDamage();
                HP -= damage;
                MyWorld w = (MyWorld)getWorld();
                w.removeObject(imhit);
            }
        }
    }

    public void movement(int speed)
    {
        if( Greenfoot.isKeyDown("a") )
        {
            move(-speed);
        }
        if( Greenfoot.isKeyDown("d") )
        {
            move(speed);
        }
        if( Greenfoot.isKeyDown("w") )
        {
            setLocation(getX(), getY()-speed);
        }
        if( Greenfoot.isKeyDown("s") )
        {
            setLocation(getX(), getY()+speed);
        }
    }

    public void act() 
    {
        movement(2);
        shoot();
        takeDamage();
    }
}