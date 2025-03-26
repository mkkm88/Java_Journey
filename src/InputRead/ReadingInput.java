package InputRead;

import java.util.Scanner;

public class ReadingInput {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Age: ");
        byte age = scanner.nextByte(); // getting byte as input
        System.out.println("You are " + age + " years old");

        System.out.print("Name: ");
        String name = scanner.next().trim(); // getting string as input
        System.out.println("I'm " + name);
    }
}
