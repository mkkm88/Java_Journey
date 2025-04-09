package FunctionAndMethods;

import java.util.Scanner;

public class PrimeCheck {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        boolean isPrime = true;

        // check for numbers less than 2
        if(number < 2){
            isPrime = false;
        } else {
            // check divisibility from 2 to sqrt(number)
            for (int i = 2; i <= Math.sqrt(number); i++) {
                if(number % i == 0) {
                    isPrime = false;
                    break;
                }
            }
        }
        if (isPrime)
            System.out.println(number + " is a prime number");
        else
            System.out.println(number + " is not a prime number");

        scanner.close();
    }
}
