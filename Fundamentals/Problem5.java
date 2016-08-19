public class Problem5
{
    public static void main( String[] args )
    {
        String[] movies = new String[3];
        movies[ 0 ] = "Fight Club";
        movies[ 1 ] = "Fringe";
        movies[ 2 ] = "Heroes";
        String[] songs = new String[3];
        songs[ 0 ] = "ClariS - Connect";
        songs[ 1 ] = "solidemo - landscape";
        songs[ 2 ] = "Eminem - Lose Yourself parody - Mom's Spaghetti";
        for( int index = 0; index < movies.length; index++ )
        {
            System.out.println(movies[ index ]);
            if( index == 2 )
            {
                System.out.println("");
            }
        }//end for
        System.out.println(" ");
        for(int index = 0; index < songs.length; index++ )
        {
            System.out.print(songs[ index ] + ", ");
        }//end for
    }//end method main
}//end class Problem5
