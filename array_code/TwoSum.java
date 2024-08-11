package array_code;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class TwoSum {

    public static void main(String[] args) {

        int[] arr = {12,5,6,9} ;

        int target = 18 ;

        int[] arr1 = twoSum(arr,target) ;

        System.out.println(Arrays.toString(arr1));

    }

    static int[] twoSum(int[] a , int target) {

        Map<Integer,Integer> hashMap = new HashMap<>() ;



        for(int i = 0; i < a.length ; i++) {

            int s = target - a[i] ;

            if(hashMap.containsKey(s)) {

                return new int[] {hashMap.get(s),i} ;
            }

            hashMap.put(a[i],i) ;
        }

        return new int[] {-1} ;
    }
}
