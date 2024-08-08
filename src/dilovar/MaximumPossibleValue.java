package dilovar;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class MaximumPossibleValue {
    /*
      Maximum Possible Value

      Create a method that will return the maximum possible value of the given number N by inserting the digit '5' somewhere in the integer.

      > bounds of N: -8,000 - 8,000

      Ex:
          Given N = 268, the function should return 5268
          Given N = 670, the function should return 6750
          Given N = 0, the function should return 50
          Given N = -999, the function should return -5999
   */
    public static void main(String[] args) {
        int num = 0;
        int digit = 5;
        int positiveNum = Math.abs(num);
        boolean sign = num < 0;
        String strNUm = "" + positiveNum;
        String number = "";
        List<Integer> listNum = new ArrayList<>();
        for (int i = 0; i < strNUm.length(); i++) {
            number = strNUm.substring(0, i) + digit + strNUm.substring(i);
            listNum.add(sign ? -Integer.parseInt(number) : Integer.parseInt(number));
        }
        System.out.println(listNum);
        for (Integer i : listNum) {
            int count = 0;
            for (Integer j : listNum) {
                if (i > j) {
                    count++;
                }

            }
            if (count == 2) {
                System.out.println("Max = " + i);
            }
        }

    }

}
