package number_based_code;

public class FactorialNumber {

    public static void main(String[] args) {

       int factorialOfNumber = factorial(5) ;

        System.out.println(factorialOfNumber);

    }

    public static int factorial(int number) {

        int fact = 1;

        for(int i = number ; i > 0 ; i--) {

            fact = fact * i ;
        }

        return  fact ;
    }
}
