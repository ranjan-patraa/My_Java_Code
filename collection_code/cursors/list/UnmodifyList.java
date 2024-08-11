package collection_code.cursors.list;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class UnmodifyList {

    public static void main(String[] args) {

        List<Integer> list =  List.of(1,2,3,4,5) ;

        Collections.unmodifiableList(list) ;

        // list.add(2) ;
        System.out.println(list);

//        Collections.synchronizedList(list) ;
//
//        System.out.println(list);


        Object [] obj  = list.toArray() ;

        System.out.println(Arrays.toString(obj)) ;

    }
}
