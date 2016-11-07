public class Array2D1
{
    public static void main( String[] args )
    {
        int[][] array = new int[3][4];
        for( int y = 0; y < array.length; y++ )
        {
            for( int x = 0; x < array[0].length; x++ )
            {
                array[y][x] = (int)(Math.random() * 9);
            }//end for
        }//end for
        String five = "";
        for( int y = 0; y < array.length; y++ )
        {
            for( int x = 0; x < array[0].length; x++ )
            {
                System.out.print(array[y][x] + " ");
                if( array[y][x] == 5 )
                {
                    five += "(" + y + ", " + x + ")";
                }//end if
            }//end for
            System.out.print("\n");
        }//end for
        System.out.println(five);
    }//end method main
}//end class Array2D1