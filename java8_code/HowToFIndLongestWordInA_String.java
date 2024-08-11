package java8_code;

import java.util.Arrays;
import java.util.Comparator;
import java.util.stream.Stream;

public class HowToFIndLongestWordInA_String {

    public static void main(String[] args) {


        String str = "Longest Word in the String ,How we find";

        String longestWord = Arrays.stream(str.split(" "))
                .max(Comparator.comparing(String::length))
                .orElse(null).toString() ;
        System.out.println(longestWord+" , length is - "+longestWord.length()) ;


        System.out.println("-------------------------------------");


        String ste = "java is a popular Language and ObjectOriented ProgramingLanguages" ;

        String longestEvenString = Arrays.stream(ste.split(" "))
                     .filter(i->i.length()%2==0)
                     .max(Comparator.comparing(String::length)).get().toString() ;

        System.out.println(longestEvenString);
    }
}
