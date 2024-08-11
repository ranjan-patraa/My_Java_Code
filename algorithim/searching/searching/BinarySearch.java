package algorithim.searching.searching;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class BinarySearch {

    public static void main(String[] args) {

        int a[] = {10, 20, 30, 80, 90, 10};
        int target = 90;

        int index = binarySearch(a, target);
        System.out.println(index);

        List<Integer> list = new ArrayList<>() ;

        Collections.sort(list) ;


    }

    static int binarySearch(int[] arr, int target) {

        int start = 0;
        int end = arr.length - 1;

        while (start <= end) {

            int mid = start + (end - start) / 2;


            if (target > arr[mid]) {

                start = mid + 1;

            } else if (target < arr[mid]) {

                end = mid - 1;

            } else {
                return mid;
            }
        }
        return -1;
    }



}