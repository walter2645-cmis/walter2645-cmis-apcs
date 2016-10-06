import javax.swing.JOptionPane;
public class SISApp
{
    public static void main( String[] args )
    {
        School SchoolInstance = new School();
        String input = "";
        while( !input.equals("0") )
        {
            input = JOptionPane.showInputDialog("0) Quit\n1) View Student List\n2) View Course List\n3)Add a Student\n4) Add a Course");
            if (input.equals("1"))
            {
                for( int index = 0; index < SchoolInstance.plebs.length; index++ )
                {
                    System.out.println(SchoolInstance.plebs[ index ]);
                }//end for
            }// end if
            
            if (input == "2")
            {
                
            }// end if
            
            if (input == "3")
            {
                
            }// end if

            if (input == "4")
            {
                
            }// end if
        }//end while
    }//end method main
}//end class SISApp