
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
        System.out.println(3/2);
    }
    public static int bin(int[] nums, int t)
    {
        int coord = -1;
        boolean nope = true;
        int top = nums.length;
        int bot = 0;
        int there = 0;
        while(coord == -1 && nope)
        {
            there = (top - bot) / 2 + bot;
            if( nums[there] == t )
            {
                coord = there;
            }
            else if()
            {
                //refer to newguess.py
            }
        }
        return coord;
    }
}
