public class Problem9
{
    public static void main( String[] args )
    {
        //pythagorean triple
        for( int a = 1; a < 1000; a++ )
        {
            for( int b = 1; b < 1000; b++ )
            {
                double c = Math.sqrt( a * a + b  * b );
                int d = (int)(c);
                if( c == d )
                {
                    
                }//end if
            }//end for
        }//end for
    }//end method main
}//end class Problem9