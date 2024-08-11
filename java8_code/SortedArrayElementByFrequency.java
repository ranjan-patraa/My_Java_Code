package java8_code;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class SortedArrayElementByFrequency {

    public static void main(String[] args) {

        String [] s = {"banana","Apple","banana","grapes","avocodo","avocodo","banana"} ;


        List<String> Sortedlist1 = new ArrayList<>() ;

        Arrays.stream(s)
                .collect(Collectors.groupingBy(Function.identity(),Collectors.counting()))
                .entrySet()
                .stream()
                .sorted(Collections.reverseOrder(Map.Entry.comparingByValue()))
                .forEach(entry->{
                    for(int i= 1 ; i <= entry.getValue() ;i++) {

                        Sortedlist1.add(entry.getKey()) ;
                    }
                });

        System.out.println(Sortedlist1);
    }
}
