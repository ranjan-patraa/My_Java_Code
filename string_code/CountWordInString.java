package string_code;

import java.util.Arrays;

public class CountWordInString {

    public static void main(String[] args) {

        String str3 = "java concept of the day" ;

        //one way
        String[] st = str3.split(" ") ;
         int iii = st.length;
        System.out.println(iii);

        // another way
        int c = 0 ;
        if(str3.charAt(0) != ' ') {

            c++ ;
        }
        for(int i =0 ; i < str3.length()-1 ; i++) {
            if(str3.charAt(i) == ' ' && str3.charAt(i+1) != ' ' ){

                c++ ;
            }

        }

        System.out.println(c);

    }
}
