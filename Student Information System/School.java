public class School
{
    private Student[] plebs = new Student[5070];
    private Course[] joylessDespair = new Course[5070];
    
    public Student getPleb(int index)
    {
        return plebs[ index ];
    }//end method getPlebs
    public int getPlebsLength()
    {
        return plebs.length;
    }//end method getPlebsLength
    public void setPleb(int index, String name)
    {
        plebs[ index ] = new Student(name);
    }//end method setPlebs
    
    public Course getJoylessDespair(int index)
    {
        return joylessDespair[ index ];
    }//end method getJoylessDespair
    public int getJoylessDespairLength()
    {
        return joylessDespair.length;
    }//end method getJoylessDespairLength
    public void setJoylessDespair(int index, String name)
    {
        joylessDespair[ index ] = new Course(name);
    }//end method setJoylessDespair
    
    public School()
    {
        /*Course c01 = new Course("AP Computer Science");
        Course c02 = new Course("Computer Science 1");
        Course c03 = new Course("Computer Science 2");
        Course c04 = new Course("English 9");
        Course c05 = new Course("English 10");
        Course c06 = new Course("English 11");
        Course c07 = new Course("English 12");
        Course c08 = new Course("AP English Literature");
        Course c09 = new Course("Pre-Calculus");
        Course c10 = new Course("Geometry");
        Course c11 = new Course("Algebra 2");
        Course c12 = new Course("AP Calculus");
        Course c13 = new Course("Business Studies");
        Course c14 = new Course("PE");
        Course c15 = new Course("Life on Earth");
        Course c16 = new Course("Biology");
        Course c17 = new Course("AP Biology");
        Course c18 = new Course("Chemistry");
        Course c19 = new Course("AP Chemistry");
        Course c20 = new Course("Physics");
        Course c21 = new Course("AP Physics");
        Course c22 = new Course("3D Sculpture");
        Course c23 = new Course("Studio Art");
        Course c24 = new Course("AP Art");
        Course c25 = new Course("Forensic Science");
        Course c26 = new Course("AP Psychology");
        Course c27 = new Course("Senior Seminar");
        Course c28 = new Course("Creative Writing");
        Course c29 = new Course("AP Statistics");
        Course c30 = new Course("AP Economics");
        Course c31 = new Course("Band");
        Course c32 = new Course("AP Human Geography");
        Course c33 = new Course("Dance");
        */

        
    }//end method School
}//end class School