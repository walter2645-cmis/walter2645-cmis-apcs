public class Student{
    //FIELDS
    //class variables

    //instance variables
    private String name;
    private int gradeLevel;
    private int id;
    private Grade[] grades = new Grade[8];
    public void justdoit()
    {
        grades[0] = new Grade(100);
        grades[1] = new Grade(42);
        grades[2] = new Grade(69);
        grades[3] = new Grade(12);
        grades[4] = new Grade(7);
        grades[5] = new Grade(55);
        grades[6] = new Grade(89);
        grades[7] = new Grade(70);
    }
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
    public int getID()
    {
        return id;
    }//end method getID
    public Grade[] getGrades()
    {
        return grades;
    }//end method getGrades
    public Grade[] minMaxGrades()
    {
        Grade[] minMax = new Grade[2];
        double min = 5.0;
        double max = -1;
        for( int index = 0; index < grades.length; index++ )
        {
            if( grades[index] != null )
            {
                double score = grades[index].getScore();
                if( score < min )
                {
                    min = score;
                }//end if
                if( score > max )
                {
                    max = score;
                }//end if
            }//end if
        }//end for
        if( min != 5.0 )
        {
            minMax[ 0 ] = new Grade(min);
        }//end if
        if( max != -1 )
        {
            minMax[ 1 ] = new Grade(max);
        }//end if
        return minMax;
    }//end method minMaxGrades
    //other non-static methods
    public String toString()
    {
        return "";
    }//end method toString
}//end class