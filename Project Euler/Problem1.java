public class Problem1
{
    public static void main( String[] args )
    {
        int num = 999;
        int total = 0;
        while( num > 0 )
        {
            boolean three = num % 3 == 0;
            boolean five = num % 5 == 0;
            if( three || five )
            {
                total += num;
            }//end if
            num--;
        }//end while
        System.out.println(total);
    }//end method main
}//end class Problem1