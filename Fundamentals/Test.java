import javax.swing.JOptionPane;
public class Test
{
    public static void main( String[] args )
    {
        int number = Integer.parseInt( JOptionPane.showInputDialog( "Type a number" ) );
        double[] array = new double[ number ];
        for( int index = 0; index < array.length; index++ )
        {
            array[ index ] = (Math.random() * 50) + 1;
            System.out.println( index + ": " + array[ index ]);
        }//end for
        for( int index = array.length - 1; index >= 0; index-- )
        {
            String str = "";
            if( (int)(array[ index ]) % 2 == 0)
            {
                double count = array[ index ];
                while( count >= 1 )
                {
                    str += "E";
                    count--;
                }//end while
            }//end if
            if( (int)(array[ index ]) % 2 == 1)
            {
                double count = array[ index ];
                while( count >= 1 )
                {
                    str += "O";
                    count--;
                }//end while
            }//end if
            System.out.println( index + ": " + str + array[ index ] );
        }//end for
    }//end method main
}//end class Test