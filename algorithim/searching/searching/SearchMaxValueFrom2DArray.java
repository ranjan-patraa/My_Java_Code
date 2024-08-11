package algorithim.searching.searching;

public class SearchMaxValueFrom2DArray {

    public static void main(String[] args) {

        int[][] arr =
                {
                        {23,4,1},
                        {18,12,3,9},
                        {78,99,34,55},
                        {18,12}
                } ;


       int maxElementIn2DArray =  searchMaxValueFrom2DArray(arr) ;

        System.out.println(maxElementIn2DArray);
    }

    static int searchMaxValueFrom2DArray(int[][] arr) {

        int max = Integer.MIN_VALUE ;

        for(int[] ii : arr) {

            for (int  element : ii) {

                if  (element > max) {

                    max = element ;
                }
            }
        }

        return max ;
    }
}
