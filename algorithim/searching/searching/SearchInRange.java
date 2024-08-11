package algorithim.searching.searching;

public class SearchInRange {

    public static void main(String[] args) {

        int[] array = {12,3,5,7,9,-23,8,9} ;

        int target = -23 ;

        int indexPositionOfElement = searchElementInRange(array,target,1,5) ;

        System.out.println(indexPositionOfElement);



    }

    static int searchElementInRange(int[] arr ,int target, int start ,int end ) {

        if(arr.length == 0) {

            return -1 ;
        }

        for(int i = start ;i<=end ;i++) {

            if(target == arr[i]) {

                return i ;
            }
        }

        return -1 ;
    }
}
