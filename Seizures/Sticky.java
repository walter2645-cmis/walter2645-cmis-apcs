import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Sticky here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Sticky extends Actor
{
    public Sticky()
    {
        GreenfootImage rescale = getImage();
        rescale.scale(38, 19);
    }

    public void act() 
    {
        move(-6);
    }    
}
