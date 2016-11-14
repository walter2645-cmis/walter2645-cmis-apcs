import javax.swing.JOptionPane;
public class Array2D7
{
    public static void main( String[] args )
    {
        int row = Integer.parseInt(JOptionPane.showInputDialog("How many rows?"));
        int col = Integer.parseInt(JOptionPane.showInputDialog("How many columns?"));
        int[][] gameBoard = new int[row][col];
        int zy = (int)(Math.random() * row);
        int zx = (int)(Math.random() * col);
        boolean bingo = true;
        for( int y = 0; y < gameBoard.length; y++ )
        {
            for( int x = 0; x < gameBoard[0].length; x++ )
            {
                gameBoard[y][x] = (int)(Math.random() * 100 + 1);
                gameBoard[zy][zx] = 0;
            }//end for
        }//end for
        while( bingo )
        {
            for( int y = 0; y < gameBoard.length; y++ )
            {
                for( int x = 0; x < gameBoard[0].length; x++ )
                {
                    if( gameBoard[y][x] < 0 )
                    {
                        System.out.print("N ");
                    }//end if
                    else
                    {
                        System.out.print("X ");
                    }//end else
                }//end for
                System.out.print("\n");
            }//end for
            int iy = Integer.parseInt(JOptionPane.showInputDialog("Row: "));
            int ix = Integer.parseInt(JOptionPane.showInputDialog("Column: "));
            if( gameBoard[iy][ix] == 0 )
            {
                bingo = false;
                System.out.println("BINGO!");
            }//end if
            else
            {
                gameBoard[iy][ix] -= 101;
                int rows0ff = Math.abs(zy - iy);
                int colsOff = Math.abs(zx - ix);
                System.out.println("You are off by " + rows0ff + " row(s) and " + colsOff + " column(s).");
            }//end else
        }//end while
    }//end method main
}//end class Array2D7
