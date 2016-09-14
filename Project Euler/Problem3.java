public class Problem3
{
    public static void main( String[] args )
    {
        long num = 600851475143l;
        boolean prime = true;
        long res = 0l;
        long count = 0l;
        while( prime )
        {
            long divisible = num - count;
            if( num % divisible == 0 )
            {
                
            }//end if
            count++;
            res = divisible;
        }//end while
        System.out.println(res);
    }//end method main
}//end class Problem3
//https://en.wikipedia.org/wiki/Sieve_of_Eratosthenes