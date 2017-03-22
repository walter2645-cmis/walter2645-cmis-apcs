import greenfoot.*; 
import java.util.*;
public class MyWorld extends World
{
    private long startTime;
    private long runningTime;
    private int level = 1;
    private int score = 0;
    private int time;
    private int rats = 0;
    private Exterminator e;
    private long now;
    private int tick = 1;
    public MyWorld()
    {
        super(600, 400, 1); 
        init(level);
        now = System.currentTimeMillis();
    }

    public void init(int level){
        List<Actor> actors = getObjects(null);
        for(Actor a: actors){
            removeObject(a);
        }
        for(int i=0; i<level; i++){
            addObject(new Rat(), 50, Greenfoot.getRandomNumber(400));
        }
        e = new Exterminator();
        addObject(e, 520, 200);
        addObject(new Trap(), 550, 200);
        startTime = System.currentTimeMillis();
        now = System.currentTimeMillis();
        tick = 1;
    }

    public void act(){
        runningTime = System.currentTimeMillis() - startTime;
        time = (int)(15 -(runningTime/1000.0));
        if(getObjects(Rat.class).size() == 0){
            init(level++);
        }
        if(Greenfoot.getRandomNumber(10000) <= getObjects(Rat.class).size() )
        {
            addObject(new RatDisease(), Greenfoot.getRandomNumber(600), Greenfoot.getRandomNumber(400));
        }

        if( System.currentTimeMillis() > now + (15000 * tick) )
        {
            addObject(new Rat(), 0, Greenfoot.getRandomNumber(400));
            tick++;
        }
        showText(score+"  "+time, 50, 50);

    }
    
    public void killRats()
    {
        List<Rat> ratPack = getObjects(Rat.class);
        for( Rat r : ratPack )
        {
            if( !r.cheesy() )
            {
                removeObject(r);
            }
        }
    }
    
    public int getLife()
    {
        return rats;
    }

    public void setLife()
    {
        rats = 0;
    }

    public void addCheese(int x, int y){
        addObject(new Cheese(), x, y);
    }

    public void ratKilled()
    {
        rats++;
    }

    public void score(){
        score++;
    }

    public void addChance()
    {
        e.addLife();
    }
    
    public void lose(){
        if( e.getLife() == 0 )
        {
            showText("Game Over!!", 300, 200);
            Greenfoot.stop();
        }
        else
        {
            e.setLocation(550, 200);
            e.sadLife();
        }
    }
}
