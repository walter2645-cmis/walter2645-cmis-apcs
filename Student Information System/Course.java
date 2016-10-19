public class Course{
    //FIELDS
    //class variables
    
    //instance variables
    private String name;
    private double grade = 100;
    private Student[] students;
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
    
    public double getGrade()
    {
        return grade;
    }//end method getGrade
    public void setGrade(double newGrade)
    {
        this.grade = newGrade;
    }//end method setGrade
    //other non-static methods
    public String toString()
    {
     return name + " " + grade;
    }//end method toString
}//end class Course