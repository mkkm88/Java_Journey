package Recursion;

public class PowerOfN {
    public static int calcPower(int x, int n) {
        if (n == 0){
            return 1;
        }
        if (x == 0) {
            return 0;
        }

        // where stack height = n
        /*int xPowNm1 = calcPower(x, n-1);
        int xPowN = x * xPowNm1;
        return xPowN;*/

        // where stack height = logn
        // if n is even
        if (n % 2 == 0) {
            return calcPower(x, n/2) * calcPower(x, n/2);
        } else {   // n is odd
            return calcPower(x, n/2) * calcPower(x, n/2) * x;
        }
    }
    public static void main(String[] args) {
        int x = 2, n = 6;
        int result = calcPower(x, n);
        System.out.println(result);
    }
}
