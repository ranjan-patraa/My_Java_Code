package array_code;

public class FindClosestNumberInSortedArray {

    public static int findClosest(int arr[], int target) {

        int n = arr.length;

        if(target <= arr[0])
            return arr[0];
        if(target >= arr[n-1])
            return arr[n-1];

        // Doing binary search

        int i = 0, j = n, mid = 0;

        while (i < j) {

            mid = (i+j)/2;

            if(arr[mid] == target)
                return arr[mid];

            if(target < arr[mid]) {
                if(mid > 0 && target > arr[mid-1])
                    return getClosest(arr[mid-1], arr[mid], target);
                j = mid;
            } else if (mid < n-1 && target < arr[mid+1])
                return getClosest(arr[mid], arr[mid+1], target);
            i = mid+1;
        }

        return arr[mid];
    }

    public static int getClosest(int val1, int val2, int target) {

        if(target - val1 >= val2 - target)
            return val2;
        else
            return val1;
    }

    public static void main(String[] args) {

        int arr[] = {1,2,3,4,5,6,6,8,9};
        int arr1[] = {1,2,5,6,7,8,8,9};
        int target = 4;

        System.out.println(findClosest(arr1, target));
    }
}
