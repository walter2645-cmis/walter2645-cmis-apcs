package Problem1;
import java.util.List;
import java.util.ArrayList;
public class DevApp
{
    public static void main( String[] args )
    {
        MyDevice a = new MyDevice( "Depression" );
        MyPhone b = new MyPhone( "Homura", 93131530 );
        MyTv c = new MyTv( "Madoka", 99 );
        ArrayList<MyDevice> array = new ArrayList<MyDevice>();
        array.add(a);
        array.add(b);
        array.add(c);
        for( int index = 0; index < array.size(); index++ )
        {
            MyDevice out = array.get(index);
            System.out.println(out);
        }//end for
        
    }//end method main
}//end class DevApp