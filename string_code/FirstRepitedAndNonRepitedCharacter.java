package string_code;

import java.util.HashMap;
import java.util.Map;

public class FirstRepitedAndNonRepitedCharacter {

    public static void main(String[] args) {

        String str = "java Concept of the day" ;

        firstRepeatedAndNon_repeated(str) ;
    }

    public static void firstRepeatedAndNon_repeated(String str) {

        Map<Character,Integer> mapCharacter = new HashMap<>() ;

        char[] ch = str.toCharArray() ;

        for (char ch1 : ch) {

            if( mapCharacter.containsKey(ch1)) {

                mapCharacter.put(ch1,mapCharacter.get(ch1)+1) ;

            } else {

                mapCharacter.put(ch1,1) ;
            }
        }

        for(char ch1 : ch) {

            if(mapCharacter.get(ch1) == 1){

                System.out.println( ch1+" First Non_Character In String");

                break;
            }

        }

        for(char ch1 : ch) {

            if(mapCharacter.get(ch1) > 1){

                System.out.println( ch1 +" 1st RepeatedCharacter In String");

                break;
            }

        }

    }
}
