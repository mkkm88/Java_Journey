package MortgageCalculator;

import java.text.NumberFormat;
import java.util.Scanner;

public class Mortgage_Calculator {
    public static void main(String[] args) {


        int principal;
        float annualInterest;
        byte years;

        // Taking Input From User
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.print("Principal : ");
            principal =  scanner.nextInt();
            if (principal >= 1000 && principal <= 1000000)
                break;
            System.out.println("Enter a number between 1000 and 1000000");
        }

        while (true) {
            System.out.print("Annual Interest Rate : ");
            annualInterest = scanner.nextFloat();
            if (annualInterest >= 1 && annualInterest <= 30)
                break;
            System.out.println("Enter a number between 1 and 30");
        }

        while (true) {
            System.out.print("Period (Years) : ");
            years = scanner.nextByte();
            if(years >= 1 && years <= 30)
                break;
            System.out.println("Enter a value between 1 and 30");
        }

        double mortgage = calculateMortgage(principal, annualInterest, years);
        String mortgageFormatted = NumberFormat.getCurrencyInstance().format(mortgage);    // Formating Mortgage into Currency
        System.out.print("Mortgage : " + mortgageFormatted);
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
