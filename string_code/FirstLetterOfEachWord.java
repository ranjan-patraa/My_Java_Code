package string_code;

public class FirstLetterOfEachWord {

    public static void main(String[] args) {

        String s = "Java Concept Of The Day" ;

        String firstLetterOfString  =firstLetterOfEachWord(s) ;

        System.out.println(firstLetterOfString) ;
    }

    static String firstLetterOfEachWord(String str) {

        StringBuilder sb =new StringBuilder() ;

        for(String s : str.split(" ")){

            String s1 = s ;

            sb.append(s1.charAt(0)) ;
        }

        return sb.toString() ;
    }
}
