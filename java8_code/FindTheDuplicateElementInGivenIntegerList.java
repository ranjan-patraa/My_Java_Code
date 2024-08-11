package java8_code;

import java.util.*;
import java.util.stream.Collectors;

public class FindTheDuplicateElementInGivenIntegerList {

    public static void main(String[] args) {

        List<Integer> listIntegerNumber = Arrays.asList(12,24,36,12,48,60,36) ;

        Set<Integer> findDuplicateNumber = new HashSet<>() ;

        listIntegerNumber.stream()

                .filter(s-> !findDuplicateNumber.add(s))

                .collect(Collectors.toSet())

                .forEach(s-> System.out.println(s)) ;

     }
}
