package array_code;

import java.util.*;

public class SortArrayElementByFrequency {

    public static void main(String[] args) {

      int arr[] =   {7, 1, 3, 4, 7, 1, 7, 1, 4, 5, 1, 9, 3} ;

      byFrequencyShort(arr) ;
    }

    static void byFrequencyShort(int[] arr) {

       Map<Integer,Integer> arrayMap = new HashMap<>() ;

       for(int i : arr) {

           if(arrayMap.containsKey(i)) {

               arrayMap.put(i,arrayMap.get(i)+1) ;
           }
           else {

               arrayMap.put(i,1) ;
           }
       }

        List<Map.Entry<Integer,Integer>> list = new ArrayList<>(arrayMap.entrySet()) ;

       Collections.sort(list,(o1,o2)->o2.getValue().compareTo(o1.getValue())) ;

        System.out.println("InputArray : "+Arrays.toString(arr)) ;

        System.out.println("sortedArrayOfThereFrequency : ");
        System.out.print("[") ;

        for(Map.Entry<Integer,Integer> i : list) {

            int frequent = i.getValue() ;

            while (frequent >= 1) {

                System.out.print( i.getKey() + " ") ;
                frequent-- ;
            }


        }

        System.out.println("]");

    }
}
