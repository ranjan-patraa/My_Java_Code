package algorithim.searching.searching;

public class LinearSearch {

    public static void main(String[] args) {

        int[] array = {18,12,9,14,77,50} ;
        int targetElement =  6 ;
        int ans = linearSearch(array,targetElement) ;
        System.out.println(ans) ;

    }

    static int linearSearch(int[] a , int target) {

        if(a.length == 0) {

            return -1 ;
        }

        for (int index = 0 ; index < a.length ;index++) {

            int element = a[index] ;

            if(element == target) {

                return index ;
            }
        }

        return -1 ;
    }



    static boolean linearSearchElementIsPresentOrNot(int[] a , int target) {

        if (a.length == 0) {

            return false;
        }

        for (int index = 0; index < a.length; index++) {

            int element = a[index];

            if (element == target) {

                return true;
            }
        }

        return false;

    }




    static int linearSearchElement(int[] a , int target) {

        if (a.length == 0) {

            return  Integer.MAX_VALUE ;
        }

        for (int element : a) {

            if (element == target) {

                return  element;
            }
        }

        return Integer.MAX_VALUE ;

    }
}
