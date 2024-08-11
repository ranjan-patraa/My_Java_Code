package java8_code;

import java.util.Arrays;
import java.util.Comparator;
import java.util.stream.Stream;

public class FindTheLengthOfLongestString {

    public static void main(String[] args) {

        String[] str = {"apple","Banana","Grapes","Avocado"} ;

        longestLengthOfStringInAnArray(str) ;
    }

    private static void longestLengthOfStringInAnArray(String[] str) {

       int maxLength = Arrays.stream(str).mapToInt(string->string.length()).max().orElse(0) ;     //  getAsInt();


        System.out.println(maxLength);



        String s = Stream.of(str)
                   .max(Comparator.comparing(String::length))
                   .orElse(null)  ;

        System.out.println(s+" length is : " +s.length());

    }
}
