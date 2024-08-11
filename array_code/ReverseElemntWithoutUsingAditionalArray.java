package array_code;

import java.util.Arrays;

public class ReverseElemntWithoutUsingAditionalArray {

    public static void main(String[] args) {
        
        int[] a = {12,13,14,15,16} ;
        reverseArray(a) ;
    }

    static void reverseArray(int[] arr) {

        int length = arr.length/2 ;

        for(int i  =0 ; i<length ;i++) {

            int temp = arr[i] ;
            arr[i] = arr[arr.length-1-i] ;
            arr[arr.length-1-i] =temp ;
        }

        System.out.println(Arrays.toString(arr)) ;
    }
}
