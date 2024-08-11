package algorithim.searching.searching;

import java.util.Arrays;

public class SearchIn2DArray {

    public static void main(String[] args) {

        int[][] arr =
                {
                      {23,4,1},
                      {18,12,3,9},
                      {78,99,34,55},
                       {18,12}
                };

        int target = 55 ;

        int[] arr1 = searchElementFrom2DArray(arr,target) ;

        System.out.println(Arrays.toString(arr1)) ;
    }

    static int[] searchElementFrom2DArray(int[][] array , int target) {

        for(int row = 0 ; row< array.length ; row++) {

            for (int col = 0 ; col< array[row].length ; col++ ) {

                if (array[row][col] == target) {

                    return new int[]{row,col} ;
                }
            }
        }

        return new int[]{-1,-1} ;
    }
}
