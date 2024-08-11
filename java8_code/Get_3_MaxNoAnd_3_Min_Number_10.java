package java8_code;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Get_3_MaxNoAnd_3_Min_Number_10 {

    public static void main(String[] args) {

        List<Integer> list = Arrays.asList(45,12,56,15,24,75,31,89) ;

        System.out.println("minimum_3_Number") ;
        list.stream().sorted().limit(3).forEach(s-> System.out.print(s+" ")) ;

        System.out.println() ;

        System.out.println("minimum_3_Number") ;
        list.stream().sorted(Comparator.reverseOrder())
                .limit(3).forEach(s-> System.out.print(s+" ")) ;

    }
}
