package JavaArray;

import java.util.Arrays;

public class Array {
    public static void main(String[] args) {
        int[] numbers = {2,4,6,3,8};
        Arrays.sort(numbers);
        System.out.println(numbers.length);
        System.out.println(Arrays.toString(numbers));
    }
}
