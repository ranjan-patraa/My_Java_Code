package collection_code.cursors;

import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class IteratorCursor {

    public static void main(String[] args) {

        Set<Integer>  setNumberImmutable = Set.of(1,2,3,4,5,6,7) ;

        Set<Integer> set = new HashSet<>(setNumberImmutable) ;

        Iterator<Integer> iterator = set.iterator() ;

        int a ;

        while (iterator.hasNext()){



            if (( a = iterator.next()) == 5) {

                 iterator.remove() ;
            }else {

                System.out.println(a+" ") ;
            }
            System.out.println("\n"+set) ;

        }


    }
}
