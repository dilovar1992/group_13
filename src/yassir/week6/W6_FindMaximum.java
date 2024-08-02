package yassir.week6;

public class W6_FindMaximum {


    public static void main(String[] args) {

        int[] myIntArray = {1, 2, 3};


        System.out.println("the maximum number = " + findMax(myIntArray));


    }






    public static int findMax(int[] array) {
        if (array == null || array.length == 0) {
            throw new IllegalArgumentException("Array must not be null or empty");
        }
        int max = array[0];
        for (int num : array) {
            if (num > max) {
                max = num;
            }
        }
        return max;
    }


}




