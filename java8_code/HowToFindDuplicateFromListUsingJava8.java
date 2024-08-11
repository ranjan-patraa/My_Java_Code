package java8_code;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class HowToFindDuplicateFromListUsingJava8 {

    public static void main(String[] args) {

        List<String> name = Arrays.asList("priyo","arpita","nirupama","kamakhya","ruchi","Priyo","priyo") ;

        Set<String> unique = new HashSet<>() ;

        Set<String> duplicateName =  name.stream().filter(n -> !unique.add(n) ).collect(Collectors.toSet()) ;

        System.out.println(duplicateName) ;

        System.out.println(unique);


       Map<String,Long> mapName = name.stream().collect(Collectors.groupingBy(Function.identity(),Collectors.counting())) ;

      Set<String> findDuplicate =  mapName.entrySet()
               .stream()
               .filter(entry -> entry.getValue() > 1)
               .map(entry -> entry.getKey())
               .collect(Collectors.toSet()) ;

        System.out.println("duplicate : "+findDuplicate);
    }
}
