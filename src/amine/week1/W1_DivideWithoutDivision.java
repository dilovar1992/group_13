package amine.week1;

import java.util.Scanner;

public class W1_DivideWithoutDivision {
    public static void main(String[] args) {
        //setup scanner for user input
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number to be divided: ");
        double dividend = input.nextDouble();
        System.out.println("Enter a divisor number: ");
        double divisor = input.nextDouble();
        input.close();

        double [] result = divideNumber(dividend, divisor);
        System.out.println("The quotient is " + result[0] + (result[1]>0?" and the remainder is "+ result[1] : "."));

    }

    public static double[] divideNumber(double dividend, double divisor) {
        double remainder;
        double quotient = 0;
        remainder = dividend % divisor;
        dividend -= remainder;

        while (dividend > 0) {
            dividend -= divisor;
            quotient++;
        }
        return new double[]{quotient,remainder};
    }


}

    /*
    QUESTION 2- Write a method that can divide two numbers without using division operator
     */

