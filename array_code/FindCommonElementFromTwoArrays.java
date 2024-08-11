package array_code;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class FindCommonElementFromTwoArrays {

    public static void main(String[] args) {
        int[] a = {1,4,3,6,9,4} ;

        int[] b = {1,7,8,6,3,4} ;

       /* int arr[] = Arrays.stream(a).filter(e->Arrays.stream(b).anyMatch(i->i==e)).distinct().toArray() ;

        System.out.print(Arrays.toString(arr)) ;   [1, 4, 3, 6]

        System.out.println() ;*/

        findCommonElementFromTwoArray(a,b) ;


    }

    public static void findCommonElementFromTwoArray(int[] array1,int[] arr2) {

        Set<Integer> arraySet1 = new HashSet<>() ;

        Set<Integer> arraySet2 = new HashSet<>() ;

        for (int arrayNo : array1) {

            arraySet1.add(arrayNo) ;
        }

        for (int arrayNo : arr2) {

            arraySet2.add(arrayNo) ;
        }

        for (int arrayNo : arraySet2) {

             boolean b = arraySet1.add(arrayNo) ;

             if(b == false) {

                 System.out.println(arrayNo);
             }
        }
    }
}
