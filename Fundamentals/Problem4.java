public class Problem4
{
    public static int square(int x)
    {
        int result = x * x;
        return result;
    }//end method square
    public static void main( String[] args )
    {
        int[] range = new int[10];
        for( int index = 0; index < range.length; index++ )
        {
            range[ index ] = index + 1;
        }//end for
        for( int index = 0; index < range.length; index++ )
        {
            System.out.println(range[ index ] + "\t" + square(range[ index ]) + "\t" + (int)((double)(square(range[ index ]) - range[ index ]) * Math.random() + range[ index ]));
        }//end for
    }//end method main
}//end class Problem4