public class Array2D3
{
    public static void main( String[] args )
    {
        
        int[][] array = new int[9][9];
        for( int y = 0; y < array.length; y++ )
        {
            for( int x = 0; x < array[0].length; x++ )
            {
                array[0][x] = x;
                array[y][0] = y;
            }//end for
        }//end for
        for( int y = 0; y < array.length; y++ )
        {
            for( int x = 0; x < array[0].length; x++ )
            {
                System.out.print(array[y][x]);
            }//end for
            System.out.print("\n");
        }//end for
    }//end method main
}//end class Array2D3