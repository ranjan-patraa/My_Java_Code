package array_code;

import java.util.Arrays;

public class SquareASortedArrayOfPositiveAndNegativeNumbers {

    public static void main(String[] args) {


        int arr[] = {-6, -1, 2, 4, 5};

        System.out.println(Arrays.toString( squareSortedArray(arr) ));

    }

    public static int[] squareSortedArray(int[] arr) {

        int[] squareArray = new int[arr.length] ;
        int start = 0;
        int end = arr.length-1;
        int squareIndex = arr.length-1 ;

        while(start <= end) {

            if(arr[start]*arr[start] > arr[end]*arr[end]) {

                squareArray[squareIndex--] = arr[start]*arr[start] ;
                start++ ;

            }else {

                squareArray[squareIndex--] = arr[end]*arr[end] ;
                end-- ;
            }
        }

        return squareArray ;
    }
}

