package string_code;

import java.util.Arrays;
import java.util.StringTokenizer;
import java.util.regex.Pattern;

public class SplitStringInJava {

    public static void main(String[] args) {

        String s  = "091-1234567890" ;

        String str[]  = s.split("-") ;
        System.out.println(Arrays.toString(str));

        StringTokenizer string = new StringTokenizer(s,"-") ;
        while (string.hasMoreElements()) {

            String str2 = string.nextToken() ;

            System.out.println(str2);
        }
    }
}
