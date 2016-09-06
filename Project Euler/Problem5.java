public class Problem5
{
    public static void main( String[] args )
    {
        int num = 1;
        boolean check = true;
        while( check )
        {
            boolean one = num % 1 == 0;
            boolean two = num % 2 == 0;
            boolean three = num % 3 == 0;
            boolean four = num % 4 == 0;
            boolean five = num % 5 == 0;
            boolean six = num % 6 == 0;
            boolean seven = num % 7 == 0;
            boolean eight = num % 8 == 0;
            boolean nine = num % 9 == 0;
            boolean ten = num % 10 == 0;
            boolean eleven = num % 11 == 0;
            boolean twelve = num % 12 == 0;
            boolean thirteen = num % 13 == 0;
            boolean fourteen = num % 14 == 0;
            boolean fifteen = num % 15 == 0;
            boolean sixteen = num % 16 == 0;
            boolean seventeen = num % 17 == 0;
            boolean eighteen = num % 18 == 0;
            boolean nineteen = num % 19 == 0;
            boolean twenty = num % 20 == 0;
            if( one && two && three && four && five && six && seven && eight && nine && ten && eleven && twelve && thirteen && fourteen && fifteen && sixteen && seventeen && eighteen && nineteen && twenty )
            {
                System.out.println(num);
                check = false;
            }//end if
            num++;
        }//end while
    }//end method main
}//end class Problem5