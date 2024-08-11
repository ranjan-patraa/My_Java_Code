package string_code;

public class PermutationOfString {

    public static void main(String[] args) {

        String inputString = "xyz" ;

        printAllPermutation(inputString,"") ;


    }

    public static void printAllPermutation(String s1,String s2) {

        if(s1.length() == 0) {

            System.out.print(s2+" ") ;

            return ;
        }

        for(int i = 0 ; i < s1.length() ; i++ ) {

            char ch = s1.charAt(i) ;

            String result = s1.substring(0,i) + s1.substring(i+1) ;

            printAllPermutation(result,s2+ch) ;
        }

    }
}
