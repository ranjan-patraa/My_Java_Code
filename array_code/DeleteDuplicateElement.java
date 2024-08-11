package array_code;

// DELETE AN ELEMENT FROM AN ARRAY

import java.util.Arrays;

public class DeleteDuplicateElement {

    public static void main(String[] args) {

        int[] arr = {12,34,56,78,89,11,23,45,34,56,4} ;//{0,0,1,1,1,2,2,3,3,4} ;




        System.out.println(Arrays.toString(arr)) ;
        deleteElement(arr) ;
        System.out.println(Arrays.toString(arr)) ;
    }

    static void deleteElement(int[] arr) {

        int noOfUniqueElement = arr.length;

        for(int i  = 0 ; i < noOfUniqueElement ; i++ ) {

            for (int j = i+1 ; j < noOfUniqueElement ; j++) {

                if(arr[i] == arr [j]) {

                    arr[j] = arr[noOfUniqueElement-1] ; // {12,34,56,78,89,11,23,45,34,56,4} {0,0,1,1,1,2,2,3,3,4}

                    noOfUniqueElement-- ;
                    j-- ;
                }
            }
        }


        int[] arrayWithoutDuplicate = Arrays.copyOf(arr,noOfUniqueElement) ;

        System.out.println(Arrays.toString(arrayWithoutDuplicate)) ;

    }
}
