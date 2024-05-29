package amine.week1;

import java.util.Scanner;

public class W1_DivideWithoutDivision {
    public static void main(String[] args) {
        //setup scanner for user input
        Scanner input = new Scanner(System.in);
        double divisor;
        double dividend;

        //ask for user input, dividend can be zero
        System.out.println("Enter a number to be divided: ");
        dividend = input.nextDouble();

        do {
            System.out.println("Enter a divisor number: ");
            divisor = input.nextDouble();

            //check if user entered valid number, division with zero is not possible
            if (divisor == 0) {
                System.out.println("Divisor cannot be zero");
            }
        } while (divisor == 0);//repeat loop if user entered zero

        input.close();

        //call method to perform division and display result
        double[] result = divideNumber(dividend, divisor);
        System.out.println("The quotient is " + result[0] + (result[1] > 0 ? " and the remainder is " + result[1] : "."));

    }

    public static double[] divideNumber(double dividend, double divisor) {


        //sign is assumed to be positive
        int sign = 1;

        //check if the division will yield a negative quotient
        //if dividend or divisor is negative, result will be negative
        //if both divisor and dividend is negative, result will be positive
        if (dividend < 0 && divisor > 0 || dividend > 0 && divisor < 0) {
            sign = -1;
        }

        double remainder;
        double quotient = 0;
        dividend = Math.abs(dividend);
        divisor = Math.abs(divisor);

        // run the loop until dividend is smaller than divisor
        while (dividend >= divisor) {
            dividend -= divisor;
            quotient++;
        }


        return new double[]{sign * quotient, dividend};
    }


}

    /*
    QUESTION 2- Write a method that can divide two numbers without using division operator
     */

