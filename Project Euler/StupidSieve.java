public class StupidSieve
{
    public static void main( String[] args )
    {
        long num = 600851475143l;
        double rt = Math.sqrt(num);
        int rtnum = (int)(rt);
        boolean[] sieve = new boolean[ 100000000 ];
        for( int index = 0; index < sieve.length; index++ )
        {
            sieve[ index ] = true;
        }//end for
        for( int index = 2; index < rtnum; index++)
        {
            if( sieve[ index ] )
            {
                int count = 0;
                for( int wat = (int)(Math.pow( index, 2 )) + count * index; wat < 100000000; count++ )
                {
                    sieve[ index ] = false;
                }//end for
            }//end if
        }//end for
        for( int index = 0; index < sieve.length; index++ )
        {
            if( sieve[ index ] )
            {
                System.out.println(index);
            }//end if
        }//end for
    }//end method main
}//end class StupidSieve