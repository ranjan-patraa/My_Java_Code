package java8_code;

import javax.xml.stream.events.EntityReference;
import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class CountTheNumberOfOccurenceOfWordsInGivenString {

    public static void main(String[] args) {

        String str = "Welcome To Code Decode And Code Decode Welcome You" ;

     /*   LinkedHashMap<String,Integer> hs = new LinkedHashMap<>() ;

        for(String s : str.split("")) {

            Integer i = hs.get(s) ;

            if(i == null) {

                hs.put(s,1) ;
            }else {

                i =i+1 ;
            hs.put(s,i) ;

            }

        }

        hs.forEach((k,v)-> System.out.println(k+" "+v)) ;

        String k = hs.entrySet().stream().filter(i->i.getValue()>1).findFirst().get().getKey() ;

        System.out.println(k) ;*/

        List<String> listString = Arrays.asList(str.split(" ")) ;

        Map<String,Long> map =  listString.stream()
               .collect(Collectors.groupingBy(Function.identity(),Collectors.counting())) ;

        System.out.println(map) ; // {And=1, Decode=2, Welcome=2, To=1, Code=2, You=1}





       Map<String,Long> map1 =  Arrays.stream(str.split(""))
                .collect(Collectors.groupingBy(Function.identity() ,Collectors.counting())) ;
        System.out.println(map1); // { =8, A=1, C=2, c=4, D=2, d=5, e=10, l=2, m=2, n=1, o=8, T=1, u=1, W=2, Y=1}



    }
}
