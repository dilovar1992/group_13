package ziyoda.week9;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

public class RemoveName {

    public static void main(String[] args) {
        // Create an ArrayList with names
        ArrayList<String> names = new ArrayList<>(Arrays.asList("Ahmed", "John", "Eric", "Ahmed", "David"));
        ArrayList<String> names2 = new ArrayList<>(Arrays.asList("Ahmed", "John", "Eric", "Ahmed", "David"));

        //Approach 1 with removeIf method and Lambda expression
        // Remove all occurrences of "Ahmed"
        //names.removeIf(name -> name.equals("Ahmed"));

        //Approach 2 with iterator and single list and while loop
        Iterator<String> iterator = names.iterator();

        while (iterator.hasNext()){
            if (iterator.next().equals("John")){
                iterator.remove();
            }
        }
        System.out.println("names = " + names);


        //Approach 3- with double list and for loop
        for(String each : names){
            if(each.equals("Ahmed")){
                    names2.remove(each);
        }}

        // Print the updated list
        System.out.println("names2" + names2); // Output: [John, Eric, David]
    }
}
/*
names.removeIf(): This method takes a lambda expression that defines a condition for removal. In this case, it checks if the name equals "Ahmed".
The lambda expression name -> name.equals("Ahmed") iterates through each element in the list and removes it if the condition is true.
This efficiently removes all instances of "Ahmed" from the list.
 */
