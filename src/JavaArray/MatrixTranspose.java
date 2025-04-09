package JavaArray;

import java.util.Scanner;

public class MatrixTranspose {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of rows : ");
        int n = sc.nextInt();
        System.out.print("Enter the number of columns : ");
        int m = sc.nextInt();

        int[][] matrixTranspose = new int[n][m];

        // input
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                matrixTranspose[i][j] = sc.nextInt();
            }
        }
        System.out.println("The transpose is : ");

        // To print transpose
        for (int j = 0; j < m; j++) {
            for (int i = 0; i < n; i++) {
                System.out.print(matrixTranspose[i][j]+ " ");
            }
            System.out.println();
        }
    }
}
