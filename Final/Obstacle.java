import greenfoot.*;
import java.awt.Color;
public class Obstacle extends CantMove implements HP
{
    private GreenfootImage img;
    public Obstacle(int x, int y)
    {
        img = new GreenfootImage(x, y);
        img.setColor(new Color(140, 72, 159));
        img.fill();
        setImage(img);
    }

    public void takeDamage()
    {

    }

    public void act()
    {

    }
}
