package Problem3;
import java.util.List;
import java.util.ArrayList;
public class App
{
    public static void main( String[] args )
    {
        AsteroidMan a = new AsteroidMan( "Brown", true );
        FriedEggMan f = new FriedEggMan( "Yellow", true );
        Sans s = new Sans( "Black", false );
        ArrayList<SuperHero> heroes = new ArrayList<SuperHero>();
        heroes.add(a);
        heroes.add(f);
        heroes.add(s);
        for( SuperHero dis : heroes )
        {
            System.out.format("%-25s%-8s%-10s%s%n", dis, dis.isCaped(), dis.getSuitColor(), dis.motto());
        }//end for
        SuperHero[][] capedHeroes = new SuperHero[3][3];
        for( int
    }//end method main
}//end class App