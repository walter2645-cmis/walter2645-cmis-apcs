
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
        System.out.println(power(2, 5));
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
