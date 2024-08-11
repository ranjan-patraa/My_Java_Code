package collection_code.cursors;

import java.util.Enumeration;
import java.util.Vector;

public class EnumeratitonCursor {

    public static void main(String[] args) {

         Vector<String>  vectorList = new Vector() ;

          vectorList.addElement("sri") ;
          vectorList.addElement("navin") ;
          vectorList.add("pattnaik") ;

        Enumeration<String> enumeration = vectorList.elements() ;

        while (enumeration.hasMoreElements()) {

            String str = enumeration.nextElement() ;

            System.out.println(str) ;

         }


    }
}
