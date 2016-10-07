import javax.swing.JOptionPane;
public class SISApp
{
    public static void main( String[] args )
    {
        School SchoolInstance = new School();
        String input = "";
        int studentCount = 0;
        while( !input.equals("0") )
        {
            input = JOptionPane.showInputDialog("0) Quit\n1) View Student List\n2) View Course List\n3)Add a Student\n4) Add a Course");
            if (input.equals("1"))
            {
                for( int index = 0; index < SchoolInstance.getPlebsLength(); index++ )
                {
                    if( SchoolInstance.getPleb(index) != null )
                    {
                        System.out.println(SchoolInstance.getPleb(index));
                    }//end if
                }//end for
            }// end if
            
            if (input.equals("2"))
            {
                
            }// end if
            
            if (input.equals("3"))
            {
                SchoolInstance.setPleb(studentCount, JOptionPane.showInputDialog("Input Student Name: "));
                studentCount++;
            }// end if

            if (input.equals("4"))
            {
                
            }// end if
        }//end while
    }//end method main
}//end class SISApp