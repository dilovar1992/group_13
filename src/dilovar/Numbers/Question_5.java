package dilovar.Numbers;

import java.util.ArrayList;
import java.util.List;

public class Question_5 {
    public static void main(String[] args) {
        int num=100;
        showDivisibles(num);
    }
    public static void showDivisibles(int num){
        List<Integer> divisibleBy3=new ArrayList<>();
        List<Integer> divisibleBy5=new ArrayList<>();
        List<Integer> divisibleBy15=new ArrayList<>();

        for (int i = 1; i <=num ; i++) {

            if (i%3==0 && i%5==0 && i%15==0){
                divisibleBy15.add(i);
            } else if (i%5==0) {
                divisibleBy5.add(i);
            } else if (i%3==0) {
                divisibleBy3.add(i);
            }




        }
        System.out.println("divisibleBy15 = " + divisibleBy15);
        System.out.println("divisibleBy5 = " + divisibleBy5);
        System.out.println("divisibleBy3 = " + divisibleBy3);

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
}
