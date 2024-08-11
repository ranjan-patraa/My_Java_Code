package string_code;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class RemoveDuplicateElementFromString {

    public static void main(String[] args) {

        String str = "arpita i love you" ;

        System.out.println(deleteDuplicateCharacterFromString(str));

        System.out.println(returnStringWIthUnique(str));
    }

    public static String deleteDuplicateCharacterFromString(String str) {

        Set<Character> stringSet = new HashSet<>() ;


        StringBuffer sb = new StringBuffer() ;

        for(int i = 0 ; i < str.length() ; i++) {

            Character ch = str.charAt(i) ;

            if(!stringSet.contains(ch)){

                stringSet.add(ch) ;

                sb.append(ch);
            }
        }

        return  sb.toString() ;
    }

    public static String returnStringWIthUnique(String str) {

         HashSet<Character> stringSet = new HashSet<>() ;

         StringBuffer stringBuffer = new StringBuffer() ;

         char[] ch = str.toCharArray() ;

         for (int i =0 ;i < ch.length ; i++) {

             if (!stringSet.contains(ch[i])) {

                 stringSet.add(ch[i]);

                 stringBuffer.append(ch[i]) ;
             }
         }

        return  stringBuffer.toString() ;
    }
}
