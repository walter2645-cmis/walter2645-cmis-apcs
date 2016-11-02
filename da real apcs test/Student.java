public class Student{
    //FIELDS
    //class variables

    //instance variables
    private String name;
    private int gradeLevel;
    private int id;
    private Grade[] grades = new Grade[8];
    //constants

    //METHODS
    //constructors
    public Student(String name, int gradeLevel)
    {
        this.name = name;
        this.gradeLevel = gradeLevel;
    }//end method

    //class (static) methods

    //getter/setter methods
    public Grade[] getGrades()
    {
        return grades;
    }//end method getGrades
    public Grade[] minMaxGrades()
    {
        return null;
    }//end method minMaxGrades
    //other non-static methods
    public String toString()
    {
        return "";
    }//end method toString
}//end class