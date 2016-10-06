public class Student
{
    //FIELDS
    //class variables
    
    //instance variables
    private int gradeLevel;
    private String name;
    private double courseGrade;
    private double gpa = 4.0;
    private Course[] listOfCourses = new Course[8];
    //constants
    
    //METHODS
    //constructors
    public Student()
    {
        
    }//end method Student
    
    //class (static) methods
    
    //getter/setter methods
    public Course[] getCourse()
    {
        return listOfCourses;
    }//end method getCourse
    public void setCourse( int courseSlot, Course newCourse )
    {
        listOfCourses[ courseSlot ] = newCourse;
    }//end method setCourse
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    public String getName()
    {
        return name;
    }//end method getName
    public void setName(String newName)
    {
        name = newName;
    }//end method setName
    
    public int getGradeLevel()
    {
        return gradeLevel;
    }//end method getGrade
    public void setGradeLevel(int newGradeLevel)
    {
        gradeLevel = newGradeLevel;
    }//end method setGradeLevel
    
    public double getGpa()
    {
        return gpa;
    }//end method getGpa
    
    public Course[] getList()
    {
        return listOfCourses;//change to return courses
    }//end method getList
    //other non-static methods
    public String toString()
    {
     return name + "\nGrade: " + gradeLevel + "\nGPA: " + gpa;
    }//end method toString
}//end class Student