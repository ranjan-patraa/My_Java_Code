package array_code;

import java.util.Arrays;

public class RemoveDuplicateFromSortedArray {

    public static void main(String[] args) {

        int arr[] = {1,1,2,2,3,3,4,4,4} ;

        int l = arr.length ;

       // System.out.println( Arrays.toString(removeDuplicate(arr)) ) ;



       int newLength =  remove(arr,l) ;

       for (int i = 0 ; i < newLength ; i++) {

           System.out.println(arr[i]+" ") ;
       }


    }

    public static int[] removeDuplicate(int[] sortedArray) {

        if(sortedArray == null || sortedArray.length == 0) {

           return new int[0] ;
        }

        int n = sortedArray.length ;
        int j = 0 ;

        for(int i = 0 ; i < n-1 ; i++) {

            if(sortedArray[i] != sortedArray[i+1]) {

                sortedArray[j++] = sortedArray[i] ;
            }
        }

        sortedArray[j++] = sortedArray[n-1] ;

        int result[] = new int[j] ;

        System.arraycopy(sortedArray,0,result,0,j) ;

        return result ;

    }

    public static  int remove(int [] arr , int n) {

        int j = 0 ;

        for(int i = 0 ; i < n-1 ; i++) {

            if(arr[i] != arr[i+1]) {

                arr[j++] = arr[i] ;
            }

        }

        arr[j++] = arr[n-1] ;

        return j ;
    }
}
