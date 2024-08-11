package java8_code;

import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StringsAnagramOrNot_11 {

    public static void main(String[] args) {

        String s = "RaceCar" ;
        String s1 = "carRace" ;

        s = Stream.of(s.split(""))
                 .map(String::toUpperCase).sorted().collect(Collectors.joining()) ;
        s1 = Stream.of(s1.split("")).map(String::toUpperCase).sorted()
                .collect(Collectors.joining()) ;

        if(s.equals(s1)) {

            System.out.println("Strings are anagram") ;

        }else {

            System.out.println("Two strings are not anagram");

        }
    }
}
