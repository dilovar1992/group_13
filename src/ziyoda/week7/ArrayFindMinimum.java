package ziyoda.week7;

public class ArrayFindMinimum {

        /*
Input Validation: The method first checks if the array is null or empty and throws an exception if it is.
Initialization: We assume the first element of the array (array[0]) is the minimum.
Iteration: We iterate through the rest of the array, comparing each element to the current minimum (min).
Update Minimum: If an element is found that is smaller than the current minimum, we update min to that element.
Return Minimum: After the loop, min holds the smallest value in the array, which is then returned.
     */

    public static void main(String[] args) {
            int[] numbers = {4, 2, 7, 1, 9, 3}; // Example array
            int min = findMinimum(numbers);
            System.out.println("The minimum number is: " + min);
        }

        // Method to find the minimum number in an array
        public static int findMinimum(int[] array) {
            if (array == null || array.length == 0) {
                throw new IllegalArgumentException("Array must not be null or empty");
            }

            int min = array[0]; // Assume the first element is the minimum

            for (int i = 1; i < array.length; i++) {
                if (array[i] < min) {
                    min = array[i]; // Update min if the current element is smaller
                }
            }

            return min; // Return the minimum number found
        }
    }





