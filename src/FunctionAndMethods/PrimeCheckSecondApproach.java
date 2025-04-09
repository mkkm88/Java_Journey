package FunctionAndMethods;

import java.util.Scanner;

public class PrimeCheckSecondApproach {
    public static boolean isPrime(int number) {
        if (number <= 1) return false;    // 0 and 1 are not prime
        if (number == 2 || number == 3) return true;  // 2 and 3 are prime
        if (number % 2 == 0 || number % 3 == 0) return false;    // eliminate multiples of 2 and 3

        // check the factors in the form of 6k ± 1 up to √n
        for (int i = 5; i * i <= number; i += 6) {
            if (number % i == 0 || number % (i+2) == 0)
                return false;
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();

        if (isPrime(n))
            System.out.println(n + " is a Prime Number.");
        else
            System.out.println(n + " is NOT a Prime Number.");

        sc.close();
    }
}
