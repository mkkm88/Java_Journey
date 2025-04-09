package FunctionAndMethods;

import java.util.Scanner;

public class GreaterCheck {
    public static int getGreater(int num1, int num2) {
        if (num1 > num2) {
            return num1;
        } else {
            return num2;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number1 : ");
        int number1 = sc.nextInt();
        System.out.print("Enter number2 : ");
        int number2 = sc.nextInt();

        System.out.println(getGreater(number1, number2));
    }
}
