import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.awt.Color;

/**
 * Write a description of class Bong here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Thing extends Actor
{
    public Thing()
    {
        GreenfootImage rescale = getImage();
        rescale.scale(20, 16);
        
    }

    public void act()
    {
        flap();
        gravity();
    }
    
    public void flap()
    {
        String key = Greenfoot.getKey();
        if(key != null){
            if( key.equals("space")){
                turn(-45);
            }
        }
    }
    
    public void gravity()
    {
        
    }
}