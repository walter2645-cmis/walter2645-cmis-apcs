import javax.swing.JOptionPane;
public class Grade
{
    private Course course;
    private double grade;
    ///*
    public Grade()
    {
        double number = Math.random();
        this.grade = number;
        this.course = new Course(String.valueOf(number), "Lin");
    }
    //*/
    public Course getCourse()
    {
        return course;
    }//end method getCourse
    public double getGrade()
    {
        return grade;
    }//end method getGrade
    public void setGrade(double newGrade)
    {
        grade = newGrade;
    }//end method setGrade
}//end class Grade