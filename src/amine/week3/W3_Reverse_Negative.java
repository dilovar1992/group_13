package amine.week3;

import java.util.Scanner;

/*2. Numbers -- Reverse negative number
Write a return method that can reverse
negative number and return it as int */

public class W3_Reverse_Negative {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter a negative number to be reversed");
        int number = input.nextInt();
        System.out.println(reverseNumber(number));

        System.out.println("Please enter a negative number to be reversed");
        number = input.nextInt();
        System.out.println(reverseNumber2(number));

        input.close();

    }

    //method that reverses integer by using the String class
    public static int reverseNumber(int number){
        //input is assumed to have negative number? But I cannot trust the user to read instructions
        int sign = 1;
        //check if the number is negative
        if (number<0){
            sign = -1;
        }

        //getting absolute value of number, do not want the negative sign in the string
        String digits = String.valueOf(Math.abs(number));
        String reverseDigits = "";

        for (int i = digits.length()-1; i >=0; i--) {
            reverseDigits += digits.charAt(i);
        }
        return Integer.parseInt(reverseDigits)*sign;
    }

    public static int reverseNumber2(int number){
        int sign = 1;
        //check if the number is negative
        if (number<0){
            sign = -1;
        }

        int reversed=0;
        number = Math.abs(number);
        while (number>0){
            //reversed*10 moves the decimal place to the right
            //number%10 gives the remainder, which is the last digit of the number
            reversed = reversed*10 + number%10;
            number = number/10; //moving the decimal place to the left
        }
        return reversed*sign;
    }



}
