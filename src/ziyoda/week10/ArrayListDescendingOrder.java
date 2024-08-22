package ziyoda.week10;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayListDescendingOrder {


         public static void main(String[] args) {
            // Create an ArrayList with some numbers
            ArrayList<Integer> list = new ArrayList<>(Arrays.asList(5, 3, 8, 1, 2, 7));

            // Sort the list in descending order
            for (int i = 0; i < list.size() - 1; i++) {
                for (int j = 0; j < list.size() - 1 - i; j++) {
                    if (list.get(j) < list.get(j + 1)) {
                        // Swap elements if they are in the wrong order
                        int temp = list.get(j);
                        list.set(j, list.get(j + 1));
                        list.set(j + 1, temp);
                    }
                }
            }

            // Print the sorted list
            System.out.println(list); // Output: [8, 7, 5, 3, 2, 1]
        }
    }
/*
Bubble Sort: The method uses a nested loop to compare adjacent elements. If an element is smaller than the one next to it, they are swapped.
Descending Order: The comparison if (list.get(j) < list.get(j + 1)) ensures that larger numbers bubble up to the front of the list.
Swapping: The elements are swapped using a temporary variable to rearrange them in the correct order.
 */

