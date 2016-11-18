import javax.swing.JOptionPane;
public class Array2D6
{
    public static void main( String[] args )
    {
        String name = JOptionPane.showInputDialog("Please enter your last name.");
        String pw = JOptionPane.showInputDialog("Please enter your new password.");
        boolean forbidden = true;
        while( forbidden )
        {
            String pwCheck = pw.toLowerCase();
            String nameCheck = name.toLowerCase();
            char[] nameChar = nameCheck.toCharArray();
            char[] pwChar = pwCheck.toCharArray();
            if( pw.length() < name.length() || pw.length() == name.length() && !pwCheck.equals(nameCheck) )
            {
                forbidden = false;
            }//end if
            else if( pw.length() > name.length() )
            {
                
            }//end else if
        }//end while
    }//end method main
}//end class