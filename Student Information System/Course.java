public class Course{
    //FIELDS
    //class variables
    
    //instance variables
    private String name;
    private double grade;
    
    //constants
    
    //METHODS
    //constructors
    public Course(String name)
    {
        this.name = name;
    }//end method course
    
    //class (static) methods
    
    //getter/setter methods
    public String getCourseName()
    {
        return name;
    }//end method getCourseName
    public void setCourseName(String newCourseName)
    {
        name = newCourseName;
    }//end method setCourseName
    //other non-static methods
    public String toString()
    {
     return name;
    }//end method toString
}//end class Course