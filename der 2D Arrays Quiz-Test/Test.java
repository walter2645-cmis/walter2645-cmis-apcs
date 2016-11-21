public class Test
{
    private int[][] nums;
    public Test(int d){
        nums = new int[d][d];
        int nineY = (int)(Math.random() * (d - 2)) + 1;
        int nineX = (int)(Math.random() * (d - 2)) + 1;
        for( int y = 0; y < nums.length; y++ )
        {
            for( int x = 0; x < nums[0].length; x++ )
            {
                nums[y][x] = (int)(Math.random() * 9);
                nums[nineY][nineX] = 9;
            }//end for
        }//end for
        /**********************************************************************************************\
         * Modify this constructor method                                                             *
         * it must populate the 2D Array nums with digits from 0-9 inclusive                          *
         * There must be ONE AND ONLY ONE 9 in the array.                                             *
         * The 9 must not be on the edge of the array (i.e. not in the first or last row or column)   *
         * Everything should work for any positive value for d.                                       *
         **********************************************************************************************/
    }//end method Test

    public void showArray(){
        for ( int y = 0; y < nums.length; y++ ){
            for ( int x = 0; x < nums.length; x++ ){
                int num = nums[y][x];
                System.out.print(nums[y][x]);

            }//end for
            System.out.println();
        }  //end for
    }//end method showArray

    public int[][] getNineAndFriends(){
        int[][] result = new int[3][3];
        int startY = 0;
        int startX = 0;
        for( int y = 0; y < nums.length; y++ )
        {
            for( int x = 0; x < nums[0].length; x++ )
            {
                if( nums[y][x] == 9 )
                {
                    startY = y - 1;
                    startX = x - 1;
                }//end if
            }//end for
        }//end for
        for( int y = 0; y < result.length; y++ )
        {
            for( int x = 0; x < result[0].length; x++ )
            {
                result[y][x] = nums[startY][startX];
                startY++;
            }//end for
            startY -= result.length;
            startX++;
        }//end for
        //Modify this method so that it returns the 9 and the 8 digits surrounding it in column major order

        return result;
    }//end method getNineAndFriends

    public static void main(String[] args){
        Test test = new Test(5);
        test.showArray();
        int[][] nine = test.getNineAndFriends();
        for( int y = 0; y < nine.length; y++){
            for( int x = 0; x < nine.length; x++){
                System.out.print(nine[y][x]);
            }//end for
            System.out.println();
        }//end for
    }//end method main
}//end class Test
