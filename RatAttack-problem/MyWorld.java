import greenfoot.*; 
import java.util.*;
public class MyWorld extends World
{
    private long startTime;
    private long runningTime;
    private int level = 1;
    private int score = 0;
    private int time;
    private int life = 0;
    public MyWorld()
    {
        super(600, 400, 1); 
        init(level);
    }

    public void init(int level){
        List<Actor> actors = getObjects(null);
        for(Actor a: actors){
            removeObject(a);
        }
        for(int i=0; i<level; i++){
            addObject(new Rat(), 50, Greenfoot.getRandomNumber(400));
        }
        addObject(new Exterminator(), 520, 200);
        addObject(new Trap(), 550, 200);
        startTime = System.currentTimeMillis();
        
    }
    
    public void act(){
        runningTime = System.currentTimeMillis() - startTime;
        time = (int)(15 -(runningTime/1000.0));
        if(getObjects(Rat.class).size() == 0){
            init(level++);
        }
        if( life == 3 )
        {
            life = 0;
            //addObject(new ExtraGuy(), Math.abs
        }
        showText(score+"  "+time, 50, 50);
        

    }
    

    public void addCheese(int x, int y){
        addObject(new Cheese(), x, y);
    }

    public void ratKilled()
    {
        life++;
    }

    public void score(){
        score++;
    }

    public void lose(){
        showText("Game Over!!", 300, 200);
        Greenfoot.stop();
    }
}
