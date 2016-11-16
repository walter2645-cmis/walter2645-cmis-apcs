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
    
    public double getRaidBoss()
    {
        double maxLife = -1;
        Alien raidBoss = null;
        for( int index = 0; index < aliens.length; index++)
        {
            System.out.println(aliens[index].getLife());
            if( aliens[index].getLife() > maxLife)
            {
                maxLife = aliens[index].getLife();
            }
        }
        for( int index = 0; index < aliens.length; index++)
        {
            if( aliens[index].getLife() == maxLife )
            {
                raidBoss = aliens[index];
                index += aliens.length;
            }
        }
        return raidBoss.getLife();
    }
    public static void main( String[] args )
    {
        SpaceShip sky = new SpaceShip( 1, 15 );
        sky.addAliens();
        System.out.println(sky.getRaidBoss());
    }
}