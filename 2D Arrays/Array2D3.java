import javax.swing.JOptionPane;
public class Array2D3
{
    public static void main( String[] args )
    {
        int num = Integer.parseInt(JOptionPane.showInputDialog("Type a number.")) + 1;
        int[][] array = new int[num][num];
        for( int y = 0; y < array.length; y++ )
        {
            for( int x = 0; x < array[0].length; x++ )
            {
                if( y == 0 )
                {
                    array[0][x] = x;
                }//end if
                else if( x == 0 )
                {
                    array[y][0] = y;
                }//end else if
                else
                {
                    array[y][x] = x * y;
                }//end else
                System.out.format("%-9d", array[y][x]);
            }//end for
            System.out.print("\n");
        }//end for
    }//end method main
}//end class Array2D3