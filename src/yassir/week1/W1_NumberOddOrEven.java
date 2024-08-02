package yassir.week1;

import java.util.Scanner;

public class W1_NumberOddOrEven {

    public static void main(String[] args) {
        //setup scanner
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter a whole number: ");
        int number = input.nextInt();
        input.close();
        System.out.println(identify(number));
    }

    public static String identify(int number) {
        //Use ternary operator to select a statement depending on the number being odd or even
        return (number % 2 == 0) ? "Even" : "Odd";
    }
}
    /*
      QUESTION 1 - Write a method which can identify if a given number odd or even
       Ex: identify(5) -->"Odd"
       identify (6) --> "Even"
      */