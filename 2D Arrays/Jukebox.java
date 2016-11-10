public class Jukebox{
    //FIELDS
    //class variables

    //instance variables
    MySong[][] songList = new MySong[3][4];
    //constants

    //METHODS
    //constructors
    public Jukebox()
    {
        songList[0][0] = new MySong( "Jet Airliner", 5 );
        songList[0][1] = new MySong( "Slide", 4 );
        songList[0][2] = new MySong( "Tom Sawyer", 3 );
        songList[0][3] = new MySong( "Purple Rain", 2 );
        songList[1][0] = new MySong( "Sing a Song", 1 );
        songList[1][1] = new MySong( "Baba O'Riley", 5 );
        songList[1][2] = new MySong( "Jumper", 4 );
        songList[1][3] = new MySong( "Car Wash", 3 );
        songList[2][0] = new MySong( "Kung Fu Fighting", 2 );
        songList[2][1] = new MySong( "Right as Rain", 4 );
        songList[2][2] = new MySong( "Beat It", 5 );
        songList[2][3] = new MySong( "Bust a Move", 4 );
    }//end method Jukebox

    //class (static) methods

    //getter/setter methods
    public String randomSong()
    {
        int r = (int)(Math.random() * 3);
        int c = (int)(Math.random() * 4);
        String out = "";
        if( songList[r][c] != null )
        {
            out = songList[r][c].getName();
        }//end if
        return out;
    }//end methog randomSong
    public String playSongofRating( int rating )
    {
        String out = "";
        for( MySong[] row : songList )
        {
            for( MySong song : row )
            {
                if( song.getRating() == rating )
                {
                    out += song.getName() + "\n";
                }//end if
            }//end for
        }//end for
        return out;
    }//end method playSongofRating
    //other non-static methods
    public String toString()
    {
        String out = "";
        for( MySong[] row : songList )
        {
            for( MySong song : row )
            {
                out += song.getName() + "\n";
            }
        }//end for
        return out;
    }//end method toString
}//end class Jukebox