package java8_code;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class FindMaximumAndMinimumNumber_8 {

    public static void main(String[] args) {

        List<Integer> list = Arrays.asList(7,9,2,11,27) ;

        int max = list.stream().max(Comparator.naturalOrder()).get() ;
        int min = list.stream().min(Comparator.naturalOrder()).get() ;

        System.out.println("max is = "+max) ;
        System.out.println("min is = "+min) ;
    }
}
