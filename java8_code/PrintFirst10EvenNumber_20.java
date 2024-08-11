package java8_code;

import java.util.stream.IntStream;

public class PrintFirst10EvenNumber_20 {

    public static void main(String[] args) {

        IntStream.range(1,10).map(i->i*2).forEach(System.out::println) ;
    }
}
