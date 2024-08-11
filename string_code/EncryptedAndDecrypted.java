package string_code;

public class EncryptedAndDecrypted {

    public static void main(String[] args) {

        String str = "Welcome to cheena  tech point"; //"\\jqhtrj%yt%hmjjsf%%yjhm%utnsy% "  ch1 -= 5 ;

        System.out.println(str) ;

        char ch[] = str.toCharArray() ;

        for(char ch1 : ch ){

            ch1 += 5 ; // logic  every character add with 5 and return sum special character

            System.out.print(ch1) ;


        }
    }
}
