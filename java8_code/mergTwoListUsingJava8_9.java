package java8_code;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class mergTwoListUsingJava8_9 {

    public static void main(String[] args) {

        List<Integer> list1 = Arrays.asList(1,2,3,4,5) ;
        List<Integer> list2 = Arrays.asList(3,4,5,6,7,8) ;

        // java8

        List<Integer> mergedList = Stream
                .of(list1,list2)
                .flatMap(l->l.stream()).distinct()
                .collect(Collectors.toList()) ;

        System.out.println(mergedList) ;

        System.out.println("------------------------------------");

        // another way

        List<Integer> concatUsingMerge = Stream.concat(list1.stream(),list2.stream()).collect(Collectors.toList()) ;

        System.out.println(concatUsingMerge);

        System.out.println("------------------------------------");



       /* List<Integer> mergeList = new ArrayList<>(list1) ;

        mergeList.removeAll(list2) ;

        mergeList.addAll(list2) ;

        System.out.println(mergeList);*/


        int [] a1 = {5,6,8,2,3,9} ;
        int[] a2 = {7,9,1,3,4} ;

        int[] mergeSort = IntStream.concat(Arrays.stream(a1), Arrays.stream(a2)).sorted().toArray() ;

        System.out.println(Arrays.toString(mergeSort)) ;

        System.out.println("------------------------------------");

        int[] mergeSortWithoutDuplicate = IntStream.concat(Arrays.stream(a1), Arrays.stream(a2))
                                          .sorted().distinct().toArray() ;

        System.out.println(Arrays.toString(mergeSortWithoutDuplicate)) ;

        System.out.println("------------------------------------");


        Stream concat = Stream.concat(Stream.of(1,2,3),Stream.of(4,5,6)) ;

        System.out.println(concat.toList()) ;






    }
}
