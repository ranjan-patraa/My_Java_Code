package collection_code.cursors.list;

import java.util.Enumeration;
import java.util.Vector;

public class Vector_All_MethodPratice
{

    public static void main(String[] args) {

        Vector<Integer> ve = new Vector<>() ;

        System.out.println(ve.capacity()) ;

        for(int i  = 0 ; i < 10 ;i++) {

            ve.addElement(i) ;
        }

        int size =  ve.size() ;

        System.out.println(size) ;

        System.out.println(ve) ;

        ve.add(10) ;

        System.out.println(ve.capacity()) ;

        Enumeration e = ve.elements() ;

        while(e.hasMoreElements()) {

            Object obj  =   e.nextElement() ;

            System.out.println(obj) ;
        }


    }
}
