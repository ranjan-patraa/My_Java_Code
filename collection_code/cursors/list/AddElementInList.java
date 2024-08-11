package collection_code.cursors.list;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;


public class AddElementInList {

    public static void main(String[] args) {

         List<String> listName = new ArrayList<>(Arrays.asList("Lokesh","Mukesh","Sekhar")) ;

        listName.add(1,"Mahesh") ;

        System.out.println(listName) ;

        List<String> listNumber =new ArrayList<>(Arrays.asList("1","2","3")) ;

        listNumber.addAll(0,List.of("4","5","6") ) ;

        System.out.println(listNumber) ;



        Collection col = new ArrayList() ;

        System.out.println(col) ;

        System.out.println(col.size()) ;

        System.out.println(col.isEmpty()) ;

        col.add(1) ; col.add(2) ; col.add(3) ;

        System.out.println(col) ;

        System.out.println(col.size()) ;

        System.out.println(col.isEmpty()) ;


    }
}
