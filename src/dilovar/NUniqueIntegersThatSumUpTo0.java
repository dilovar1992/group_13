package dilovar;

import java.util.Arrays;

public class NUniqueIntegersThatSumUpTo0 {
    public static void main(String[] args) {
        int N=25;
        elementsSumUpToZeroArray(N);


        System.out.println(Arrays.toString(elementsSumUpToZeroArray(N)));
    }
    public static int[] elementsSumUpToZeroArray(int N){
        int[] result=new int[N];
        result[0]=0;
        for (int i = 1; i < result.length; i++) {
            result[i]=i;
            result[0]-=i;

        }
        return result;
    }
}
