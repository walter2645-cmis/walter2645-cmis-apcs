public class Problem139
{
    public static void main( String[] args )
    {
        long count = 0l;
        int a = 1;
        int b = 1;
        double c = 0;
        while( (a + b + c) * 4 < 100000000 )
        {
            while( (a + b + c) * 4 < 100000000 )
            {
                c = Math.sqrt( a * a + b  * b );
                int d = (int)(c);
                if( c - d == 0 && d % (b - a) == 0 )
                {
                    count++;
                }//end if
                b++;
            }//end for
            a++;
        }//end for
        System.out.println(count);
        int a1 = 3;
        int b1 = 4;
        double c1 = Math.sqrt( a1 * a1 + b1 * b1 );
        int d1 = (int)(c1);
        if( c1 - d1 == 0 && d1 % (b1 - a1) == 0 )
        {
            //System.out.println("sdfa");
        }//end if
    }//end method main
}//end class Problem139