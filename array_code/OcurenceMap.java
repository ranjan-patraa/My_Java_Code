package array_code;

import javax.swing.text.html.parser.Entity;
import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class OcurenceMap {

    // count number of iland ;

    public static void main(String[] args) {



        int a[] = {1, 2, 1, 3, 3, 3, 4, 4, 4, 4};

        int b[] = {1, 2} ;


        boolean b1  = occurrenceIsUnique(a) ;

        System.out.println(b1) ;

        boolean b2  = byUsingJava8Occurrence(b) ;

        System.out.println(b2);

    }

    private static boolean occurrenceIsUnique(int[] a) {

        Map<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < a.length; i++) {

            Integer e = map.get(a[i]);

            if (e == null) {

                map.put(a[i], 1);

            } else {

                e = e + 1;

                map.put(a[i], e);
            }
        }

        map.forEach((k, v) -> System.out.println(k + " " + v));

        Set<Integer> entry = new HashSet<>() ;

        for (Map.Entry<Integer, Integer> set : map.entrySet()) {

            if (entry.contains(set.getValue())) {

                return false;

            } else {

                entry.add(set.getValue()) ;
            }

        }

        return true ;

    }


    public static boolean byUsingJava8Occurrence(int[] b) {

 //       Set<Long> entry = new HashSet<>();

//        Map<Integer,Long> mapOccurrence =

        Map<Integer,Long> mapOccurrence = Arrays.stream(b).boxed()
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting())) ;
//                .entrySet().stream().filter(e -> {
//
//                    if (entry.contains(e.getValue())) {
//
//                        return false;
//
//                    } else
//
//                        entry.add(e.getValue());
//
//                    return false ;
//                });

        Set<Long> entry = new HashSet<>() ;

        for (Map.Entry<Integer, Long> set : mapOccurrence.entrySet()) {

            if (entry.contains(set.getValue())) {

                return false;

            } else {

                entry.add(set.getValue()) ;
            }

        }

        return true ;


    }

}

interface a {

    void addition(int b) ;
}

interface b {

    void addition(int a) ;
}

class Test implements a,b {

    @Override
    public void addition(int b) {


    }
}

