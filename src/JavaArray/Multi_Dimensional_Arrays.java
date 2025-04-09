package JavaArray;
import java.util.Scanner;

public class Multi_Dimensional_Arrays {
    public static void main(String[] args) {
        /*int[][] numbers = {{1,2,3}, {6,7,8}};
        System.out.println(Arrays.deepToString(numbers));*/

        Scanner scanner = new Scanner(System.in);
        int rows = scanner.nextInt();
        int cols = scanner.nextInt();

        int[][] numbers = new int[rows][cols];

        //input
        // rows
        for (int i = 0; i < rows; i++) {
            // columns
            for (int j = 0; j < cols; j++) {
                numbers[i][j] = scanner.nextInt();
            }
        }

        // print 2D Array metrix -> output
        /*for (int i = 0; i < rows; i++) {
            // columns
            for (int j = 0; j < cols; j++) {
                System.out.print(numbers[i][j] + " ");
            }
            System.out.println();
        }*/

        // search given number and print indices

        int x = scanner.nextInt();
        System.out.println("The number you want to search is : " + x);

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if(numbers[i][j] == x) {
                    System.out.println("x found at location : (" + i + "," + j + ")");
                }
            }
        }

    }
}
