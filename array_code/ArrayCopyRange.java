package array_code;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayCopyRange {

    public static void main(String[] args) {

        String[] name = {"priovjv", "jbvjnr", "wqbdlc", "c kje"};

        String[] partialName = Arrays.copyOfRange(name, 0, 2);

        System.out.println(Arrays.toString(partialName));  // [priovjv, jbvjnr]

         List<String> nameList =   Arrays.asList(Arrays.copyOfRange(name,2,name.length));

        System.out.println(nameList); // [wqbdlc, c kje]




        String str = "java is a popular language" ;

        String[] s =  str.split((" ")) ;

        System.out.println(Arrays.toString(s)) ;

        String[] s1 = Arrays.copyOfRange(s,2,s.length-1) ;
        System.out.println(Arrays.toString(s1)) ;
        int i = s1.length ; // 2
        System.out.println(i) ;
    }
}