package java8_code;

import java.util.stream.Collectors;
import java.util.stream.Stream;

public class FindSUmOfAllDigitInJava_12 {

    public static void main(String[] args) {

        int i = 15623 ;

       int sumOfDigit  = Stream.of(String.valueOf(i).split(""))
                .collect(Collectors.summingInt(Integer::parseInt)) ;

        System.out.println(sumOfDigit) ;
    }
}
