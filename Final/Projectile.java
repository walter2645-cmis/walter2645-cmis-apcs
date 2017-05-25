import greenfoot.*;
import java.awt.Color;
public class Projectile extends Actor
{
    private GreenfootImage img;
    private int x, y;
    private boolean aim = true;
    private int damage;
    private int team;
    private Color color;
    public Projectile(int x, int y, Color color, int damage, int team)
    {
        img = new GreenfootImage(20, 3);
        setImage(new GreenfootImage(1, 1));
        this.color = color;
        this.x = x;
        this.y = y;
        this.damage = damage;
        this.team = team;
    }

    public void movement(int speed)
    {
        move(speed);
    }

    public void aim()
    {
        if( aim )
        {
            img.setColor(color);
            img.fill();
            setImage(img);
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

    public int getTeam()
    {
        return team;
    }
}