public class Problem14
{
    public static void main( String[] args )
    {
        long num = 1l;
        long count = 1l;
        long ans = 1l;
        long res = 0l;
        while( count < 1000000 )
        {
            long cal = num + count;
            System.out.println(cal);
            while( cal > 1 )
            {
                if( cal % 2 == 0 )
                {
                    cal = cal / 2;
                }//end if
                else if( cal % 2 == 1 )
                {
                    cal = (cal * 3) + 1;
                }//end else if
                ans++;
            }//end while
            if( ans > res )
            {
                res = ans;
            }//end if
            ans = 1;
            count++;
        }//end while
        System.out.println(res);
    }//end method main
}//end Problem14