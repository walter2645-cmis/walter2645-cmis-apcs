public class Problem6
{
    public static void main( String[] args )
    {
        int sumofsq = 0;
        int sqofsum = 0;
        int count = 0;
        int sq = 0;
        while( count < 100 )
        {
            count++;
            sqofsum += count;
        }//end while
        sqofsum = sqofsum * sqofsum;
        count = 0;
        while( count < 100 )
        {
            count++;
            sq = count * count;
            sumofsq += sq;
        }//end while
        System.out.println(sumofsq + "\n" + sqofsum);
        int result = sqofsum - sumofsq;
        System.out.println(result);
    }//end method main
}//end class Problem6