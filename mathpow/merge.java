
/**
 * Write a description of class merge here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class merge
{
    public static void main( String[] args )
    {
        int a = 3;
        int b = 2;
        int c = a/b;
        System.out.println(c);
    }
    public static int[][] split(int[] cut)
    {
        int mid = cut.length / 2;
        int[] left = new int[mid];
        int[] right = new int[mid + cut.length % 2];
        int[][] sandwich = new int[][]{left, right};
        for( int i = 0; i < mid; i++ )
        {
            left[i] = cut[i];
        }
        for( int i = mid; i < cut.length; i++ )
        {
            right[i - mid] = cut[i];
        }
        return sandwich;
    }
    public static int[] mergeSort(int[] juan)
    {
        if(juan.length == 1)
        {
            return juan;
        }
        int[][] duality = split(juan);
        int[] left = mergeSort(duality[0]);
        int[] right = mergeSort(duality[1]);
        int[] singularity = merge(left, right);
        return singularity;
    }
    public static int[] merge(int[] left, int[] right)
    {
        int[] convergence = new int[left.length+right.length];
        int lefti = 0;
        int righti = 0;
        for( int i = 0; i < convergence.length; i++ )
        {
            if(left[lefti] < right[righti])
            {
                convergence[i] = left[lefti];
                
                lefti++;
            }
            else
            {
                convergence[i] = right[righti];
                righti++;
            }
        }
        return null;
    }
}