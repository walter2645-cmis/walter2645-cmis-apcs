import javax.swing.JOptionPane;
public class Problem3
{
    public static void main ( String[] args )
    {
        String input = JOptionPane.showInputDialog( "Type a number." );
        int num = Integer.parseInt( input );
        if ( num % 2 == 1 )
        {
            System.out.println(num + " is an odd number.");
        }
        else if ( num % 2 == 0 )
        {
            System.out.println(num + " is an even number.");
        }
    }//end method main
}//end class Problem3