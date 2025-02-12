package gs;

public class CircularArray_27 {

    public static void main(String[] args) {

        int[] arr1 = {-2, -1, 1, -2, -1};
        int[] arr2 = {4, 1, 1, 1};

        System.out.println(checkArrayIsCircularArrayOrNot(arr1));
        System.out.println(checkArrayIsCircularArrayOrNot(arr2));
    }

    static boolean checkArrayIsCircularArrayOrNot(int[] arr) {

        if(arr.length <= 1) {
            return false;
        }

        for(int i = 0; i < arr.length; i++) {

            int slow, fast;
            slow = fast = i;
            boolean isForWord = arr[i] > 0; // +ve value for direction is forward

            while (true) {
                slow = getNextPosition(arr, slow, isForWord);
                if(slow == -1){
                    break;
                }
                fast = getNextPosition(arr, fast, isForWord);
                if(fast == -1){
                    break;
                }
                fast = getNextPosition(arr, fast, isForWord);
                if(fast == -1){
                    break;
                }
                if(slow == fast) {
                    return true;
                }
            }
        }
        return false;
    }

    private static int getNextPosition(int[] arr, int index, boolean isForWord) {

        boolean direction = arr[index] >= 0;
        if(direction != isForWord) {
            return -1;
        }

        int nextIndex = (index+arr[index]) % arr.length;

        if(nextIndex < 0) {
            nextIndex = nextIndex + arr.length;
        }

        if(nextIndex == index) {
            return -1;
        }
        return nextIndex;
    }
}
