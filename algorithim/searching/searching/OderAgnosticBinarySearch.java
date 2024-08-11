package algorithim.searching.searching;

public class OderAgnosticBinarySearch {

    public static void main(String[] args) {

        // Ascending order Searching
        int[] array = {1, 2, 4, 5, 6, 7, 8, 9, 56, 78, 90};

        int target = 9;

        int index = binarySearch(array,target) ;

        System.out.println(index);


        //DescendingOrder Searching

        int[] array1 = { 89,56,34,12,3,-2,-9};

        int target1 = 12;

        int index1 = binarySearch(array1,target1) ;

        System.out.println(index1);

    }

    static int binarySearch(int[] arr, int targetElement) {

        int start = 0;
        int end = arr.length - 1;
        boolean isSortedAsc = arr[start] < arr[end];

        while (start <= end) {

            int mid = start + (end - start) / 2;

            if (arr[mid] == targetElement) {
                return mid;
            }

            if (isSortedAsc) {

                if (targetElement < arr[mid]) {

                    end = mid - 1;

                } else if (targetElement > arr[mid]) {

                    start = mid + 1;

                }
            }  else {

                    if (targetElement > arr[mid]) {

                        end = mid - 1;

                    } else if (targetElement < arr[mid]) {

                        start = mid + 1;

                    }
                }
            }

        return  -1 ;
        }


    }
