
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
        
        return null;
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
        return null;
    }
}