package FunctionAndMethods;

import java.util.Scanner;

public class EvenOddCheck {

    public static boolean isEven(int number) {
        return number % 2 == 0;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number : ");
        int number = sc.nextInt();

        if (isEven(number))
            System.out.println(number + " is even");
        else
            System.out.println(number + " is odd");
    }
}
