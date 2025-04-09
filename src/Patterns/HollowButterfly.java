package Patterns;

public class HollowButterfly {
    public static void main(String[] args) {
        int n = 10;

        // outer loop
        for (int i = 1; i <= n; i++) {
            // inner loop -> first stars
            for (int j = 1; j <= i; j++){
                if (j == 1 || j == i) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }

            }

            // inner loop -> space print
            int spaces = 2*(n-i);
            for (int j = 1; j <= spaces; j++){
                System.out.print(" ");
            }

            // inner loop -> second stars
            for (int j = 1; j <= i; j++){
                if (j == 1 || j == i) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }

            }
            System.out.println();
        }
        // outer loop -> for reverse stars
        for (int i = n; i >= 1; i--){
            // inner loop -> first stars
            for (int j = 1; j <= i; j++){
                if (j == 1 || j == i) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }

            }

            // inner loop -> space print
            int spaces = 2*(n-i);
            for (int j = 1; j <= spaces; j++){
                System.out.print(" ");
            }

            // inner loop -> second stars
            for (int j = 1; j <= i; j++){
                if (j == 1 || j == i) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }

            }
            System.out.println();
        }
    }
}
