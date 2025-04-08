package Patterns;

import java.util.Scanner;

public class Hollow_Rectangle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int rows = scanner.nextInt();
        System.out.println("Number of rows : " + rows);

        int columns = scanner.nextInt();
        System.out.println("Number of columns : " + columns);

        // outer loop
        for (int i = 1; i <= rows; i++){
            // inner loop
            for (int j = 1; j <= columns; j++){
                if(i == 1 || j == 1 || i == rows || j == columns){
                    System.out.print("*");
                }
                else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
