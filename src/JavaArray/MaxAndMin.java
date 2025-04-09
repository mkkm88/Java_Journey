package JavaArray;

import java.util.Scanner;

public class MaxAndMin {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int[] numbers = new int[size];

        //input
        for(int i=0; i<size; i++) {
            numbers[i] = sc.nextInt();
        }

        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;

        for (int number : numbers) {
            if (number < min) {
                min = number;
            }
            if (number > max) {
                max = number;
            }
        }
        System.out.println("Largest number is : " + max);
        System.out.println("Smallest number is : " + min);
    }
}
