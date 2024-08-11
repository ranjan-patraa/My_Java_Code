package java8_code;

import java.util.Arrays;

public class FindSecondSmallestElementInArray {

    public static void main(String[] args) {

        int[] arr = {12,4,32,9,11,23} ;

        secondSmallestElement(arr) ;
    }

    private static void secondSmallestElement(int[] arr) {

       int secondSmallest =  Arrays.stream(arr).sorted().skip(1).findFirst().orElseThrow(()-> new IllegalArgumentException("Array does not have Second smallest element")) ;

        System.out.println("secondSmallestElement Is : "+secondSmallest) ;
    }
}
