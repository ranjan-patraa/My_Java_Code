package array_code;

import java.util.HashSet;

public class FirstDuplicateElementInAnArray {

    public static void main(String[] args) {

        firstDuplicateElementInArray(new int[] {12,4,5,7,6,3,4,8,2,4,9});


    }

    public static void firstDuplicateElementInArray(int arr[]) {

       /* for (int i = 0 ; i < arr.length ; i ++) {

            int temp = 0 ;

            for (int j = i + 1; j < arr.length ; j++  ) {

                if(arr[i] == arr[j]) {

                    System.out.println(arr[i]+"\tis 1st duplicate element");

                    temp = temp+1 ; break ;
                }
            }
            if (temp > 0)
                break;
        }*/

        HashSet<Integer> hs = new HashSet<>() ;


        int temp = 0 ;

        for (int i = arr.length-1 ; i >= 0 ; i--) {



             if (hs.contains(arr[i])) {

                temp = i ;

             } else {

                 hs.add(arr[i]) ;
             }


        }

        if (temp != -1)

            System.out.println("1st duplicate element is : "+ arr[temp]) ;


    }
}
