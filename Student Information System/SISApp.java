import javax.swing.JOptionPane;
public class SISApp
{
    public static void main( String[] args )
    {
        School SchoolInstance = new School();
        String input = "";
        int studentCount = 0;
        int courseCount = 0;
        while( !input.equals("0") )
        {
            input = JOptionPane.showInputDialog("0) Quit\n1) View Student List\n2) View Course List\n3)Add a Student\n4) Add a Course\n5) Edit a Student");
            if( input.equals("1") )
            {
                for( int index = 0; index < SchoolInstance.getPlebsLength(); index++ )
                {
                    if( SchoolInstance.getPleb(index) != null )
                    {
                        System.out.println(SchoolInstance.getPleb(index));
                    }//end if
                }//end for
            }// end if

            if( input.equals("2") )
            {
                for( int index = 0; index < SchoolInstance.getJoylessDespairLength(); index++ )
                {
                    if( SchoolInstance.getJoylessDespair(index) != null )
                    {
                        System.out.println(SchoolInstance.getJoylessDespair(index));
                    }//end if
                }//end for
            }// end if

            if( input.equals("3") )
            {
                SchoolInstance.setPleb(studentCount, JOptionPane.showInputDialog("Input Student Name: "));
                studentCount++;
            }// end if

            if( input.equals("4") )
            {
                SchoolInstance.setJoylessDespair(courseCount, JOptionPane.showInputDialog("Input Course Name: "));
                courseCount++;
            }// end if

            if ( input.equals("5") )
            {
                editStudent(SchoolInstance);
            }//end if
        }//end while
    }//end method main

    public static void editStudent(School SchoolInstance)
    {
        int option = -1;
        while( option != 0 )
        {
            String info = "0) Cancel\n";
            for( int index = 0; index < SchoolInstance.getPlebsLength(); index++ )
            {
                if( SchoolInstance.getPleb(index) != null )
                {
                    Student thisStudent = SchoolInstance.getPleb(index);
                    info += index + 1  + ") " + thisStudent.getName() + "\n";
                }//end if
            }//end for
            String input = JOptionPane.showInputDialog(info);
            option = Integer.parseInt(input);
            if( option != 0 )
            {
                Student tribute = SchoolInstance.getPleb(option - 1);
                editStudent2(tribute);
            }//end if
        }//end while
    }//end method editStudent
    public static void editStudent2(Student chosenOne)
    {
        String input = "";
        while( !input.equals("0") )
        {
            input = JOptionPane.showInputDialog("0) Cancel\n1) Add a Course\n2) Change a grade");
            if( input.equals("1") )
            {
                
            }//end if
            
            if( input.equals("2") )
            {
                
            }//end if
        }//end while
    }//end method editStudent2
}//end class SISApp
