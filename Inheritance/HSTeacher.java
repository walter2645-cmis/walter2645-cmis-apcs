public class HSTeacher extends Teacher
{
    private int gradeLevel;
    public HSTeacher( int salary, int years, String school, String subject, int gradeLevel)
    {
        super(salary, years, school, subject);
        this.gradeLevel = gradeLevel;
    }//end method HSTeacher
    
    public int getGradeLevel()
    {
        return gradeLevel;
    }//end method getGradeLevel
    
    public void setGradeLevel( int newGradeLevel )
    {
        gradeLevel = newGradeLevel;
    }//end method setGradeLevel
    
    public String toString()
    {
        return String.format("%s I teach grade %d.", super.toString(), gradeLevel);
    }//end method toString
}//end class HSTeacher