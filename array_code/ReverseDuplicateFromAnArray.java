package array_code;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class  ReverseDuplicateFromAnArray {

    public static void main(String[] args) {

        int arr[] = {43,54,78,54,87,90,90} ;

        findDuplicate(arr) ;
    }

    static void findDuplicate(int[] a) {

         HashMap<Integer,Integer> hs = new HashMap<>() ;

       for(int no : a) {

           Integer i = hs.get(no) ;

           if(i == null) {

               hs.put(no ,1) ;

           }else {

               i = i + 1 ;

               hs.put(no,i) ;
           }
       }

        Set<Integer> duplicate = new HashSet<>() ;

        Set<Map.Entry<Integer,Integer>> entrySet = hs.entrySet() ;

       for(Map.Entry<Integer,Integer> es : entrySet) {

           if(es.getValue() > 1) {

                 duplicate.add(es.getKey()) ;
           }
        }

        System.out.println("duplicate is : " +duplicate);

        System.out.print("reverse of duplicate is :") ;

       for(int dp : duplicate) {

           int temp = dp ;
           int reverse = 0 ;

           while(temp != 0) {

               int r = temp%10 ;
               reverse = reverse*10 +r ;
               temp = temp /10 ;
           }

           System.out.print( reverse +" ") ;
       }
    }

}
