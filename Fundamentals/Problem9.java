import javax.swing.JOptionPane;
public class Problem9
{
    public static void main( String[] args )
    {
        String username = "M3G4 T3RR4";
        int password = 130;
        String userinp = JOptionPane.showInputDialog( "Username: " );
        String userpass = JOptionPane.showInputDialog( "Password: " );
        int passconvert = Integer.parseInt( userpass );
        boolean usercheck = username.equals(userinp);
        boolean passcheck = password == passconvert;
        if( usercheck && passcheck )
        {
            System.out.println( "You have succesfully logged in." );
        }//end if
        else
        {
            System.out.println( "Login unsuccesful... try again" );
        }//end else
    }//end method main
}//end class Problem9