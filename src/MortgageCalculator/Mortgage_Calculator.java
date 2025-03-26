package MortgageCalculator;

import java.text.NumberFormat;
import java.util.Currency;
import java.util.Scanner;

public class Mortgage_Calculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Principal : ");
        int principal =  scanner.nextInt();

        System.out.print("Annual Interest Rate : ");
        float annualInterestRate = scanner.nextFloat();
        float monthlyInterestRate = annualInterestRate/12/100;


        System.out.print("Period (Years) : ");
        byte period = scanner.nextByte();
        int numberOfPayments = period*12;


        double powerOfNumbers = Math.pow((1 + monthlyInterestRate), numberOfPayments);


        double mortgage = principal * ((monthlyInterestRate*powerOfNumbers)/(powerOfNumbers-1));
        String mortgageFormatted = NumberFormat.getCurrencyInstance().format(mortgage);
        System.out.print("Mortgage : " + mortgageFormatted);
    }


}
