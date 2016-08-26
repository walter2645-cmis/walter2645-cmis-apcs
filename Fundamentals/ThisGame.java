import java.util.Scanner;
public class ThisGame
{
    public static int[] traplocation()
    {
        int trapy = (int)(Math.random()*20);
        int trapx = (int)(Math.random()*20);
        int[] traps = {trapy, trapx};
        return traps;
    }//end method foodnadtraps
    public static void main( String[] args )
    {
        int[] l = {10, 10};
        int foody = (int)(Math.random()*20);
        int foodx = (int)(Math.random()*20);
        int[] food = {foody, foodx};
        int[] trap = traplocation();
        int h = 20, w = 20, y = 0, x = 0;
        int score = 0;
        int steps = 0;
        String i = "", m = "";
        Scanner s = new Scanner(System.in);
        while( !i.equals("q") )
        {
            m = "";
            y = 0;
            while( y < h )
            {
                x = 0;
                while( x < w )
                {
                    if( l[ 0 ] == food[ 0 ] && l[ 1 ] == food[ 1 ] )
                    {
                        food[ 0 ] = (int)(Math.random()*20);
                        food[ 1 ] = (int)(Math.random()*20);
                        score++;
                    }//end if
                    else if( x == l[ 0 ] && y == l[ 1 ] )
                    {
                        m += "+";
                    }//end else if
                    else if( x == food[ 0 ] && y == food[ 1 ])
                    {
                        m += "*";
                    }//end else if
                    else
                    {
                        m += ".";
                    }//end else
                    x++;
                }//end while
                m += "\n";
                y++;
            }//end while
            System.out.print(m + "========================================\nYou have taken " + steps + " steps.\nYour Score so far is:" + score + "\n");
            i = s.nextLine();
            if( i.equals("w") )
            {
                l[ 1 ]--;
                steps++;
            }//end if
            else if( i.equals("s") )
            {
                l[ 1 ]++;
                steps++;
            }//end else if
            else if( i.equals("a") )
            {
                l[ 0 ]--;
                steps++;
            }//end else if
            else if( i.equals("d" ) )
            {
                l[ 0 ]++;
                steps++;
            }//end else if
        }//end while
    }//end method main
}//end class ThisGame