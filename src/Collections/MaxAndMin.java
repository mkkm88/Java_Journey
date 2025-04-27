package Collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class MaxAndMin {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // create an arrayList
        ArrayList<Integer> numbers = new ArrayList<>();

        // ask for size
        System.out.print(STR. "Enter the number of elements : ");
        int size = sc.nextInt();

        // take inputs
        for (int i=0; i<size; i++) {
            System.out.print(STR. "Enter elements \{i+1} : ");
            numbers.add(i, sc.nextInt());
        }

        int min = Collections.min(numbers);
        int max = Collections.max(numbers);

        System.out.println(STR."Smallest number is : \{min}");
        System.out.println(STR."Largest number is : \{max}");
    }
}
