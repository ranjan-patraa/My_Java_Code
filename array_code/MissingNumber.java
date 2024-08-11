package array_code;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

public class MissingNumber {

    public static void main(String[] args) {


        int arr[] = {1, 3, 5, 8, 7, 2, 4,0};



        HashSet<Integer> hs = new HashSet<>() ;

        for(int i : arr) {

            hs.add(i) ;
        }
        int no = arr.length + 1;

        for(int i  = 0 ; i<no  ;i++) {

            if(!hs.contains(i)) {

                System.out.println(i);
            }
        }


//        int sumOfNumber = (no * (no + 1)) / 2;
//
//        int sumOfElement = 0 ;
//
//        for (int i = 0 ; i < arr.length ; i++) {
//
//            sumOfElement = sumOfElement+arr[i] ;
//        }
//
//        int missingNumber = sumOfNumber-sumOfElement ;
//
//        System.out.println(missingNumber) ;
    }
}