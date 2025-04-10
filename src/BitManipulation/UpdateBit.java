package BitManipulation;

import java.util.Scanner;

public class UpdateBit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int opr = sc.nextInt();
        // opr==1 : set, opr==0 : clear
        int n = 5;
        int pos = 2;

        int bitMask = 1<<pos;
        if (opr == 1) {
            //set
            int newNumber = bitMask | n;
            System.out.println(newNumber);
        } else {
            // clear
            int notBitMask = ~(bitMask);
            int newNumber =  notBitMask & n;
            System.out.println(newNumber);
        }
    }
}
