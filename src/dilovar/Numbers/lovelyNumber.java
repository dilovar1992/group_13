package dilovar.Numbers;

import java.util.*;

public class lovelyNumber {
    public static void main(String[] args) {
    /*
        Lovely Number

        Create a method that will count the lovely numbers with the given range. The parameters a and b are defined as the lower and upper bounds.
        A number is lovely if it contains fewer than three instances of any distinct digit

        Example of lovely numbers: 0, 100, 1232 and 9922
        Example of non-lovely numbers: 1000 (contains three copies of digit '0'), 33533 (contains four copies of digit '3').

        parameter: int, int
            A and B will be within the range: 0 - 100,000
        return: int

        Ex:
            Given A = 0, B = 0, your function should return 1, because o is
        lovely.

            Given A = 1, B = 111, your function should return 110, because
        the only integer in the range [1..111] that is not lovely is 111.

            Given A = 100000, B = 100000, your function should return 0,
        because 100000 is not lovely.
     */
        int a=1;
        int b=111;
        System.out.println("lovelyNumber(a,b) = " + lovelyNumber(a, b));


    }
    public static int lovelyNumber(int a,int b){
        List<Integer> nums=new ArrayList<>();
        for (int i = a; i <= b; i++) {
            nums.add(i);

        }
        //System.out.println(nums);
        nums.removeIf(x->isRepeated(x));
        //System.out.println(nums);
        return nums.size();

    }
    public static boolean isRepeated(int num){
        //String str2=String.valueOf(num);
        String str=num+"";
        boolean repeated= false;
        char[] chars = str.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            int count=0;

            for (int j = 0; j < chars.length; j++) {
                if (chars[i]==chars[j]){
                    count++;
                }

            }
            if (count>2){
                repeated=true;
                break;
            }

        }
        return repeated;

    }
}
