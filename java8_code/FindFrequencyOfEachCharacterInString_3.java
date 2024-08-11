package java8_code;

import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class FindFrequencyOfEachCharacterInString_3 {

    public static void main(String[] args) {

        String str = "java concept of the day" ;

       Map<Character,Long> map = str.chars()
                .mapToObj(c -> (char) c)
                .collect(Collectors.groupingBy(Function.identity(),Collectors.counting())) ;

        System.out.println(map);

       Map<String,Long> map1 = Stream.of(str.split("")).collect(Collectors.groupingBy(Function.identity(),Collectors.counting())) ;
       map1.forEach((k,v)-> System.out.print(k+" = "+v+" , ")) ;

    }
}
