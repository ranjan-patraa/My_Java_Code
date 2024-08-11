package array_code;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;

public class MergeArrayAndRemoveDuplicate {

    public static void main(String[] args) {

        int[] arrayA = new int[] {7, -5, 3, 8, -4, 11, -19, 21} ;

        int[] arrayB = new int[] {6, 13, -7, 0, 11, -4, 3, -5} ;

        int[] mergedArray = mergeArraySortWithoutDuplicate(arrayA,arrayB) ;
        System.out.println(Arrays.toString(mergedArray));
    }

    public static int[] mergeArraySortWithoutDuplicate(int[] arr , int[] arr1) {

        int i  = 0 ; int j = 0 ; int k = 0 ;

        int []mergeSortArray = new int[arr.length+arr1.length] ;

        while (i < arr.length) {

            mergeSortArray[k] = arr[i] ;

            i++ ;
            k++ ;
        }

        while (j < arr1.length) {

            mergeSortArray[k] = arr1[j] ;

            j++ ;
            k++ ;

        }

        HashSet<Integer> hs = new HashSet<>() ;

        for(int m : mergeSortArray) {

            hs.add(m) ;
        }

        int[] mergedArrayWIthNoDuplicate = new int[hs.size()] ;

        Iterator<Integer> iterator = hs.iterator() ;
        int n = 0 ;

        while(iterator.hasNext()){

            mergedArrayWIthNoDuplicate[n] = iterator.next() ;
            n++ ;
        }

        for(int x = 0 ;  x < mergedArrayWIthNoDuplicate.length-1 ; x++) {

            for (int y = x + 1; y > 0; y--) {

                if (mergedArrayWIthNoDuplicate[y] < mergedArrayWIthNoDuplicate[y - 1]) {

                    int temp = mergedArrayWIthNoDuplicate[y];
                    mergedArrayWIthNoDuplicate[y] = mergedArrayWIthNoDuplicate[y - 1];
                    mergedArrayWIthNoDuplicate[y - 1] = temp;
                } else {
                    break;
                }
            }
        }

       // Arrays.sort(mergedArrayWIthNoDuplicate) ; [-19, -7, -5, -4, 0, 3, 6, 7, 8, 11, 13, 21]


        return mergedArrayWIthNoDuplicate ;
    }
}
