package functionalprogramming;

import java.util.function.BiFunction;
import java.util.function.Function;

public class _Function {

    public static void main(String[] args) {

        int increment = increment(1);
        System.out.println(increment);

        System.out.println("---------------------------------");

        // Function ;

        int increment2 = incrementByOneFunction.apply(1) ;
        System.out.println(increment2) ;

        System.out.println("---------------------------------");

        int multiply = multipleBy2.apply(increment2) ;
        System.out.println(multiply) ;

        System.out.println("---------------------------------");

        Function<Integer,Integer> addBy1AndMultipleBy2 = incrementByOneFunction.andThen(multipleBy2) ;
        int andThen  = addBy1AndMultipleBy2.apply(1) ;
        System.out.println(andThen) ;

        System.out.println("---------------------------------");


        // Bi function take one argument and produce one result

        int byFunction  = incrementBy1AndMultiplyByFunction.apply(4,10) ;
        System.out.println(byFunction) ;

        int normal2ArgsFunction = incrementBy1AndMultipleBy10(4,10) ;
        System.out.println(normal2ArgsFunction) ;

    }


    // Function
    static Function<Integer,Integer> incrementByOneFunction = number -> number++ ;

    static Function<Integer,Integer> multipleBy2 = number -> number * 2 ;


    // function one args
    static int increment(int number) {

        return number+1 ;
    }

    // BiFunction
    static BiFunction<Integer,Integer,Integer> incrementBy1AndMultiplyByFunction =

            (noIncrementBy1,noMultiplyBy10) ->  (noIncrementBy1 + 1) * noMultiplyBy10 ;

    // normal function
    static int incrementBy1AndMultipleBy10(int number , int n) {

        return number+1 * n ;
    }
}
