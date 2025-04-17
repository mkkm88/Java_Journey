package BitManipulation;

import java.util.Scanner;

public class ToggleBit {
    public static int toggleBit(int n, int pos) {
        // XOR with (1<<pos) will toggle the bit at 'pos'
        return n ^ (1 << pos);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number : ");
        int n = sc.nextInt();

        System.out.print("Enter the bit position to toggle (starting from 0) : ");
        int pos = sc.nextInt();

        int result = toggleBit(n, pos);

        System.out.println("Original number: " + n + " (" + Integer.toBinaryString(n) + ")");
        System.out.println("After toggling bit at position " + pos + ": " + result + " (" + Integer.toBinaryString(result) + ")");

    }
}
