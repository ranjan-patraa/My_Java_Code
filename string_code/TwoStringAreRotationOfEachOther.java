package string_code;

public class TwoStringAreRotationOfEachOther {

    public static void main(String[] args) {

        String str = "abcd" ;
        String rotateString = "bcda" ;

        boolean b = isRotationOrNot(str,rotateString) ;

        System.out.println(b);
    }

    static boolean isRotationOrNot(String str , String s) {

        if(str.length() != s.length()) {

            return false ;

        }else if (str == null || s == null){

            return false ;

        } else {

            String concat = str+str;

           return concat.contains(s) ;
        }
    }
}
