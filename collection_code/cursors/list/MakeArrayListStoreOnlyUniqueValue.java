package collection_code.cursors.list;

import java.util.ArrayList;

public class MakeArrayListStoreOnlyUniqueValue {

    public static void main(String[] args) {

        OwnUniqueArrayList oWA = new OwnUniqueArrayList() ;

        for(int i  = 0  ; i < 10 ; i++) {

            oWA.add(i) ;

        }

        System.out.println(oWA);

        oWA.add(9) ;

        System.out.println(oWA);

    }
}

class OwnUniqueArrayList extends ArrayList {

    public boolean add(Object o) {

        if(this.contains(o)) {

            return true ;
        }

        return super.add(o) ;
    }

}
