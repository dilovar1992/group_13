package amine.week8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class ArrayIntSumZero {
    /**
     * Array - N unique integers that sum up to 0
     * Write a function that given an integer N (1<N<100),
     * Returns an array containing N unique integers that sum up to 0.
     * The function can return any such array.
     * For example, given N = 4, the function could return [1,0,-3,2] or [-2,1,-4,5].
     * The answer [1,-1,1,3] would be incorrect (because value 1 occurs twice).
     * For N = 3 one of the possible answers is [-1,0,1] (but there are many more correct answers).
     */

    public static void main(String[] args) {

        System.out.println("Arrays.toString(arraySumZero(7)) = " + Arrays.toString(arraySumZero(7)));
        System.out.println("Arrays.toString(arraySumZero(10)) = " + Arrays.toString(arraySumZero(10)));

    }


    public static int[] arraySumZero(int n){

        int[] numbers = new int[n];

        if(n==1){
            return numbers;
        }

        for (int i = 1, index = 0; i <= numbers.length/2; i++, index+=2) {
            numbers[index] = i;
            numbers[index +1] = i *(-1);
        }

        return numbers;
    }

}
