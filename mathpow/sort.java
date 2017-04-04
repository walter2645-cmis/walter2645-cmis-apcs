
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
        int[] nums = new int[] {3, 3, 5, 8, 1, 6, 9, 4, 2, 0, 7, 99, 7};
        int[] ss = bubbles(nums);
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
    
    public static int[] bubbles( int[] nums )
    {
        boolean swap = true;
        while( swap )
        {
            swap = false;
            for( int i = 0; i < nums.length - 1; i++ )
            {
                if( nums[i] > nums[i+1] )
                {
                    int doge = nums[i];
                    nums[i] = nums[i+1];
                    nums[i+1] = doge;
                    swap = true;
                }
            }
        }
        return nums;
    }
}
