package Collections;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListOfNames {
    public static void main() {
        Scanner sc = new Scanner(System.in);

        // arrayList declaration
        ArrayList<String> names = new ArrayList<>();

        // Ask the user for the number of names
        System.out.print("Enter the number of names: ");
        int size = sc.nextInt();
        sc.nextLine(); // consume the leftover newline

        // Take names as input
        for (int i=0; i<size; i++) {
            System.out.print(STR. "Enter name \{i+1} : ");
            names.add(i, sc.nextLine());
                    /*
             OR
             String name = sc.nextLine();
             names.add(name);
            */
        }

        // print the names
        System.out.println(STR. "The names you entered are : \{names}");
    }
}
