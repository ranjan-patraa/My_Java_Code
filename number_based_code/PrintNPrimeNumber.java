package number_based_code;

import java.util.Scanner;

public class PrintNPrimeNumber {

    public static void main(String[] args) {

        int size  ; int c = 0 ;

        Scanner sc = new Scanner(System.in) ;
        System.out.println("Size of PrimeNumber =") ;
        size = sc.nextInt() ;

        int n = 2 ;

           while (c<=size) {

               boolean flag = true ;

               for(int i = 2; i < n ; i++) {

                   if(n%i ==  0) {

                       flag = false ;
                       break;
                   }
               }

               if(flag){

                   System.out.println("number is prime "+n) ;
                   c++ ;
               }
               n++ ;
           }
    }
}
