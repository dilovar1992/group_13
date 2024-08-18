package amine.week9;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;

public class ArrayListRemoveValues {

    /*
        ArrayList - Remove some values
        Given a list of Integers 1, 2, 3, 4, 5, 6 ....etc. remove all values greater than 100
     */
    public static void main(String[] args) {

        ArrayList<Integer> values = new ArrayList<>(Arrays.asList(112, 31, 322, 5, 100));
        ArrayList<Integer> values2 = new ArrayList<>(Arrays.asList(2, 101,350,23,44,0));

        System.out.println("removeValues(values) = " + removeValues(values));

        System.out.println("removeValues2(values2) = " + removeValues2(values2));



    }

    public static ArrayList<Integer> removeValues(ArrayList<Integer> list){

        //make iterator object so that list can be manipulated while iterating
        Iterator<Integer> iterator = list.iterator();

        //loop until the iterator has no item
        while (iterator.hasNext()){
            //check if the current item is equal to the one we want to remove
            //remove item when it's equal to the given name
            if(iterator.next() > 100){
                iterator.remove();
            }
        }

        return list;
    }

    public static ArrayList<Integer> removeValues2(ArrayList<Integer> list){

        list.removeIf(num->num>100);

        return list;
    }
}
