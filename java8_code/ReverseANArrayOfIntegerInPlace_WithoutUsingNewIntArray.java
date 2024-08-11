package java8_code;

import java.util.Arrays;
import java.util.stream.IntStream;

public class ReverseANArrayOfIntegerInPlace_WithoutUsingNewIntArray {

    public static void main(String[] args) {

        int[] arr = {1,2,3,4,5} ;

         reverseArrayInPlace(arr) ;
    }

    private static void reverseArrayInPlace(int[] arr) {


        IntStream.range(0,arr.length/2)

                .forEach(s->
                        {
                               int temp = arr[s] ;
                               arr[s] = arr[arr.length-s-1] ;
                               arr[arr.length-s-1] = temp ;

                        }
                                );

        System.out.println("reversed array is : " +  Arrays.toString(arr) );
    }
}
