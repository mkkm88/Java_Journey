package FunctionAndMethods;

import java.util.Scanner;

public class OddNumberSum {
    public static void oddSum(int number) {
        int sum = 0;
        for (int i = 1; i <= number; i++) {
            if (i % 2 != 0){
                sum = sum + i;
            }
        }
        System.out.println("The sum of odd numbers till " + number + " is " + sum);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number till where you want sum : ");
        int number = sc.nextInt();

        oddSum(number);
    }
}
