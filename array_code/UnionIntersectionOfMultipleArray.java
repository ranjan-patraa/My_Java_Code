package array_code;

import java.util.Arrays;
import java.util.HashSet;

public class UnionIntersectionOfMultipleArray {

    public static void main(String[] args) {

        int[] inputArray1 = {2, 3, 4, 7, 1};

        int[] inputArray2 = {4, 1, 3, 5};

        int[] inputArray3 = {8, 4, 6, 2, 1};

        int[] inputArray4 = {7, 9, 4, 1};

        unionIntersection(inputArray1,inputArray2,inputArray3,inputArray4) ;
    }

    static void unionIntersection(int[] ... inputArrays) {

        HashSet<Integer> union = new HashSet<>() ;

        for(int[] inputArray : inputArrays) {

            System.out.println(Arrays.toString(inputArray));

            for (int i : inputArray) {

                union.add(i) ;
            }
        }

        System.out.println("unionSet is : "+union);


    }
}
