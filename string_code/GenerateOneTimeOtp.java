package string_code;

import java.util.Random;

public class GenerateOneTimeOtp {

    public static void main(String[] args) {

        int[] arr = {4,6,7} ;

        String str = "ABCDEFGHIJKLMNOPQRSTUVWXYZ" ;

        System.out.println(getRandomFromArray(arr));

        String randomStringGenerator = randomString(str) ;

        System.out.println(randomStringGenerator) ;



        int  random = (int) ( Math.random() *900000 )+100 ;

        String  otp = String.valueOf(random);

        System.out.println("Otp: "+otp);
    }

    static int getRandomFromArray(int[] arr) {

        int result = new Random().nextInt(arr.length) ;

        return arr[result] ;
    }

    static String randomString (String str) {

        StringBuilder sb = new StringBuilder() ;
        int length = 6 ;

        for(int i  = 0 ; i < length ; i++) {

            int index = new Random().nextInt(str.length()) ;

            char randomChar = str.charAt(index) ;

            sb.append(randomChar) ;
        }

        String randomString = sb.toString() ;

        return randomString ;
    }
}
