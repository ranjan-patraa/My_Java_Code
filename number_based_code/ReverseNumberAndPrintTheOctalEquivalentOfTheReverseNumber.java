package number_based_code;

public class ReverseNumberAndPrintTheOctalEquivalentOfTheReverseNumber {

    public static void main(String[] args) {

        int number = 123 ;

        reverseNumber(number) ;

        octalEquivalentOfReverseNumber(number);
    }
    static void reverseNumber(int n) {

        int temp = n ;
        int reminder  ;
        int reverseNumber = 0  ;

        while ( temp != 0 ) {

            reminder = temp % 10 ;
            reverseNumber = reverseNumber * 10 + reminder ;
            temp = temp / 10 ;
        }

        System.out.println("reverse no of " +n +" = "+reverseNumber) ;

        octalEquivalentOfReverseNumber(reverseNumber) ;
    }

    static void octalEquivalentOfReverseNumber(int reverseNumber) {

        int temp = reverseNumber ;
        int r ;
        int sum = 0 ;
        int i = 1 ;

        while(temp != 0) {

             r = temp % 8 ;
             sum = sum + i * r ;
             i = i * 10 ;
             temp = temp/8 ;

        }

        System.out.println("octalEquivalentOfReverseNumber of "+ reverseNumber + ": "+sum) ;
    }
}
