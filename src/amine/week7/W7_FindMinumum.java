package amine.week7;

public class W7_FindMinumum {

    public static void main(String[] args) {
        int[] array = {10,11,14,26,5,29,30};

        System.out.println("findMinimum(array) = " + findMinimum(array));
    }

    // Write a method that can find the minimum  number from an int Array

    public static int findMinimum(int [] array){

        //initial number set as the first number in array
        int current = array[0];

        //iterate through the array and update current number when current is bigger than the number at array[i]
        for (int i=0; i<array.length; i++){
            if(current > array[i]){
                current = array[i];
            }
        }
        return current;
    }


}
