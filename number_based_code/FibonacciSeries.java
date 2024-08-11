package number_based_code;

public class FibonacciSeries {

    public static void main(String[] args) {

        findFibonacciSeries(10);


}

    public static void findFibonacciSeries(int noOfSeries) {

        int a = 0 ;
        int b = 1 ;
        int c ;

        for(int i = 1 ; i <= noOfSeries ;i++) {

            System.out.println(a) ;

            c = a+b ;

            a = b ;
            b = c ;

        }
    }


    }
