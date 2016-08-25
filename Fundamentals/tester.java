public class tester
{
    public static void main( String[] args )
    {
        int[] asd = new int[1000000];
        for( int index = 0; index < asd.length; index++ )
        {
            asd[ index ] = (int)(Math.random() * 1000000);
        }//end for
        boolean confirm = true;
        for( int index = 0; confirm; index++ )
        {
            boolean three = asd[ index ] % 3 == 0;
            boolean five = asd[ index ] % 5 == 0;
            boolean seven = asd[ index ] % 7 == 0;
            boolean eleven = asd[ index ] % 11 == 0;
            if( three && five && seven && eleven )
            {
                System.out.println(asd[ index ] + " " + index);
                confirm = false;
            }//end for
        }//end for
    }//end method main
}//end class tester
