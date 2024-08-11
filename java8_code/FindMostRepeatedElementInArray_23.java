package java8_code;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FindMostRepeatedElementInArray_23 {

    public static void main(String[] args) {

        List<String> list = Arrays.asList("Pen","Eraser","NoteBook","Pen","Pencil","pen","noteBook","Pencil") ;

        Map.Entry<String,Long> map = list.stream().collect(Collectors.groupingBy(Function.identity(),Collectors.counting()))
                .entrySet().stream().max(Map.Entry.comparingByValue()).get() ;

        System.out.println("most frequently usedElement : " + map.getKey() + " = "+ map.getValue()) ;
    }
}
