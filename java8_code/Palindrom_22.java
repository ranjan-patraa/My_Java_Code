package java8_code;

import java.util.stream.IntStream;

public class Palindrom_22 {

    public static void main(String[] args) {

        String str = "ROTATOR" ;

       boolean isPalingDrom  = IntStream.range(0,str.length()/2)
                .noneMatch(i->str.charAt(i) != str.charAt(str.length()-i-1)) ;

       if(isPalingDrom) {

           System.out.println("String is palingDrom") ;
       }else {

           System.out.println("String is not palingDrom") ;
       }
    }
}
