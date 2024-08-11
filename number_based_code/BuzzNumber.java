package number_based_code;

public class BuzzNumber {

    public static void main(String[] args) {

        int number = 127 ;

        if( number % 10 == 7 || number % 7 == 0) {

            System.out.println(number+" is a BuzzNumber");

        }else {

            System.out.println(number+" is not a BuzzNumber");

        }
    }
}
