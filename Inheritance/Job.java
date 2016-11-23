public class Job
{
    private int salary;
    private int years;
    public Job( int salary, int years )
    {
        this.salary = salary;
        this.years = years;
    }//end method Job
    
    public int getSalary()
    {
        return salary;
    }//end method getSalary
    
    public void setSalary( int newSalary )
    {
        salary = newSalary;
    }//end method setSalary
    
    public String toString()
    {
        return String.format("I have a %s. My salary is %d dollars. I have worked for %d years.", getClass(), salary, years);
    }//end method toString
}//end class Job