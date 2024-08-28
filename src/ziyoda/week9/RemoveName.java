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

/*
names.removeIf(): This method takes a lambda expression that defines a condition for removal. In this case, it checks if the name equals "Ahmed".
The lambda expression name -> name.equals("Ahmed") iterates through each element in the list and removes it if the condition is true.
This efficiently removes all instances of "Ahmed" from the list.
 */
