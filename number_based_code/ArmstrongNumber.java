package number_based_code;

import com.sun.source.tree.BreakTree;

public class ArmstrongNumber {

    public static void main(String[] args) {



        armstrongNumber(153) ;


    }

    public static void armstrongNumber(int number) {

        int r ;
        int cube = 0 ;
        int temp = number ;

        while(temp > 0) {

            r = temp % 10 ;

            cube = cube+(r * r * r) ;

            temp = temp / 10 ;
        }

        if(number == cube) {

            System.out.println("number\t"+number+ " is ArmstrongNumber") ;

        }else {

            System.out.println("number\t"+number+ " is not a ArmstrongNumber") ;

        }
     }



}
