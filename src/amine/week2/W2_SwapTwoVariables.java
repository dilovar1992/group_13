package amine.week2;
/*
Numbers – Swap Numbers
Swap two variables' values without using a third variable.

*/
public class W2_SwapTwoVariables {
    public static void main(String[] args) {

        int num1 = 5;
        int num2 = 15;

        System.out.println("Before swapping");
        System.out.println("num1 = " + num1);
        System.out.println("num2 = " + num2);

        num1 = num1 + num2; //5 + 15
        num2 = num1 - num2; //20 - 15
        num1 = num1 - num2; //20 - 5

        System.out.println("After swapping");
        System.out.println("num1 = " + num1);
        System.out.println("num2 = " + num2);

    }

}



/*
Numbers – Swap Numbers
Swap two variables' values without using a third variable.

*/