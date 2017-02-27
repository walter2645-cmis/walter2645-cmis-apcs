import javax.swing.JOptionPane;
/**
 * Write a description of class mathpow here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class mathpow
{
    public static void main( String[] args )
    {
        String x = JOptionPane.showInputDialog("x = ");
        String n = JOptionPane.showInputDialog("to the power of: ");
        int a = Integer.parseInt(x);
        int b = Integer.parseInt(n);
        System.out.println(power(a, b));
    }
    public static int power(int x, int n){
        if(n == 1){
            return x;
        }
        else
        {
            return x * power(x, n - 1);
        }
    }
}
