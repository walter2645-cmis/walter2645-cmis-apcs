package B;
public abstract class TV
{
    private boolean tvON;
    public boolean getTvON()
    {
        return tvON;
    }//end method getTvON
    public void setTvON(boolean newTvON)
    {
        tvON = newTvON;
    }//end method setTvON
    public abstract String tvType();
}//end class TV