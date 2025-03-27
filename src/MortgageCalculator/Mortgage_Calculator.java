package MortgageCalculator;

import java.text.NumberFormat;
import java.util.Scanner;

public class Mortgage_Calculator {
    public static void main(String[] args) {

        final byte MONTHS_IN_YEAR = 12;
        final byte PERCENT = 100;

        // Taking Input From User
        Scanner scanner = new Scanner(System.in);

        System.out.print("Principal : ");
        int principal =  scanner.nextInt();

        System.out.print("Annual Interest Rate : ");
        float annualInterest = scanner.nextFloat();
        float monthlyInterest = annualInterest / MONTHS_IN_YEAR / PERCENT;          // Calculating Monthly Interest

        System.out.print("Period (Years) : ");
        byte years = scanner.nextByte();
        int numberOfPayments = years * MONTHS_IN_YEAR;                  // Calculating Number of Payments

        double powerOfNumbers = Math.pow((1 + monthlyInterest), numberOfPayments);    // Calculating (1+r)power(n)

        double mortgage = principal * ((monthlyInterest*powerOfNumbers)/(powerOfNumbers-1));  // Calculating Mortgage
        String mortgageFormatted = NumberFormat.getCurrencyInstance().format(mortgage);    // Formating Mortgage into Currency
        System.out.print("Mortgage : " + mortgageFormatted);
    }


}
