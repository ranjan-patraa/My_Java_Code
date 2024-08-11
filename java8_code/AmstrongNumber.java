package java8_code;

public class  AmstrongNumber {

    public static void main(String[] args) {

        int number = 371 ;
         System.out.println(number+" isAmstrong : "+armstrongNumberJava8(number));


    }

    static boolean armstrongNumberJava8(int number) {

        int length = String.valueOf(number).length() ;

        int sum = String.valueOf(number).chars().map(ch->Character.digit(ch,10))
                .map(digit->(int)Math.pow(digit,length)).sum();

        return sum == number ;
    }
}
