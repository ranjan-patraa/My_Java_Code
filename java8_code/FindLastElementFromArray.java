package java8_code;

import java.util.Arrays;

public class FindLastElementFromArray {

    public static void main(String[] args) {

        int a[] = {1,2,3,4,5} ;

        int lastElement = Arrays.stream(a).skip(a.length-1).findFirst().getAsInt() ;

        System.out.println(lastElement) ;
    }
}
