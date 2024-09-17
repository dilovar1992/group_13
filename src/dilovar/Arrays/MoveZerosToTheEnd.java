package dilovar.Arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MoveZerosToTheEnd {
    public static void main(String[] args) {
        int[] nums = {67, 0, 2, 9, 3, 0, 2555, 0};

        System.out.println(Arrays.toString(moveZeroToLeft(nums)));



    }

    public static int[] moveZeroToEnd(int[] nums) {
        return SortArrayInDescending.sortArrayDesc(nums);
    }

    public static int[] moveZeroToLeft(int[] nums) {
        //convert Array to ArrayList
        List<Integer> numList = new ArrayList<>();
        for (int i = 0; i < nums.length; i++) {
            numList.add(nums[i]);
        }
        //find number of zero by removing 0
        int originalSize = numList.size();
        numList.removeIf(n -> n.equals(0));
        int zero = originalSize - numList.size();

        //then add 0 again to move to the end
        for (int i = 0; i < zero; i++) {
            numList.add(0);
        }

        //convert ArrayList to an Array
        int[] result = new int[nums.length];
        int i=0;
       // result = numList.toArray(result);
        for (Integer each : numList) {
            result[i]=each;
            i++;
        }

        return result;


    }


}
