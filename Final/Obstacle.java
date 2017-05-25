import greenfoot.*;
import java.util.*;
import java.awt.Color;
public class Obstacle extends CantMove implements HP
{
    private GreenfootImage img;
    private int HP;
    public Obstacle(int x, int y, int HP)
    {
        img = new GreenfootImage(x, y);
        img.setColor(new Color(140, 72, 159));
        img.fill();
        setImage(img);
        this.HP = HP;
    }

    public void takeDamage()
    {
        List<Projectile> bullets = getIntersectingObjects(Projectile.class);
        MyWorld w = (MyWorld)getWorld();
        for( Projectile pebble : bullets )
        {
            
        }
    }

    public void act()
    {

    }
}
