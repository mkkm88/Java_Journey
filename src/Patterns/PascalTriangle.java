package Patterns;

public class PascalTriangle {
    public static void main(String[] args) {
        int n = 6;

        // outer loop
        for (int i = 0; i < n; i++) {
            // inner loop -> space print
            for (int j = 0; j < n-i; j++) {
                System.out.print(" ");
            }

            // inner loop -> print numbers
            int number = 1;
            for (int j = 0; j <= i; j++) {
                System.out.print(number+" ");
                number = number * (i - j) / (j + 1);
            }
            System.out.println();
        }
    }
}
