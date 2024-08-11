package algorithim.searching.searching;

public class SearchMinimumNUmber

{
    public static void main(String[] args) {

        int[] arr = {12,4,2,78,-2,41} ;

        System.out.println(minElementInArray(arr));
    }

    static int minElementInArray(int[] arr) {

        int ans = arr[0] ;

        for (int i = 1 ;i<arr.length ;i++) {

            if( arr[i] < ans) {

                ans = arr[i] ;
            }
        }

        return ans ;
    }
}
