package Recursion;

import java.util.HashSet;

public class UniqueSubsequences {
    public static void printSubsequences(String str, int idx, String newString, HashSet<String> set) {
        if (idx == str.length()) {
            if (set.contains(newString)) {
                return;
            } else {
                System.out.println(newString);
                set.add(newString);
                return;
            }
        }
        char currChar = str.charAt(idx);

        // to be
        printSubsequences(str, idx+1, newString+currChar, set);

        // not to be
        printSubsequences(str, idx+1, newString, set);
    }
    public static void main(String[] args) {
        String str = "aaa";
        HashSet<String> set = new HashSet<>();
        printSubsequences(str, 0, "", set);
    }
}
