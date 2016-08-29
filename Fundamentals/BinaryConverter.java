public class BinaryConverter
{
    public static void main(String[] args){
        
        //Testing bin2dec()
        String bin1 = "101101";
        int dec1 = bin2dec(bin1);
        assert dec1 == 45;
        
        //Testing dec2bin();
        int dec2 = 34243;
        String bin2 = dec2bin(dec2);
        assert bin2.equals("1000010110111010");
    }//end method main
    
    public static int bin2dec(String bin1){
        char binaryarray[] = bin1.toCharArray();
        int decimalvalue = 0;
        for( int index = 0; index < binaryarray.length; index ++ )
        {
            int num = 2;
            if( index == binaryarray.length - 1 )
            {
                if( binaryarray[ index ] == '1')
                {
                    decimalvalue += 1;
                }//end if
            }//end if
            else if( binaryarray[ index ] == '1')
            {
                int counter = binaryarray.length - index;
                while( counter > 2 )
                {
                    num =  num * 2;
                    counter--;
                }//end while
                decimalvalue += num;
            }//end else if
        }//end for
        return decimalvalue;
    }//end method bin2dec
    
    public static String dec2bin(int dec){
        return "1000010110111010";
    }//end method dec2bin
        
}//end class BinaryConverter