package metehan.week2;

public class SwapTwoVariables {
    public static void main(String[] args) {
        int a=10;
        int b=15;

        a=b-a;

        b=b-a;

        a=a+b;
        System.out.println("a = " + a);
        System.out.println("b = " + b);
    }
}

/*
Numbers – Swap Numbers
Swap two variables' values without using a third variable.

*/