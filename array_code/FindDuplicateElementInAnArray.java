package array_code;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FindDuplicateElementInAnArray {

    public static void main(String[] args) {

        int a[] = new int[]{1,22,22,56,22,90,1,39,56} ;

        findDuplicateElementInArray(a) ;
    }

    public static void  findDuplicateElementInArray(int[] arr) {

        System.out.println(Arrays.toString(arr)) ;

        HashMap<Integer,Integer> mapNumber = new HashMap<>() ;

        for(int arrayNumber : arr) {

            Integer i = mapNumber.get(arrayNumber) ;

            if(i == null) {

                mapNumber.put(arrayNumber,1) ;

            }else {

                i = i+1 ;

                mapNumber.put(arrayNumber,i) ;
            }
        }

        Set<Map.Entry<Integer,Integer>> entrySet = mapNumber.entrySet();

        for (Map.Entry<Integer,Integer> mapEntry : entrySet) {

            if (mapEntry.getValue() > 1)

              System.out.println( mapEntry.getKey() );
        }
    }
}
