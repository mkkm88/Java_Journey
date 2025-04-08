package Patterns;

public class Number_Pyramid {
    public static void main(String[] args) {
        int n = 5;

        //outer loop
        for (int i = 1; i<=n; i++) {
            //inner loop -> print space
            for (int j =1; j<=n-i; j++){
                System.out.print(" ");
            }

            // inner loop -> print number
            for (int j = 1; j <= i; j++){
                System.out.print(i);
                System.out.print(" ");
            }
            System.out.println();
        }
    }
}
