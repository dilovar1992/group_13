package ziyoda.week9;

import java.util.ArrayList;
import java.util.Arrays;

public class RemoveName {

    public static void main(String[] args) {
        // Create an ArrayList with names
        ArrayList<String> names = new ArrayList<>(Arrays.asList("Ahmed", "John", "Eric", "Ahmed", "David"));

        // Remove all occurrences of "Ahmed"
        names.removeIf(name -> name.equals("Ahmed"));

        // Print the updated list
        System.out.println(names); // Output: [John, Eric, David]
    }
}

