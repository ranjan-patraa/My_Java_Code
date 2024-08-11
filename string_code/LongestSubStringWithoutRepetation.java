package string_code;

import java.util.HashSet;
import java.util.Set;

// write a program LongestSubStringWithoutRepetition
public class LongestSubStringWithoutRepetation {

    public static void main(String[] args) {

        String str = "abccdab" ;

      String s =  non_repeated_SubString(str) ;

        System.out.println(s);

    }

    static String non_repeated_SubString(String str) {

        Set<Character> set = new HashSet<>() ;

        String longestTillNow= "" ;

        String longestOverAll = "" ;

        for(int i = 0 ; i < str.length() ; i++) {

            char c = str.charAt(i) ;

            if(!set.contains(c)) {

                set.add(c) ;

                longestTillNow+=c ;

            }else {

                longestTillNow="" ;
                set.clear();
            }

            if(longestTillNow.length() > longestOverAll.length())
            {
                longestOverAll = longestTillNow ;
            }

        }

        return longestOverAll ;
    }
}
