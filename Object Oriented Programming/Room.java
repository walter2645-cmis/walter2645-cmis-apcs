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
    private double[][] windowDimensions;
    //constants
    public static final double asd = 0;
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
        this.windows = (int)(Math.random() * 13);
    }//end method room
    public Room( String name, String password )
    {
        this.name = name;
        if( password.equals("CIEL TAMER") )
        {
            this.entrance = true;
        }//end if
        this.height = 0;
        this.width = Math.random() * 25;
        this.depth = Math.random() * 99999;
        this.windows = 0;
    }//end method room
    //class (static) methods
    /**public static void main( String[] args )
    {
        Room r1 = new Room("HS302", 24, true);
        System.out.println(r1);
        System.out.println(r1.windows);
        System.out.println(r1.entrance);
        
        Room r2 = new Room("Radomus");
        System.out.println(r2);
        System.out.println(r2.entrance);
        System.out.println("h = " + r2.height);
        System.out.println("w = " + r2.width);
        System.out.println("d = " + r2.depth);
        
        String pass = JOptionPane.showInputDialog("Currently in use.\n    -T3RR4");
        Room r3 = new Room("T3RR4", pass);
        System.out.println(r3 + "\n" + r3.entrance);
    }//end method main
    **/
    //overrides
    public boolean equals(Room other)
    {
        if( this.entrance == other.entrance && this.windows == other.windows )
        {
            return true;
        }//end if
        else
        {
            return false;
        }//end else
    }
    //getter/setter methods
    public String getName()
    {
        return name;
    }//end method getName
    public String getTruncName(int limit)
    {
        String ret = "Room ";
        if( name.length() > limit )
        {
            ret += name.substring(0, limit);
        }//end if
        else
        {
            ret += name;
        }//end else
        return ret;
    }//end method getTruncName
    public void setName(String newName)
    {
        name = newName;
    }//end method setName
    
    public boolean getEntrance()
    {
        return entrance;
    }//end method getEntrance
    public void setEntrance(boolean newEntrance)
    {
        entrance = newEntrance;
    }//end method setEntrance
    
    public int getWindows()
    {
        return windows;
    }//end method getWindows
    public void setWindows(int newWindows)
    {
        windows = newWindows;
    }//end method setWindows
    
    public double getHeight()
    {
        return height;
    }//end method getHeight
    public void setHeight(double newHeight)
    {
        height = newHeight;
    }//end method setHeight
    
    public double getWidth()
    {
        return width;
    }//end method getWidth
    public void setWidth(double newWidth)
    {
        width = newWidth;
    }//end method setWidth
    
    public double getDepth()
    {
        return depth;
    }//end method getDepth
    public void setDepth(double newDepth)
    {
        depth = newDepth;
    }//end method setDepth
    
    public String getEntranceWord()
    {
        String ret;
        if( entrance )
        {
            ret = "There is an entrance.";
        }//end if
        else
        {
            ret = "The room is inaccessible.";
        }//end else
        return ret;
    }//end method getEntranceWord
    
    public double getFloorArea()
    {
        double floorarea = width * depth;
        return floorarea;
    }//end method getFloorArea
    
    public double getVolume()
    {
        double volume = height * width * depth;
        return volume;
    }//end method getVolume
    
    public double getObjectAccess(String objectHeight)
    {
        double objectheight = Double.parseDouble(objectHeight);
        if( entrance && objectheight <= height )
        {
            System.out.println("The object can fit in the room.");
        }//end if
        else
        {
            System.out.println("The object can't fit into the room.");
        }//end else
        System.out.print("The difference between the room's height and the object's height is: ");
        return height - objectheight;
    }//end method getObjectAccess
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