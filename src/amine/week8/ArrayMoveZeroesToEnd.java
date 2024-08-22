package amine.week8;

import java.util.Arrays;

public class ArrayMoveZeroesToEnd {
    /*
    Write a method that can move all the zeroes to last indexes of the array
    Do not use sort method
    input : {1,0,2,0,3,0,4,0,5}
    output : [1,2,3,4,5,0,0,0,0]
     */

    public static void main(String[] args) {
        int[] numbers = {1,0,2,0,3,0,4,0,5};

        System.out.println("Arrays.toString(numbers) = " + Arrays.toString(numbers));

        System.out.println("moveZeroes(numbers) = " + Arrays.toString(moveZeroes(numbers)));
    }

    public static int[] moveZeroes(int[] numbers){
        //all numbers in new array is 0
        int[] ordered = new int[numbers.length];

        //variable to keep track of index
        int index = 0;

        //iterate and add all non-zero numbers to the new array
        for (int i = 0; i < numbers.length; i++) {
            if(numbers[i]!=0){
                ordered[index] = numbers[i];
                index++;
            }
        }
        return ordered;
    }
}
