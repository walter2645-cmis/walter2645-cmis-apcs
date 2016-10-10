public class Alien
{
    int life;
    double theForce;
    public Alien()
    {
        life = (int)(Math.random() * 100);
        theForce = Math.random();
    }
    
    public double getLife()
    {
        return this.life;
    }
    
    public boolean isDead()
    {
        return life < 0;
    }
}