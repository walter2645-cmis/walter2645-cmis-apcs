import javax.swing.JOptionPane;
public class Room
{
    //FIELDS
    //class variables
    
    //instance variables
    private String name;
    private boolean entrance; //true -> has entrance, false -> no entrance
    private int windows;
    private double height;
    private double width;
    private double depth;
    //constants
    
    //METHODS
    //constructors
    public Room( String name, int windows, boolean entrance )
    {
        this.name = name;
        this.windows = windows;
        this.entrance = entrance;
    }//end method room
    public Room( String name )
    {
        this.name = name;
        double ent = Math.random();
        if( ent > 0.5 )
        {
            this.entrance = true;
        }//end if
        else
        {
            this.entrance = false;
        }//end else
        this.height = Math.random() * 50;
        this.width = height * 2;
        this.depth = height * Math.random() * 10;
    }//end method room
    public Room( String name, String password )
    {
        this.name = name;
        if( password.equals("CIEL TAMER") )
        {
            this.entrance = true;
        }//end if
    }//end method room
    //class (static) methods
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
    //getter/setter methods
    
    //other non-static methods
    public String toString()
    {
        String output = "You have arrived at "+name;
        return output;
    }//end method toString
}//end class Room
/*
 * Room

 * Description
 *  Width
 *  Depth
 *  Height
 *  entrance/exit
 *  Name
 *  windows
What it does
    Store item(s)
        w/d/h, entrance
    increase/decrease size
        w/d/h
    add/remove entrance/exit
        entrance/exit
    install/remove windows
        Windows
    Used as meeting place for people
        Name, entrance/exit 

 */