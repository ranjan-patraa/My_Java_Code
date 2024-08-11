package number_based_code;

public class Lcm_OfNumber {

    public static void main(String[] args) {

        int a = 10 ; int b = 20 ;

       int lcmIs =  lcmOfNumber(a,b) ;

        System.out.println(a+" and "+ b +" lcm is  = " + lcmIs) ;

    }

    static int lcmOfNumber(int a , int b) {

        int r ;
        int min ;
        int max ;
        int lcm =1 ; int gcd  = 1 ;

        min = a ;

        if(min > b) {

            min = b ;
            max = a ;
        }else {
            min = a ;
            max = b ;
        }

        while(max > min) {

            r = max % min ;

            if(r==0) {

                gcd = min ;
                break ;

            }else {

                max = min ;
                min = r ;
            }


        }

        lcm = (a*b)/gcd ;

        return lcm ;

    }

}
