public class apachehelicopter
{
    //FIELDS
    //class variables
    
    //instance variables
    boolean gender;
    int age = 1;
    //constants
    
    //METHODS
    //constructors
    //class (static) methods
    public static void main( String[] args )
    {
        
    }//end method main
    //getter/setter methods
    public double getYearsLeft()
    {
        double lifeLeft = 0;
        if( gender )
        {
            lifeLeft = 86.8 - age;
        }//end if
        else
        {
            lifeLeft = 80.5 - age;
        }//end else
        return lifeLeft;
    }//end method getYearsLeft
    //other non-static methods
}//end class apachehelicopter