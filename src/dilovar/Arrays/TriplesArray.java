package dilovar.Arrays;

public class TriplesArray {
    /*
        Triples Array

        Create a method that will determine if the array has a triple or not. A triple is when an element is repeat 3 times in a row. If any number is repeat 3 times in a row return false. If the array does not have any triples return true

        Ex:
            noTriples([1, 1, 2, 2, 1]) → true
            noTriples([1, 1, 2, 2, 2, 1]) → false
            noTriples([1, 1, 1, 2, 2, 2, 1]) → false

     */
    public static void main(String[] args) {
        int[] arr={1,2,3,1,1,1};
        System.out.println("hasTriples(arr) = " + hasTriples(arr));


    }
    public static boolean hasTriples(int[]arr){
        boolean triple=false;
        for (int i = 1; i < arr.length-1; i++) {
            if(arr[i]==arr[i-1] &&  arr[i]==arr[i+1]){
                triple=true;
            }





        }

        return triple;
    }
}
