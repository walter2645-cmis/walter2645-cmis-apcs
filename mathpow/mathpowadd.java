import javax.swing.JOptionPane;
/**
 * Write a description of class mathpowadd here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class mathpowadd
{
    private static int y;
    public static void main( String[] args )
    {
        //String x = JOptionPane.showInputDialog("x = ");
        //String n = JOptionPane.showInputDialog("to the power of: ");
        //int a = Integer.parseInt(x);
        //int b = Integer.parseInt(n);
        System.out.println(poweradd(10, 8, 10));
    }
    public static int poweradd(int x, int n, int y)
    {
        if(n == 1)
        {
            return x;
        }
        else
        {
            if( y > 0 )
            {
                return x + poweradd(x,n,y-1);
            }
            else
            {
                y = x;
                return 0;
            }
        }
    }
}
