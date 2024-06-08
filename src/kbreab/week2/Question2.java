package kbreab.week2;

public class Question2 {

    public static void main(String[] args) {

        int Kebi = 100;
        String divisibleBy15 = "";
        String divisibleBy5 = "";
        String divisibleBy3 = "";

        for (int i = 1; i <= 100; i++) {

            if (i % 15 == 0 ){
                // If the number is divisible by 15, add it to divisibleBy15
                divisibleBy15 += i + " ";
            } else if (i % 5 == 0){
                // If the number is divisible by 5 but not by 15, add it to divisibleBy5
                divisibleBy5 += i + " ";
            } else if(i % 3== 0){
                // If the number is divisible by 3 but not by 15, add it to divisibleBy3
                divisibleBy3 += i + " ";
            }
        }
        System.out.println("Divisible by 15: " +divisibleBy15 );
        System.out.println("Divisible by 5: " +divisibleBy5 );
        System.out.println("Divisible by 3: " + divisibleBy3);


                                  // in another way //

        /*int Kebi = 100;
        String divisibleBy15 = "";
        String divisibleBy5 = "";
        String divisibleBy3 = "";

        for (int i = 1; i <= 100; i++) {
            if (i % 15 == 0) {
                divisibleBy15 += i + " ";
            }
        }
        System.out.println( "DivisibleBy15 : " + divisibleBy15);

        for (int i = 1; i <= 100; i++) {
            if (i % 5 == 0 && i % 15 != 0) {
                divisibleBy5 += i + " ";
            }
        }
        System.out.println( "DivisibleBy5 : " + divisibleBy5);


        for (int i = 1; i <= 100; i++) {
            if (i % 3 == 0 && i % 15 != 0) {
                divisibleBy3 += i + " ";
            }

        }
        System.out.println( "DivisibleBy3 : " + divisibleBy3);*/




    }

}
/*
Numbers -- Divisible by 3, 5, 15
Write a program that can print the numbers between 1 ~ 100  that can be divisible by 3, 5, and 15.
if the number can be divisible by 3, 5, and 15, then it should only be displayed in DivisibleBy15' section.
If the number can be divisible by 3, but cannot be divisible by 15, then it should only be displayed in DivisibleBy3' section.
If the number can be divisible by 5, but cannot be divisible by 15, then it should only be displayed in DivisibleBy5' section.

output:
DivisibleBy15 : 15 30 45 60 75 90
DivisibleBy5 : 5 10 20 25 35 40 50 55 65 70 80 85 95 100
DivisibleBy3 : 3 6 9 12 18 21 24 27 33 36 39 42 48 51 54 57 63 66 69 72 78 81 84 87 93 96 99


 */
