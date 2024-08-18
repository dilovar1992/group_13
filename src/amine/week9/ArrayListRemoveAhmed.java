package amine.week9;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

public class ArrayListRemoveAhmed {

    /*
        ArrayList - Remove "Ahmed"
        Given a list of people' names: "Ahmed", "John", Eric", "Ahmed".....
        Write a java operation to remove all the names named Ahmed
     */

    public static void main(String[] args) {

        ArrayList<String> names = new ArrayList<>(Arrays.asList("Ahmed", "John", "Eric", "Ahmed"));

        System.out.println("removeName(names,\"Ahmed\") = " + removeName(names, "Ahmed"));

    }

    public static ArrayList<String> removeName(ArrayList<String> list, String name){

        //make iterator object so that list can be manipulated while iterating
        Iterator<String> iterator = list.iterator();

        //loop until the iterator has no item
        while (iterator.hasNext()){
            //check if the current item is equal to the one we want to remove
            //remove item when it's equal to the given name
            if(iterator.next().equalsIgnoreCase(name)){
                iterator.remove();
            }
        }

        return list;
    }

}
