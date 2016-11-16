class Thing
{
    public int x;
    public double y;
    public Thing( int x )
    {
        this.x = x;
        this.y = x * x;
    }

    public int mystery1( boolean arg )
    {
        if( this.x > this.y )
            return 0;
        else
            return x * (int) y;
    }

    public boolean mystery2()
    {
        return this.x == this.y;
    }

    public static void main( String[] args )
    {
        //Thing t = new Thing( 3 );
        //boolean res = t.mystery1( true ) * t.mystery1( false ) == 0;
        //System.out.println( res );
        //z = t.x;
        int arg = -1;
        Thing t = new Thing( arg );
        boolean result = t.mystery2();
        System.out.println(result);
    }
}