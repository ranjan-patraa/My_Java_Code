package array_code;

public class NextGreaterElementInArray {

    public static void main(String[] args) {

        int []arr = {11,21,6,5,7,9} ;
        int next ;
        for(int i = 0 ; i < arr.length ;i++ ) {

              next = -1 ;
            for(int j = i+1 ; j < arr.length ; j++ ) {

                if(arr[i]<arr[j]){
                    next = arr[j] ;
                    break ;
                }
            }

            System.out.println(arr[i]+" "+ next) ;
        }
    }
}
