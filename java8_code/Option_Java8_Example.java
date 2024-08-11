package java8_code;

import java.util.Optional;

public class Option_Java8_Example {

    public static void main(String[] args) {

        String str = null;

        Optional<String> optional = Optional.ofNullable(str) ;

        if(optional.isPresent()) {

            System.out.println("value is "+optional.get()) ;

        } else {

            System.out.println("pls insert value") ;
        }
    }
}
