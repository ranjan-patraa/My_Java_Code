package array_code;

import java.util.Arrays;
import java.util.Stack;

public class ReverseArrayUsingStack {

    public static void main(String[] args) {

        Stack stack = new Stack() ;

        int arr[] = {1,4,5} ;

        System.out.println(Arrays.toString(arr)) ;

        for(int i = 0 ; i < arr.length ; i++) {

            stack.push(arr[i]) ;

        }

        for(int i = 0 ; i < arr.length ; i++) {

             arr[i] = (int)stack.pop() ;
        }

        System.out.println(Arrays.toString(arr)) ;
    }
}
