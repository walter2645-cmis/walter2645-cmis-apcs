package Problem3;
import java.util.List;
import java.util.ArrayList;
public class SuperHeroDriver
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
        System.out.println("Original set of ArrayList heroes...");
        for( SuperHero dis : heroes )
        {
            System.out.format("%-25s%-8s%-10s%s%n", dis, dis.isCaped(), dis.getSuitColor(), dis.motto());
        }//end for
        SuperHero[][] capedHeroes = new SuperHero[3][3];
        for( int y = 0; y < capedHeroes.length; y++ )
        {
            for( int x = 0; x < capedHeroes[0].length; x++ )
            {
                for( int i = 0; i < heroes.size(); i++ )
                {
                    SuperHero determination = heroes.get(i);
                    if( determination.isCaped() )
                    {
                        capedHeroes[y][x] = determination;
                        heroes.remove(i);
                        i+= heroes.size();
                    }//end if
                }//end for
            }//end for
        }//end for
        System.out.println("\n\nPrinting 2D Array capedHeroes...");
        for( int y = 0; y < capedHeroes.length; y++ )
        {
            for( int x = 0; x < capedHeroes[0].length; x++ )
            {
                if( capedHeroes[y][x] != null )
                {
                    SuperHero dis = capedHeroes[y][x];
                    System.out.format("%-30s", dis);
                }//end if
                else
                {
                    System.out.format("%-30s", "null");
                }//end else
            }//end for
            System.out.println();
        }//end for
        System.out.println("\n\nPrinting contents of capedHeroes...");
        for( int y = 0; y < capedHeroes.length; y++ )
        {
            for( int x = 0; x < capedHeroes[0].length; x++ )
            {
                if( capedHeroes[y][x] != null )
                {
                    SuperHero dis = capedHeroes[y][x];
                    System.out.format("%-25s%-8s%-10s%s%n", dis, dis.isCaped(), dis.getSuitColor(), dis.motto());
                }//end if
            }//end for
        }//end for
        System.out.println("\n\nRemaining set of ArrayList heroes...");
        for( SuperHero dis : heroes )
        {
            System.out.format("%-25s%-8s%-10s%s%n", dis, dis.isCaped(), dis.getSuitColor(), dis.motto());
        }//end for
    }//end method main
}//end class App