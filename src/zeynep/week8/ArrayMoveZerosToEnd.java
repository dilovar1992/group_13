package zeynep.week8;

import java.util.Arrays;

public class ArrayMoveZerosToEnd {

    /*
    Write a method that can move all the zeros to last indexes of the array
    (Do not use sort method)

    input : {1,0,2,0,3,0,4,0,5}
    output : [1,2,3,4,5,0,0,0,0]
     */

    public static void main(String[] args) {

        int[] nums = {1, 0, 2, 0, 3, 0, 4, 0, 5};

        System.out.println(Arrays.toString(nums));

        System.out.println(Arrays.toString(moveZeros(nums)));
    }

    public static int[] moveZeros(int[] nums){

        int[] moved = new int[nums.length];
        int index = 0;

        for (int i = 0; i < nums.length; i++) {

            if(nums[i]!=0){

                moved[index] = nums[i];
                index++;
            }
        }
        return moved;
    }
}
