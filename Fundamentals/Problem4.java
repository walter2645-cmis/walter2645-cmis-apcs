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
        for( int num = 1; num <= 10; num++ )
        {
            System.out.println(num + "\t" + square(num) + "\t" + (int)((double)(square(num) - num) * Math.random() + num));
        }//end for
    }//end method main
}//end class Problem4