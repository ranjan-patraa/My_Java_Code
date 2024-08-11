package number_based_code;

import java.util.Scanner;

public class PronicNumber {

    public static void main(String[] args) {

        int n ;
        boolean flag = false ;

        Scanner sc = new Scanner(System.in) ;
        System.out.print("Enter Number =");
        n = sc.nextInt() ;

        for(int i = 0 ; i < n  ; i++) {

            if(i*(i+1) == n) {

                flag = true ;
                break;
            }
        }

        if(flag) {

            System.out.println("Number is pronic_Number") ;

        }else  {

            System.out.println("Number is not  pronic_Number") ;
        }
    }
}
