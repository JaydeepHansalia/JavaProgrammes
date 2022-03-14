package Programmes;

public class SwapTwoNumbersWithoutUsingThirdVariable {

    public static void main(String[] args) {
        int a = 23;
        int b = 56;

        a = a + b;
        b = a - b;
        a = a - b;

        System.out.println("" + a + ", " + b + "");
    }
}
