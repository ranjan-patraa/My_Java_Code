package array_code;

import java.util.Arrays;

public class RemoveSpecificElementInAnArray {

    public static void main(String[] args) {

       int[] returnNewArray = deleteSpecificElementInAnArray(new int[] {1,2,3,4,5,6,7},5) ;

        System.out.println(Arrays.toString(returnNewArray));
    }

    public static int[] deleteSpecificElementInAnArray(int[] array,int specificElement) {

        int[] newArray = new int[array.length-1] ;

        int index = 0 ;

        for(int i = 0 ; i < array.length ;i++) {

            if(array[i] != specificElement) {

                newArray[index] =array[i] ;

                index++ ;
            }
        }

        return newArray ;
    }

}
