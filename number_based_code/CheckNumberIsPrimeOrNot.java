package number_based_code;

public class CheckNumberIsPrimeOrNot {

    public static void main(String[] args) {

        boolean noIsPrimeOrNot = isPrime(7) ;

        if (noIsPrimeOrNot) {

            System.out.println("no is primeNumber") ;
        }
        else {

            System.out.println("no is not prime number");
        }
    }

    public static boolean isPrime(int number) {

        boolean isDivisible = false ;

        for (int i = 2 ; i < number ; i++) {

            if(number % 2 == 0){

                 isDivisible = true ;
                break ;
            }
        }

        return number > 1 && !isDivisible ;
    }


}
