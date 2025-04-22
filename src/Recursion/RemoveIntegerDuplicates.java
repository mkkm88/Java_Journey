package Recursion;

import java.util.HashSet;
import java.util.*;

public class RemoveIntegerDuplicates {
    public static int[] removeDups(int[] arr) {
        Set<Integer> seen = new HashSet<>();
        List<Integer> result = new ArrayList<>();
        helper(arr, 0, seen, result);

        int[] uniqueArr = new int[result.size()];
        for (int i=0; i<result.size(); i++) {
            uniqueArr[i] = result.get(i);
        }
        return uniqueArr;
    }
    public static void helper(int[] arr, int idx, Set<Integer> seen, List<Integer> result) {
        if (idx == arr.length) return;

        if (!seen.contains(arr[idx])) {
            seen.add(arr[idx]);
            result.add(arr[idx]);
        }
        // Recursive call
        helper(arr, idx+1, seen, result);
    }
    public static void main(String[] args) {
        int[] arr = {5,7,5,8,4,9,4};

        int[] uniqueArr = removeDups(arr);
        System.out.println("Unique elements array : ");
        for (int num : uniqueArr) {
            System.out.println(num + " ");
        }
    }
}
