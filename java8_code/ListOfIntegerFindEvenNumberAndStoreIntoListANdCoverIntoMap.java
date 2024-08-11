package java8_code;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class ListOfIntegerFindEvenNumberAndStoreIntoListANdCoverIntoMap {

    public static void main(String[] args) {

        List<Integer> list1 = Arrays.asList(1,2,3,4,5,6,7,8,9,10) ;

        List<Integer> listEven = list1.stream().filter(l->l%2==0).collect(Collectors.toList()) ;

        Map<Integer,Integer> map = listEven.stream().collect(Collectors.toMap((i)->i+1 ,Integer::intValue)) ;

        map.forEach((k,v)-> System.out.println(k+" = "+v)) ;
    }
}
