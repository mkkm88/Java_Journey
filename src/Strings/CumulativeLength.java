package Strings;

import java.util.Scanner;

public class CumulativeLength {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of array : ");
        int size = sc.nextInt();

        String[] array = new String[size];
        int cumLength = 0;

        System.out.println("Enter array elements : ");
        for (int i=0; i<size; i++) {
            array[i] = sc.next();   // taking input

            cumLength += array[i].length();   // finding cumulative length
        }
        System.out.println("Cumulative Length is : " + cumLength);
    }
}
