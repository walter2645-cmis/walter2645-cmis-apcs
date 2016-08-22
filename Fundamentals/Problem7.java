public class Problem7
{
    public static void main( String[] args )
    {
        int[] ten = new int[10];
        for( int index = 0; index < ten.length; index++ )
        {
            double num = Math.random() * 101;
            double chance = Math.random();
            if ( chance > 0.49 )
            {
                ten[ index ] = (int)(num);
            }//end if
            else
            {
                ten[ index ] = (int)(num) * -1;
            }//end else
        }//end for
        for( int index = 0; index < ten.length; index++ )
        {
            System.out.print(ten[ index ] + ", ");
        }//end for
        System.out.println();
        for( int index = 0; index < ten.length; index++ )
        {
            if( ten[ index ] >= 0 )
            {
                System.out.print(ten[ index ] + ", ");
            }
        }//end for
    }//end method main
}//end Problem7