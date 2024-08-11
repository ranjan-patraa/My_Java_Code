package array_code;

import java.util.Arrays;

public class ReverseArray_Without_Using_Loop_Methods {

    public static void main(String[] args) {

        int array1[]  = {1,2,3,4,5} ;
        int start = 0 ;
        int end = array1.length-1 ;

        reverse(array1,start,end) ;

        System.out.println(Arrays.toString(array1));
    }

    static void reverse(int[] arr,int start ,int end) {

        if(start >= end) {

            return ;

        }

        int temp = arr[start] ;
        arr[start] = arr[end] ;
        arr[end] = temp ;

        reverse(arr,start+1,end-1) ;
    }
}
