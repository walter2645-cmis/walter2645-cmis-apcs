public class Problem14
{
    public static void main( String[] args )
    {
        long num = 0l;
        long count = 1l;
        int ans = 2;
        int res = 0;
        while( count < 1000000 )
        {
            long cal = num + count;
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
                System.out.println(count);
            }//end if
            ans = 2;
            count++;
        }//end while
        System.out.println(res);
    }//end method main
}//end Problem14