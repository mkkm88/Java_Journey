package Recursion;

public class Add_Numbers {
    public static int sum(int n){
        if(n > 0)
            return n + sum(n - 1);
        else
            return 0;
    }

    public static void main(String[] args) {
        int result = sum(5);
        System.out.println(result);
    }
}
