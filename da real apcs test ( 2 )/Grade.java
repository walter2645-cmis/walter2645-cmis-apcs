public class Grade{
    //FIELDS
    //class variables

    //instance variables
    private Course course;
    private double score;
    //constants

    //METHODS
    //constructors
    public Grade(double score)
    {
        this.score = score;
    }//end method

    //class (static) methods

    //getter/setter methods
    public double getScore()
    {
        return score;
    }//end method getScore
    public Course getCourse()
    {
        return course;
    }//end method getCourse
    //other non-static methods
    public String toString()
    {
        return "";
    }//end method toString
}//end class