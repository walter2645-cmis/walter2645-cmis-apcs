public class Problem8
{
    public static void main( String[] args )
    {
        String[] notMJ = new String[3];
        notMJ[ 0 ] = "GlitchxCity";
        notMJ[ 1 ] = "ClariS";
        notMJ[ 2 ] = "Kalafina";
        for( int index = 0; index < notMJ.length; index++ )
        {
            System.out.println(notMJ[ index ]);
        }//end for
        double slotamt = 1.0 / notMJ.length;
        notMJ[ (int)(Math.random() * slotamt) ] = "Michael Jackson";
        for( int index = 0; index < notMJ.length; index++ )
        {
            System.out.println(notMJ[ index ]);
        }//end for
        for( int index = 0; index < notMJ.length; index++ )
        {
            if( notMJ[ index ] == "Michael Jackson" )
            {
                System.out.println("We found Michael!");
            }//end if
            else
            {
                System.out.println("No Michael found in music " + index);
            }//end else
        }//end for
    }//end method main
}//end class Problem8