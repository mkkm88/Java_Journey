package Patterns;

public class Diamond {
    public static void main(String[] args) {
        int n = 10;

        // outer loop
        for (int i = 1; i <= n; i++){
            // inner loop -> space print
            int spaces = (n-i);
            for (int j = 1; j <= spaces; j++) {
                System.out.print(" ");
            }

            // inner loop -> star print
            int stars = 2*i-1;
            for (int j = 1; j <= stars; j++){
                System.out.print("*");
            }
            System.out.println();
        }
        for (int i = n; i >= 1; i--){
            // inner loop -> space print
            int spaces = (n-i);
            for (int j = 1; j <= spaces; j++) {
                System.out.print(" ");
            }

            // inner loop -> star print
            int stars = 2*i-1;
            for (int j = 1; j <= stars; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
