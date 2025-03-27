package ControlFlow;

import java.util.Scanner;

public class If_Statement {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Temperature : ");
        int temperature = scanner.nextInt();

        if (temperature > 30)
            System.out.println("It's a hot day! Drink plenty of water");
        else if (temperature >= 20)
            System.out.println("It's a nice day");
        else
            System.out.println("It's cold");


        // Simplify the if statement
        int income = 120_000;
        boolean hasHighIncome = (income > 100_000);
        System.out.println(hasHighIncome);
    }
}
