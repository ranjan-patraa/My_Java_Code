package java8_code;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class SortListOfStringAccordingToLength_14 {

    public static void main(String[] args) {

        List<String> list = Arrays.asList("Java","Python","c#","Html","kotlin","c++","c") ;

        List<String> sort = list.stream().sorted(Comparator.comparing(String::length)).toList() ;

        System.out.println(sort) ;
    }
}
