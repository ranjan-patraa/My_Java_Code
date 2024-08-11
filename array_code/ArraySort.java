package array_code;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Comparator;
import java.util.stream.Stream;

public class ArraySort {

    public static void main(String[] args) {

        String[] arr = {"priyo","mishu","arpita","chandan"} ;

        Integer[] arr1 = {2,4,5,1,0,9,6} ;

        arr1 = Stream.of(arr1).sorted().toArray(Integer[]::new) ;
        System.out.println(Arrays.toString(arr1)) ; // [0, 1, 2, 4, 5, 6, 9]

        arr = Stream.of(arr).sorted().toArray(String[]::new) ;
        System.out.println(Arrays.toString(arr)) ; // [arpita, chandan, mishu, priyo]

        arr = Stream.of(arr).sorted(Comparator.reverseOrder()).toArray(String[]::new) ;
        System.out.println(Arrays.toString(arr)) ; // [priyo, mishu, chandan, arpita]

        Arrays.sort(arr) ;
        System.out.println(Arrays.toString(arr)) ;  // [arpita, chandan, mishu, priyo]

        Arrays.sort(arr,Comparator.reverseOrder());
        System.out.println(Arrays.toString(arr)) ; // [priyo, mishu, chandan, arpita]
    }
}

/*
[arpita, chandan, mishu, priyo]
[priyo, mishu, chandan, arpita]
[arpita, chandan, mishu, priyo]
[priyo, mishu, chandan, arpita]
*/
