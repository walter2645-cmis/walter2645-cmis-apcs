public class SADDSASD
{
    public static void main( String[] args )
    {
        int y = 0;
        for( int x = 0; x < 100; x++ )
        {
            if ( x % 2 == 0 )
            {
                x += 3;
            }
            y += 1;
        }
        boolean a = false;
        boolean b = true;
        boolean x = !(a || b) && !a || b == (!a || b) || (a || !b);
        //System.out.println(y);
        //System.out.println(x);
        
    }//end method main
}//end class SADDSASD