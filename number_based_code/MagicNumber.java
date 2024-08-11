package number_based_code;

import java.util.Scanner;

public class MagicNumber {

    public static void main(String[] args) {

       int n ; int num ; int r = 0 ; int sum = 0 ;

        Scanner sc = new Scanner(System.in) ;
        System.out.print("Enter number =") ;
         n = sc.nextInt() ;
         num = n ;

         while (num > 9) {

             while (num > 0) {

                 r = num % 10 ;
                 sum = sum + r ;
                 num/=10 ;

             }

             num = sum ;
             sum = 0 ;
         }

         if(num == 1) {

             System.out.println("number is magicNumber") ;

         } else {

             System.out.println("Number is  not a magicNumber") ;
         }

    }
}
