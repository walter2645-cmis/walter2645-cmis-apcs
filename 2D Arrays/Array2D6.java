import javax.swing.JOptionPane;
public class Array2D6
{
    public static void main( String[] args )
    {
        String name = JOptionPane.showInputDialog("Please enter your last name.");
        String pw = JOptionPane.showInputDialog("Please enter your new password.");
        String pwCheck = pw.toLowerCase();
        String nameCheck = name.toLowerCase();
        boolean forbidden = true;
        while( forbidden )
        {
            char[] nameChar = nameCheck.toCharArray();
            char[] pwChar = pwCheck.toCharArray();
            
        }//end while
    }//end method main
}//end class