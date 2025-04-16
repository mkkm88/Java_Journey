package Strings;

import java.util.Scanner;

public class StringChapter {
    public static void main(String[] args) {
        // taking input
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first name : ");
        String firstName = sc.nextLine();
        System.out.print("Enter last name : ");
        String lastName = sc.nextLine();

        // printing full name with string concatenation
        String fullName = firstName + " " + lastName;
        System.out.println("Full name is : " + fullName);
        System.out.println("Length of full name is : " + fullName.length());

        // accessing the characters of full name
        System.out.println("Characters of string : " + fullName);
        for (int i=0; i<fullName.length(); i++) {
            System.out.println(fullName.charAt(i));
        }

        System.out.println();
        // comparing two string
        if (firstName.equals(lastName))
            System.out.println("Equal");
        else
            System.out.println("Not Equal");

        // Note : Do not use == operator for string comparison
        // Here it gives false response
        System.out.println();
        if (firstName == lastName) {
            System.out.println(firstName + " Equal " + lastName);
        } else {
            System.out.println(firstName + " not equal " + lastName);
        }

        // Here also it gives false response
        System.out.println();
        if (new String("Kasim") == new String("Kasim")) {
            System.out.println("They are equal");
        } else {
            System.out.println("They are not equal");
        }

        // substring of string
        System.out.println();
        System.out.println(fullName.substring(2, 5));

        // parseInt Method of Integer Class
        System.out.println();
        String str = "123";
        int number = Integer.parseInt(str);
        System.out.println(number);

        // ToString Method of String Class
        System.out.println();
        String num = Integer.toString(number);
        System.out.println(num);


    }
}
