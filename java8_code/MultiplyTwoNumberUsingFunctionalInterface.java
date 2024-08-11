package java8_code;

public class MultiplyTwoNumberUsingFunctionalInterface {

    public static void main(String[] args) {

        Finterface total = (a,b)-> a * b ;

        System.out.println(total.multiply(10,20)) ;


        Addition addition = (a , b)-> a + b ;

        System.out.println("Addition is  = "+addition.add(10,20)) ;
    }
}

@FunctionalInterface
interface Finterface {

    public int multiply(int a , int b) ;
}

@FunctionalInterface
interface Addition {

    int add(int a , int b) ;
}
