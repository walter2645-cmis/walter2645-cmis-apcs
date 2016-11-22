public class Job
{
    private String name;
    private int salary;
    public Job( String name, int salary )
    {
        this.name = name;
        this.salary = salary;
    }//end method Job
    public String toString()
    {
        return String.format("I have a %s.", getClass());
    }//end method toString
}//end class Job