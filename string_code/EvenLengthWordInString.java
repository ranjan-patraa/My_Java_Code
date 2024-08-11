package string_code;

import java.util.Arrays;
import java.util.stream.Stream;

public class EvenLengthWordInString {

    public static void main(String[] args) {

        String str = "Hell World we lol" ;

      //  Stream.of(str.split(" ")).filter(i->i.length()%2==0).forEach(s->System.out.println(s)) ;


        String[] st = str.split(" ") ;

        for(int i = 0 ; i < st.length ; i++) {

            if( st[i].length() % 2 == 0 ) {

                System.out.println(st[i]) ;
            }
        }
    }
}
