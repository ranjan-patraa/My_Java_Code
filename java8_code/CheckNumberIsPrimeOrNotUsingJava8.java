package java8_code;

import java.util.Iterator;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class CheckNumberIsPrimeOrNotUsingJava8 {

    public static void main(String[] args) {

         boolean checkPrime = isPrime(33) ;

        if (checkPrime) {

            System.out.println("no is primeNumber") ;
        }
        else {

            System.out.println("no is not prime number");
        }

        Stream.iterate(1,i->i+1)
                .filter(CheckNumberIsPrimeOrNotUsingJava8::noPrimeOrNot).limit(10).forEach(System.out::println); ;
    }

    public static boolean isPrime(int number) {

         return number > 1 && IntStream.range(2,number).noneMatch(n -> number % n == 0) ;
    }

    static boolean noPrimeOrNot(int no) {

        return no > 1 && IntStream.range(2,no).noneMatch(number->no%number==0) ;
    }
}
