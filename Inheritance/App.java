public class App
{
    public static void main( String[] args )
    {
        Job j = new Job(5000, 1);
        System.out.println(j);
        
        President p = new President(1, 3, "Canada");
        System.out.println(p);
        
        Teacher t = new Teacher(999999999, 10, "CMIS", "Computer Science");
        System.out.println(t);
    }//end method main
}//end class App