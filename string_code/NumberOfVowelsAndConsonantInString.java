package string_code;

public class NumberOfVowelsAndConsonantInString {

    public static void main(String[] args) {

        String str  = "java concept of the day" ;

        /*str = str.toLowerCase().replaceAll("\\s+","") ;
        boolean c =  str.matches(".*[aeiou].*") ;
        System.out.println(c) ;*/

        noOfConsonantAndVowel(str) ;
    }

    static void noOfConsonantAndVowel(String str) {

        int vowelsCount =0  ;
        int consonantCount =0 ;

       str =  str.replaceAll("\\s" , "");

        for(int i = 0 ;i<str.length() ;i++) {


            if(isVowels(str.charAt(i))) {

                ++vowelsCount ;

            }else {

                ++consonantCount ;
            }
        }

        System.out.println("noOfVowels is : "+vowelsCount);
        System.out.println("noOfConsonant is : "+consonantCount);


    }

    private static boolean isVowels(char c) {

        c = Character.toUpperCase(c) ;

        return (c =='A' || c =='E' || c =='I' || c =='O' || c =='U') ;
    }
}
