package array_code;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.HashSet;

// Find Missing Number in Array
public class FindTheListOfMissingNumber {

    public static void main(String[] args) {

        int[] arr = {2, 4, 1, 5, 7, 8, 0};

         missingNumber(arr);



    }

    public static void missingNumber(int[] arr) {

        HashSet<Integer> hs = new HashSet<>();

        for (int i : arr)
            hs.add(i);

        int n = arr.length + 1;

        for (int i = 0; i < n; i++) {

            if (!hs.contains(i)) {

                System.out.println(i);
            }
        }
    }
}