package number_based_code;

public class FindTheSumOfDigitsOfNumberGeneratedByFactorial {

    public static void main(String[] args) {
        int number = 7 ;

       int sumOfDigits = factorial(number) ;

        System.out.println(sumOfDigits);
    }

    static int factorial(int number) {

        int factorial = 1;

        for(int i = 1 ; i <= number ;i++) {

            factorial = factorial*i ;

         }

       return sumOfDigitsOfDigitsOfNumberGeneratedBYFactorial(factorial) ;


    }

    static int sumOfDigitsOfDigitsOfNumberGeneratedBYFactorial(int fact) {

        int sum =0 ;
        int r ;

        while(fact != 0) {


            r = fact % 10 ;
             sum = sum + r ;
             fact= fact/10 ;
        }

        return sum ;
    }
}
