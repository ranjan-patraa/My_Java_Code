package java8_code;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FindCommonElement_InTwoArray_16 {

    public static void main(String[] args) {


        int[] arr1 = {12, 24, 36, 60, 48, 12, 72, 60};

        int[] arr2 = {12, 84, 96, 108, 60,60, 24};

        findCommonElements(arr1,arr2) ;


    }

    private static void findCommonElements(int[] arr1, int[] arr2) {

      List<Integer> commonElement =  Arrays.stream(arr1)
                                           .filter(number-> Arrays.stream(arr2)
                                                   .anyMatch(arr2Number-> arr2Number==number))
                                                      .distinct()
                                                         .boxed().collect(Collectors.toList()) ;

        System.out.println("CommonElement in the given array is : "+ commonElement) ;
    }
}