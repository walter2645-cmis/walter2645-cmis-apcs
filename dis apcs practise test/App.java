public class App
{
    public static void main( String[] args )
    {
        Student instance = new Student( "Terra", 0 );
        String[] output = instance.getCourseNamesWithGradesBetterThan(0.5);
        for( int index = 0; index < output.length; index++ )
        {
            if( output[index] != null )
            {
                System.out.println(output[index]);
            }
        }
    }//end method main
}//end class App