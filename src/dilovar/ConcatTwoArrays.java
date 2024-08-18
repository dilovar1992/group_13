package dilovar;

import java.util.Arrays;

public class ConcatTwoArrays {
    public static void main(String[] args) {
        /**
         * 1) Array - Concat two arrays
         * Write a return method that can concate two arrays
         */
        String[] arr1={"dilovar","amine","zeynep"};
        String[] arr2={"metehan","ziyoda","kb"};
        String[] result=new String[arr1.length+ arr2.length];
        for (int i = 0,j=3; i < arr1.length;  i++,j++) {
            result[i]=arr1[i];
            if (j<=(arr2.length+arr1.length)){
            result[j]=arr2[i];
            }

        }

        System.out.println("result= " + Arrays.toString(result));
    }
}
