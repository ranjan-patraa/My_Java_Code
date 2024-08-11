package java8_code;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FindDuplicateElementFromString {

    public static void main(String[] args) {


        String str = "java is a programming language";


        List<String> str1 = Arrays.stream(str.split(""))
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))
                .entrySet().stream()
                .filter(s -> s.getValue() > 1).map(s -> s.getKey()).collect(Collectors.toList());


        System.out.println(str1);


    }
}

