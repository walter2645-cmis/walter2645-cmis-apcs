public class apachehelicopter
{
    boolean gender;
    int age;
    
    public static void main( String[] args )
    {
        
    }//end method main
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
    }
}//end class apachehelicopter