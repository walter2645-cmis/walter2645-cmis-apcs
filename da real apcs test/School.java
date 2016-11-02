public class School{
    //FIELDS
    //class variables

    //instance variables
    private Student[] students;
    private Course[] catalog;
    //constants

    //METHODS
    //constructors
    public School()
    {

    }//end method

    //class (static) methods

    //getter/setter methods
    public Student getStudentById(int searchId)
    {
        Student theOne = null;
        for( int index = 0; index < students.length; index++ )
        {
            if( students[index].getID() == searchId )
            {
                theOne = students[index];
            }//end if
        }//end for
        return theOne;
    }//end method getStudentById
    public double gpaForCourse(Course course)
    {
        double count = 0;
        double total = 0;
        String name = course.getName();
        for( int index = 0; index < students.length; index++ )
        {
            Student target = students[ index ];
            Grade[] list = target.getGrades();
            for( int i = 0; i < list.length; i++ )
            {
                if( list[i] != null )
                {
                    Course lesson = list[index].getCourse();
                    if(lesson.getName() == name)
                    {
                        total += list[index].getScore();
                        count++;
                    }//end if
                }//end if
            }//end for
        }//end for
        double avg = -1;
        if( count > 0 )
        {
            avg = total/count;
        }//end if
        return avg;
    }//end method gpaForCourse
    //other non-static methods
    public String toString()
    {
        return "";
    }//end method toString
}//end class