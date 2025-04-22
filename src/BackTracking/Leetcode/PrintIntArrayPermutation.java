package BackTracking.Leetcode;

import java.util.ArrayList;
import java.util.List;

public class PrintIntArrayPermutation {
    public static List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        helper(nums, new ArrayList<>(), new boolean[nums.length], result);
        return result;
    }

    public static void helper(int[] nums, List<Integer> current, boolean[] used, List<List<Integer>> result) {
        // base case
        if (current.size() == nums.length) {
            result.add(new ArrayList<>(current));
            return;
        }
        for (int i=0; i<nums.length; i++) {
            if (used[i]) continue;  // skip if already used
            used[i] = true;
            current.add(nums[i]);

            // recursive call
            helper(nums, current, used, result);

            // backtrack
            current.remove(current.size() - 1);
            used[i] = false;
        }
    }
    public static void main(String[] args) {
        int[] nums = {1,2,3};
        List<List<Integer>> permutations = permute(nums);

        for (List<Integer> p : permutations) {
            System.out.println(p);
        }
    }
}
