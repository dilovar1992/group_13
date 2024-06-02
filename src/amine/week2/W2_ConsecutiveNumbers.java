package amine.week2;

public class W2_ConsecutiveNumbers {
    public static void main(String[] args) {
        displayNumbers(33);

    }

    public static void displayNumbers(int number) {
        //setting variables with messages
        // so it easy to re-use and easy to read
        String message2 = "Codility";
        String message3 = "Test";
        String message5 = "Coders";

        for (int i = 1; i <= number; i++) {
            //checking condition to print message or number

            // checking the most broad condition first,
            // so it is not mistakenly assigned to other numbers divisibility list
            if (i % 2 == 0 && i % 3 == 0 && i % 5 == 0){
                System.out.println(message2+message3+message5);
            }else if (i % 2 == 0 && i % 3 == 0){
                System.out.println(message2+message3);
            }else if (i % 2 == 0 && i % 5 == 0){
                System.out.println(message2+message5);
            }else if (i % 3 == 0 && i % 5 == 0){
                System.out.println(message3+message5);
            }else{
                System.out.println(i);
            }
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