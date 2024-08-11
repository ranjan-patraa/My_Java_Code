package java8_code;

import java.util.Arrays;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class FindLongestStringFromGivenArray {

    public static void main(String[] args) {

        String[] str = {"java","spring boot","microservices","kafka"} ;

        String longestString = Arrays.stream(str)
                .reduce((word1,word2)-> word1.length()>word2.length()?word1:word2)
                .get() ;

        System.out.println(longestString);


        String lambaString =
        Stream.of (str)
                .reduce( (string1,string2) -> string1.length() > string2.length() ? string1 : string2)
                .orElse(null) ;
        System.out.println(lambaString);


    }
}
