package recursion;

public class factorialOfNumber {

    public static void main(String[] args) {

        int fact = factorial(5) ;

        System.out.println(fact) ;

        int ans = sumOfNo(5) ;

        System.out.println(ans) ;
    }

    public static int factorial(int n) {

        if(n == 1) {
            return 1 ;
        }
        return n * factorial(n-1) ;
    }

    public static int sumOfNo(int n) {

        if(n == 1) {

            return  1 ;
        }

        return n + sumOfNo(n-1) ;
    }
}
