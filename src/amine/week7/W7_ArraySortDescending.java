package amine.week7;

import java.util.Arrays;

public class W7_ArraySortDescending {

    /*Write a return method that can sort an int array in descending order
 without using the sort method of the Arrays class
Ex: int[] arr = {10,20,7, 8, 90};
arr = Sort(arr); ==> {90, 20, 10, 8, 7};
*/

    public static void main(String[] args) {
        int [] numbers = {11,29,11,8,20,15,20,1,21,12,16};

        System.out.println("arraySortAsc({11,29,11,8,20,15,20,1,21,12,16}) = " + Arrays.toString(arraySortDesc(numbers)));
    }

    public static int[] arraySortDesc(int[] numbers){
        int [] sortedArray = numbers;

        for (int i = 0; i < numbers.length; i++) {
            for (int j = 0; j < numbers.length; j++) {

                if (sortedArray[i] > numbers[j]){
                    int temp = sortedArray[j];
                    sortedArray[j] = sortedArray[i];
                    sortedArray[i] = temp;
                }
            }
        }
        return sortedArray;
    }


}
