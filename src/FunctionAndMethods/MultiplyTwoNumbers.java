package FunctionAndMethods;

import java.util.Scanner;

public class MultiplyTwoNumbers {
    public  static  int multiply(int a, int b) {
        return a * b;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();

        int result = multiply(a,b);
        System.out.println(result);
    }
}
