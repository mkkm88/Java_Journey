package Recursion;

public class StringPermutation {
    public static void printPermutation(String str, String permutation) {
        if (str.isEmpty()) {
            System.out.println(permutation);
            return;
        }

        for (int i=0; i<str.length(); i++) {
            char currChar = str.charAt(i);
            // "abc" -> "bc"
            String newString = str.substring(0, i) + str.substring(i+1);
            printPermutation(newString, permutation+currChar);
        }
    }
    public static void main(String[] args) {
        String str = "abc";
        printPermutation(str, "");
    }
}
