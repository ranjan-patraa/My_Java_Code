package java8_code;

import java.util.Arrays;

public class FindSumAndAvrgOfAllElement_15 {

    public static void main(String[] args) {

        int a[] = {45,12,15,56,24,75,31,89} ;


        int sum = Arrays.stream(a).sum() ;

        System.out.println(sum) ;

        int sum1  = Arrays.stream(a).reduce((i,j)->i+j).getAsInt() ;

        System.out.println(sum1) ;

        Double avrg = Arrays.stream(a).average().getAsDouble() ;

        System.out.println(avrg) ;
    }

}
