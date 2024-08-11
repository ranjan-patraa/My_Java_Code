package java8_code;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class JoinStringWith_Prefix_Suffix_Delimiter_6 {

    public static void main(String[] args) {

        List<String> list = Arrays.asList("FaceBook","Twitter","YouTube","WhatsUp","TwitterIndia") ;

       String joiningString =  list.stream().collect(Collectors.joining(",","[","]")) ;

       System.out.println(joiningString) ;

       String[] str = {"FaceBook","Twitter","YouTube","WhatsUp","TwitterIndia"} ;

       String stringJoining = Stream.of(str).collect(Collectors.joining(",","[","]")) ;

        System.out.println(stringJoining) ;
    }
}
