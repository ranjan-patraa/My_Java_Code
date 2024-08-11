package string_code;

public class RemoveSpecialCharacterFromTheString {

    public static void main(String[] args) {

        String str = "$j#@a!^va&*" ;

        String str1 = str.replaceAll("[^a-zA-Z0-9]","") ;
        System.out.println(str1) ;
    }
}
