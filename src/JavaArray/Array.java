package JavaArray;

import java.util.Arrays;
import java.util.Scanner;

public class Array {
    public static void main(String[] args) {
        /*int[] numbers = {2,4,6,3,8};
        Arrays.sort(numbers);
        System.out.println(numbers.length);
        System.out.println(Arrays.toString(numbers));*/

        Scanner scanner = new Scanner(System.in);
        int size = scanner.nextInt();
        int numbers[] = new int[size];
        System.out.println("Size of the array : " +  size);

        // input
        for (int i = 0; i < size; i++){
            numbers[i] = scanner.nextInt();
        }

        int x = scanner.nextInt();
        System.out.println("The number you want to search is : " + x);

        // output
        for (int i = 0; i < numbers.length; i++) {
            if(numbers[i] == x){
                System.out.println("x found at index : " + i);
            }
        }
    }
}
