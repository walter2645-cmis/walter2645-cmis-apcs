
/**
 * Write a description of class Sequence here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class SequenceSearch
{
    public static void main( String[] args )
    {
        int[] nums = new int[] {1, 2, 3, 4, 5, 6, 7, 8, 9};
        int dis = sequence(nums, 1);
        System.out.println(dis);
    }
    public static int sequence(int[] nums, int t)
    {
        int coord = -1;
        for( int i = 0; i < nums.length; i++ )
        {
            if( nums[i] == t )
            {
                coord = i;
                i+= nums.length;
            }
        }
        return coord;
    }
}
