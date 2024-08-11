package array_code;

import java.util.HashMap;

public class ContiguousSubArray_With_givenSum {

    public static void main(String[] args) {

        int[] arr1 = {2, 4, 2, 8, 3, 3, 2, -4, 12};
        int[] arr2 = {5, -9, 4, -2, 7, 1, -4, -3, -7};

        int sum = 8 ;
        int sum1 = -7 ;

        contiguousSubArray(arr1, 8);
        System.out.println("----------------------------------");
        contiguousSubArray(arr2, -7);
        System.out.println("----------------------------------");


    }

    static void contiguousSubArray(int[] inputArray, int givenSum) {

        int currentSum = 0;

        //Defining sumIndexMap with currentSum as keys and index as values

        HashMap<Integer, Integer> sumIndexMap = new HashMap<>();

        //Inserting 0 as key and 1 as value into sumIndexMap

        sumIndexMap.put(0, -1);

        //Iterating each element of inputArray

        for (int i = 0; i < inputArray.length; i++) // i-0 : map(2,0) , cs-2 / {2, 4, 2, 8, 3, 3, 2, -4, 12}

            //   i-1 : map(6,1) , cs-6  / i-2 : map(8,2) , cs-8 / i-3 : map(8,2) , cs-16

            //
        {
            //Adding current element to currentSum

            currentSum = currentSum + inputArray[i];

            //Checking whether sumIndexMap contains (currentSum - givenSum)

            if (sumIndexMap.containsKey(currentSum - givenSum))
            {
                //If it contains, printing sub array

                printSubArray(inputArray, sumIndexMap.get(currentSum - givenSum)+1, i);
            }

            //Inserting currentSum as key and i as its value into sumIndexMap

            sumIndexMap.put(currentSum, i);
        }
    }


    //Utility Method To Print Sub Array

    private static void printSubArray(int[] inputArray, int start, int end)
    {
        System.out.print("[");

        for (int i = start; i <= end; i++)
        {
            System.out.print(" "+inputArray[i]);
        }

        System.out.println(" ]");
    }



}