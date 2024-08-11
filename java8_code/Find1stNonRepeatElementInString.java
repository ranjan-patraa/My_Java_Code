package java8_code;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Find1stNonRepeatElementInString { // nonrepeated character

    public static void main(String[] args) {

        String str = "java concept of the day" ;

       String str1 =  Arrays.stream(str.split(""))
                .collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new,Collectors.counting()))
                .entrySet()
                .stream()
                .filter(s->s.getValue()>1)
                .findFirst().get().getKey() ;

        System.out.println(str1) ; // a


        List<String> list = Arrays.asList("pen","pencil","pen","notebook","eraser","notebook","pen") ;

       Map.Entry<String,Long> map = list.stream().collect(Collectors.groupingBy(Function.identity(),Collectors.counting()))
                .entrySet().stream().max(Map.Entry.comparingByValue()).get() ;

        System.out.println ("most frequently use element : " + map.getKey() + "= "+ map.getValue()) ; // most frequently use element : pen= 3
    }
}
