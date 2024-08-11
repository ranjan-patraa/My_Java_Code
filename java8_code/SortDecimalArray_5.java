package java8_code;

import java.util.Arrays;
import java.util.Comparator;

public class SortDecimalArray_5 {

    public static void main(String[] args) {

        double arr[] ={12.45,23.58,17.13,42.89,33.78,42.99} ;

       Object[] a = Arrays.stream(arr).boxed().sorted(Comparator.reverseOrder()).toArray() ;

        System.out.println(Arrays.toString(a)) ; // [42.99, 42.89, 33.78, 23.58, 17.13, 12.45]
    }
}
