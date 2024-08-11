package java8_code;

import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ReverseEachWordOfAString_17 {

    public static void main(String[] args) {

        String str = "java concept of the day" ;

       String revers =  Stream.of(str.split(" "))
                .map(word-> new StringBuilder(word).reverse())
                .collect(Collectors.joining(" ")) ;

        System.out.println(revers) ;
    }
}
