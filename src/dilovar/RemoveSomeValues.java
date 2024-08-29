package dilovar;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

public class RemoveSomeValues {
    public static void main(String[] args) {
        ArrayList<Integer> nums=new ArrayList<>(Arrays.asList(500,480,1,2,3,14,16,85,78,9,102));
        System.out.println(removeIntGreaterThan(nums, 100));
        nums.removeIf(t->t>100);
        System.out.println(nums);
    }
    public static ArrayList<Integer> removeIntGreaterThan(ArrayList<Integer> nums,int N){
        Iterator<Integer> iterator = nums.iterator();
        while (iterator.hasNext()) {
            Integer integer = iterator.next();
            if (integer > N) {
                iterator.remove();
            }
        }
        return nums;
    }

}
