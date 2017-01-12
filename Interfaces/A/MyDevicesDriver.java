package A;
import java.util.ArrayList;

public class MyDevicesDriver
{
    public static void main( String[] args )
    {
        MyPod pod = new MyPod( 32, "Black" );
        MyPhone phone = new MyPhone( 16, "Blue", "AT&T" );
        MyCar car = new MyCar();
        ArrayList<Connectable> inventory = new ArrayList<Connectable>(); 
        inventory.add( pod );
        inventory.add( phone );
        inventory.add( car );
        for( Connectable device : inventory ) 
        {
            device.connectToBluetooth();              
        } // end for each

    } // end method main
} // end class MyDevicesDriver
