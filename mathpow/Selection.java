
/**
 * Write a description of class Selection here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Selection
{
    public static void main( String[] args )
    {
        int[] nums = new int[] {3, 3, 5, 8, 1, 6, 9, 4, 2, 0, 7, 99, 7};
        int[] ss = sort2(nums);
        for( int i = 0; i < nums.length; i++ )
        {
            System.out.print(ss[i] + " ");
        }
    }
    public static int[] sort2( int[] nums )
    {
        int min, cur, dawg;
        min = Integer.MAX_VALUE;
        cur = -1;
        dawg = 0;
        for( int i = 0; i < nums.length; i++ )
        {
            min = nums[i];
            for( int in = i; in < nums.length; in++ )
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
        }
        return nums;
    }
}
