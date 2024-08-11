package string_code;

import java.lang.reflect.Array;
import java.util.Arrays;

public class WordReverse {

    public static void main(String[] args) {

        String str = "java concept of the day" ;

        String splitArray[] = str.split(" ");

        for (int i = splitArray.length-1 ;i >=0 ; i --){

            System.out.print(splitArray[i]+" ") ;
        }
    }
}
