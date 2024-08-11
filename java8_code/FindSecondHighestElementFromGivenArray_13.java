package java8_code;

import java.util.Arrays;
import java.util.Comparator;

public class FindSecondHighestElementFromGivenArray_13 {
    public static void main(String[] args) {


        int arr[] = {2, 4, 6, 7, 19, 37, 23, 12};

        Integer secondHighestInteger =  Arrays.stream(arr).boxed().sorted(Comparator.reverseOrder()).skip(1).findFirst().get() ;

        System.out.println("second highest element in Array is : "+secondHighestInteger);
    }
}