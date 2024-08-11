package array_code;

import java.util.Arrays;

public class SeparateZerosFromNonZero {

    public static void main(String[] args) {

        int arr[] =  {12,34,0,56,0,2,0,0,1,2} ;

        System.out.println(Arrays.toString(arr));

        int count = 0 ;

        for(int i = 0 ;i < arr.length ;i++) {

            if( arr[i] != 0 ) {

                arr[count] = arr[i] ;

                count++ ;
            }
        }

        while(count < arr.length) {

            arr[count] = 0 ;

            count++ ;
        }

        System.out.println(Arrays.toString(arr)) ;

    }
}
