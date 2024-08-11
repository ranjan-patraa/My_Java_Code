package java8_code;

import java.util.Arrays;
import java.util.List;

public class FindThoseStringStartWithNumber_21 {

    public static void main(String[] args) {

        List<String> list = Arrays.asList("one","2wo","3hree","four","5ive") ;

        list.stream().filter(f->Character.isDigit(f.charAt(0))).forEach(System.out::println) ;
    }
}
