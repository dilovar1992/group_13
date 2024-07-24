package zeynep.week6;

import java.util.Arrays;

public class FindMaxInArray {

    //Array -- Find Maximum
    //Write a method that can find the maximum number from an int Array

    public static void main(String[] args) {


        int[] arr = {8, 3, -2, 0, 5};
        System.out.println(maxInt(arr));


    }


    public static int maxInt(int[] arr){

        int max = arr[0];

        for (int each : arr){
            if(each > max){
                max = each;
            }
        }

//        Arrays.sort(arr);
//
//        max = arr[arr.length-1];

        return max;
    }


}
