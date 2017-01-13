package B;
import java.util.List;
import java.util.ArrayList;
public class AnalogDigitalDriver
{
    public static void main( String[] args )
    {
        BWTV tv1 = new BWTV();
        HDTV tv2 = new HDTV();
        ArrayList<TV> tvs = new ArrayList<TV>();
        tvs.add(tv1);
        tvs.add(tv2);
        for( TV tv : tvs )
        {
            System.out.println(tv.tvType() + "...Am I on? " + tv.getTvON());
        }//end foreach
        System.out.println("\n");
        for( int index = 0; index < tvs.size(); index++ )
        {
            tvs.get(index).setTvON( true );
        }//end for
        for( TV tv : tvs )
        {
            System.out.println(tv.tvType() + "...Am I on? " + tv.getTvON());
        }//end foreach
        System.out.println(tv1.rotateRabbitEars());
        System.out.println(tv2.connectHDMI());
    }//end method main
}//end class AnalogDigitalDriver