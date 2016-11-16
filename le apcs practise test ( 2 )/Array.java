public class Array
{
    public static void main( String[] args )
    {
        int[][] array = new int[10][10];
        int maxRow = 0;
        int rowI = 0;
        int maxCol = 0;
        int colI = 0;
        int rowTotal = 0;
        int colTotal = 0;
        System.out.println("Row major");
        for( int y = 0; y < array.length; y++ )
        {
            rowTotal = 0;
            for( int  x = 0; x < array[0].length; x++ )
            {
                array[y][x] = (int)(Math.random() * 10);
                System.out.print(array[y][x]);
                rowTotal += array[y][x];
            }//end for
            if( rowTotal > maxRow )
            {
                maxRow = rowTotal;
                rowI = y;
            }//end if
            System.out.print(" " + rowTotal + "\n");
        }//end for
        System.out.println("Column major");
        for( int y = 0; y < array[0].length; y++ )
        {
            colTotal = 0;
            for( int x = 0; x < array.length; x++ )
            {
                System.out.print(array[x][y]);
                colTotal += array[x][y];
            }//end for
            if( colTotal > maxCol )
            {
                maxCol = colTotal;
                colI = y;
            }//end if
            System.out.print(" " + colTotal + "\n");
        }//end for
        System.out.println(rowI + " " + colI);
    }//end method main
}//end class Array