import javax.swing.JOptionPane;
public class RoomApp
{
    public static void main( String[] args )
    {
        Room r1 = new Room("HS202", 24, true);
        System.out.println(r1);
        System.out.println(r1.getWindows());
        System.out.println(r1.getEntrance());
        
        Room r2 = new Room("Radomus's Room");
        System.out.println(r2);
        System.out.println(r2.getEntrance());
        System.out.println("h = " + r2.getHeight());
        System.out.println("w = " + r2.getWidth());
        System.out.println("d = " + r2.getDepth());
        System.out.println("v = " + r2.getVolume());
        
        String pass = JOptionPane.showInputDialog("Currently in use.\n    -T3RR4");
        Room r3 = new Room("T3RR4's Room", pass);
        System.out.println(r3 + "\n" + r3.getEntranceWord());
        String objectheight = JOptionPane.showInputDialog("What is the height of the object? Do not input a unit of measurement. Decimals are accepted.");
        System.out.println(r3.getObjectAccess(objectheight));
    }//end method main
}//end class RoomApp
