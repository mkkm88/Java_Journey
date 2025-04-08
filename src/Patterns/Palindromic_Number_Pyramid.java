package Patterns;

public class Palindromic_Number_Pyramid {
    public static void main(String[] args) {
        int n = 5;

        // outer loop
        for (int i = 1; i <= n; i++) {
            // inner loop -> space print
            for (int j = 1; j <= n-i; j++){
                System.out.print(" ");
            }

            // first part inner loop -> number print
            for (int j = i; j >=1; j--) {
                System.out.print(j);
            }

            // second part inner loop -> number print
            for (int j = 2; j <= i; j++) {
                System.out.print(j);
            }
            System.out.println();
        }
    }
}
