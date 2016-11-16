public class Student
{
    private String name;
    private int gradeLevel;
    private Grade[] grades;
    ///*
    public Student(String name, int gradeLevel)
    {
        this.name = name;
        this.gradeLevel = gradeLevel;
        Grade[] asa = new Grade[6];
        for( int index = 0; index < asa.length; index ++ )
        {
            asa[index] = new Grade();
        }//end for
        
        
        this.grades = asa;
    }//end if
    //*/
    public String[] getCourseNamesWithGradesBetterThan(double grade)
    {
        String[] demCourses = new String[66];
        int stringI = 0;
        for( int index = 0; index < grades.length; index++ )
        {
            if( grade > grades[ index ].getGrade())
            {
                Course dis = grades[index].getCourse();
                demCourses[stringI] = dis.getName();
                stringI++;
            }//end if
        }//end for
        return demCourses;
    }//end method
}//end class Student