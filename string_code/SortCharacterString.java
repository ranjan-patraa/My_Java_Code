package string_code;

import java.util.Arrays;

// Write a program sort character String
public class SortCharacterString {

    public static void main(String[] args) {


        String str = "java";

        char[] ch = str.toCharArray();

        Arrays.sort(ch) ;

        String sortedString  = new String(ch) ;

        System.out.println(sortedString);
    }
}