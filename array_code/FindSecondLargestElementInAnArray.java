package array_code;

public class FindSecondLargestElementInAnArray {

    public static void main(String[] args) {

        int arr[] = {84,937,748,23,849,47,389};

        secondLargestElementInArray(arr) ;

        secondSmallestElementInArray(arr);
    }

    public static void secondLargestElementInArray(int[] arr) {

        int largest        = Integer.MIN_VALUE ;
        int second_largest = Integer.MIN_VALUE ;

        for(int i = 0 ;  i < arr.length ; i++) {

            if(arr[i] > largest) {

                second_largest = largest ;

                largest = arr[i] ;

            } else if (arr[i] >  second_largest && arr[i] != largest) {

                second_largest = arr[i] ;
            }
        }

        if (second_largest == Integer.MIN_VALUE){

            System.out.println("In Array not available any second largest element ");

        }else  {

            System.out.println(second_largest+"\t is the second largest element");
        }
    }

    public static void secondSmallestElementInArray(int[] arr) {

        int smallest        = Integer.MAX_VALUE ;
        int second_Smallest = Integer.MAX_VALUE ;

        for(int i = 0 ;  i < arr.length ; i++) {

            if(arr[i] <  smallest) {

                 second_Smallest =  smallest ;

                 smallest = arr[i] ;

            } else if (arr[i] <  second_Smallest && arr[i] != smallest) {

                 second_Smallest = arr[i] ;
            }
        }

        if ( second_Smallest == Integer.MAX_VALUE){

            System.out.println("In Array not available any second  smallest element ");

        }else  {

            System.out.println( second_Smallest+"\t is the second  smallest element");
        }
    }
}
