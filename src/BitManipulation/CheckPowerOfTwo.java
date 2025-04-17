package BitManipulation;

import java.util.Scanner;

public class CheckPowerOfTwo {
    public static boolean isPowerOfTwo(int num) {
        // Check if only one bit is set and n is greater than 0
        return num > 0 && (num & (num-1)) == 0;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int num = sc.nextInt();

        if (isPowerOfTwo(num)) {
            System.out.println(num + " is a power of 2.");
        } else {
            System.out.println(num + " is NOT a power of 2.");
        }

        sc.close();

    }
}
