package string_code;

import java.util.Arrays;

public class ReverseEachWordOfString {

    public static void main(String[] args) {

        String s = "hello world";

//        char[] chars = s.toCharArray() ;
//        for(int i  = 0 ;  i < chars.length/2 ; i++ ) {
//
//            char temp = chars[i];
//            chars[i] =  chars[chars.length-i-1];
//            chars[chars.length-i-1] = temp ;
//        }
//
//        System.out.println( String.valueOf(chars) ) ;


         

        String reverseString = "" ;

       String[] ch = s.split(" ");

        for(int i = 0 ; i < ch.length ; i++) {

            String word = ch[i] ;
            String reverseWord = "" ;

            for(int j = word.length()-1 ; j >= 0 ; j--) {

                reverseWord = reverseWord + word.charAt(j) ;

            }

            reverseString = reverseString + reverseWord +" " ;
        }

        System.out.println(reverseString);
        
    }

}
