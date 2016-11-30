package Problem1;
public class MyPhone extends MyDevice
{
    private int number;
    public MyPhone( String name, int number )
    {
        super(name);
        this.number = number;
    }//end method MyPhone
    
    public int getNumber()
    {
        return number;
    }//end method getNumber
    
    public void setNumber( int newNumber )
    {
        number = newNumber;
    }//end method setNumber
    
    public String toString()
    {
        return String.format("%s My number is %d.", super.toString(), number);
    }//end method toString
}//end class MyPhone