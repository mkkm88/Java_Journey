package Recursion;

import java.util.*;

public class SubsetsOfN {
    public static void printSubset(ArrayList<Integer> subset) {
        for (int i=0; i<subset.size(); i++) {
            System.out.print(subset.get(i)+" ");
        }
        System.out.println();
    }
    public static void findSubset(int n, ArrayList<Integer> subset) {
        if (n == 0) {
            printSubset(subset);
            return;
        }
        // add hoga
        subset.add(n);
        findSubset(n-1, subset);

        // add nhi hoga
        subset.removeLast();
        findSubset(n-1, subset);
    }
    public static void main(String[] args) {
        int n = 4;
        ArrayList<Integer> subset = new ArrayList<>();
        findSubset(n, subset);
    }
}
