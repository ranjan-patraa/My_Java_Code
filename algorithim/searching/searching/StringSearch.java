package algorithim.searching.searching;

public class StringSearch {
    public static void main(String[] args) {

        String str = "Abhinav" ;
        char target = 'i' ;

        System.out.println(searchACharacterFromString(str,target)) ;
    }

    static boolean searchACharacterFromString(String str , char targetElement) {

        if(str.length() == 0) {

            return false ;
        }

        for (int i =0 ; i < str.length() ;i++) {   // for( int ii : str.toCharArray())

            if(targetElement == str.charAt(i)) {

                return true ;
            }
        }
        return false ;
    }
}
