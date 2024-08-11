package java8_code;

import java.util.Arrays;
import java.util.stream.IntStream;

public class ReverseAnIntegerArray_19 {

    public static void main(String[] args) {

        int arr[] = {5,1,7,9,6} ;

       int[] reverseArray = IntStream.rangeClosed(1,arr.length)
                .map(i->arr[arr.length-i]).toArray() ;

        System.out.println(Arrays.toString(reverseArray)) ;
    }
}
