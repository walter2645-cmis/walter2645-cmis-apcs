
/**
 * Write a description of class BinarySearch here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class BinarySearch
{
    public static void main( String[] args )
    {
        int[] nums = new int[] {1, 2, 3, 4, 5, 6, 7, 8, 9};
        int dis = bin(nums, 1);
        System.out.println(dis);
    }

    public static int bin(int[] nums, int t)
    {
        int coord = -1;
        boolean nope = true;
        int top = nums.length - 1;
        int bot = 0;
        int there = 0;
        while(coord == -1 && nope)
        {
            if( bot > top )
            {
                nope = false;
            }
            else
            {
                there = (top + bot) / 2;
                if( nums[there] == t )
                {
                    coord = there;
                }
                else if( t < nums[there] )
                {
                    top = there - 1;
                }
                else if( t > nums[there] )
                {
                    bot = there + 1;
                }
            }
        }
        return coord;
    }
}
