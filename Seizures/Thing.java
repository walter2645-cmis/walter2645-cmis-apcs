import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.awt.Color;

public class Thing extends Actor
{
    private GreenfootImage img,alt;

    public Thing(){
        img = new GreenfootImage(250,250);
        img.setColor(Color.red);
        img.fill();
        alt = new GreenfootImage(img);
        img.setColor(Color.cyan);
        img.fillRect(62,62,125,125);
        img.fillRect(125, 0, 1, 250);
        img.fillRect( 0,125,250,1 );
        Color myColor = new Color(0xff33ff);
        myColor = myColor.brighter();
        img.setColor(myColor);
        img.fillOval(62,62,125,125);

        alt.setColor(Color.yellow);
        alt.drawRect(10,10, 29,29);

        setImage(img);
    }

    public void act() 
    {
        changeImage();
    }    

    public void changeImage(){
        String key = Greenfoot.getKey();
        if(key != null){
            if( key.equals("c")){
                setImage(getImage() == img ? alt : img);
            }
        }
    }
}