package ControlFlow;

public class Logical_Operators {
    public static void main(String[] args) {
        // Comparison( ==, !=, >, <, >=, <= ) Operator
        int x = 3;
        int y = 3;
        System.out.println(x != y);

        // AND(&&) Operator
        int temperature = 23;
        boolean isWarm = temperature > 20 && temperature < 30;
        System.out.println(isWarm);

        // OR(||) Operator
        boolean hasHighIncome = false;
        boolean hasHighCredit = true;
        boolean hasCriminalRecord =  true;
        boolean isEligible = (hasHighIncome || hasHighCredit) && !hasCriminalRecord;
        System.out.println(isEligible);

    }
}
