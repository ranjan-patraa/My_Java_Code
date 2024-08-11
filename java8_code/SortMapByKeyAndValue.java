package java8_code;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

import static java.util.Arrays.stream;

public class SortMapByKeyAndValue {
     
    public static void main(String[] args) {

        Map<Integer,String> map =  new HashMap<>() ;

        map.put(1,"One") ;
        map.put(12,"Twoelve") ;
        map.put(35,"Thirty_five") ;
        map.put(4,"four") ;
        map.put(101,"OneThousendOne") ;
        map.put(111,"OneThousendEleven") ;

        map.forEach((k,v)-> System.out.println(k+" "+v)) ;

        System.out.println("________________________");

       Map<Integer,String> map1 = map.entrySet().stream().sorted(Map.Entry.comparingByKey()).collect(Collectors
                                  .toMap(Map.Entry::getKey, Map.Entry::getValue,(e1,e2)->e1, LinkedHashMap::new)) ;

        map1.forEach((k,v)-> System.out.println(k+" "+v)) ;

        System.out.println("________________________") ;

        map.entrySet().stream().sorted(Map.Entry.comparingByValue()).forEach(System.out::println) ;




     }
}
