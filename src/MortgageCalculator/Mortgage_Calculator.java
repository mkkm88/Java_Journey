package MortgageCalculator;

import java.text.NumberFormat;
import java.util.Scanner;

public class Mortgage_Calculator {
    public static void main(String[] args) {
        int principal = (int) readNumber("Principal : ", 1000, 1_000_000);
        float annualInterest = (float) readNumber("Annual Interest Rate : ", 1, 30);
        byte years = (byte) readNumber("Period (Year) : ", 1, 30);

        double mortgage = calculateMortgage(principal, annualInterest, years);
        String mortgageFormatted = NumberFormat.getCurrencyInstance().format(mortgage);    // Formating Mortgage into Currency
        System.out.print("Mortgage : " + mortgageFormatted);
    }

    public static double readNumber(String prompt, double min, double max) {
        Scanner scanner = new Scanner(System.in);
        double value;
        while (true) {
            System.out.print(prompt);
            value = scanner.nextFloat();
            if (value >= min && value <= max)
                break;
            System.out.println("Enter a value between " + min + " and " + max);
        }
        return value;
    }

    public static double calculateMortgage(
            int principal,
            float annualInterest,
            byte years) {

        final byte MONTHS_IN_YEAR = 12;
        final byte PERCENT = 100;

        float monthlyInterest = annualInterest / MONTHS_IN_YEAR / PERCENT;          // Calculating Monthly Interest
        short numberOfPayments = (short)(years * MONTHS_IN_YEAR);                  // Calculating Number of Payments
        double powerOfNumbers = Math.pow((1 + monthlyInterest), numberOfPayments);    // Calculating (1+r)power(n)

        return principal * ((monthlyInterest*powerOfNumbers)/(powerOfNumbers-1));   // Calculating Mortgage
    }
}
