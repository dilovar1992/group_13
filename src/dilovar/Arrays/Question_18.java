package dilovar.Arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Question_18 {
/*
create a method that will take two int arrays and concat them into one array. Concat the arrays by combining into one array
 */
public static void main(String[] args) {
    int[] num = {1, 3, 5};
    int[] num2 = {8, 12, 5, 9};

    System.out.println(Arrays.toString(concatTwoArray(num, num2)));
}
public static int[] concatTwoArray(int[] num,int[]num2){
    int[] result=new int[num.length+ num2.length];
    List<Integer> list=new ArrayList<>();
    for (int i = 0; i < num.length; i++) {
        list.add(num[i]);
    }
    for (int i = 0; i < num2.length; i++) {
        list.add(num2[i]);
    }
    for (int i = 0; i < list.size(); i++) {
        result[i]= list.get(i);
    }
    return result;
}
}
