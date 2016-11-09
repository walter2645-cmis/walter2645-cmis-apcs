import javax.swing.JOptionPane;
public class Array2D4
{
    public static void main( String[] args )
    {
        String input = JOptionPane.showInputDialog("0) Lower case\n1) Upper case\n2) 0-9 digits");
        char letter = 0;
        char stop = 0;
        int reset = 0;
        int row = Integer.parseInt(JOptionPane.showInputDialog("Number of rows: "));
        int col = Integer.parseInt(JOptionPane.showInputDialog("Number of columns: "));
        if( input.equals("0") )
        {
            letter = 97;
            stop = 122;
            reset = 26;
            System.out.println("Lower-Case Letters Grid.");
        }//end if
        else if( input.equals("1") )
        {
            letter = 65;
            stop = 90;
            reset = 26;
            System.out.println("Upper-Case Letters Grid.");
        }//end else if
        else if( input.equals("2") )
        {
            letter = 48;
            stop = 57;
            reset = 10;
            System.out.println("0-9 Digits Grid.");
        }//end else if
        char[][] array = new char[row][col];
        for( int y = 0; y < array.length; y++ )
        {
            for( int x = 0; x < array[0].length; x++ )
            {
                array[y][x] = letter;
                String output = "";
                //if( x % 3 == y % 2 )
                //{
                    output = String.valueOf(array[y][x]);
                //}//end if
                //else
                //{
                //    output = "     ";
                //}//end else
                System.out.print(output);
                if( letter == stop )
                {
                    letter -= reset;
                }//end if
                letter++;
            }//end for
            System.out.print("\n");
        }//end for
    }//end method main
}//end class Array2D4
//https://www.cs.cmu.edu/~pattis/15-1XX/common/handouts/ascii.html