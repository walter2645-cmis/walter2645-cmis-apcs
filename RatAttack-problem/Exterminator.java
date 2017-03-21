import greenfoot.*;
import java.util.*;
public class Exterminator extends Actor
{
    private int cheeseCount;
    private int delay;
    private boolean haveTrap;
    private int newLife;
    private int life;
    public Exterminator(){
        haveTrap = true;
        cheeseCount = 5;
        delay = 0;
        getImage().mirrorVertically();
        turn(180);
        life = 0;
    }

    public void act() 
    {
        die();
        MyWorld w = (MyWorld)(getWorld());
        newLife = w.getLife();
        if( life == 3 )
        {
            w.addObject(new ExtraGuy(), Math.abs(getX() - 600), Math.abs(getY() - 400 ));
            w.setLife();
        }
        if(Greenfoot.isKeyDown("w")){
            move(1);
        }
        if(Greenfoot.isKeyDown("a")){
            turn(-3);
        }
        if(Greenfoot.isKeyDown("d")){
            turn(3);
        }
        if(Greenfoot.isKeyDown("j") && delay-- <= 0){
            dropCheese();
            delay = 25;
        } 
    }    

    public void addLife()
    {
        life++;
    }
    
    public int getLife()
    {
        return life;
    }
    
    public void dropCheese(){
        if(cheeseCount > 0){
            MyWorld w = (MyWorld)getWorld();
            w.addCheese(getX(), getY());
            cheeseCount--;
        }
    }

    public void die(){
        if(isTouching(Rat.class)){
            MyWorld w = (MyWorld)getWorld();
            w.lose();
        }
    }
    
}
