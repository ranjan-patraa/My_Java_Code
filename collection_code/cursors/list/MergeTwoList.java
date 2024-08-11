package collection_code.cursors.list;

import com.sun.source.doctree.SeeTree;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class MergeTwoList {

    public static void main(String[] args) {


        ArrayList<String> lis1 = new ArrayList<>(List.of("a", "b", "c"));
        List<String> lis2 = new ArrayList<>(List.of("c", "d", "e"));


        Set<String> set = new LinkedHashSet<>(lis1) ;
        set.addAll(lis2) ;

        ArrayList<String> combineList = new ArrayList<>(set) ;

        System.out.println(combineList);


        List<String> mergeList = Stream.of(lis1,lis2)
                .flatMap(x->x.stream())
                .collect(Collectors.toList());

        System.out.println(mergeList) ;


        List<String> copyOfTwoList = new ArrayList<>(lis2) ;

        copyOfTwoList.removeAll(lis1) ;

        lis1.addAll(copyOfTwoList) ;

        System.out.println(lis1);


    }


}
