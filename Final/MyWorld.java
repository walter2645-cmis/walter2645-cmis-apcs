import greenfoot.*;
public class MyWorld extends World
{
    public MyWorld()
    {
        super(600, 400, 1);
        populate();
    }
    public void populate()
    {
        addObject(new Player(), 300, 200);
    }
}
