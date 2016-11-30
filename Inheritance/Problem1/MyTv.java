package Problem1;
public class MyTv extends MyDevice
{
    private int channels;
    public MyTv( String name, int channels )
    {
        super(name);
        this.channels = channels;
    }//end method MyTv
    
    public int getChannels()
    {
        return channels;
    }//end method getChannels
    
    public void setChannels( int newChannels )
    {
        channels = newChannels;
    }//end method setChannels
    
    public String toString()
    {
        return String.format("%s I have %d channels.", super.toString(), channels);
    }//end method toString
}//end class MyTv