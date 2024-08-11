package java8_code;

import java.util.Arrays;

public class PrintNumberWhichMultiplayBy5_7 {

    public static void main(String[] args) {

        int[] arr  = {11,10,75,4,5,8,9,20} ;

        Arrays.stream(arr).filter(i->i%5==0).forEach(System.out::println) ;
    }
}
