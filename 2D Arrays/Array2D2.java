public class Array2D2
{
    public static void main( String[] args )
    {
        int[][] array = new int[3][5];
        int count = 1;
        int total = 0;
        for( int y = 0; y < array.length; y++ )
        {
            int rowTotal = 0;
            for( int x = 0; x < array[0].length; x++ )
            {
                array[y][x] = count++;
                total += array[y][x];
                rowTotal += array[y][x];
            }//end for
            System.out.println("Row " + y + " total: " + rowTotal);
        }//end for
        for( int y = 0; y < array[0].length; y++ )
        {
            int colTotal = 0;
            for( int x = 0; x < array.length; x++ )
            {
                colTotal += array[x][y];
            }//end for
            System.out.println("Column " + y + " total: " + colTotal);
        }//end for
        System.out.println("Grand total: " + total);
    }//end method main
}//end class Array2D2