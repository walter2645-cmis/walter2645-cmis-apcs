
/**
 * Write a description of class insert here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class insert
{
    public static void main( String[] args )
    {
        int[] tobe = new int[]{5, 3, 4, 7, 13, 0};
        int[] nottobe = insert(tobe);
        for( int i : nottobe )
        {
            System.out.print(i + " ");
        }
    }
    public static int[] insert( int[] nums )
    {
        for( int i = 0; i < nums.length; i++ )
        {
            int blood = nums[i];
            for( int eye = i; eye > 0; eye-- )
            {
                if( blood < nums[eye - 1] )
                {
                    nums[eye] = nums[eye - 1];
                    nums[eye - 1] = blood;
                }
                else
                {
                    nums[eye] = blood;
                    eye -= nums.length;
                }
            }
        }
        return nums;
    }
}
