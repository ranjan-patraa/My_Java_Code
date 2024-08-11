package java8_code;

import java.util.stream.IntStream;
import java.util.stream.Stream;

public class PrintNPrimeNumber {

    public static void main(String[] args) {

        Stream.iterate(1,i->i+1)
                .filter(PrintNPrimeNumber::isPrime)
                .limit(10)
                .forEach(System.out::println) ;
    }

    public static boolean isPrime(int number) {

        return number > 1 && IntStream.range(2,number).noneMatch(n-> number % n == 0) ;
    }
}
