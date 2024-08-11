package java8_code;

import java.util.Arrays;
import java.util.List;

public class OddNumberSqrSum {

    public static void main(String[] args) {

        List<Integer> list = Arrays.asList(1,2,3,4,5,6,7,8,9,10);

       int sumOfSquare = list.stream().filter(i -> i%2 != 0).map(odd -> (int)Math.pow(odd,2))
                .reduce(0,(x,y) -> x+y);
        System.out.println(sumOfSquare);
    }
}
