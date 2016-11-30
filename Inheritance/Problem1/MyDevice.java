package Problem1;
public class MyDevice
{
    private String name;
    public MyDevice( String name )
    {
        this.name = name;
    }//end method MyDevice
    
    public String getName()
    {
        return name;
    }//end method getName
    
    public void setName( String newName )
    {
        name = newName;
    }//end method setName
    
    public String toString()
    {
        return String.format("I am a %s.", name);
    }//end method toString
}//end class MyDevice