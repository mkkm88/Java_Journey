package Recursion;

public class Subsequences {
    public static void printSubsequences(String str, int idx, String newString) {
        if (idx == str.length()) {
            System.out.println(newString);
            return;
        }
        char currChar = str.charAt(idx);

        // to be
        printSubsequences(str, idx+1, newString+currChar);

        // not to be
        printSubsequences(str, idx+1, newString);
    }
    public static void main(String[] args) {
        String str = "abc";
        printSubsequences(str, 0, "");
    }
}
