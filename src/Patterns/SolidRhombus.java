package Patterns;

public class SolidRhombus {
    public static void main(String[] args) {
        int n = 10;

        // outer loop
        for (int i = 1; i<=n; i++){
            // inner loop -> space print
            for (int j = 1; j<=n-i; j++) {
                System.out.print(" ");
            }

            // inner loop -> star print
            for(int j = 1; j<=n; j++){
                System.out.print("*");
            }

            /*// inner loop -> space print
            for (int j = 1; j<=i-1; j++){
                System.out.print(" ");
            }*/
            System.out.println();
        }
    }
}
