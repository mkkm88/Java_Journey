package FunctionAndMethods;

import java.util.Scanner;

public class CalculateAverage {
    public static float average(int num1, int num2, int num3) {
        return (float) (num1 + num2 + num3) / 3;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number1 : ");
        int num1 = sc.nextInt();
        System.out.print("Enter number2 : ");
        int num2 = sc.nextInt();
        System.out.print("Enter number3 : ");
        int num3 = sc.nextInt();

        System.out.println("Average of " + num1 + ", " + num2 + " and " + num3 + " is : " + average(num1,num2,num3));
    }
}
