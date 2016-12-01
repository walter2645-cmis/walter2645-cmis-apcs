package Problem2;
import java.util.List;
import java.util.ArrayList;
public class TVApp
{
    public static void main( String[] args )
    {
        ArrayList<Television> array = new ArrayList<Television>();
        Television tv1 = new Television("HD Bronze", 59.99);
        DLP tv2 = new DLP("DLP Silver", 99.99);
        LCD tv3 = new LCD("LCD Gold", 199.99);
        LED tv4 = new LED("LED Platinum", 399.99);
        Plasma tv5 = new Plasma("Plasma Sapphire", 499.99);
        array.add(tv1);
        array.add(tv2);
        array.add(tv3);
        array.add(tv4);
        array.add(tv5);
        for( Television tv : array )
        {
            System.out.println(tv);
        }//end for
    }//end method main
}//end class TVApp
