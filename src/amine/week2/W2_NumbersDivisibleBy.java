package amine.week2;

import java.util.ArrayList;
import java.util.List;

public class W2_NumbersDivisibleBy {
    public static void main(String[] args) {
        divisibilityCheck(100);

    }

    public static void divisibilityCheck(int number) {
        //making lists to add divisible numbers
        List<Integer> divisibleBy3 = new ArrayList<>();
        divisibleBy3.add(3);
        List<Integer> divisibleBy5 = new ArrayList<>();
        divisibleBy5.add(5);
        List<Integer> divisibleBy15 = new ArrayList<>();
        divisibleBy15.add(15);

        //iterating from 1 to number and adding each divisible number to the corresponding list
        for (int i = 1; i <= number; i++) {
            if (i % 15 == 0) {
                divisibleBy15.add(i);
            } else if (i % 5 == 0) {
                divisibleBy5.add(i);
            } else if (i % 3 == 0) {
                divisibleBy3.add(i);
            }
        }

        //displaying the results
        System.out.print("Divisible By ");
        printList(divisibleBy15);
        System.out.print("Divisible By ");
        printList(divisibleBy5);
        System.out.print("Divisible By ");
        printList(divisibleBy3);
    }

    public static void printList (List<Integer> numbers){
        // method for printing numbers side by side
        for (Integer num : numbers) {
            System.out.print(num + " ");

        }
        System.out.println();
    }


}


/*Numbers – Divisible by 3, 5, 15
Write a program that can print the numbers between 1 ~ N that can be divisible by 3, 5, and 15.
            if the number can be divisible by 3, 5 and 15,
                then it should only be displayed in DivisibelBy15' section

            if the number can be divisible by 3 but cannot be divisible by 15,
                then it should only be displayed in DivisibelBy3' section

            if the number can be divisible by 5 but cannot be divisible by 15,
                then it should only be displayed in DivisibelBy5' section

        EX:
            input: 100

            Output:
                 Divisible By 15 15 30 45 60 75 90
                 Divisible By 5 5 10 20 25 35 40 50 55 65 70 80 85 95 100
                 Divisible By 3 3 6 9 12 18 21 24 27 33 36 39 42 48 51 54 57 63 66 69 72 78 81 84 87 93 96 99
 */