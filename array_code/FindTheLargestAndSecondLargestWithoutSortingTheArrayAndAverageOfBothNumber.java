package array_code;

public class FindTheLargestAndSecondLargestWithoutSortingTheArrayAndAverageOfBothNumber {

    public static void main(String[] args) {

        int a[] = {4,9,7,3,2} ;

        findLargestAndSecondLargest(a) ;
    }

    public static void findLargestAndSecondLargest(int[] arr) {

        int largest = Integer.MIN_VALUE ;
        int second_Largest = Integer.MIN_VALUE ;

        for (int i  = 0 ; i < arr.length ; i++) {

            if(arr[i] > largest) {

                second_Largest = largest ;
                largest = arr[i] ;

            } else if (arr[i] > second_Largest && arr[i] != largest) {

                second_Largest = arr[i] ;
            }
        }

        System.out.println("largest element is = "+ largest) ;
        System.out.println("second_largest element is = "+  second_Largest) ;

        averageOfLargestAndSecondLargest(largest , second_Largest) ;
    }

    public static void averageOfLargestAndSecondLargest(int largest , int secondLargest) {

        int avrg = 0;

        avrg = (largest + secondLargest)/2 ;

        System.out.println("averageOfLargestAndSecondLargest is = "+avrg) ;
    }
}
