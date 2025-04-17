package BitManipulation;

import java.util.Scanner;

public class CountSetBits {
    public static int countOnes(int n) {
        int count = 0;
        while (n > 0) {
            // n & (n-1) removes the rightmost 1-bit
            n = n & (n-1);
            count++;
        }
        return count;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number : ");
        int n = sc.nextInt();

        int result = countOnes(n);

        System.out.println("Binary representation: " + Integer.toBinaryString(n));
        System.out.println("Number of 1's: " + result);
    }
}
