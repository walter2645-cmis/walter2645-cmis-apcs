import javax.swing.JOptionPane;
/**
 * Write a description of class mathpowadd here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class mathpowadd
{
    public static void main( String[] args )
    {
        //String x = JOptionPane.showInputDialog("x = ");
        //String n = JOptionPane.showInputDialog("to the power of: ");
        //int a = Integer.parseInt(x);
        //int b = Integer.parseInt(n);
        System.out.println(poweradd(15, 2));
    }
    public static int poweradd(int x, int n)
    {
        if(n == 0)
        {
            return 1;
        }
        else if(n == 1)
        {
            return x;
        }
        else
        {
            if(x == 2)
            {
                return poweradd(x, n-1) + poweradd(x, n-1);
            }
            else if(x == 3)
            {
                return poweradd(x, n-1) + poweradd(x, n-1) + poweradd(x, n-1);
            }
            else if(x == 4)
            {
                return poweradd(x, n-1) + poweradd(x, n-1) + poweradd(x, n-1) + poweradd(x, n-1);
            }
            else if(x == 5)
            {
                return poweradd(x, n-1) + poweradd(x, n-1) + poweradd(x, n-1) + poweradd(x, n-1) + poweradd(x, n-1);
            }
            else if(x == 6)
            {
                return poweradd(x, n-1) + poweradd(x, n-1) + poweradd(x, n-1) + poweradd(x, n-1) + poweradd(x, n-1) + poweradd(x, n-1);
            }
            else if(x == 7)
            {
                return poweradd(x, n-1) + poweradd(x, n-1) + poweradd(x, n-1) + poweradd(x, n-1) + poweradd(x, n-1) + poweradd(x, n-1) + poweradd(x, n-1);
            }
            else if(x == 8)
            {
                return poweradd(x, n-1) + poweradd(x, n-1) + poweradd(x, n-1) + poweradd(x, n-1) + poweradd(x, n-1) + poweradd(x, n-1) + poweradd(x, n-1) + poweradd(x, n-1);
            }
            else if(x == 9)
            {
                return poweradd(x, n-1) + poweradd(x, n-1) + poweradd(x, n-1) + poweradd(x, n-1) + poweradd(x, n-1) + poweradd(x, n-1) + poweradd(x, n-1) + poweradd(x, n-1) + poweradd(x, n-1);
            }
            else if(x == 10)
            {
                return poweradd(x, n-1) + poweradd(x, n-1) + poweradd(x, n-1) + poweradd(x, n-1) + poweradd(x, n-1) + poweradd(x, n-1) + poweradd(x, n-1) + poweradd(x, n-1) + poweradd(x, n-1) + poweradd(x, n-1);
            }
            else if(x == 11)
            {
                return poweradd(x, n-1) + poweradd(x, n-1) + poweradd(x, n-1) + poweradd(x, n-1) + poweradd(x, n-1) + poweradd(x, n-1) + poweradd(x, n-1) + poweradd(x, n-1) + poweradd(x, n-1) + poweradd(x, n-1) + poweradd(x, n-1);
            }
            else if(x == 12)
            {
                return poweradd(x, n-1) + poweradd(x, n-1) + poweradd(x, n-1) + poweradd(x, n-1) + poweradd(x, n-1) + poweradd(x, n-1) + poweradd(x, n-1) + poweradd(x, n-1) + poweradd(x, n-1) + poweradd(x, n-1) + poweradd(x, n-1) + poweradd(x, n-1);
            }
            else if(x == 13)
            {
                return poweradd(x, n-1) + poweradd(x, n-1) + poweradd(x, n-1) + poweradd(x, n-1) + poweradd(x, n-1) + poweradd(x, n-1) + poweradd(x, n-1) + poweradd(x, n-1) + poweradd(x, n-1) + poweradd(x, n-1) + poweradd(x, n-1) + poweradd(x, n-1) + poweradd(x, n-1);
            }
            else if(x == 14)
            {
                return poweradd(x, n-1) + poweradd(x, n-1) + poweradd(x, n-1) + poweradd(x, n-1) + poweradd(x, n-1) + poweradd(x, n-1) + poweradd(x, n-1) + poweradd(x, n-1) + poweradd(x, n-1) + poweradd(x, n-1) + poweradd(x, n-1) + poweradd(x, n-1) + poweradd(x, n-1) + poweradd(x, n-1);
            }
            else if(x == 15)
            {
                return poweradd(x, n-1) + poweradd(x, n-1) + poweradd(x, n-1) + poweradd(x, n-1) + poweradd(x, n-1) + poweradd(x, n-1) + poweradd(x, n-1) + poweradd(x, n-1) + poweradd(x, n-1) + poweradd(x, n-1) + poweradd(x, n-1) + poweradd(x, n-1) + poweradd(x, n-1) + poweradd(x, n-1) + poweradd(x, n-1);
            }
            else if(x == 16)
            {
                return poweradd(x, n-1) + poweradd(x, n-1) + poweradd(x, n-1) + poweradd(x, n-1) + poweradd(x, n-1) + poweradd(x, n-1) + poweradd(x, n-1) + poweradd(x, n-1) + poweradd(x, n-1) + poweradd(x, n-1) + poweradd(x, n-1) + poweradd(x, n-1) + poweradd(x, n-1) + poweradd(x, n-1) + poweradd(x, n-1) + poweradd(x, n-1);
            }
            else if(x == 17)
            {
                return poweradd(x, n-1) + poweradd(x, n-1) + poweradd(x, n-1) + poweradd(x, n-1) + poweradd(x, n-1) + poweradd(x, n-1) + poweradd(x, n-1) + poweradd(x, n-1) + poweradd(x, n-1) + poweradd(x, n-1) + poweradd(x, n-1) + poweradd(x, n-1) + poweradd(x, n-1) + poweradd(x, n-1) + poweradd(x, n-1) + poweradd(x, n-1) + poweradd(x, n-1);
            }
            else if(x == 18)
            {
                return poweradd(x, n-1) + poweradd(x, n-1) + poweradd(x, n-1) + poweradd(x, n-1) + poweradd(x, n-1) + poweradd(x, n-1) + poweradd(x, n-1) + poweradd(x, n-1) + poweradd(x, n-1) + poweradd(x, n-1) + poweradd(x, n-1) + poweradd(x, n-1) + poweradd(x, n-1) + poweradd(x, n-1) + poweradd(x, n-1) + poweradd(x, n-1) + poweradd(x, n-1) + poweradd(x, n-1);
            }
            else if(x == 19)
            {
                return poweradd(x, n-1) + poweradd(x, n-1) + poweradd(x, n-1) + poweradd(x, n-1) + poweradd(x, n-1) + poweradd(x, n-1) + poweradd(x, n-1) + poweradd(x, n-1) + poweradd(x, n-1) + poweradd(x, n-1) + poweradd(x, n-1) + poweradd(x, n-1) + poweradd(x, n-1) + poweradd(x, n-1) + poweradd(x, n-1) + poweradd(x, n-1) + poweradd(x, n-1) + poweradd(x, n-1) + poweradd(x, n-1);
            }
            else if(x == 20)
            {
                return poweradd(x, n-1) + poweradd(x, n-1) + poweradd(x, n-1) + poweradd(x, n-1) + poweradd(x, n-1) + poweradd(x, n-1) + poweradd(x, n-1) + poweradd(x, n-1) + poweradd(x, n-1) + poweradd(x, n-1) + poweradd(x, n-1) + poweradd(x, n-1) + poweradd(x, n-1) + poweradd(x, n-1) + poweradd(x, n-1) + poweradd(x, n-1) + poweradd(x, n-1) + poweradd(x, n-1) + poweradd(x, n-1) + poweradd(x, n-1);
            }
            else if(x == 21)
            {
                return poweradd(x, n-1) + poweradd(x, n-1) + poweradd(x, n-1) + poweradd(x, n-1) + poweradd(x, n-1) + poweradd(x, n-1) + poweradd(x, n-1) + poweradd(x, n-1) + poweradd(x, n-1) + poweradd(x, n-1) + poweradd(x, n-1) + poweradd(x, n-1) + poweradd(x, n-1) + poweradd(x, n-1) + poweradd(x, n-1) + poweradd(x, n-1) + poweradd(x, n-1) + poweradd(x, n-1) + poweradd(x, n-1) + poweradd(x, n-1) + poweradd(x, n-1);
            }
            else if(x == 22)
            {
                return poweradd(x, n-1) + poweradd(x, n-1) + poweradd(x, n-1) + poweradd(x, n-1) + poweradd(x, n-1) + poweradd(x, n-1) + poweradd(x, n-1) + poweradd(x, n-1) + poweradd(x, n-1) + poweradd(x, n-1) + poweradd(x, n-1) + poweradd(x, n-1) + poweradd(x, n-1) + poweradd(x, n-1) + poweradd(x, n-1) + poweradd(x, n-1) + poweradd(x, n-1) + poweradd(x, n-1) + poweradd(x, n-1) + poweradd(x, n-1) + poweradd(x, n-1) + poweradd(x, n-1);
            }
            else
            {
                return -1;
            }
        }
    }
}
