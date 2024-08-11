package array_code;

import java.util.Arrays;

public class FindPairOfElementIsEqualToGivenNumber

{

    public static void main(String[] args) {

        int [] arr =   {5,6,8,2,3,9,9,4,3,1,2} ;


        int sum = 18 ;

        Arrays.sort(arr) ;

        int i = 0 ;
        int j  = arr.length-1 ;

        while(i < j) {

            if(arr[i] + arr[j] == sum) {

                System.out.println(arr[i]+ "+" +arr[j] + "=" + sum) ;

                i++ ;
                j-- ;

            } else if (arr[i] + arr[j] < sum) {

                i++ ;

            } else if (arr[i] + arr[j] > sum) {

                j-- ;

            }

        }
    }
}
