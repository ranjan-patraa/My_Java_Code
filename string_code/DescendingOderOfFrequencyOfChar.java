package string_code;

// Write a program to print the character in their descending of frequency of occurrence of String

import java.util.*;

public class DescendingOderOfFrequencyOfChar {

    public static void main(String[] args) {

        String fruit = "banana" ;

        char[] ch = fruit.toCharArray() ;

        Map<Character,Integer> hm =new HashMap<>() ;


        for (char c : ch) {

            Integer i = hm.get(c) ;

            if(i == null ) {

                hm.put(c,1) ;

            }else {

                 i=i+1 ;
                hm.put(c,i) ;
            }
        }

        Set<Map.Entry<Character,Integer>> entrySet = hm.entrySet() ;

        List<Map.Entry<Character,Integer>> listEntry = new ArrayList<>(entrySet) ;

        Collections.sort(listEntry,new Comparator<Map.Entry<Character,Integer>>(){

            @Override
            public int compare(Map.Entry<Character, Integer> o1, Map.Entry<Character, Integer> o2) {
                return o2.getValue().compareTo(o1.getValue());
            }
        }) ;

        for(Map.Entry<Character, Integer> c : listEntry) {

            System.out.println("the frequency of occurrence 0f  "+ c.getKey() +" :"+ c.getValue());
        }
    }
}

   /* the frequency of occurrence 0f  a :3
        the frequency of occurrence 0f  n :2
        the frequency of occurrence 0f  b :1*/