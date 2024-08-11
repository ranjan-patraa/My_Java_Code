package string_code;

import java.util.LinkedHashMap;
import java.util.Map;

public class StringCompression {

    public static void main(String[] args) {

        String str = "aaabbcceee" ;

        String nString = compression(str) ;

        System.out.println(nString);

    }

    static String compression(String str) {

        Map<Character,Integer> map = new LinkedHashMap<>() ;

        for (int i = 0 ; i < str.length() ; i ++) {

            if(map.get(str.charAt(i))!= null) {

                map.put(str.charAt(i),map.get(str.charAt(i))+1) ;

            }else {

                map.put(str.charAt(i),1) ;
            }
        }

        StringBuilder sb = new StringBuilder() ;

        for (Map.Entry<Character,Integer> entry : map.entrySet()) {

            sb.append(entry.getKey()) ;
            sb.append(entry.getValue()) ;
        }

        return sb.toString() ;

    }
}
