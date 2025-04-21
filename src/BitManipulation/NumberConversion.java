package BitManipulation;

import java.util.Scanner;

public class NumberConversion {

    // Convert Decimal to Binary using bitwise operations
    public static String decimalToBinary(int n) {
        if (n == 0) return "0";
        StringBuilder binary = new StringBuilder();

        while (n > 0) {
            int lsb = n & 1; // get the least significant bit
            binary.append(lsb);
            n = n >> 1; // right shift to divide by 2
        }
        return binary.reverse().toString();
    }

    // Convert Binary to Decimal using bitwise operations
    public static int binaryToDecimal(String binary) {
        int result = 0;
        for (int i = 0; i < binary.length(); i++) {
            result = result << 1; // left shift to multiply by 2
            if (binary.charAt(i) == '1') {
                result = result | 1; // set the last bit to 1 if current char is '1'
            }
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter decimal number : ");
        int decimal = sc.nextInt();

        System.out.print("Enter binary number : ");
        String binary = sc.next();

        // Decimal to Binary
        String binResult = decimalToBinary(decimal);
        System.out.println("Decimal to Binary of " + decimal + " = " + binResult);

        // Binary to Decimal
        int decResult = binaryToDecimal(binary);
        System.out.println("Binary to Decimal of " + binary + " = " + decResult);
    }
}
