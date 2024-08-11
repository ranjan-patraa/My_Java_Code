package java8_code;

import java.util.stream.IntStream;

public class SumOf1stNatural10Number_18 {

    public static void main(String[] args) {

        int sum = IntStream.range(1,11).sum() ;

        System.out.println(sum) ;
    }
}
