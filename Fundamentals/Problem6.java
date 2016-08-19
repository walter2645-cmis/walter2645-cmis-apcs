public class Problem6
{
    public static void main( String[] args )
    {
        int[] fiddy = new int[50];
        for( int index = 0; index < fiddy.length; index++ )
        {
            double num = Math.random();
            fiddy[ index ] = (int)(num * 100);
        }//end for
        for(int index = 0; index < fiddy.length; index++ )
        {
            System.out.print(fiddy[ index ] + ", ");
        }//end for
    }//end method main
}//end class Problem6