package java8_code;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

public class SeparateOddAndEvenNumber_1 {

    public static void main(String[] args) {

        List<Integer> list = Arrays.asList(2,7,8,9,5,4) ;

        Map<Boolean,List<Integer>> map = list.stream().collect(Collectors.partitioningBy(i-> i % 2 == 0));

        Set<Map.Entry<Boolean,List<Integer>>> entrySet = map.entrySet() ;

        for (Map.Entry<Boolean,List<Integer>> entry : entrySet) {

            if(entry.getKey()) {

                System.out.println("Even_Number") ;

            }else {

                System.out.println("Odd_Number") ;
            }

            List<Integer> list1 = entry.getValue() ;

            for(int i : list1) {

                System.out.println(i) ;
            }
        }
    }
}
