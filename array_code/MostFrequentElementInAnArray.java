package array_code;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MostFrequentElementInAnArray {

    public static void main(String[] args) {

        frequentElement(new int[]{4, 5, 8, 7, 4, 7, 6,7});

        frequentElement(new int[]{1, 2, 7, 5, 3, 6});

    }

    static void frequentElement(int[] arr) {

        Map<Integer,Integer> map = new HashMap<>() ;

        for(int a : arr) {

            Integer i = map.get(a) ;

            if(i == null) {

                map.put(a,1) ;

            }else {

                i=i+1 ;
                map.put(a,i) ;
            }
        }

        Set<Map.Entry<Integer,Integer>> entrySet = map.entrySet() ;

        int element = 0;
        int frequent = 1 ;
        for(Map.Entry<Integer,Integer> set : entrySet) {

            if(set.getValue() > frequent) {

                element = set.getKey() ;
                frequent = set.getValue() ;
            }
        }

        if(frequent > 1) {

            System.out.println(Arrays.toString(arr)) ;

            System.out.println("frequent element is : "+ element) ;
            System.out.println("frequent is  : "+frequent) ;
        }
        else {

            System.out.println(Arrays.toString(arr)) ;

            System.out.println("There is no frequent element") ;
        }
    }
}
