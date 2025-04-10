package Recursion;

public class PrintNumbers {
    public static void printNumbers(int n) {
        // base case
        if (n == 0)
            return;
        // print the number
        System.out.println(n);
        // recursion
        printNumbers(n-1);
    }
    public static void main(String[] args) {
        int n = 5;
        printNumbers(n); // n=5
    }
}
