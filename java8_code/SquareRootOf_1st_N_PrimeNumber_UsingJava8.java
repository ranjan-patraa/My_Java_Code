package java8_code;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class SquareRootOf_1st_N_PrimeNumber_UsingJava8 {

    public static void main(String[] args) {

        List<Double>   list =

                 Stream.iterate(1,i->i+1)
                .filter(SquareRootOf_1st_N_PrimeNumber_UsingJava8::isPrime)
                         .peek(System.out::println)
                .map(Math::sqrt)
                         .limit(10)
                .collect(Collectors.toList()) ;

        System.out.println(list) ;


    }

    public static boolean isPrime(int number) {

        return  (number > 1 && IntStream.range(2,number).noneMatch( i -> number % i == 0))  ;
    }
}
