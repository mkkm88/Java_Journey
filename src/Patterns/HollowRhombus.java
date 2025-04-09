package Patterns;

public class HollowRhombus {
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
                if (i == 1 || i == n || j == 1 || j == n) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }

            /*// inner loop -> space print
            for (int j = 1; j<=i-1; j++){
                System.out.print(" ");
            }*/
            System.out.println();
        }
    }
}
