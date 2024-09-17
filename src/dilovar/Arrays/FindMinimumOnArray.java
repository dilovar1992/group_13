package dilovar.Arrays;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class FindMinimumOnArray {
    public static void main(String[] args)
    {
        /*
        Write a method that can find the maximum number from an int Array
         */
        int[] nums = {2, 5, 8, 9, 7};
        System.out.println("findMinOnArray2(nums) = " + findMinOnArray2(nums));

        System.out.println("findMinOnArray(nums) = " + findMinOnArray(nums));
    }
    public static int findMinOnArray(int [] nums){
        int min=10;
        for (int i = 0; i < nums.length; i++) {
            if (min>nums[i]){
                min=nums[i];
            }


        }
        return min;
    }
    public static int findMinOnArray2(int [] nums){
        List<Integer> result=new ArrayList<>();
        for (int i = 0; i < nums.length; i++) {
            result.add(nums[i]);
        }
        return Collections.min(result);
    }

}
