public class President extends Job
{
    private String country;
    public President( int salary, int years, String country )
    {
        super( salary, years );
        this.country = country;
    }//end method President
    
    public String getCountry()
    {
        return country;
    }//end method getCountry
    
    public void setCountry( String newCountry )
    {
        country = newCountry;
    }//end method setCountry
    
    public String toString()
    {
        return String.format("%s I am the President of %s.", super.toString(), country);
    }//end method toString
}//end class President