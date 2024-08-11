package java8_code;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.stream.Collectors;

public class ConvertListOfIntegerIntoListOfStringUsingFunctionAndConsumer {

    public static void main(String[] args) {

        List<Integer> liInteger = Arrays.asList(1, 2, 34, 6);

        System.out.println("list of integer : "+ liInteger) ;


        List<String> listOfString1 =  liInteger.stream().map(i->String.valueOf(i)).collect(Collectors.toList()) ;

        System.out.println(listOfString1);

        List<String> listOfString =  coverListString(liInteger,s->String.valueOf(s)) ;


        Consumer<List<String>> c = System.out::println ;

        c.accept(listOfString) ;


    }

    static <T,U>List<U> coverListString(List<T> listInteger , Function<T,U> function) {

        return listInteger.stream().map(function).collect(Collectors.toList()) ;

    }



}
