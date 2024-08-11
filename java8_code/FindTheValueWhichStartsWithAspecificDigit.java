package java8_code;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FindTheValueWhichStartsWithAspecificDigit {

    public static void main(String[] args) {

        int[] arr = {11,78,48,19,57,18,67} ;

        List<Integer> digitStartWithOne = Arrays.stream(arr)
                .boxed()
                .map(e->String.valueOf(e))
                .filter(e->e.startsWith("1"))
                .map(Integer::valueOf)
                .collect(Collectors.toList()) ;

        System.out.println(digitStartWithOne);

        System.out.println("---------------------------") ;

        List<Integer> digitStartWithOne1 =  Arrays.stream(arr)
                .boxed()
                .map(e->e+"")
                .filter(e->e.startsWith("1"))
                .map(Integer::valueOf)
                .collect(Collectors.toList()) ;

        System.out.println(digitStartWithOne1);
    }
}
