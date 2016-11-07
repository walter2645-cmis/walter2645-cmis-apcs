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
            System.out.println(rowTotal);
        }//end for
        System.out.println(total);
    }//end method main
}//end class Array2D2