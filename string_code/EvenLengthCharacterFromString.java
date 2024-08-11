package string_code;

public class EvenLengthCharacterFromString {

    public static void main(String[] args) {


        String str = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";

        char[] ch = str.toCharArray() ;
        for (int i = 1; i < ch.length ;i ++){

             if(i%2 !=0 ) {

                 System.out.println(ch[i]) ;
             }
        }
    }
}