import javax.swing.JOptionPane;
public class hmm
{
    public static void main( String[] args )
    {
        String input = JOptionPane.showInputDialog( "Type a number" );
        int number = Integer.parseInt( input );
        int[] array = new int[ number ];
        System.out.println( "Generating " + number + " random integers from 0 to 99." );
        for( int index = 0; index < array.length; index++ )
        {
            array[ index ] = (int)(Math.random() * 100);
        }//end for
        for( int idx = 0; idx < 100; idx++ )
        {
            String str = "";
            for( int index = 0; index < array.length; index++ )
            {
                if( array[ index ] == idx )
                {
                    str += "#";
                }//end if
            }//end for
            System.out.println( idx + ": " + str );
        }//end for
        int min = 99;
        int max = 0;
        int sum = 0;
        for( int index = 0; index < array.length; index++ )
        {
            sum += array[ index ];
            if( array[ index ] <= min )
            {
                min = array[ index ];
            }//end if
            if( array[ index ] >= max )
            {
                max = array[ index ];
            }//end if
        }//end for
        double avg = sum / (number * 1.0);
        System.out.println( "Minimum number: " + min + "\n" + "Maximum number: " + max + "\n" + "Sum of numbers: " + sum + "\n" + "Average of numbers: " +  avg );
        int[] modearray = new int[99];
        for( int index = 0; index < modearray.length; index++ )
        {
            for( int idx = 0; idx < array.length; idx++ )
            {
                if( index == array[ idx ] )
                {
                    modearray[ index ]++;
                }//end if
            }//end for
        }//end for
        int maxmode = 0;
        for( int index = 0; index < modearray.length; index++ )
        {
            if( modearray[ index ] > maxmode )
            {
                maxmode = modearray[ index ];
            }//end if
        }//end for
        String modeout = "";
        for( int index = 0; index < modearray.length; index++ )
        {
            if( modearray[ index ] == maxmode )
            {
                String strint = Integer.toString( index );
                modeout += strint + " ";
            }//end if
        }//end for
        System.out.println( "Mode(s): " + modeout );
    }//end method main
}//end class hmm