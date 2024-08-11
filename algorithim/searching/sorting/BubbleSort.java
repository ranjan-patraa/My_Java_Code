package algorithim.searching.sorting;

import java.util.Arrays;

public class BubbleSort {

    public static void main(String[] args ) {

        int array[] = {3,7,2,8,34,12} ;

        bubbleSort(array) ;

        System.out.println(Arrays.toString(array)) ;
    }


    static void bubbleSort(int[] arr) {

        boolean swap  ;

        for(int i = 0 ; i < arr.length ; i++) {

            swap = false ;

            for (int j = 1 ; j < arr.length-i ; j++) {

                if(arr[j] < arr[j-1]) {

                    int temp = arr[j] ;

                    arr[j] = arr[j-1] ;

                    arr[j-1] = temp ;

                     swap = true ;

                }

            }


            if (!swap) {

                break ;
            }
        }
    }
}
