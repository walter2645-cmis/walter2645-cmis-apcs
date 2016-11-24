public class HSTeacher extends Teacher
{
    private int gradeLevel;
    public HSTeacher( int salary, int years, String school, String subject, int gradeLevel)
    {
        super(salary, years, school, subject);
        this.gradeLevel = gradeLevel;
    }//end method HSTeacher
}//end class HSTeacher