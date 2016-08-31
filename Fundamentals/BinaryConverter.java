public class BinaryConverter
{
    public static void main(String[] args){
        
        //Testing bin2dec()
        String bin1 = "1000010110111010";
        int dec1 = bin2dec(bin1);
        assert dec1 == 34234;
        
        //Testing dec2bin();
        int dec2 = 5;
        String bin2 = dec2bin(dec2);
        //assert bin2.equals("1000010110111010");
    }//end method main
    public static int bin2dec(String bin1){
        char binaryarray[] = bin1.toCharArray();
        int decimalvalue = 0;
        for( int index = 0; index < binaryarray.length; index ++ )
        {
            int num = 1;
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
                while( counter > 1 )
                {
                    num =  num * 2;
                    counter--;
                }//end while
                decimalvalue += num;
            }//end else if
        }//end for
        //System.out.println(decimalvalue);
        return decimalvalue;
    }//end method bin2dec
    public static String dec2bin(int dec){
        int length = 0;
        int num = 1;
        String binary = "";
        while( dec > num )
        {
            num = num * 2;
            length++;
        }//end while
        if( dec <= 1 )
        {
            if( dec == 1 )
            {
                binary += "1";
            }//end if
            else if( dec == 0 )
            {
                binary += "0";
            }//end else if
        }//end if
        else
        {
            num = 1;
            while( length > 0 )
            {
                num = num * 2;
                length--;
            }//end while
            while( true)
            {
                
            }//end while
        }//end else
        System.out.println(binary);
        return "1000010110111010";
    }//end method dec2bin
}//end class BinaryConverter