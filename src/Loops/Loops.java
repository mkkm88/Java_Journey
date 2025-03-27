package Loops;

import java.util.Scanner;

public class Loops {
    public static void main(String[] args) {

        // FOR Loop
        for(int i = 0; i < 5; i++) {                   // in situation where you know ahead of time, how many times +
            System.out.println("hello kasim " + i);    // you want to execute one or more statements.
        }

        System.out.println();

        // WHILE LOOP
        int i = 1;
        while (i <= 10) {                              // while loops are better in situation where we exactly don't
            System.out.println("hello samar " + i);    // know how many times we want to repeat something
            i++;
        }

        System.out.println();

        // WHILE LOOP Example using String
        Scanner scanner = new Scanner(System.in);
        String input = "";
        while (true) {
            System.out.print("Input : ");
            input = scanner.next().toLowerCase();
            if(input.equals("pass"))                    // Continue keyword
                continue;
            if(input.equals("quit"))                    // Break keyword
                break;
            System.out.println(input);
        }

        System.out.println();

        // DO WHILE LOOP
        do {
            System.out.println("hello buddy");

        } while (i < 10);

        System.out.println();

        // DO WHILE LOOP using String
        do {
            System.out.print("Input : ");
            input = scanner.next().toLowerCase();
            System.out.println(input);
        } while (!input.equals("quit"));

        System.out.println();

        // FOR EACH LOOP                                   // use foreach loop to iterate over arrays and collections
        String[] fruits = {"Apple", "Banana", "Mango"};         // Limitations :
        for(String fruit : fruits)                                 // It always forward only so we can not iterate the array from end to beginning
            System.out.println(fruit);                             // Here we don't have access of index of items
    }
}
