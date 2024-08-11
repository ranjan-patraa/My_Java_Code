package string_code;

import java.util.HashMap;

public class FindContinuousSubArrayWhoseSumIsGivenNumber {

    public static void main(String[] args) {


        int arr[] = {42, 15, 12, 8, 6, 32};

        int sumOfSubArray =  26 ;


        int start = 0 ;
        int sum = arr[0] ;

        for (int i = 1; i < arr.length; i++) {

            sum = sum + arr[i] ;

            while(sum > sumOfSubArray && start <= i - 1) {

                sum = sum - arr[start] ;

                start ++ ;


            }
            if(sum == sumOfSubArray) {

                for(int j = start ; j <= i ; j++) {

                    System.out.print(arr[j]+" ") ;
                }



            }
        }


    }
}
