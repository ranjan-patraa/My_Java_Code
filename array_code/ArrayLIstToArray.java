package array_code;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayLIstToArray {

    public static void main(String[] args) {

        List<Integer> list = new ArrayList<>() ;

        list.add(1) ; list.add(2) ; list.add(3) ;

        Object[] arr1 = list.toArray() ;

        System.out.println(Arrays.toString(arr1)) ; // [1, 2, 3]

        int[] arr  = list.stream().mapToInt(Integer::intValue).toArray() ;

        System.out.println(Arrays.toString(arr)) ; // [1, 2, 3]

    }
}
