
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
        int[] asd = new int[]{4, 7, 2, 6, 8, 9, 2, 4, 5, 1, 3};
        int[] sorted = mergeSort(asd);
        for( int i : sorted )
        {
            System.out.print(i + " ");
        }
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

    public static int[][] cutThree(int[] pigeons)
    {
        int third = pigeons.length / 3;
        int one = 0;
        int two = 0;
        if( pigeons.length % 3 == 2 )
        {
            one++;
            two++;
        }
        if( pigeons.length % 3 == 1 )
        {
            one++;
        }
        int[] uno = new int[third + one];
        int[] dos = new int[third + two];
        int[] tres = new int[third];
        for( int i = 0; i < uno.length; i++ )
        {
            uno[i] = pigeons[i];
        }
        for( int i = 0; i < dos.length; i++ )
        {
            dos[i] = pigeons[i + uno.length];
        }
        for( int i = 0; i < tres.length; i++ )
        {
            tres[i] = pigeons[i + uno.length + dos.length];
        }
        return new int[][]{uno, dos, tres};
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
            if( lefti < left.length && righti < right.length )
            {
                if( left[lefti] <= right[righti] )
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
            else if( lefti >= left.length && righti < right.length )
            {
                convergence[i] = right[righti];
                righti++;
            }
            else if( righti >= right.length && lefti < left.length )
            {
                convergence[i] = left[lefti];
                lefti++;
            }
        }
        return convergence;
    }
}