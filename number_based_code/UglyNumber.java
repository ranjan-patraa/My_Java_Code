package number_based_code;

import java.util.Scanner;

public class UglyNumber {

    public static void main(String[] args) {

        int n  = 0 ;
        boolean flag = true ;

        Scanner sc = new Scanner(System.in) ;
        System.out.print("Enter number =") ;
          n = sc.nextInt() ;

        while(n != 1) {

            if(n % 5 == 0){

                n/= 5;

            } else if (n % 3 == 0) {

                    n = n/3 ;

            }else if (n % 2 == 0) {

                n = n/2 ;

            }else {

                flag = false ;
                break;
            }
        }

        if(flag) {

            System.out.println("number is ugly no") ;

        }else {

            System.out.println("no is not a ugly no");
        }
    }
}
