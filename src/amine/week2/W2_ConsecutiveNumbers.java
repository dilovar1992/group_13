package amine.week2;

import java.util.ArrayList;
import java.util.List;

public class W2_ConsecutiveNumbers {
    public static void main(String[] args) {
        displayNumbers(33);
    }

    public static String selectText(int num) {
        String result = "";
        switch (num) {
            case 2:
                result = "Codility";
                break;
            case 3:
                result = "Test";
                break;
            case 5:
                result = "Coders";
                break;
            default:
                break;
        }
        return result;
    }

    public static List<Integer> findFactors(int number) {
        //find if number is divisible by 2, 3, 5
        int[] factors = {2, 3, 5};
        List<Integer> factorsOfNumber = new ArrayList<>();

        for (int factor : factors) {
            if (number % factor == 0) {
                factorsOfNumber.add(factor);
            }
        }
        if (factorsOfNumber.isEmpty()) {
            factorsOfNumber.add(number);
        }
        return factorsOfNumber;
    }

    public static void displayNumbers(int number) {

        for (int i = 1; i <= number; i++) {
            List<Integer> factors = findFactors(i);
            String result = "";
            if (factors.contains(2) ||factors.contains(3)||factors.contains(5) ) {
                for (Integer factor : factors) {
                    result += selectText(factor);
                }
            } else {
                result += i;
            }
            System.out.println(result);
        }
    }


}
/* Numbers – Print Consecutive Numbers
Write a function:
    that, given a positive integer N, prints the consecutive numbers from 1 to N, each on a separate line.
    However, any number divisible by 2, 3 or 5 should be replaced by the word Codility,
    Test or Coders respectively.
    If a number is divisible by more than one of the numbers: 2,3 or 5,
    it should be replaced by a concatenation of the respective words Codility,
     Test and Coders in this given order.
    For example, numbers divisible by both 2 and 3 should be replacée by CodilityTest
     and numbers divisible by all three numbers: 2,3 and 5, should be replaced by CodilityTestCoders.

        For example, here is the output for N = 24:
                                    1
                                    Codility
                                    Test
                                    Codility
                                    Coders
                                    CodilityTest
                                    7
                                    Codility
                                    Test
                                    Codi1ityCoders
                                    11
                                    CodilityTest
                                    13
                                    Codility
                                    TestCoders
                                    Codility
                                    17
 */