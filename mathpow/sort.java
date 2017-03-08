
/**
 * Write a description of class sort here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class sort
{
    public static void main( String[] args )
    {
        int[] nums = new int[] {3, 3, 5, 8, 1, 6, 9, 4, 2, 7, 0, 99, 7};
        int[] ss = sort2(nums);
        for( int i = 0; i < nums.length; i++ )
        {
            //nums[i] = (int)(Math.random() * 10);
            System.out.print(ss[i] + " ");
        }
    }

    public static int[] sort( int[] nums )
    {
        int min, cur, max;
        min = Integer.MAX_VALUE;
        cur = -1;
        int[] sorted = new int[nums.length];
        for( int i = 0; i < sorted.length; i++ )
        {
            for( int in = 0; in < nums.length; in++ )
            {
                if( nums[in] < min )
                {
                    min = nums[in];
                    cur = in;
                }
            }
            sorted[i] = min;
            min = Integer.MAX_VALUE;
            nums[cur] = Integer.MAX_VALUE;
        }
        return sorted;
    }

    public static int[] sort2( int[] nums )
    {
        int min, cur, dawg;
        min = Integer.MAX_VALUE;
        cur = -1;
        dawg = 0;
        for( int i = 0; i < nums.length; i++ )
        {
            for( int in = 0 + i; in < nums.length; in++ )
            {
                if( nums[in] < min )
                {
                    min = nums[in];
                    cur = in;
                }
            }
            dawg = nums[i];
            nums[i] = min;
            nums[cur] = dawg;
            min = Integer.MAX_VALUE;
        }
        return nums;
    }
}
