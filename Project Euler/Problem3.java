public class Problem3
{
    public static void main( String[] args )
    {
        long num = 600851475143l;
        boolean prime = true;
        long res = 0l;
        while( prime )
        {
            long count = 0l;
            long divisible = num - count;
            if( num % divisible == 0 )
            {
                System.out.println(divisible);
                long primecheck = 2l;
                while( primecheck < divisible )
                {
                    if( divisible % primecheck == 0 )
                    {
                        primecheck += divisible;
                    }//end if
                    else if( primecheck == divisible - 1 )
                    {
                        prime = true;
                    }//end else if
                    primecheck++;
                }//end while
            }//end if
            count++;
            res = divisible;
        }//end while
        System.out.println(res);
    }//end method main
}//end class Problem3