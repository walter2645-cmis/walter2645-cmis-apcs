package Problem4;
public abstract class Student
{
    private String name;
    private String major;
    private int units;
    public Student( String name, String major, int units )
    {
        this.name = name;
        this.major = major;
        this.units = units;
    }//end Student
    
    public String getName()
    {
        return name;
    }//end method getName
    
    public void setName( String newName )
    {
        name = newName;
    }//end method setName
    
    public String getMajor()
    {
        return major;
    }//end method getMajor
    
    public void setMajor( String newMajor )
    {
        major = newMajor;
    }//end method setMajor
    
    public int getUnits()
    {
        return units;
    }//end method getUnits
    
    public void setUnits( int newUnits )
    {
        units = newUnits;
    }//end method setUnits
    
    public abstract int calculateTuition( int units );
}//end class Student