public class RoomApp
{
    public static void main( String[] args )
    {
        Room r1 = new Room("HS302", 24, true);
        System.out.println(r1);
        System.out.println(r1.windows);
        System.out.println(r1.entrance);
        
        Room r2 = new Room("Radomus's Room");
        System.out.println(r2);
        System.out.println(r2.entrance);
        System.out.println("h = " + r2.height);
        System.out.println("w = " + r2.width);
        System.out.println("d = " + r2.depth);
        
        String pass = JOptionPane.showInputDialog("Currently in use.\n    -T3RR4");
        Room r3 = new Room("T3RR4's Room", pass);
        System.out.println(r3 + "\n" + r3.entrance);
    }//end method main
}//end class RoomApp