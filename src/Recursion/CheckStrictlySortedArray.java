package Recursion;

public class CheckStrictlySortedArray {
    public static boolean isSorted(int[] arr, int idx) {
        if (idx == arr.length-1) {
            return true;
        }

        // first logic with straight condition
        /*if (arr[idx] < arr [idx+1]) {
            // array is sorted till now
            return isSorted(arr, idx+1);
        } else {
            return false;
        }*/

        // 2nd logic with reverse condition
        if (arr[idx] >= arr [idx+1]) {
            // array is sorted till now
            return false;
        }
        return isSorted(arr, idx+1);
    }
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        System.out.println(isSorted(arr, 0));
    }
}
