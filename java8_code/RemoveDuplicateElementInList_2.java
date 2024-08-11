package java8_code;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class RemoveDuplicateElementInList_2 {

    public static void main(String[] args) {

        List<String> listOfString = Arrays.asList("pen","paper","pencil","pen") ;

        Set<String> findDuplicateString = new HashSet<>() ;


       List<String> removeDuplicate =  listOfString.stream().distinct().collect(Collectors.toList()) ;

        System.out.println(removeDuplicate) ;

        System.out.println("*****************************************");

        listOfString.stream().filter(s->findDuplicateString.add(s)).collect(Collectors.toSet()).forEach(s-> System.out.println(s)) ;
    }
}
