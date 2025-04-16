package Strings;

import java.util.Scanner;

public class LetterReplacingInString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter original string : ");
        String str = sc.next();

        String result = "";

        for (int i=0; i<str.length(); i++) {
            if (str.charAt(i) == 'e') {
                result += 'i';
            } else {
                result += str.charAt(i);
            }
        }
        System.out.println("String after replacement is : " + result);
    }
}
