package array_code;

import java.util.Arrays;

public class ArraysCopy {

    public static void main(String[] args) {

        String[] name = {"priyo","mishu","arpita","chandan"} ;

        System.out.println(Arrays.toString(name));  // [priyo, mishu, arpita, chandan]

       String[] copyOfName = Arrays.copyOf(name,name.length);
       System.out.println(Arrays.toString(copyOfName)); // [priyo, mishu, arpita, chandan]

        String[] cloneOfName =  name.clone() ;
        System.out.println(Arrays.toString(cloneOfName)); // [priyo, mishu, arpita, chandan]

        String[] copyOfName2 = new String[name.length] ;
        System.arraycopy(name,0,copyOfName2,0,copyOfName2.length) ;
        System.out.println(Arrays.toString(copyOfName2)); // [priyo, mishu, arpita, chandan]


    }
}
