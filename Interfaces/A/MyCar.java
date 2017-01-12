package A;
public class MyCar extends Vehicle implements Connectable, Discountable
{
    public void connectToBluetooth()
    {
        System.out.println("Connecting to bluetooth for a MyCar");
    }//end method connectToBluetooth
    public void applyDiscount()
    {
        
    }//end method applyDiscount
}//end class MyCar