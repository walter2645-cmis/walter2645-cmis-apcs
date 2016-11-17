public class Problem36
{
    public static void main( String[] args )
    {
        int num = 10000000;
        int total = 0;
        while( num > 0 )
        {
            char[] numArray = ("" + num).toCharArray();
            char[] binArray = dec2bin(num).toCharArray();
            int zero = 0;
            int i = numArray.length - 1;
            int binZero = 0;
            int binI = binArray.length - 1;
            boolean ayy = true;
            while( ayy )
            {
                if( zero > i && binZero > binI )
                {
                    ayy = false;
                    total += num;
                }//end if
                else if( zero == i - 1 && numArray[zero] == numArray[i] && binArray[binZero] == binArray[binI] )
                {
                    ayy = false;
                    total += num;
                }//end else if
                else if( numArray[zero] != numArray[i] || binArray[binZero] != binArray[binI] )
                {
                    ayy = false;
                }//end else if
                zero++;
                i--;
                binZero++;
                binI++;
            }//end while
            num--;
        }//end while
        System.out.println(total);
    }//end method main
    public static String dec2bin(int dec)
    {
        int length = 0;
        int num = 1;
        String binary = "";
        while( dec > num )
        {
            num = num * 2;
            length++;
        }//end while
        int powerof = length;
        int runtime = 0;
        int q = 0;
        while( dec >= 0 && q == 0 )
        {
            num = 1;
            while( length > 0 )
            {
                num = num * 2;
                length--;
            }//end while
            if( binary.length() == powerof - 1 )
            {
                if ( dec == 1 )
                {
                    binary += "1";
                    dec--;
                    q--;
                }//end else if
                else if ( dec == 0 )
                {
                    binary += "0";
                    dec--;
                    q--;
                }//end else if
            }//end if
            else if( dec >= num )
            {
                binary += "1";
                dec -= num;
            }//end else if
            else if( dec < num  && runtime != 0 )
            {
                binary += "0";
            }//end else if
            runtime++;
            length = powerof - runtime;
        }//end while
        return binary;
    }//end method dec2bin
}//end class Problem36