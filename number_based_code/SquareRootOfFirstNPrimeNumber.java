package number_based_code;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;

public class SquareRootOfFirstNPrimeNumber {

    public static void main(String[] args) {

        List<Double> sqrRootOf10Prime = new ArrayList<>(10) ;

        int index = 1 ;

        while(sqrRootOf10Prime.size() < 10) {

            if (isPrime(index)) {

                sqrRootOf10Prime.add(Math.sqrt(index)) ;
            }
            index++ ;
        }
        System.out.println(sqrRootOf10Prime) ;
    }

    public static boolean isPrime(int number) {

        return number > 1 && IntStream.range(2,number).noneMatch(n->number%n==0) ;
    }
}
