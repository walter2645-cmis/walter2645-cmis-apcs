public class Teacher extends Job
{
    private String school;
    private String subject;
    public Teacher( int salary, int years, String school, String subject )
    {
        super(salary, years);
        this.school = school;
        this.subject = subject;
    }//end method Teacher
    
    public String getSchool()
    {
        return school;
    }//end method getSchool
    
    public void setSchool( String newSchool )
    {
        school = newSchool;
    }//end method setSchool
    
    public String getSubject()
    {
        return subject;
    }//end method getSubject
    
    public void setSubject( String newSubject )
    {
        subject = newSubject;
    }//end method setSubject
    
    public void setSalary( int newSalary )
    {
        super.setSalary(newSalary);
    }//end method setSalary
    
    public String toString()
    {
        return String.format("%s I am a %s. I work at %s. I teach the %s subject.", super.toString(), getClass(), school, subject);
    }//end method toString
    
}//end class Teacher