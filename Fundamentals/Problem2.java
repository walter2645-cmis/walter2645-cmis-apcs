import javax.swing.JOptionPane;
public class Problem2{
    public static void main ( String[] args )
    {
        String num1 = JOptionPane.showInputDialog( "Type a number. No decimals allowed." );
        String num2 = JOptionPane.showInputDialog( "Type another number. The number can be the same." );
        int a = Integer.parseInt( num1 );
        int b = Integer.parseInt( num2 );
        if( a > b )
            {
            System.out.println("The value of a is " + a + " and it is greater than b whose value is " + b + ".");
            }//end if
        else if ( a < b )
            {
            System.out.println("The value of a is " + a + " and it is less than b whose value is " + b + ".");
            }//end else if
        else if ( a == b )
            {
            System.out.println("The value of a is " + a + " and it is equal to b whose value is " + b + ".");
            }
    }//end method main
}//end class Problem2