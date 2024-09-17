package dilovar.Arrays;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class FindMaxOnArray {
    /*
    Array -- Find Maximum
Write a method that can find the maximum number from an int Array
     */
    public static void main(String[] args) {
        int[] nums = {2, 5, 8, 9, 7};

        System.out.println(maxNum(nums));


        System.out.println(maxNumSpecial(nums));


    }

    public static int maxNum(int[] nums) {
        int max = 0;
        for (int i = 0; i < nums.length; i++) {
            if (max < nums[i]) {
                max = nums[i];
            }

        }

        return max;
    }
    public static int maxNumSpecial(int[] nums){
        List<Integer> numlist=new ArrayList<>();
        for (int i = 0; i < nums.length; i++) {
            numlist.add(nums[i]);
        }
        return Collections.max(numlist);
    }



}
