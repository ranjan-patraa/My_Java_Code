package string_code;

public class StringIsPanagramOrNot {

    public static void main(String[] args) {
        String str = "The Quick brown fox jumps over the lazy Dog" ;

       if( isPanagram(str.toLowerCase()) ){

           System.out.println("String is Pnagram") ;
       }else{

           System.out.println("String is Not Panagram") ;
       }
    }

    private static boolean isPanagram(String str) {

        if (str.length() < 26) {

            return false ;

        } else {

            for (char ch = 'a'; ch<='z' ;ch++) {

                if (str.indexOf(ch) < 0) {

                    return false ;
                }
            }
        }

        return true ;
    }
}
