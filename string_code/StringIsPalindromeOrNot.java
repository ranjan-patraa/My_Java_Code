package string_code;

public class StringIsPalindromeOrNot {

    public static void main(String[] args) {

        String str = "abccba" ;

        if(isPalindrome(str)) {

            System.out.println("String : "+str+" is a palindrome");
        }
        else {

            System.out.println("String : "+str+" is not a palindrome");
        }
    }

    public static boolean isPalindrome(String str) {

        String str1 = str.replace("//s","").toUpperCase() ;

        char[] ch = str1.toCharArray() ;

        int start = 0 ;
        int end = str.length()-1 ;

        while (start<=end) {

            if (ch[start] != ch[end]) {

               return false ;
            }

            start++ ;
            end--;

        }
        return true ;
    }
}
