package array_code;

import java.util.Arrays;

public class MinimumAbsoluteDifference {

    public static void main(String[] args) {

        int[] arr = {3,8,9,5,12,13,12};// {1,5,7,8,3,2,-2,-1};

        minimumAbsolute(arr) ;
    }

    static void minimumAbsolute(int arr[]) {

        //Arrays.sort(arr) ;  // 1 2 3 5 7 8

        for(int i = 0; i < arr.length-1 ; i++ ){

            for(int j = i+1 ; j > 0 ; j--){

                if(arr[j] < arr[j-1]) {

                    int temp = arr[j] ;
                    arr[j] = arr[j-1] ;
                    arr[j-1] = temp ;
                }
            }
        }


        int minimum = Math.abs(arr[1]-arr[0]) ;

        int firstElement = arr[0] ;
        int secondElement = arr[1] ;

        for(int i = 2 ; i < arr.length ;i++) {

            if(Math.abs(arr[i]-arr[i-1])< minimum) {

                minimum = Math.abs(arr[i]-arr[i-1]) ;
                firstElement = arr[i-1] ;
                secondElement = arr[i] ;
            }
        }

        System.out.println("sorted array is : " +Arrays.toString(arr)) ;
        System.out.println("absolute difference is :"+minimum);
        System.out.println("fist no : "+firstElement);
        System.out.println("second no : "+secondElement);
    }
}
