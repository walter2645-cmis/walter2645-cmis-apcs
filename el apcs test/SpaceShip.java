public class SpaceShip
{
    private Alien[] aliens;
    public SpaceShip(int maxSpeed, int maxAliens)
    {
        this.aliens = new Alien[maxAliens];
    }
    
    public void addAliens()
    {
        for ( int i = 0; i < aliens.length; i++)
        {
            aliens[i] = new Alien();
        }
    }
    
    public Alien getRaidBoss()
    {
        int maxLife = -1;
        Alien raidBoss;
        for( int index = 0; index < aliens.length; index++)
        {
            if( aliens[index].getlife() > maxLife)
            {
                maxLife = aliens[index].getLife();
            }
        }
    }
}