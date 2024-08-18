package amine.week9;

import java.util.Arrays;

public class ConcatTwoArrays {
    /*
        Write a return method that can concate two array
     */
    public static void main(String[] args) {

        int [] arr1 = {5,12,30};
        int [] arr2 = {7,14,26,2,10,11,12,29};

        System.out.println("Arrays.toString(arr1) = " + Arrays.toString(arr1));
        System.out.println("Arrays.toString(arr2) = " + Arrays.toString(arr2));
        System.out.println("Arrays.toString(mergeArray(arr1,arr2)) = " + Arrays.toString(mergeArray(arr1, arr2)));

    }

    public static int[] mergeArray(int [] array1,int [] array2){

        //make new array with total length of two given arrays,
        int [] mergedArray = new int[array1.length + array2.length];

        // 2D array for containing given arrays, for dynamically indexing inside the for loop
        int[][] arrays = {array1, array2};

        //to keep track of index of the mergedArray array, to add item to correct position
        int currentIndex = 0;

        //iterate through 2D array
        for (int i = 0; i < arrays.length; i++) {
            //iterate until last index of array
            for (int j = 0; j < arrays[i].length ; j++) {
                //set mergedArray at the current index to the item of array at index j
                mergedArray[currentIndex] = arrays[i][j];

                //update current index counter
                currentIndex++;
            }
        }
        return mergedArray;

    }
}
