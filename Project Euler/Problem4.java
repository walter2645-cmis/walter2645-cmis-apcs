public class Problem4
{
    public static void main( String[] args )
    {
        int[][] array = new int[999][999];
        int big = 0;
        for( int y = array.length - 1; y > 1; y-- )
        {
            for( int x = array[0].length - 1; x > 1; x-- )
            {
                array[y][x] = (y + 1) * (x + 1);
                char[] num = ("" + array[y][x]).toCharArray();
                int zero = 0;
                int i = num.length - 1;
                boolean ayy = true;
                while( ayy )
                {
                    if( zero > i )
                    {
                        ayy = false;
                        if( array[y][x] > big )
                        {
                            big = array[y][x];
                        }//end if
                        x -= array[0].length;
                    }//end if
                    else if( zero == i - 1 && num[zero] == num[i] )
                    {
                        ayy = false;
                        if( array[y][x] > big )
                        {
                            big = array[y][x];
                        }//end if
                        x -= array[0].length;
                    }//end else if
                    else if( num[zero] != num[i] )
                    {
                        ayy = false;
                    }//end else if
                    zero++;
                    i--;
                }//end while

            }//end for
        }//end for
        System.out.println( big );
    }//end method main
}//end class Problem4