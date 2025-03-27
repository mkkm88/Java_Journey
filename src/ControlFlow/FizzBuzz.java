package ControlFlow;

import java.util.Scanner;

public class FizzBuzz {
    public static void main(String[] args) {
        // if number divisible by 5 -> FIZZ
        // if number divisible by 3 -> BUZZ
        // if number divisible by both 5 & 3 -> FIZZBUZZ
        // if number not divisible by any -> number itself


        Scanner scanner = new Scanner(System.in);
        System.out.print("Number : ");
        byte number = scanner.nextByte();

        if (number % 5 == 0 && number % 3 == 0) {
            System.out.println("FIZZBUZZ");
        } else if(number % 5 == 0)
            System.out.println("FIZZ");
        else if (number % 3 == 0)
            System.out.println("BUZZ");
        else
            System.out.println(number);
    }
}
