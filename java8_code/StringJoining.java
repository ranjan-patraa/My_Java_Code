package java8_code;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class StringJoining {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the no");
        int i = sc.nextInt();
        sc.nextLine();
        List<String> list = new ArrayList<>() ;

        for( int j = 0 ; j < i ; j++) {

            System.out.println("Enter String");
            String temp = sc.nextLine();
            list.add(temp) ;
        }

        for(String s : list){

            System.out.print(s+" ");
        }

        String ss = list.stream().filter( s -> s.length() == 3 || s.length() == 4)
                .collect(Collectors.toList())
                .stream().sorted(Collections.reverseOrder())
                .collect(Collectors.joining("-"));

        System.out.println(ss);
    }
}
