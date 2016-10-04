import javax.swing.JOptionPane;
public class Student{
    //FIELDS
    //class variables
    
    //instance variables
    private int gradeLevel;
    private String name;
    private double courseGrade;
    private double gpa = 4.0;
    private String[] listOfCourses = new String[6];
    //constants
    
    //METHODS
    //constructors
    public Student(String name, int gradeLevel){
        this.name = name;
        this.gradeLevel = gradeLevel;
    }//end method Student
    
    //class (static) methods
    
    //getter/setter methods
    public String getName()
    {
        return name;
    }//end method getName
    public void setName(String newName)
    {
        name = newName;
    }//end method setName
    
    public double getGpa()
    {
        return gpa;
    }//end method getGpa
    
    public String[] getList()
    {
        return listOfCourses;
    }//end method getList
    //other non-static methods
    public String toString(){
     return name + "\nGrade: " + gradeLevel + "\nGPA: " + gpa;
    }//end method toString
}//end class Student