public class MySong{
    //FIELDS
    //class variables

    //instance variables
    String name;
    int rating;
    //constants

    //METHODS
    //constructors
    public MySong( String name, int rating )
    {
        this.name = name;
        this.rating = rating;
    }//end method MySong

    //class (static) methods

    //getter/setter methods
    public String getName()
    {
        return name;
    }//end method getName
    public int getRating()
    {
        return rating;
    }//end method getRating
    //other non-static methods
    public String toString()
    {
        return "";
    }//end method toString
}//end class MySong