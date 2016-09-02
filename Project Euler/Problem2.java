public class Problem2
{
    public static void main( String[] args )
    {
        int a = 1;
        int b = 2;
        int c = 0;
        int total = 0;
        while( b < 4000000 )
        {
            if( b % 2 == 0 )
            {
                total += b;
            }//end if
            c = a + b;
            a = b;
            b = c;
        }//end while
        System.out.println(total);
    }//end method main
}//end class Problem2